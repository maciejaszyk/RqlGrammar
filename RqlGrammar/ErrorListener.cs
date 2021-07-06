using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Antlr4.Runtime;

namespace RqlGrammar
{
    public class ErrorListener : BaseErrorListener
    {

        public ErrorListener(){}

        public ErrorListener(List<ErrorMessage> list)
        {
            errors = list;
           
        }

        private bool _hasError = false;
        public bool HasError
        {
            get { return _hasError; }
            set{}
        } 
        public List<ErrorMessage> errors { get; set; }
        public override void SyntaxError(
            IRecognizer recognizer, 
            IToken offendingSymbol, 
            int line, 
            int charPositionInLine, 
            string msg,
            RecognitionException e)
        {
            
            _hasError = true;
            var stack = ((Parser) recognizer).GetRuleInvocationStack();
            foreach (var item in stack )
            {
                Console.WriteLine(item);
            }
            if (stack.Last() == "jsCode" || stack.Last() == "jsFunction")
            {
                Console.WriteLine("Got javascript insertion. Skipping.");
            }

            else
            {
                var s = new List<string>();
                if (e != null)
                {
                    foreach (var v in e.GetExpectedTokens().ToList())
                    {
                        s.Add(RqlParser.DefaultVocabulary.GetDisplayName(v));
                    }
                }
                var expected = string.Join(",", s);
                if(e is InputMismatchException)
                    errors?.Add(new ErrorMessage() { Line = line, CharPosition = charPositionInLine, Expected = expected});
                else errors?.Add(new ErrorMessage() { Line = line, CharPosition = charPositionInLine});
            }


        }
    }
}
