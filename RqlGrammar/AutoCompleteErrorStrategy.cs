using System;
using System.Collections.Generic;
using System.Text;
using Antlr4.Runtime;

namespace RqlGrammar
{
    public class AutoCompleteErrorStrategy : DefaultErrorStrategy
    {

        protected override void ReportNoViableAlternative(Parser recognizer, NoViableAltException e)
        {
            
            recognizer.NotifyErrorListeners(e.OffendingToken,"Cant choose how to",e);
        }

        public override void Sync(Parser recognizer)
        {
            
        }
    }
}
