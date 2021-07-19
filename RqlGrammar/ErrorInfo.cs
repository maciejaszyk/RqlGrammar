using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Text;

namespace RqlGrammar
{
    public enum CustomTokens
    {
        Index,
        AllDocs,
        Collection,
        IndexName,
        Variable,
        Function,
        GroupByVariable,
        OrderBy,
        OrderBySortingOption,
        JavaScriptSelect,
        Alias
    }
    public class NoViableInfo
    {
        public static CustomTokens[] Get(int ruleIndex, int tokenIndex = 0)
        {
            var options = new List<CustomTokens>();
            switch (ruleIndex)
            {
                case 0: //prog
                    break;
                case 1: //fromStatement
                    options.Add(CustomTokens.AllDocs);
                    options.Add(CustomTokens.Collection);
                    options.Add(CustomTokens.Index);
                    break;
                case 2: //indexName
                    options.Add(CustomTokens.IndexName);
                    break;
                case 3: //loadStatement
                    options.Add(CustomTokens.Collection);
                    break;
                case 4: //selectStatement
                    options.Add(CustomTokens.Variable);
                    options.Add(CustomTokens.JavaScriptSelect);
                    break;
                case 5: //jsFunction
                    break;
                case 6: //jsCode
                    break;
                case 7: //alias
                    options.Add(CustomTokens.Alias);
                    break;
                case 8: //variable
                    options.Add(CustomTokens.Variable);
                    break;
                case 9: //function
                    options.Add(CustomTokens.Function);
                    break;
                case 10: //whereStatement
                    break;
                case 11: //groupByStatement
                    break;
                case 12: //orderByStatement
                    break;
                case 13: //orderBySorting
                    options.Add(CustomTokens.OrderBySortingOption);
                    break;
                case 14: //expr
                    break;
                case 15: //specialFunctions
                    break;
                case 16: //specialParam
                    break;
                case 17: //parameterWithOptionalAlias
                    options.Add(CustomTokens.Variable);
                    options.Add(CustomTokens.Function);
                    break;
            }

            return options.ToArray();
        }
    }
    public class MissingInfo
    {
        public static CustomTokens[] Get(int ruleIndex, int tokenIndex=0)
        {
            var options = new List<CustomTokens>();
            switch (ruleIndex)
            {
                case 0: //prog
                    break;
                case 1: //fromStatement
                    break;
                case 2: //indexName
                    break;
                case 3: //loadStatement
                    options.Add(CustomTokens.Collection);
                    break;
                case 4: //selectStatement
                    break;
                case 5: //jsFunction
                    break;
                case 6: //jsCode
                    break;
                case 7: //alias
                    options.Add(CustomTokens.Alias);
                    break;
                case 8: //variable
                    options.Add(CustomTokens.Variable);
                    break;
                case 9: //function
                    break;
                case 10: //whereStatement
                    break;
                case 11:
                    options.Add(CustomTokens.GroupByVariable);
                    break;
                case 12: //orderByStatement
                    options.Add(CustomTokens.Variable);
                    break;
                case 13: //orderBySorting
                    break;
                case 14: //expr
                    break;
                case 15: //specialFunctions
                    break;
                case 16: //specialParam
                    break;
                case 17: //parameterWithOptionalAlias
                    options.Add(CustomTokens.Variable);
                    options.Add(CustomTokens.Function);
                    break;
            }

            return options.ToArray();
        }
    }
}
