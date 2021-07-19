using System;
using System.Collections.Generic;
using System.Linq.Expressions;
using System.Text;

namespace RqlGrammar.Queries
{
    public abstract class QueryExpression
    {
        public ExpressionType Type;

        public abstract override string ToString();

        public abstract bool Equals(QueryExpression other);
    }
}
