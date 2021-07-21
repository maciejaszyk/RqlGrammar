using System;
using System.Collections.Generic;
using System.Text;
using Antlr4.Runtime;
using RqlGrammar;
using Xunit;

namespace Tests.LowLevelTests
{
    public class SelectTest
    {

        [Fact]
        public void SelectSingleItemFromCollection()
        {
            var result = Act("select abc");
            AssertNoErrors(result);
        }

        [Fact]
        public void SelectSingleItemWithAliasFromCollection()
        {
            var result = Act("select o.abc");
            AssertNoErrors(result);
        }

        [Fact]
        public void SelectMultipleItemsFromCollection()
        {
            var result = Act("select abc,egv,asd,   aer, qwe");
            AssertNoErrors(result);
        }

        [Fact]
        public void SelectMultipleItemsWithAliasFromCollection()
        {
            var result = Act("select o.abc,o.egv,o.asd,   o.aer, qwe");
            AssertNoErrors(result);
        }

        [Fact]
        public void SelectMultipleItemsWithAliasAndFunctionsFromCollection()
        {
            var result = Act("select Employee as EmployeeIdentifier, count(), Company");
            AssertNoErrors(result);
        }

        private RqlParser Act(string input)
        {
            var lexer = new RqlLexer(new AntlrInputStream(input));
            var parser = new RqlParser(new CommonTokenStream(lexer));
            parser.selectStatement();

            return parser;
        }

        private static void AssertNoErrors(RqlParser result)
        {
            Assert.Equal(0, result.NumberOfSyntaxErrors);
        }
    }
}
