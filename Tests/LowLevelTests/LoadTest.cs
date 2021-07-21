using System;
using System.Collections.Generic;
using System.Text;
using Antlr4.Runtime;
using RqlGrammar;
using Xunit;

namespace Tests.LowLevelTests
{
    public class LoadTest
    {
        [Fact]
        public void CompleteLoad()
        {
            var result = Act("load Col as i");
            AssertNoErrors(result);
        }

        [Theory]
        [InlineData("load")]
        [InlineData("load col")]
        [InlineData("load col as")]
        [InlineData("load col a")]
        public void UncompleteLoadStatement(string input)
        {
            var result = Act(input);
            AssertWithErrors(result);
        }

        private RqlParser Act(string input)
        {
            var lexer = new RqlLexer(new AntlrInputStream(input));
            var parser = new RqlParser(new CommonTokenStream(lexer));
            parser.loadStatement();

            return parser;
        }

        private static void AssertNoErrors(RqlParser result)
        {
            Assert.Equal(0, result.NumberOfSyntaxErrors);
        }
        private static void AssertWithErrors(RqlParser result)
        {
            Assert.NotEqual(0, result.NumberOfSyntaxErrors);
        }
    }
}
