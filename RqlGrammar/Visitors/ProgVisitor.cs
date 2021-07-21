using System;
using Antlr4.Runtime.Misc;
using RqlGrammar.Model;
using RqlGrammar.Models;

namespace RqlGrammar.Visitors
{
    public class ProgVisitor : RqlParserBaseVisitor<object>
    {
        public override object VisitProg([NotNull] RqlParser.ProgContext context)
        {
            for (int i = 0; i < context.ChildCount; ++i)
                if (context.GetChild(i).GetText().Equals("<EOF>"))
                    break;
                else
                    Visit(context.GetChild(i));
            return "test";
        }

        #region FromStatement

        public override object VisitCollectionByName([NotNull] RqlParser.CollectionByNameContext context)
        {
            var collection = context.collectionName().GetText();
            if (context.ChildCount == 3)
            {
                var alias = Visit(context.GetChild(2));
                DataHolder.Instance.Aliases.Add((string)alias, collection);
            }

            DataHolder.Instance.From = new From() {CollectionIdentifier = collection, FromType = FromType.COLLECTION};
            return collection;
        }

        public override object VisitAllCollections([NotNull] RqlParser.AllCollectionsContext context)
        {
            DataHolder.Instance.From = new From() {FromType = FromType.ALL_DOCS};
            return context.GetText();
        }

        public override object VisitCollectionByIndex([NotNull] RqlParser.CollectionByIndexContext context)
        {
            DataHolder.Instance.From = new From()
                {CollectionIdentifier = context.GetChild(1).GetText(), FromType = FromType.INDEX};
            return base.VisitCollectionByIndex(context);
        }

        #endregion

        #region Alias

        public override object VisitAlias([NotNull] RqlParser.AliasContext context)
        {
            return context.GetChild(1).GetText();
        }


        #endregion

        #region Load

        public override object VisitLoadStatement([NotNull] RqlParser.LoadStatementContext context)
        {
            DataHolder.Instance.LoadOption = (context.variable().GetText(), (string)Visit(context.GetChild(2)));
            if (DataHolder.Instance.Aliases.ContainsKey(DataHolder.Instance.LoadOption.Item1))
                throw new Exception($"Alias already used.");
            return "OK";
        }

        #endregion

        #region SelectStatement

        public override object VisitProjectIndividualFields([NotNull] RqlParser.ProjectIndividualFieldsContext context)
        {

            return base.VisitProjectIndividualFields(context);
        }

        public override object VisitJavascriptCode([NotNull] RqlParser.JavascriptCodeContext context)
        {
            return base.VisitJavascriptCode(context);
        }

        #endregion



        #region Utils

      
        public override object VisitVariable([NotNull] RqlParser.VariableContext context)
        {
            switch (context.ChildCount)
            {
                case 1: 
                    return new Variable()
                    {
                        Name = context.GetText(),
                        Type = VariableType.Variable
                    };
                case 3:
                    return new Variable()
                    {
                        Alias = context.GetChild(0).GetText(),
                        Name = context.GetChild(2).GetText()
                    };
                case 5:
                    return new Variable()
                    {
                        Alias = context.GetChild(0).GetText(),
                        Name = context.GetChild(4).GetText(),
                        Type = VariableType.List
                    };
                default:
                    throw new Exception("Unkown pattern for variable");
            }
        }

        #endregion
    }
}
