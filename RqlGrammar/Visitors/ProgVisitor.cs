using System;
using System.Collections.Generic;
using System.Text;
using Antlr4.Runtime.Misc;
using RqlGrammar.Model;

namespace RqlGrammar.Visitors
{
    public class ProgVisitor : RqlParserBaseVisitor<string>
    {
        public override string VisitProg([NotNull] RqlParser.ProgContext context)
        {
            for (int i = 0 ; i < context.ChildCount;++i)
                if (context.GetChild(i).GetText().Equals("<EOF>"))
                    break;
                else
                    Visit(context.GetChild(i));
            return "test";
        }

        #region FromStatement
        public override string VisitCollectionByName([NotNull] RqlParser.CollectionByNameContext context)
        {
            var collection = context.WORD().GetText();
            if (context.ChildCount == 3)
            {
                var alias = Visit(context.GetChild(2));
                DataHolder.Instance.Aliases.Add(alias,collection);
            }

            DataHolder.Instance.From = new From() { CollectionIdentifier = collection, FromType = FromType.COLLECTION };
            return collection;
        }

        public override string VisitAllCollections([NotNull] RqlParser.AllCollectionsContext context)
        {
            DataHolder.Instance.From = new From() { FromType = FromType.ALL_DOCS };
            return context.GetText();
        }

        public override string VisitCollectionByIndex([NotNull] RqlParser.CollectionByIndexContext context)
        {
            DataHolder.Instance.From = new From()
                { CollectionIdentifier = context.GetChild(1).GetText(), FromType = FromType.INDEX };
            return base.VisitCollectionByIndex(context);
        }
        #endregion

        #region Alias
        public override string VisitAlias([NotNull] RqlParser.AliasContext context)
        {
            return context.GetChild(1).GetText();
        }


        #endregion

        #region Load

        public override string VisitLoadStatement([NotNull] RqlParser.LoadStatementContext context)
        {
            DataHolder.Instance.LoadOption = (context.variable().GetText(), Visit(context.GetChild(2)));
            if (DataHolder.Instance.Aliases.ContainsKey(DataHolder.Instance.LoadOption.Item1))
                throw new Exception($"Alias already used.");
            return "OK";
        }

        #endregion
    }
}
