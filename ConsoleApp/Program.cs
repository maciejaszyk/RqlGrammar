using System;
using System.Text;
using Antlr4.Runtime;
using RqlGrammar;

namespace ConsoleApp
{
    class Program
    {
        static void Main(string[] args)
        {
            var sb = new StringBuilder();
            string input;
            while ((input = Console.ReadLine()) != null)
            {
                sb.Append(input);
            }

            var lexer = new RqlLexer(new AntlrInputStream(sb.ToString()));
            var parser = new RqlParser(new CommonTokenStream(lexer));
            parser.AddErrorListener(new ErrorListener());
            parser.prog();
        }
    }
}
