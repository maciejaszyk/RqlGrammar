using System;
using System.Collections.Generic;
using System.Text;
using Antlr4.Runtime;
using RqlGrammar;
using Xunit;

namespace Tests
{
    public class QueryTest
    {
        [Fact]
        public void BasicSelect()
        {
            var lexer = new RqlLexer(new AntlrInputStream("from @all_docs as x select test"));
            var parser = new RqlParser(new CommonTokenStream(lexer));
            parser.prog();
            Assert.Equal(0, parser.NumberOfSyntaxErrors);


        }
    }
}
