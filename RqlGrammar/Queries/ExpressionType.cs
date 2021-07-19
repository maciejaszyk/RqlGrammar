using System;
using System.Collections.Generic;
using System.Text;

namespace RqlGrammar.Queries
{
    public enum ExpressionType
    {
        None,
        Field,
        Between,
        Binary,
        In,
        Value,
        Method,
        True,
        Negated,
        Pattern,
        WithEdge
    }
}
