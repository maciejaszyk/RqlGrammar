using System;
using System.Collections.Generic;
using System.Text;

namespace RqlGrammar.Queries
{
    class Alias
    {
        public string Key { get; set; }
        public string Value { get; set; }
        public override string ToString()
        {
            return Key + '.' + Value;
        }
    }
}
