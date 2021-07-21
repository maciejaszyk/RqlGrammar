using System.Collections.Generic;
using Xunit;
using Antlr4.Runtime;
using RqlGrammar;

namespace Tests.LowLevelTests
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
        public void FromByAllDocsWithAlias()
        {
            var result = Act("from @all_docs as name");
            AssertWithError(result);
        }
        
        private ErrorMessage[] Act(string input)
        {
            var errorList = new List<ErrorMessage>();
            var lexer = new RqlLexer(new AntlrInputStream(input));
            var parser = new RqlParser(new CommonTokenStream(lexer));
            parser.RemoveErrorListeners();
            parser.AddErrorListener(new RqlGrammar.ErrorListener(errorList));
            parser.prog();
            return errorList.ToArray();
        }

        private static void AssertNoErrors(ErrorMessage[] result)
        {
            Assert.Empty(result);
        }
        private static void AssertWithError(ErrorMessage[] result)
        {
            Assert.NotEmpty(result);
        } 
    }
}
