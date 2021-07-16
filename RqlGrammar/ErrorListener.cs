using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using Antlr4.Runtime;

namespace RqlGrammar
{
    public class ErrorListener : BaseErrorListener
    {
        public List<ErrorMessage> ErrorList { get; }
        public bool HasError { get; private set; }
        public ErrorListener()
        {
        }

        public ErrorListener(List<ErrorMessage> errorList)
        {
            ErrorList = errorList;
        }

        private ErrorType GetErrorTypeFromSyntaxError(string message, RecognitionException e)
        {
            if (e is null)
                if (message[0] == 'e')
                    return ErrorType.InputExtraneousException;
                else if (message[0] == 'm')
                    return ErrorType.InputMissing;

            if (e is InputMismatchException)
                return ErrorType.InputMismatchException;

            if (e is NoViableAltException)
                return ErrorType.NoViableAltException;

            return ErrorType.NotImplemented;
        }
    

    public override void SyntaxError(IRecognizer recognizer, IToken offendingSymbol, int line,
        int charPositionInLine, string msg, RecognitionException e)
    {
        HasError = true;
        var parser = (Parser)recognizer; var expectedTokensIds =  parser.GetExpectedTokensWithinCurrentRule(); //GetExpectedTokens();
            var expectedTokenNames = new List<string>();

        foreach (var id in expectedTokensIds.ToList())
        {
            expectedTokenNames.Add(RqlLexer.DefaultVocabulary.GetDisplayName(id).ToLower());
        }

        
        
        ErrorList.Add(new ErrorMessage()
        {
            Line = line,
            CharPosition = charPositionInLine,
            RuleIndex = parser.RuleContext.RuleIndex,
            TokenIndex = parser.CurrentToken.TokenIndex,
            ExpectedToken = expectedTokenNames,
            OffendingSymbol = offendingSymbol.Text,
            ErrorType = GetErrorTypeFromSyntaxError(msg,e)
        });
    }
}
}
