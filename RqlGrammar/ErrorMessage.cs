using System;
using System.Collections.Generic;
using System.Text;

namespace RqlGrammar
{

    public enum ErrorType
    {
        InputMismatchException,
        InputMissingException,
        InputExtraneousException,
        InputMissing,
        NoViableAltException,
        NotImplemented
    }
    public class ErrorMessage
    {
        public ErrorMessage()
        {
            ExpectedToken = new List<string>();
        }
        public int Line { get; set; }
        public int CharPosition { get; set; }
        public int RuleIndex { get; set; }
        public int TokenIndex { get; set; }
        public List<string> ExpectedToken { get; set; }
        public string OffendingSymbol { get; set; }
        public ErrorType ErrorType { get; set; }
        public override string ToString()
        {
            
            switch (ErrorType)
            {
                case ErrorType.InputMissing:
                case ErrorType.NoViableAltException:
                    return $"Options: {(NoViableInfo.Get(RuleIndex) == string.Empty ? string.Join(",", ExpectedToken) : NoViableInfo.Get(RuleIndex))}";
                case ErrorType.InputExtraneousException:
                    var possibleMatches = new List<string>();
                    foreach (var item in ExpectedToken)
                    {
                        if (item.Contains(OffendingSymbol) == true)
                            possibleMatches.Add(item);
                    }
                    return $"Do you mean: ({string.Join(",", possibleMatches.Count == 0? ExpectedToken : possibleMatches)})";
                case ErrorType.InputMissingException:
                    return $"({Line},{CharPosition}): Write {ErrorInfo.Get(RuleIndex, TokenIndex)}. Available: ({string.Join(",", ExpectedToken)})";
                case ErrorType.InputMismatchException:
                    return $"({Line},{CharPosition}): Unexpected '{(OffendingSymbol.Contains( "<eof>" )? "end of query." : OffendingSymbol)}' Available: ({string.Join(",", ExpectedToken)})";
            }
            return "Not implemented";
        }
    }
}
