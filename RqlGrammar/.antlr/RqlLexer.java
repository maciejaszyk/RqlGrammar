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
		FROM=1, AS=2, SELECT=3, WHERE=4, INDEX=5, GROUP_BY=6, NAME=7, DECLARE=8, 
		ORDER_BY=9, LOAD=10, INCLUDE=11, WITH=12, MATCH=13, ALL_DOCS=14, BETWEEN=15, 
		IN=16, AND=17, MATH_OPERATOR=18, MORE_CHAR=19, MORE_OR_EQUAL=20, LESS_CHAR=21, 
		LESS_OR_EQUAL=22, EQUAL=23, NOT_EQUAL=24, ALL_IN=25, OR=26, WORD=27, INT=28, 
		DOUBLE=29, QUOTE=30, BACK_SLASH=31, FORWARD_SLASH=32, DIGIT=33, COMMA=34, 
		DOT=35, OPEN_CURLY=36, CLOSE_CURLY=37, OPEN_PAREN=38, CLOSE_PAREN=39, 
		OPEN_BRACKET=40, CLOSE_BRACKET=41, AT=42, UNDERSCORE=43, WS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FROM", "AS", "SELECT", "WHERE", "INDEX", "GROUP_BY", "NAME", "DECLARE", 
			"ORDER_BY", "LOAD", "INCLUDE", "WITH", "MATCH", "ALL_DOCS", "BETWEEN", 
			"IN", "AND", "MATH_OPERATOR", "MORE_CHAR", "MORE_OR_EQUAL", "LESS_CHAR", 
			"LESS_OR_EQUAL", "EQUAL", "NOT_EQUAL", "ALL_IN", "OR", "WORD", "INT", 
			"DOUBLE", "QUOTE", "BACK_SLASH", "FORWARD_SLASH", "DIGIT", "COMMA", "DOT", 
			"OPEN_CURLY", "CLOSE_CURLY", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "AT", "UNDERSCORE", "A", "B", "C", "D", "E", "F", "G", 
			"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
			"V", "W", "X", "Y", "Z", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'@all_docs'", null, null, null, null, "'>'", "'>='", "'<'", 
			"'<='", null, null, null, null, null, null, null, "'''", "'\\'", "'/'", 
			null, "','", "'.'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'@'", 
			"'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FROM", "AS", "SELECT", "WHERE", "INDEX", "GROUP_BY", "NAME", "DECLARE", 
			"ORDER_BY", "LOAD", "INCLUDE", "WITH", "MATCH", "ALL_DOCS", "BETWEEN", 
			"IN", "AND", "MATH_OPERATOR", "MORE_CHAR", "MORE_OR_EQUAL", "LESS_CHAR", 
			"LESS_OR_EQUAL", "EQUAL", "NOT_EQUAL", "ALL_IN", "OR", "WORD", "INT", 
			"DOUBLE", "QUOTE", "BACK_SLASH", "FORWARD_SLASH", "DIGIT", "COMMA", "DOT", 
			"OPEN_CURLY", "CLOSE_CURLY", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "AT", "UNDERSCORE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u018c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0100"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\5\30\u010f\n\30\3\31\3\31\3\31\3\31\5\31\u0115\n\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\6\34\u0122\n\34\r\34\16\34\u0123"+
		"\3\35\6\35\u0127\n\35\r\35\16\35\u0128\3\36\6\36\u012c\n\36\r\36\16\36"+
		"\u012d\3\36\3\36\6\36\u0132\n\36\r\36\16\36\u0133\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\6G\u0187\nG\rG"+
		"\16G\u0188\3G\3G\2\2H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2]\2_\2a\2c\2e"+
		"\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d.\3\2\37\4\2C\\c|\3\2\62;\4\2CCcc\4\2DDdd\4\2"+
		"EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4"+
		"\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVv"+
		"v\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\""+
		"\2\u017d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0094"+
		"\3\2\2\2\7\u0097\3\2\2\2\t\u009e\3\2\2\2\13\u00a4\3\2\2\2\r\u00aa\3\2"+
		"\2\2\17\u00b3\3\2\2\2\21\u00b7\3\2\2\2\23\u00bf\3\2\2\2\25\u00c8\3\2\2"+
		"\2\27\u00cd\3\2\2\2\31\u00d5\3\2\2\2\33\u00da\3\2\2\2\35\u00e0\3\2\2\2"+
		"\37\u00ea\3\2\2\2!\u00f2\3\2\2\2#\u00f5\3\2\2\2%\u00ff\3\2\2\2\'\u0101"+
		"\3\2\2\2)\u0103\3\2\2\2+\u0106\3\2\2\2-\u0108\3\2\2\2/\u010e\3\2\2\2\61"+
		"\u0114\3\2\2\2\63\u0116\3\2\2\2\65\u011d\3\2\2\2\67\u0121\3\2\2\29\u0126"+
		"\3\2\2\2;\u012b\3\2\2\2=\u0135\3\2\2\2?\u0137\3\2\2\2A\u0139\3\2\2\2C"+
		"\u013b\3\2\2\2E\u013d\3\2\2\2G\u013f\3\2\2\2I\u0141\3\2\2\2K\u0143\3\2"+
		"\2\2M\u0145\3\2\2\2O\u0147\3\2\2\2Q\u0149\3\2\2\2S\u014b\3\2\2\2U\u014d"+
		"\3\2\2\2W\u014f\3\2\2\2Y\u0151\3\2\2\2[\u0153\3\2\2\2]\u0155\3\2\2\2_"+
		"\u0157\3\2\2\2a\u0159\3\2\2\2c\u015b\3\2\2\2e\u015d\3\2\2\2g\u015f\3\2"+
		"\2\2i\u0161\3\2\2\2k\u0163\3\2\2\2m\u0165\3\2\2\2o\u0167\3\2\2\2q\u0169"+
		"\3\2\2\2s\u016b\3\2\2\2u\u016d\3\2\2\2w\u016f\3\2\2\2y\u0171\3\2\2\2{"+
		"\u0173\3\2\2\2}\u0175\3\2\2\2\177\u0177\3\2\2\2\u0081\u0179\3\2\2\2\u0083"+
		"\u017b\3\2\2\2\u0085\u017d\3\2\2\2\u0087\u017f\3\2\2\2\u0089\u0181\3\2"+
		"\2\2\u008b\u0183\3\2\2\2\u008d\u0186\3\2\2\2\u008f\u0090\5c\62\2\u0090"+
		"\u0091\5{>\2\u0091\u0092\5u;\2\u0092\u0093\5q9\2\u0093\4\3\2\2\2\u0094"+
		"\u0095\5Y-\2\u0095\u0096\5}?\2\u0096\6\3\2\2\2\u0097\u0098\5}?\2\u0098"+
		"\u0099\5a\61\2\u0099\u009a\5o8\2\u009a\u009b\5a\61\2\u009b\u009c\5]/\2"+
		"\u009c\u009d\5\177@\2\u009d\b\3\2\2\2\u009e\u009f\5\u0085C\2\u009f\u00a0"+
		"\5g\64\2\u00a0\u00a1\5a\61\2\u00a1\u00a2\5{>\2\u00a2\u00a3\5a\61\2\u00a3"+
		"\n\3\2\2\2\u00a4\u00a5\5i\65\2\u00a5\u00a6\5s:\2\u00a6\u00a7\5_\60\2\u00a7"+
		"\u00a8\5a\61\2\u00a8\u00a9\5\u0087D\2\u00a9\f\3\2\2\2\u00aa\u00ab\5e\63"+
		"\2\u00ab\u00ac\5{>\2\u00ac\u00ad\5u;\2\u00ad\u00ae\5\u0081A\2\u00ae\u00af"+
		"\5w<\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\5[.\2\u00b1\u00b2\5\u0089E\2\u00b2"+
		"\16\3\2\2\2\u00b3\u00b4\5=\37\2\u00b4\u00b5\5\67\34\2\u00b5\u00b6\5=\37"+
		"\2\u00b6\20\3\2\2\2\u00b7\u00b8\5_\60\2\u00b8\u00b9\5a\61\2\u00b9\u00ba"+
		"\5]/\2\u00ba\u00bb\5o8\2\u00bb\u00bc\5Y-\2\u00bc\u00bd\5{>\2\u00bd\u00be"+
		"\5a\61\2\u00be\22\3\2\2\2\u00bf\u00c0\5u;\2\u00c0\u00c1\5{>\2\u00c1\u00c2"+
		"\5_\60\2\u00c2\u00c3\5a\61\2\u00c3\u00c4\5{>\2\u00c4\u00c5\7\"\2\2\u00c5"+
		"\u00c6\5[.\2\u00c6\u00c7\5\u0089E\2\u00c7\24\3\2\2\2\u00c8\u00c9\5o8\2"+
		"\u00c9\u00ca\5u;\2\u00ca\u00cb\5Y-\2\u00cb\u00cc\5_\60\2\u00cc\26\3\2"+
		"\2\2\u00cd\u00ce\5i\65\2\u00ce\u00cf\5s:\2\u00cf\u00d0\5]/\2\u00d0\u00d1"+
		"\5o8\2\u00d1\u00d2\5\u0081A\2\u00d2\u00d3\5_\60\2\u00d3\u00d4\5a\61\2"+
		"\u00d4\30\3\2\2\2\u00d5\u00d6\5\u0085C\2\u00d6\u00d7\5i\65\2\u00d7\u00d8"+
		"\5\177@\2\u00d8\u00d9\5g\64\2\u00d9\32\3\2\2\2\u00da\u00db\5q9\2\u00db"+
		"\u00dc\5Y-\2\u00dc\u00dd\5\177@\2\u00dd\u00de\5]/\2\u00de\u00df\5g\64"+
		"\2\u00df\34\3\2\2\2\u00e0\u00e1\7B\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3"+
		"\7n\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7a\2\2\u00e5\u00e6\7f\2\2\u00e6"+
		"\u00e7\7q\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7u\2\2\u00e9\36\3\2\2\2\u00ea"+
		"\u00eb\5[.\2\u00eb\u00ec\5a\61\2\u00ec\u00ed\5\177@\2\u00ed\u00ee\5\u0085"+
		"C\2\u00ee\u00ef\5a\61\2\u00ef\u00f0\5a\61\2\u00f0\u00f1\5s:\2\u00f1 \3"+
		"\2\2\2\u00f2\u00f3\5i\65\2\u00f3\u00f4\5s:\2\u00f4\"\3\2\2\2\u00f5\u00f6"+
		"\5Y-\2\u00f6\u00f7\5s:\2\u00f7\u00f8\5_\60\2\u00f8$\3\2\2\2\u00f9\u0100"+
		"\5)\25\2\u00fa\u0100\5\'\24\2\u00fb\u0100\5+\26\2\u00fc\u0100\5-\27\2"+
		"\u00fd\u0100\5/\30\2\u00fe\u0100\5\61\31\2\u00ff\u00f9\3\2\2\2\u00ff\u00fa"+
		"\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100&\3\2\2\2\u0101\u0102\7@\2\2\u0102(\3\2\2\2\u0103"+
		"\u0104\7@\2\2\u0104\u0105\7?\2\2\u0105*\3\2\2\2\u0106\u0107\7>\2\2\u0107"+
		",\3\2\2\2\u0108\u0109\7>\2\2\u0109\u010a\7?\2\2\u010a.\3\2\2\2\u010b\u010f"+
		"\7?\2\2\u010c\u010d\7?\2\2\u010d\u010f\7?\2\2\u010e\u010b\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\60\3\2\2\2\u0110\u0111\7>\2\2\u0111\u0115\7@\2\2"+
		"\u0112\u0113\7#\2\2\u0113\u0115\7?\2\2\u0114\u0110\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0115\62\3\2\2\2\u0116\u0117\5Y-\2\u0117\u0118\5o8\2\u0118\u0119"+
		"\5o8\2\u0119\u011a\7\"\2\2\u011a\u011b\5i\65\2\u011b\u011c\5s:\2\u011c"+
		"\64\3\2\2\2\u011d\u011e\5u;\2\u011e\u011f\5{>\2\u011f\66\3\2\2\2\u0120"+
		"\u0122\t\2\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u01248\3\2\2\2\u0125\u0127\5C\"\2\u0126\u0125"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		":\3\2\2\2\u012a\u012c\5C\"\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\5G"+
		"$\2\u0130\u0132\5C\"\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134<\3\2\2\2\u0135\u0136\7)\2\2\u0136>"+
		"\3\2\2\2\u0137\u0138\7^\2\2\u0138@\3\2\2\2\u0139\u013a\7\61\2\2\u013a"+
		"B\3\2\2\2\u013b\u013c\t\3\2\2\u013cD\3\2\2\2\u013d\u013e\7.\2\2\u013e"+
		"F\3\2\2\2\u013f\u0140\7\60\2\2\u0140H\3\2\2\2\u0141\u0142\7}\2\2\u0142"+
		"J\3\2\2\2\u0143\u0144\7\177\2\2\u0144L\3\2\2\2\u0145\u0146\7*\2\2\u0146"+
		"N\3\2\2\2\u0147\u0148\7+\2\2\u0148P\3\2\2\2\u0149\u014a\7]\2\2\u014aR"+
		"\3\2\2\2\u014b\u014c\7_\2\2\u014cT\3\2\2\2\u014d\u014e\7B\2\2\u014eV\3"+
		"\2\2\2\u014f\u0150\7a\2\2\u0150X\3\2\2\2\u0151\u0152\t\4\2\2\u0152Z\3"+
		"\2\2\2\u0153\u0154\t\5\2\2\u0154\\\3\2\2\2\u0155\u0156\t\6\2\2\u0156^"+
		"\3\2\2\2\u0157\u0158\t\7\2\2\u0158`\3\2\2\2\u0159\u015a\t\b\2\2\u015a"+
		"b\3\2\2\2\u015b\u015c\t\t\2\2\u015cd\3\2\2\2\u015d\u015e\t\n\2\2\u015e"+
		"f\3\2\2\2\u015f\u0160\t\13\2\2\u0160h\3\2\2\2\u0161\u0162\t\f\2\2\u0162"+
		"j\3\2\2\2\u0163\u0164\t\r\2\2\u0164l\3\2\2\2\u0165\u0166\t\16\2\2\u0166"+
		"n\3\2\2\2\u0167\u0168\t\17\2\2\u0168p\3\2\2\2\u0169\u016a\t\20\2\2\u016a"+
		"r\3\2\2\2\u016b\u016c\t\21\2\2\u016ct\3\2\2\2\u016d\u016e\t\22\2\2\u016e"+
		"v\3\2\2\2\u016f\u0170\t\23\2\2\u0170x\3\2\2\2\u0171\u0172\t\24\2\2\u0172"+
		"z\3\2\2\2\u0173\u0174\t\25\2\2\u0174|\3\2\2\2\u0175\u0176\t\26\2\2\u0176"+
		"~\3\2\2\2\u0177\u0178\t\27\2\2\u0178\u0080\3\2\2\2\u0179\u017a\t\30\2"+
		"\2\u017a\u0082\3\2\2\2\u017b\u017c\t\31\2\2\u017c\u0084\3\2\2\2\u017d"+
		"\u017e\t\32\2\2\u017e\u0086\3\2\2\2\u017f\u0180\t\33\2\2\u0180\u0088\3"+
		"\2\2\2\u0181\u0182\t\34\2\2\u0182\u008a\3\2\2\2\u0183\u0184\t\35\2\2\u0184"+
		"\u008c\3\2\2\2\u0185\u0187\t\36\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3"+
		"\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\bG\2\2\u018b\u008e\3\2\2\2\13\2\u00ff\u010e\u0114\u0123\u0128\u012d"+
		"\u0133\u0188\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}