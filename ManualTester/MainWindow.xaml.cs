using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using Antlr4.Runtime;
using RqlGrammar;
using RqlGrammar.Visitors;

namespace ManualTester
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            //for (int i = 0; i < RqlLexer.DefaultVocabulary.MaxTokenType; i++)
            //{
            //    Rql.Text += "{" + i.ToString() + ",\"" + RqlLexer.DefaultVocabulary.(i) + "\"}\n";
            //}
        }

      

        private void Rql_OnTextChanged(object sender, TextChangedEventArgs e)
        {
            if(Rql.Text.Length == 0 ||  cbParser.IsChecked == false) return;
            //if(Rql.Text[Rql.Text.Length-1] != ' ') return;
            int pos = 0;
            var list = new List<ErrorMessage>();
            var lexer = new RqlLexer(new AntlrInputStream(Rql.Text));
            var parser = new RqlParser(new CommonTokenStream(lexer));
          //  parser.ErrorHandler = new AutoCompleteErrorStrategy();
            parser.RemoveErrorListeners();
            parser.AddErrorListener(new RqlGrammar.ErrorListener(list));
            var context = parser.prog();
            var visitor = new ProgVisitor();
            
          //  visitor.Visit(context);
            ErrorBox.Text = "";
            var t = DataHolder.Instance.From;
            foreach (var err in list)
            {
                ErrorBox.Text += err.ToString() + Environment.NewLine;
            }


        }
    }
}
