using System;
using System.Collections.Generic;
using System.Text;
using Antlr4.Runtime;

namespace RqlGrammar
{
    public class ErrorListener : BaseErrorListener
    {
        public List<String> errors { get; set; }
        public override void SyntaxError(
            IRecognizer recognizer, 
            IToken offendingSymbol, 
            int line, 
            int charPositionInLine, 
            string msg,
            RecognitionException e)
        {
            errors.Add($"");
        }
    }
}
