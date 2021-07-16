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
                    return $"({Line},{CharPosition}): {(NoViableInfo.Get(RuleIndex).Length == 0 ? string.Join(",", ExpectedToken) : string.Join(",",NoViableInfo.Get(RuleIndex)))}";
                case ErrorType.InputExtraneousException:
                    return $"({Line},{CharPosition}): ({string.Join(",", ExpectedToken)})";
                case ErrorType.InputMissingException:
                case ErrorType.InputMismatchException:
                    var output = string.Join(",", MissingInfo.Get(RuleIndex));
                    return $"({Line},{CharPosition}): " +
                           $"({output},{(output.Length != 0 ? string.Empty : string.Join(",", ExpectedToken))})";
            }
            return "Not implemented";
        }
    }
}
