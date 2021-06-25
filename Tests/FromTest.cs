using System;
using Xunit;
using Antlr4;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using RqlGrammar;
using Xunit.Abstractions;

namespace Tests
{
    public class FromTest
    {
        [Fact]
        public void FromCollectionAllDocs()
        {
            var result = Act("from @all_docs");
            AssertNoErrors(result);
        }

        [Fact]
        public void FromCollectionAllDocsWithAlias()
        {
            var result = Act("from @all_docs as name");
            AssertWithError(result);
        }

        [Fact]
        public void FromCollectionByName()
        {
            var result = Act("from Name");
            AssertNoErrors(result);

        }

        [Fact]
        public void FromCollectionByNameWithAlias()
        {
            var result = Act("from Name as n");
            AssertNoErrors(result);

        }
        [Fact]
        public void FromByIndex()
        {
            var result = Act("from index 'IndexName/Test'");
            AssertNoErrors(result);
        }

        [Fact]
        public void FromByIndexWithAlias()
        {
            var result = Act("from index 'IndexName/Test' as name");
            AssertNoErrors(result);
        }

        [Fact]
        public void FromByIndexWithoutIndexKeyword()
        {
            var result = Act("from 'Collection/Name'");
            AssertWithError(result);
        }

        private RqlParser Act(string input)
        {
            var lexer = new RqlLexer(new AntlrInputStream(input));
            var parser = new RqlParser(new CommonTokenStream(lexer));
            parser.fromStatement();

            return parser;
        }

        private static void AssertNoErrors(RqlParser result)
        {
            Assert.Equal(0, result.NumberOfSyntaxErrors);
        }

        private static void AssertWithError(RqlParser result)
        {
            Assert.NotEqual(0,result.NumberOfSyntaxErrors);
        }
    }
}
