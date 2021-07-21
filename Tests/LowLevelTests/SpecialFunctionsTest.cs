using Antlr4.Runtime;
using RqlGrammar;
using Xunit;
namespace Tests.LowLevelTests
{
   public class SpecialFunctionsTest
    {
        [Theory]
        [InlineData("morelikethis(id() = 'articles/1')")]
        [InlineData("morelikethis(id() = 'articles/1', '{ \"Fields\" : [ \"ArticleBody\" ] }')")]
        [InlineData("intersect(Manufacturer = 'Raven', Color = 'Blue' 'and' 'Size =' 'Small', Color = 'Gray' and Size = 'Large')")]
        public void SpecialFunctions(string input)
        {
            var result = Act(input);
            AssertNoErrors(result);
        }

        [Theory]
        [InlineData("morelikethis(id() = 'articles/1'. '{ \"Fields\" : [ \"ArticleBody\" ] }')")]
        [InlineData("intersect(Manufacturer = 'Raven', Color = 'Blue' Size = 'Small', Color = 'Gray' and Size = 'Large')")]
        public void SpecialFunctionsWithError(string input)
        {
            var result = Act(input);
            AssertWithErrors(result);
        }

        private RqlParser Act(string input)
        {
            var lexer = new RqlLexer(new AntlrInputStream(input));
            var parser = new RqlParser(new CommonTokenStream(lexer));
            parser.specialFunctions();

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
