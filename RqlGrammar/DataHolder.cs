using System;
using System.Collections.Generic;
using System.Text;
using RqlGrammar.Model;

namespace RqlGrammar
{
    
    public class DataHolder
    {
        public static DataHolder Instance = new DataHolder();
        public Dictionary<string, string> Aliases { get; }
        public From From { get; set; }
        public (string,string) LoadOption { get; set; }
        public DataHolder()
        {
            Aliases = new Dictionary<string, string>();
        }
    }
}
