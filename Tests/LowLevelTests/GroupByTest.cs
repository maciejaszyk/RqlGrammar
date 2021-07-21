using System;
using System.Collections.Generic;
using System.Text;
using Antlr4.Runtime;
using RqlGrammar;
using Xunit;

namespace Tests.LowLevelTests
{
    public class GroupByTest
    {
        [Theory]
        [InlineData("group by test")]
        [InlineData("group by m.test")]
        [InlineData("group by test()")]
        [InlineData("group by m.plapla, test()")]
        public void GroupByComplete(string input)
        {
            var result = Act(input);
            AssertNoErrors(result);
        }

        [Theory]
        [InlineData("group by []")]
        [InlineData("group test as test")]
        [InlineData("group by")]
        public void UnavailableCharactersInGroupByStatement(string input)
        {
            var result = Act(input);
            AssertWithErrors(result);
        }

        private RqlParser Act(string input)
        {
            var lexer = new RqlLexer(new AntlrInputStream(input));
            var parser = new RqlParser(new CommonTokenStream(lexer));
            parser.groupByStatement();

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
