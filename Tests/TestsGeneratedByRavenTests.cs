using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using Antlr4.Runtime;
using Newtonsoft.Json;
using RqlGrammar;
using Xunit;

namespace Tests
{

    public class TestsGeneratedByRavenTests
    {
        [Theory]
        [ClassData(typeof(TestsFromJson))]
        public void ExamplesFromDocs(string input)
        {
            var result = Act(input);
            AssertNoErrors(result,input);
        }

        private RqlParser Act(string input)
        {
            var lexer = new RqlLexer(new AntlrInputStream(input));
            var parser = new RqlParser(new CommonTokenStream(lexer));
            parser.prog();

            return parser;
        }

        private static object locker = new object();
        private static void AssertNoErrors(RqlParser result, string input)
        {
            if(result.NumberOfSyntaxErrors != 0)
                lock (locker)
                {
                    using (StreamWriter sw = File.AppendText("D:\\error.txt"))
                    {
                        sw.WriteLine(input);
                    }
                }
            Assert.Equal(0, result.NumberOfSyntaxErrors);
        }

        private class TestsFromJson : IEnumerable<object[]>
        {
            private readonly List<object[]> _data;

            public TestsFromJson()
            {
                var list = new List<object[]>();
                var data = JsonConvert.DeserializeObject<List<string>>(System.IO.File.ReadAllText(@"out2.json")).ToList();
                foreach (var item in data)
                {
                    list.Add(new object[]{item});
                }

                _data = list;
            }
            public IEnumerator<object[]> GetEnumerator() => _data.GetEnumerator();

            IEnumerator IEnumerable.GetEnumerator() => GetEnumerator();
        }
    }
}
