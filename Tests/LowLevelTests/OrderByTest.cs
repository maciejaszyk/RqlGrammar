using Antlr4.Runtime;
using RqlGrammar;
using Xunit;

namespace Tests.LowLevelTests
{
    public class OrderByTest
    {
        [Theory]
        [InlineData("order by test")]
        [InlineData("order by m.test")]
        [InlineData("order by test, ams, m.test")]
        [InlineData("order by m.test as string)")]
        [InlineData("order by m.test as ALPHANUMERIC desc")]
        [InlineData("order by m.test as LONG asc")]
        [InlineData("order by m.test as DOUBLE ascending")]
        [InlineData("order by m.test as DOUBLE descending")]

        public void OrderByComplete(string input)
        {
            var result = Act(input);
            AssertNoErrors(result);
        }

        [Theory]
        [InlineData("order test asc")]
        public void UnavailableCharactersInOrderByStatement(string input)
        {
            var result = Act(input);
            AssertWithErrors(result);
        }

        private RqlParser Act(string input)
        {
            var lexer = new RqlLexer(new AntlrInputStream(input));
            var parser = new RqlParser(new CommonTokenStream(lexer));
            parser.orderByStatement();

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
