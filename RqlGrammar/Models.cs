using System;
using System.Collections.Generic;
using System.Text;

namespace RqlGrammar
{
    public class AutoComplete
    {
        public int Line { get; set; }
        public int CharPosition { get; set; }
        public string[] Purposes { get; set; }

    }
}
