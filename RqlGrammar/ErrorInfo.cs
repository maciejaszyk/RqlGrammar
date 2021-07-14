using System;
using System.Collections.Generic;
using System.Text;

namespace RqlGrammar
{
    public class NoViableInfo
    {
        public static string Get(int ruleIndex, int tokenIndex = 0)
        {
            switch (ruleIndex)
            {
                case 0: //prog
                    break;
                case 1: //fromStatement
                    return $"Collection (as Alias)? | index 'IndexName' (as Alias) | @all_docs";
                case 2: //indexName
                    break;
                case 3: //loadStatement
                    break;
                case 4: //selectStatement
                    return $"Names of collection etc";
                case 5: //jsFunction
                    break;
                case 6: //jsCode
                    break;
                case 7: //alias
                    return "(alias name)";
                case 8: //variable
                    break;
                case 9: //function
                    break;
                case 10: //whereStatement
                    break;
                case 11: //groupByStatement
                    break;
                case 12: //orderByStatement
                    break;
                case 13: //orderBySorting
                    break;
                case 14: //expr
                    break;
                case 15: //specialFunctions
                    break;
                case 16: //specialParam
                    break;
            }
            return string.Empty;
        }
    }
    public class ErrorInfo
    {
        public static string Get(int ruleIndex, int tokenIndex=0)
        {
            switch (ruleIndex)
            {
                case 0: //prog
                    break;
                case 1: //fromStatement
                    break;
                case 2: //indexName
                    break;
                case 3: //loadStatement
                    break;
                case 4: //selectStatement
                    break;
                case 5: //jsFunction
                    break;
                case 6: //jsCode
                    break;
                case 7: //alias
                    return "(name of alias)";
                    break;
                case 8: //variable
                    break;
                case 9: //function
                    break;
                case 10: //whereStatement
                    break;
                case 11: //groupByStatement
                    break;
                case 12: //orderByStatement
                    break;
                case 13: //orderBySorting
                    break;
                case 14: //expr
                    break;
                case 15: //specialFunctions
                    break;
                case 16: //specialParam
                    break;
            }
            return "xd";
        }
    }
}
