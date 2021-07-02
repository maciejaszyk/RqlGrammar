// Generated from c:\workspace\antlr\RqlGrammar\RqlGrammar\RqlLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FROM=1, AS=2, SELECT=3, WHERE=4, INDEX=5, GROUP_BY=6, DECLARE=7, ORDER_BY=8, 
		LOAD=9, INCLUDE=10, ENDS_WITH=11, STARTS_WITH=12, WITH=13, MATCH=14, ALL_DOCS=15, 
		BETWEEN=16, IN=17, AND=18, NOT=19, MATH_OPERATOR=20, MORE_CHAR=21, MORE_OR_EQUAL=22, 
		LESS_CHAR=23, LESS_OR_EQUAL=24, EQUAL=25, NOT_EQUAL=26, ALL_IN=27, OR=28, 
		WORD=29, INT=30, DOUBLE=31, QUOTE=32, BACK_SLASH=33, FORWARD_SLASH=34, 
		DIGIT=35, COMMA=36, DOT=37, OPEN_CURLY=38, CLOSE_CURLY=39, OPEN_PAREN=40, 
		CLOSE_PAREN=41, OPEN_BRACKET=42, CLOSE_BRACKET=43, AT=44, UNDERSCORE=45, 
		WS=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FROM", "AS", "SELECT", "WHERE", "INDEX", "GROUP_BY", "DECLARE", "ORDER_BY", 
			"LOAD", "INCLUDE", "ENDS_WITH", "STARTS_WITH", "WITH", "MATCH", "ALL_DOCS", 
			"BETWEEN", "IN", "AND", "NOT", "MATH_OPERATOR", "MORE_CHAR", "MORE_OR_EQUAL", 
			"LESS_CHAR", "LESS_OR_EQUAL", "EQUAL", "NOT_EQUAL", "ALL_IN", "OR", "WORD", 
			"INT", "DOUBLE", "QUOTE", "BACK_SLASH", "FORWARD_SLASH", "DIGIT", "COMMA", 
			"DOT", "OPEN_CURLY", "CLOSE_CURLY", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "AT", "UNDERSCORE", "A", "B", "C", "D", "E", "F", "G", 
			"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
			"V", "W", "X", "Y", "Z", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'@all_docs'", null, null, null, null, null, "'>'", 
			"'>='", "'<'", "'<='", null, null, null, null, null, null, null, "'''", 
			"'\\'", "'/'", null, "','", "'.'", "'{'", "'}'", "'('", "')'", "'['", 
			"']'", "'@'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FROM", "AS", "SELECT", "WHERE", "INDEX", "GROUP_BY", "DECLARE", 
			"ORDER_BY", "LOAD", "INCLUDE", "ENDS_WITH", "STARTS_WITH", "WITH", "MATCH", 
			"ALL_DOCS", "BETWEEN", "IN", "AND", "NOT", "MATH_OPERATOR", "MORE_CHAR", 
			"MORE_OR_EQUAL", "LESS_CHAR", "LESS_OR_EQUAL", "EQUAL", "NOT_EQUAL", 
			"ALL_IN", "OR", "WORD", "INT", "DOUBLE", "QUOTE", "BACK_SLASH", "FORWARD_SLASH", 
			"DIGIT", "COMMA", "DOT", "OPEN_CURLY", "CLOSE_CURLY", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "AT", "UNDERSCORE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public RqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RqlLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u01aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0118\n\25\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u0127\n\32\3\33\3\33\3\33\3\33"+
		"\5\33\u012d\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\6\36\u013a\n\36\r\36\16\36\u013b\3\37\5\37\u013f\n\37\3\37\6\37\u0142"+
		"\n\37\r\37\16\37\u0143\3 \5 \u0147\n \3 \6 \u014a\n \r \16 \u014b\3 \3"+
		" \6 \u0150\n \r \16 \u0151\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D"+
		"\3E\3E\3F\3F\3G\3G\3H\3H\3I\6I\u01a5\nI\rI\16I\u01a6\3I\3I\2\2J\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2"+
		"w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d"+
		"\2\u008f\2\u0091\60\3\2\37\4\2C\\c|\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4"+
		"\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNn"+
		"n\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2"+
		"WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\"\2\u019d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2"+
		"\2\2\5\u0098\3\2\2\2\7\u009b\3\2\2\2\t\u00a2\3\2\2\2\13\u00a8\3\2\2\2"+
		"\r\u00ae\3\2\2\2\17\u00b7\3\2\2\2\21\u00bf\3\2\2\2\23\u00c8\3\2\2\2\25"+
		"\u00cd\3\2\2\2\27\u00d5\3\2\2\2\31\u00de\3\2\2\2\33\u00e9\3\2\2\2\35\u00ee"+
		"\3\2\2\2\37\u00f4\3\2\2\2!\u00fe\3\2\2\2#\u0106\3\2\2\2%\u0109\3\2\2\2"+
		"\'\u010d\3\2\2\2)\u0117\3\2\2\2+\u0119\3\2\2\2-\u011b\3\2\2\2/\u011e\3"+
		"\2\2\2\61\u0120\3\2\2\2\63\u0126\3\2\2\2\65\u012c\3\2\2\2\67\u012e\3\2"+
		"\2\29\u0135\3\2\2\2;\u0139\3\2\2\2=\u013e\3\2\2\2?\u0146\3\2\2\2A\u0153"+
		"\3\2\2\2C\u0155\3\2\2\2E\u0157\3\2\2\2G\u0159\3\2\2\2I\u015b\3\2\2\2K"+
		"\u015d\3\2\2\2M\u015f\3\2\2\2O\u0161\3\2\2\2Q\u0163\3\2\2\2S\u0165\3\2"+
		"\2\2U\u0167\3\2\2\2W\u0169\3\2\2\2Y\u016b\3\2\2\2[\u016d\3\2\2\2]\u016f"+
		"\3\2\2\2_\u0171\3\2\2\2a\u0173\3\2\2\2c\u0175\3\2\2\2e\u0177\3\2\2\2g"+
		"\u0179\3\2\2\2i\u017b\3\2\2\2k\u017d\3\2\2\2m\u017f\3\2\2\2o\u0181\3\2"+
		"\2\2q\u0183\3\2\2\2s\u0185\3\2\2\2u\u0187\3\2\2\2w\u0189\3\2\2\2y\u018b"+
		"\3\2\2\2{\u018d\3\2\2\2}\u018f\3\2\2\2\177\u0191\3\2\2\2\u0081\u0193\3"+
		"\2\2\2\u0083\u0195\3\2\2\2\u0085\u0197\3\2\2\2\u0087\u0199\3\2\2\2\u0089"+
		"\u019b\3\2\2\2\u008b\u019d\3\2\2\2\u008d\u019f\3\2\2\2\u008f\u01a1\3\2"+
		"\2\2\u0091\u01a4\3\2\2\2\u0093\u0094\5g\64\2\u0094\u0095\5\177@\2\u0095"+
		"\u0096\5y=\2\u0096\u0097\5u;\2\u0097\4\3\2\2\2\u0098\u0099\5]/\2\u0099"+
		"\u009a\5\u0081A\2\u009a\6\3\2\2\2\u009b\u009c\5\u0081A\2\u009c\u009d\5"+
		"e\63\2\u009d\u009e\5s:\2\u009e\u009f\5e\63\2\u009f\u00a0\5a\61\2\u00a0"+
		"\u00a1\5\u0083B\2\u00a1\b\3\2\2\2\u00a2\u00a3\5\u0089E\2\u00a3\u00a4\5"+
		"k\66\2\u00a4\u00a5\5e\63\2\u00a5\u00a6\5\177@\2\u00a6\u00a7\5e\63\2\u00a7"+
		"\n\3\2\2\2\u00a8\u00a9\5m\67\2\u00a9\u00aa\5w<\2\u00aa\u00ab\5c\62\2\u00ab"+
		"\u00ac\5e\63\2\u00ac\u00ad\5\u008bF\2\u00ad\f\3\2\2\2\u00ae\u00af\5i\65"+
		"\2\u00af\u00b0\5\177@\2\u00b0\u00b1\5y=\2\u00b1\u00b2\5\u0085C\2\u00b2"+
		"\u00b3\5{>\2\u00b3\u00b4\7\"\2\2\u00b4\u00b5\5_\60\2\u00b5\u00b6\5\u008d"+
		"G\2\u00b6\16\3\2\2\2\u00b7\u00b8\5c\62\2\u00b8\u00b9\5e\63\2\u00b9\u00ba"+
		"\5a\61\2\u00ba\u00bb\5s:\2\u00bb\u00bc\5]/\2\u00bc\u00bd\5\177@\2\u00bd"+
		"\u00be\5e\63\2\u00be\20\3\2\2\2\u00bf\u00c0\5y=\2\u00c0\u00c1\5\177@\2"+
		"\u00c1\u00c2\5c\62\2\u00c2\u00c3\5e\63\2\u00c3\u00c4\5\177@\2\u00c4\u00c5"+
		"\7\"\2\2\u00c5\u00c6\5_\60\2\u00c6\u00c7\5\u008dG\2\u00c7\22\3\2\2\2\u00c8"+
		"\u00c9\5s:\2\u00c9\u00ca\5y=\2\u00ca\u00cb\5]/\2\u00cb\u00cc\5c\62\2\u00cc"+
		"\24\3\2\2\2\u00cd\u00ce\5m\67\2\u00ce\u00cf\5w<\2\u00cf\u00d0\5a\61\2"+
		"\u00d0\u00d1\5s:\2\u00d1\u00d2\5\u0085C\2\u00d2\u00d3\5c\62\2\u00d3\u00d4"+
		"\5e\63\2\u00d4\26\3\2\2\2\u00d5\u00d6\5e\63\2\u00d6\u00d7\5w<\2\u00d7"+
		"\u00d8\5c\62\2\u00d8\u00d9\5\u0081A\2\u00d9\u00da\5\u0089E\2\u00da\u00db"+
		"\5m\67\2\u00db\u00dc\5\u0083B\2\u00dc\u00dd\5k\66\2\u00dd\30\3\2\2\2\u00de"+
		"\u00df\5\u0081A\2\u00df\u00e0\5\u0083B\2\u00e0\u00e1\5]/\2\u00e1\u00e2"+
		"\5\177@\2\u00e2\u00e3\5\u0083B\2\u00e3\u00e4\5\u0081A\2\u00e4\u00e5\5"+
		"\u0089E\2\u00e5\u00e6\5m\67\2\u00e6\u00e7\5\u0083B\2\u00e7\u00e8\5k\66"+
		"\2\u00e8\32\3\2\2\2\u00e9\u00ea\5\u0089E\2\u00ea\u00eb\5m\67\2\u00eb\u00ec"+
		"\5\u0083B\2\u00ec\u00ed\5k\66\2\u00ed\34\3\2\2\2\u00ee\u00ef\5u;\2\u00ef"+
		"\u00f0\5]/\2\u00f0\u00f1\5\u0083B\2\u00f1\u00f2\5a\61\2\u00f2\u00f3\5"+
		"k\66\2\u00f3\36\3\2\2\2\u00f4\u00f5\7B\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7"+
		"\7n\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7a\2\2\u00f9\u00fa\7f\2\2\u00fa"+
		"\u00fb\7q\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7u\2\2\u00fd \3\2\2\2\u00fe"+
		"\u00ff\5_\60\2\u00ff\u0100\5e\63\2\u0100\u0101\5\u0083B\2\u0101\u0102"+
		"\5\u0089E\2\u0102\u0103\5e\63\2\u0103\u0104\5e\63\2\u0104\u0105\5w<\2"+
		"\u0105\"\3\2\2\2\u0106\u0107\5m\67\2\u0107\u0108\5w<\2\u0108$\3\2\2\2"+
		"\u0109\u010a\5]/\2\u010a\u010b\5w<\2\u010b\u010c\5c\62\2\u010c&\3\2\2"+
		"\2\u010d\u010e\5w<\2\u010e\u010f\5y=\2\u010f\u0110\5\u0083B\2\u0110(\3"+
		"\2\2\2\u0111\u0118\5-\27\2\u0112\u0118\5+\26\2\u0113\u0118\5/\30\2\u0114"+
		"\u0118\5\61\31\2\u0115\u0118\5\63\32\2\u0116\u0118\5\65\33\2\u0117\u0111"+
		"\3\2\2\2\u0117\u0112\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118*\3\2\2\2\u0119\u011a\7@\2\2\u011a"+
		",\3\2\2\2\u011b\u011c\7@\2\2\u011c\u011d\7?\2\2\u011d.\3\2\2\2\u011e\u011f"+
		"\7>\2\2\u011f\60\3\2\2\2\u0120\u0121\7>\2\2\u0121\u0122\7?\2\2\u0122\62"+
		"\3\2\2\2\u0123\u0127\7?\2\2\u0124\u0125\7?\2\2\u0125\u0127\7?\2\2\u0126"+
		"\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0127\64\3\2\2\2\u0128\u0129\7>\2\2"+
		"\u0129\u012d\7@\2\2\u012a\u012b\7#\2\2\u012b\u012d\7?\2\2\u012c\u0128"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012d\66\3\2\2\2\u012e\u012f\5]/\2\u012f"+
		"\u0130\5s:\2\u0130\u0131\5s:\2\u0131\u0132\7\"\2\2\u0132\u0133\5m\67\2"+
		"\u0133\u0134\5w<\2\u01348\3\2\2\2\u0135\u0136\5y=\2\u0136\u0137\5\177"+
		"@\2\u0137:\3\2\2\2\u0138\u013a\t\2\2\2\u0139\u0138\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c<\3\2\2\2\u013d"+
		"\u013f\7/\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2"+
		"\2\2\u0140\u0142\5G$\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144>\3\2\2\2\u0145\u0147\7/\2\2\u0146\u0145"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u014a\5G$\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014f\5K&\2\u014e\u0150\5G$\2\u014f\u014e"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"@\3\2\2\2\u0153\u0154\7)\2\2\u0154B\3\2\2\2\u0155\u0156\7^\2\2\u0156D"+
		"\3\2\2\2\u0157\u0158\7\61\2\2\u0158F\3\2\2\2\u0159\u015a\t\3\2\2\u015a"+
		"H\3\2\2\2\u015b\u015c\7.\2\2\u015cJ\3\2\2\2\u015d\u015e\7\60\2\2\u015e"+
		"L\3\2\2\2\u015f\u0160\7}\2\2\u0160N\3\2\2\2\u0161\u0162\7\177\2\2\u0162"+
		"P\3\2\2\2\u0163\u0164\7*\2\2\u0164R\3\2\2\2\u0165\u0166\7+\2\2\u0166T"+
		"\3\2\2\2\u0167\u0168\7]\2\2\u0168V\3\2\2\2\u0169\u016a\7_\2\2\u016aX\3"+
		"\2\2\2\u016b\u016c\7B\2\2\u016cZ\3\2\2\2\u016d\u016e\7a\2\2\u016e\\\3"+
		"\2\2\2\u016f\u0170\t\4\2\2\u0170^\3\2\2\2\u0171\u0172\t\5\2\2\u0172`\3"+
		"\2\2\2\u0173\u0174\t\6\2\2\u0174b\3\2\2\2\u0175\u0176\t\7\2\2\u0176d\3"+
		"\2\2\2\u0177\u0178\t\b\2\2\u0178f\3\2\2\2\u0179\u017a\t\t\2\2\u017ah\3"+
		"\2\2\2\u017b\u017c\t\n\2\2\u017cj\3\2\2\2\u017d\u017e\t\13\2\2\u017el"+
		"\3\2\2\2\u017f\u0180\t\f\2\2\u0180n\3\2\2\2\u0181\u0182\t\r\2\2\u0182"+
		"p\3\2\2\2\u0183\u0184\t\16\2\2\u0184r\3\2\2\2\u0185\u0186\t\17\2\2\u0186"+
		"t\3\2\2\2\u0187\u0188\t\20\2\2\u0188v\3\2\2\2\u0189\u018a\t\21\2\2\u018a"+
		"x\3\2\2\2\u018b\u018c\t\22\2\2\u018cz\3\2\2\2\u018d\u018e\t\23\2\2\u018e"+
		"|\3\2\2\2\u018f\u0190\t\24\2\2\u0190~\3\2\2\2\u0191\u0192\t\25\2\2\u0192"+
		"\u0080\3\2\2\2\u0193\u0194\t\26\2\2\u0194\u0082\3\2\2\2\u0195\u0196\t"+
		"\27\2\2\u0196\u0084\3\2\2\2\u0197\u0198\t\30\2\2\u0198\u0086\3\2\2\2\u0199"+
		"\u019a\t\31\2\2\u019a\u0088\3\2\2\2\u019b\u019c\t\32\2\2\u019c\u008a\3"+
		"\2\2\2\u019d\u019e\t\33\2\2\u019e\u008c\3\2\2\2\u019f\u01a0\t\34\2\2\u01a0"+
		"\u008e\3\2\2\2\u01a1\u01a2\t\35\2\2\u01a2\u0090\3\2\2\2\u01a3\u01a5\t"+
		"\36\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\bI\2\2\u01a9\u0092\3\2"+
		"\2\2\r\2\u0117\u0126\u012c\u013b\u013e\u0143\u0146\u014b\u0151\u01a6\3"+
		"\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}