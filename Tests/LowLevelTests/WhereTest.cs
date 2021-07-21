using System;
using System.Collections.Generic;
using System.Text;
using Antlr4.Runtime;
using RqlGrammar;
using Xunit;

namespace Tests.LowLevelTests
{
    public class WhereTest
    {
        [Fact]
        void MathOperator()
        {
            var result = Act("where Value=1.0");
            AssertNoErrors(result);
        }

        [Fact]
        void BinaryOperator()
        {
            var result = Act("where Value=1.0 and Name='test'");
            AssertNoErrors(result);
        }

        [Fact]
        void ComplexBinaryOperators()
        {
            var result = Act("where (value=1.0 and Name='test') AND max = 'tests'");
            AssertNoErrors(result);
        }

        void ComplexBinaryOperator()
        {
            var result = Act("where (test = 10 and (x = 10 or (p <> null)))");
            AssertNoErrors(result);
        }

        void ComplexFailingBinaryOperator()
        {
            var result = Act("where (test = 10 and (x = 10 or (p <> null))");
            AssertNoErrors(result);
        }

        [Fact]
        void BetweenKeyword()
        {
            var result = Act("where Value between 10.0 and 15");
            AssertNoErrors(result);
        }


        private RqlParser Act(string input)
        {
            var lexer = new RqlLexer(new AntlrInputStream(input));
            var parser = new RqlParser(new CommonTokenStream(lexer));
            parser.whereStatement();
            
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
