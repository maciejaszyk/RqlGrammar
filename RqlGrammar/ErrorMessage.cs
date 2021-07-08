using System;
using System.Collections.Generic;
using System.Text;

namespace RqlGrammar
{
    public class ErrorMessage
    {
        public int Line { get; set; }
        public int CharPosition { get; set; }
        public string Expected { get; set; }
        public override string ToString()
        {
            return $"Error at ({Line};{CharPosition}). " +( Expected == null ? "Non-acceptable state. Check last word." : $"Expected {Expected}");
        }
    }
}
