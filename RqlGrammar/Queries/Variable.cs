using System;
using System.Collections.Generic;
using System.Text;

namespace RqlGrammar.Models
{
    enum VariableType
    {
        List,
        Variable
    }
    struct Variable
    {
        public string Alias { get; set; }
        public string Name { get; set; }
        public VariableType Type { get; set; }
    }
}
