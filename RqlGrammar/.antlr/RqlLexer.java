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
		CL_CUR=1, CL_PAR=2, CL_Q=3, COMMA=4, DOT=5, D_QUOTE=6, EQUAL=7, MATH=8, 
		OP_CUR=9, OP_PAR=10, OP_Q=11, SLASH=12, ALL=13, ALL_DOCS=14, ALPHANUMERIC=15, 
		AND=16, AS=17, BETWEEN=18, DECLARE=19, DOUBLE=20, ENDS_WITH=21, FALSE=22, 
		FROM=23, GROUP_BY=24, IN=25, INCLUDE=26, INDEX=27, INTERSECT=28, LOAD=29, 
		LONG=30, MATCH=31, MORELIKETHIS=32, NOT=33, NULL=34, OR=35, ORDER_BY=36, 
		SELECT=37, SORTING=38, STARTS_WITH=39, STRING_W=40, TRUE=41, WHERE=42, 
		WITH=43, JS_BODY=44, JS_FUNCTION_DECLARATION=45, NUM=46, STRING=47, WORD=48, 
		WS=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CL_CUR", "CL_PAR", "CL_Q", "COMMA", "DOT", "D_QUOTE", "EQUAL", "MATH", 
			"OP_CUR", "OP_PAR", "OP_Q", "SLASH", "ALL", "ALL_DOCS", "ALPHANUMERIC", 
			"AND", "AS", "BETWEEN", "DECLARE", "DOUBLE", "ENDS_WITH", "FALSE", "FROM", 
			"GROUP_BY", "IN", "INCLUDE", "INDEX", "INTERSECT", "LOAD", "LONG", "MATCH", 
			"MORELIKETHIS", "NOT", "NULL", "OR", "ORDER_BY", "SELECT", "SORTING", 
			"STARTS_WITH", "STRING_W", "TRUE", "WHERE", "WITH", "JS_BODY", "JS_FUNCTION_DECLARATION", 
			"NUM", "STRING", "WORD", "DIGIT", "A", "B", "C", "D", "E", "F", "G", 
			"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
			"V", "W", "X", "Y", "Z", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'}'", "')'", "']'", "','", "'.'", "'\"'", null, null, "'{'", "'('", 
			"'['", "'/'", null, "'@all_docs'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'declare function'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CL_CUR", "CL_PAR", "CL_Q", "COMMA", "DOT", "D_QUOTE", "EQUAL", 
			"MATH", "OP_CUR", "OP_PAR", "OP_Q", "SLASH", "ALL", "ALL_DOCS", "ALPHANUMERIC", 
			"AND", "AS", "BETWEEN", "DECLARE", "DOUBLE", "ENDS_WITH", "FALSE", "FROM", 
			"GROUP_BY", "IN", "INCLUDE", "INDEX", "INTERSECT", "LOAD", "LONG", "MATCH", 
			"MORELIKETHIS", "NOT", "NULL", "OR", "ORDER_BY", "SELECT", "SORTING", 
			"STARTS_WITH", "STRING_W", "TRUE", "WHERE", "WITH", "JS_BODY", "JS_FUNCTION_DECLARATION", 
			"NUM", "STRING", "WORD", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u022a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00af\n\b\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00b6\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\5\'\u0188\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3"+
		"-\7-\u01ae\n-\f-\16-\u01b1\13-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3/\6/\u01c7\n/\r/\16/\u01c8\3/\3/\6/\u01cd\n/\r/\16"+
		"/\u01ce\5/\u01d1\n/\3\60\3\60\3\60\3\60\7\60\u01d7\n\60\f\60\16\60\u01da"+
		"\13\60\3\60\3\60\3\60\3\60\3\60\7\60\u01e1\n\60\f\60\16\60\u01e4\13\60"+
		"\3\60\5\60\u01e7\n\60\3\61\6\61\u01ea\n\61\r\61\16\61\u01eb\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\6M\u0225\nM\rM\16M\u0226\3M\3"+
		"M\5\u01af\u01d8\u01e2\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097"+
		"\2\u0099\63\3\2 \4\2>>@@\4\2C\\c|\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2"+
		"FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4"+
		"\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWw"+
		"w\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\"\2\u0221"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2\u0099\3\2\2\2\3\u009b\3\2\2\2\5\u009d\3\2\2\2\7\u009f\3\2\2\2"+
		"\t\u00a1\3\2\2\2\13\u00a3\3\2\2\2\r\u00a5\3\2\2\2\17\u00ae\3\2\2\2\21"+
		"\u00b5\3\2\2\2\23\u00b7\3\2\2\2\25\u00b9\3\2\2\2\27\u00bb\3\2\2\2\31\u00bd"+
		"\3\2\2\2\33\u00bf\3\2\2\2\35\u00c3\3\2\2\2\37\u00cd\3\2\2\2!\u00da\3\2"+
		"\2\2#\u00de\3\2\2\2%\u00e1\3\2\2\2\'\u00e9\3\2\2\2)\u00f1\3\2\2\2+\u00f8"+
		"\3\2\2\2-\u0101\3\2\2\2/\u0107\3\2\2\2\61\u010c\3\2\2\2\63\u0115\3\2\2"+
		"\2\65\u0118\3\2\2\2\67\u0120\3\2\2\29\u0126\3\2\2\2;\u0130\3\2\2\2=\u0135"+
		"\3\2\2\2?\u013a\3\2\2\2A\u0140\3\2\2\2C\u014d\3\2\2\2E\u0151\3\2\2\2G"+
		"\u0156\3\2\2\2I\u0159\3\2\2\2K\u0162\3\2\2\2M\u0187\3\2\2\2O\u0189\3\2"+
		"\2\2Q\u0194\3\2\2\2S\u019b\3\2\2\2U\u01a0\3\2\2\2W\u01a6\3\2\2\2Y\u01ab"+
		"\3\2\2\2[\u01b4\3\2\2\2]\u01c6\3\2\2\2_\u01e6\3\2\2\2a\u01e9\3\2\2\2c"+
		"\u01ed\3\2\2\2e\u01ef\3\2\2\2g\u01f1\3\2\2\2i\u01f3\3\2\2\2k\u01f5\3\2"+
		"\2\2m\u01f7\3\2\2\2o\u01f9\3\2\2\2q\u01fb\3\2\2\2s\u01fd\3\2\2\2u\u01ff"+
		"\3\2\2\2w\u0201\3\2\2\2y\u0203\3\2\2\2{\u0205\3\2\2\2}\u0207\3\2\2\2\177"+
		"\u0209\3\2\2\2\u0081\u020b\3\2\2\2\u0083\u020d\3\2\2\2\u0085\u020f\3\2"+
		"\2\2\u0087\u0211\3\2\2\2\u0089\u0213\3\2\2\2\u008b\u0215\3\2\2\2\u008d"+
		"\u0217\3\2\2\2\u008f\u0219\3\2\2\2\u0091\u021b\3\2\2\2\u0093\u021d\3\2"+
		"\2\2\u0095\u021f\3\2\2\2\u0097\u0221\3\2\2\2\u0099\u0224\3\2\2\2\u009b"+
		"\u009c\7\177\2\2\u009c\4\3\2\2\2\u009d\u009e\7+\2\2\u009e\6\3\2\2\2\u009f"+
		"\u00a0\7_\2\2\u00a0\b\3\2\2\2\u00a1\u00a2\7.\2\2\u00a2\n\3\2\2\2\u00a3"+
		"\u00a4\7\60\2\2\u00a4\f\3\2\2\2\u00a5\u00a6\7$\2\2\u00a6\16\3\2\2\2\u00a7"+
		"\u00af\7?\2\2\u00a8\u00a9\7?\2\2\u00a9\u00af\7?\2\2\u00aa\u00ab\7>\2\2"+
		"\u00ab\u00af\7@\2\2\u00ac\u00ad\7#\2\2\u00ad\u00af\7?\2\2\u00ae\u00a7"+
		"\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\20\3\2\2\2\u00b0\u00b6\t\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b6\7?\2\2"+
		"\u00b3\u00b4\7@\2\2\u00b4\u00b6\7?\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\22\3\2\2\2\u00b7\u00b8\7}\2\2\u00b8"+
		"\24\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba\26\3\2\2\2\u00bb\u00bc\7]\2\2\u00bc"+
		"\30\3\2\2\2\u00bd\u00be\7\61\2\2\u00be\32\3\2\2\2\u00bf\u00c0\5e\63\2"+
		"\u00c0\u00c1\5{>\2\u00c1\u00c2\5{>\2\u00c2\34\3\2\2\2\u00c3\u00c4\7B\2"+
		"\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8"+
		"\7a\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7e\2\2\u00cb"+
		"\u00cc\7u\2\2\u00cc\36\3\2\2\2\u00cd\u00ce\5e\63\2\u00ce\u00cf\5{>\2\u00cf"+
		"\u00d0\5\u0083B\2\u00d0\u00d1\5s:\2\u00d1\u00d2\5e\63\2\u00d2\u00d3\5"+
		"\177@\2\u00d3\u00d4\5\u008dG\2\u00d4\u00d5\5}?\2\u00d5\u00d6\5m\67\2\u00d6"+
		"\u00d7\5\u0087D\2\u00d7\u00d8\5u;\2\u00d8\u00d9\5i\65\2\u00d9 \3\2\2\2"+
		"\u00da\u00db\5e\63\2\u00db\u00dc\5\177@\2\u00dc\u00dd\5k\66\2\u00dd\""+
		"\3\2\2\2\u00de\u00df\5e\63\2\u00df\u00e0\5\u0089E\2\u00e0$\3\2\2\2\u00e1"+
		"\u00e2\5g\64\2\u00e2\u00e3\5m\67\2\u00e3\u00e4\5\u008bF\2\u00e4\u00e5"+
		"\5\u0091I\2\u00e5\u00e6\5m\67\2\u00e6\u00e7\5m\67\2\u00e7\u00e8\5\177"+
		"@\2\u00e8&\3\2\2\2\u00e9\u00ea\5k\66\2\u00ea\u00eb\5m\67\2\u00eb\u00ec"+
		"\5i\65\2\u00ec\u00ed\5{>\2\u00ed\u00ee\5e\63\2\u00ee\u00ef\5\u0087D\2"+
		"\u00ef\u00f0\5m\67\2\u00f0(\3\2\2\2\u00f1\u00f2\5k\66\2\u00f2\u00f3\5"+
		"\u0081A\2\u00f3\u00f4\5\u008dG\2\u00f4\u00f5\5g\64\2\u00f5\u00f6\5{>\2"+
		"\u00f6\u00f7\5m\67\2\u00f7*\3\2\2\2\u00f8\u00f9\5m\67\2\u00f9\u00fa\5"+
		"\177@\2\u00fa\u00fb\5k\66\2\u00fb\u00fc\5\u0089E\2\u00fc\u00fd\5\u0091"+
		"I\2\u00fd\u00fe\5u;\2\u00fe\u00ff\5\u008bF\2\u00ff\u0100\5s:\2\u0100,"+
		"\3\2\2\2\u0101\u0102\5o8\2\u0102\u0103\5e\63\2\u0103\u0104\5{>\2\u0104"+
		"\u0105\5\u0089E\2\u0105\u0106\5m\67\2\u0106.\3\2\2\2\u0107\u0108\5o8\2"+
		"\u0108\u0109\5\u0087D\2\u0109\u010a\5\u0081A\2\u010a\u010b\5}?\2\u010b"+
		"\60\3\2\2\2\u010c\u010d\5q9\2\u010d\u010e\5\u0087D\2\u010e\u010f\5\u0081"+
		"A\2\u010f\u0110\5\u008dG\2\u0110\u0111\5\u0083B\2\u0111\u0112\7\"\2\2"+
		"\u0112\u0113\5g\64\2\u0113\u0114\5\u0095K\2\u0114\62\3\2\2\2\u0115\u0116"+
		"\5u;\2\u0116\u0117\5\177@\2\u0117\64\3\2\2\2\u0118\u0119\5u;\2\u0119\u011a"+
		"\5\177@\2\u011a\u011b\5i\65\2\u011b\u011c\5{>\2\u011c\u011d\5\u008dG\2"+
		"\u011d\u011e\5k\66\2\u011e\u011f\5m\67\2\u011f\66\3\2\2\2\u0120\u0121"+
		"\5u;\2\u0121\u0122\5\177@\2\u0122\u0123\5k\66\2\u0123\u0124\5m\67\2\u0124"+
		"\u0125\5\u0093J\2\u01258\3\2\2\2\u0126\u0127\5u;\2\u0127\u0128\5\177@"+
		"\2\u0128\u0129\5\u008bF\2\u0129\u012a\5m\67\2\u012a\u012b\5\u0087D\2\u012b"+
		"\u012c\5\u0089E\2\u012c\u012d\5m\67\2\u012d\u012e\5i\65\2\u012e\u012f"+
		"\5\u008bF\2\u012f:\3\2\2\2\u0130\u0131\5{>\2\u0131\u0132\5\u0081A\2\u0132"+
		"\u0133\5e\63\2\u0133\u0134\5k\66\2\u0134<\3\2\2\2\u0135\u0136\5{>\2\u0136"+
		"\u0137\5\u0081A\2\u0137\u0138\5\177@\2\u0138\u0139\5q9\2\u0139>\3\2\2"+
		"\2\u013a\u013b\5}?\2\u013b\u013c\5e\63\2\u013c\u013d\5\u008bF\2\u013d"+
		"\u013e\5i\65\2\u013e\u013f\5s:\2\u013f@\3\2\2\2\u0140\u0141\5}?\2\u0141"+
		"\u0142\5\u0081A\2\u0142\u0143\5\u0087D\2\u0143\u0144\5m\67\2\u0144\u0145"+
		"\5{>\2\u0145\u0146\5u;\2\u0146\u0147\5y=\2\u0147\u0148\5m\67\2\u0148\u0149"+
		"\5\u008bF\2\u0149\u014a\5s:\2\u014a\u014b\5u;\2\u014b\u014c\5\u0089E\2"+
		"\u014cB\3\2\2\2\u014d\u014e\5\177@\2\u014e\u014f\5\u0081A\2\u014f\u0150"+
		"\5\u008bF\2\u0150D\3\2\2\2\u0151\u0152\5\177@\2\u0152\u0153\5\u008dG\2"+
		"\u0153\u0154\5{>\2\u0154\u0155\5{>\2\u0155F\3\2\2\2\u0156\u0157\5\u0081"+
		"A\2\u0157\u0158\5\u0087D\2\u0158H\3\2\2\2\u0159\u015a\5\u0081A\2\u015a"+
		"\u015b\5\u0087D\2\u015b\u015c\5k\66\2\u015c\u015d\5m\67\2\u015d\u015e"+
		"\5\u0087D\2\u015e\u015f\7\"\2\2\u015f\u0160\5g\64\2\u0160\u0161\5\u0095"+
		"K\2\u0161J\3\2\2\2\u0162\u0163\5\u0089E\2\u0163\u0164\5m\67\2\u0164\u0165"+
		"\5{>\2\u0165\u0166\5m\67\2\u0166\u0167\5i\65\2\u0167\u0168\5\u008bF\2"+
		"\u0168L\3\2\2\2\u0169\u016a\5e\63\2\u016a\u016b\5\u0089E\2\u016b\u016c"+
		"\5i\65\2\u016c\u0188\3\2\2\2\u016d\u016e\5e\63\2\u016e\u016f\5\u0089E"+
		"\2\u016f\u0170\5i\65\2\u0170\u0171\5m\67\2\u0171\u0172\5\177@\2\u0172"+
		"\u0173\5k\66\2\u0173\u0174\5u;\2\u0174\u0175\5\177@\2\u0175\u0176\5q9"+
		"\2\u0176\u0188\3\2\2\2\u0177\u0178\5k\66\2\u0178\u0179\5m\67\2\u0179\u017a"+
		"\5\u0089E\2\u017a\u017b\5i\65\2\u017b\u0188\3\2\2\2\u017c\u017d\5k\66"+
		"\2\u017d\u017e\5m\67\2\u017e\u017f\5\u0089E\2\u017f\u0180\5i\65\2\u0180"+
		"\u0181\5m\67\2\u0181\u0182\5\177@\2\u0182\u0183\5k\66\2\u0183\u0184\5"+
		"u;\2\u0184\u0185\5\177@\2\u0185\u0186\5q9\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0169\3\2\2\2\u0187\u016d\3\2\2\2\u0187\u0177\3\2\2\2\u0187\u017c\3\2"+
		"\2\2\u0188N\3\2\2\2\u0189\u018a\5\u0089E\2\u018a\u018b\5\u008bF\2\u018b"+
		"\u018c\5e\63\2\u018c\u018d\5\u0087D\2\u018d\u018e\5\u008bF\2\u018e\u018f"+
		"\5\u0089E\2\u018f\u0190\5\u0091I\2\u0190\u0191\5u;\2\u0191\u0192\5\u008b"+
		"F\2\u0192\u0193\5s:\2\u0193P\3\2\2\2\u0194\u0195\5\u0089E\2\u0195\u0196"+
		"\5\u008bF\2\u0196\u0197\5\u0087D\2\u0197\u0198\5u;\2\u0198\u0199\5\177"+
		"@\2\u0199\u019a\5q9\2\u019aR\3\2\2\2\u019b\u019c\5\u008bF\2\u019c\u019d"+
		"\5\u0087D\2\u019d\u019e\5\u008dG\2\u019e\u019f\5m\67\2\u019fT\3\2\2\2"+
		"\u01a0\u01a1\5\u0091I\2\u01a1\u01a2\5s:\2\u01a2\u01a3\5m\67\2\u01a3\u01a4"+
		"\5\u0087D\2\u01a4\u01a5\5m\67\2\u01a5V\3\2\2\2\u01a6\u01a7\5\u0091I\2"+
		"\u01a7\u01a8\5u;\2\u01a8\u01a9\5\u008bF\2\u01a9\u01aa\5s:\2\u01aaX\3\2"+
		"\2\2\u01ab\u01af\7}\2\2\u01ac\u01ae\13\2\2\2\u01ad\u01ac\3\2\2\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7\177\2\2\u01b3Z\3\2\2\2\u01b4\u01b5"+
		"\7f\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7\7e\2\2\u01b7\u01b8\7n\2\2\u01b8"+
		"\u01b9\7c\2\2\u01b9\u01ba\7t\2\2\u01ba\u01bb\7g\2\2\u01bb\u01bc\7\"\2"+
		"\2\u01bc\u01bd\7h\2\2\u01bd\u01be\7w\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0"+
		"\7e\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2\7k\2\2\u01c2\u01c3\7q\2\2\u01c3"+
		"\u01c4\7p\2\2\u01c4\\\3\2\2\2\u01c5\u01c7\5c\62\2\u01c6\u01c5\3\2\2\2"+
		"\u01c7\u01c8\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01d0"+
		"\3\2\2\2\u01ca\u01cc\5\13\6\2\u01cb\u01cd\5c\62\2\u01cc\u01cb\3\2\2\2"+
		"\u01cd\u01ce\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1"+
		"\3\2\2\2\u01d0\u01ca\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1^\3\2\2\2\u01d2"+
		"\u01d8\7$\2\2\u01d3\u01d4\7^\2\2\u01d4\u01d7\7$\2\2\u01d5\u01d7\13\2\2"+
		"\2\u01d6\u01d3\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01e7\7$\2\2\u01dc\u01e2\7)\2\2\u01dd\u01de\7^\2\2\u01de\u01e1\7$\2\2"+
		"\u01df\u01e1\13\2\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e5\u01e7\7)\2\2\u01e6\u01d2\3\2\2\2\u01e6\u01dc\3\2"+
		"\2\2\u01e7`\3\2\2\2\u01e8\u01ea\t\3\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ecb\3\2\2\2\u01ed"+
		"\u01ee\t\4\2\2\u01eed\3\2\2\2\u01ef\u01f0\t\5\2\2\u01f0f\3\2\2\2\u01f1"+
		"\u01f2\t\6\2\2\u01f2h\3\2\2\2\u01f3\u01f4\t\7\2\2\u01f4j\3\2\2\2\u01f5"+
		"\u01f6\t\b\2\2\u01f6l\3\2\2\2\u01f7\u01f8\t\t\2\2\u01f8n\3\2\2\2\u01f9"+
		"\u01fa\t\n\2\2\u01fap\3\2\2\2\u01fb\u01fc\t\13\2\2\u01fcr\3\2\2\2\u01fd"+
		"\u01fe\t\f\2\2\u01fet\3\2\2\2\u01ff\u0200\t\r\2\2\u0200v\3\2\2\2\u0201"+
		"\u0202\t\16\2\2\u0202x\3\2\2\2\u0203\u0204\t\17\2\2\u0204z\3\2\2\2\u0205"+
		"\u0206\t\20\2\2\u0206|\3\2\2\2\u0207\u0208\t\21\2\2\u0208~\3\2\2\2\u0209"+
		"\u020a\t\22\2\2\u020a\u0080\3\2\2\2\u020b\u020c\t\23\2\2\u020c\u0082\3"+
		"\2\2\2\u020d\u020e\t\24\2\2\u020e\u0084\3\2\2\2\u020f\u0210\t\25\2\2\u0210"+
		"\u0086\3\2\2\2\u0211\u0212\t\26\2\2\u0212\u0088\3\2\2\2\u0213\u0214\t"+
		"\27\2\2\u0214\u008a\3\2\2\2\u0215\u0216\t\30\2\2\u0216\u008c\3\2\2\2\u0217"+
		"\u0218\t\31\2\2\u0218\u008e\3\2\2\2\u0219\u021a\t\32\2\2\u021a\u0090\3"+
		"\2\2\2\u021b\u021c\t\33\2\2\u021c\u0092\3\2\2\2\u021d\u021e\t\34\2\2\u021e"+
		"\u0094\3\2\2\2\u021f\u0220\t\35\2\2\u0220\u0096\3\2\2\2\u0221\u0222\t"+
		"\36\2\2\u0222\u0098\3\2\2\2\u0223\u0225\t\37\2\2\u0224\u0223\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2"+
		"\2\2\u0228\u0229\bM\2\2\u0229\u009a\3\2\2\2\21\2\u00ae\u00b5\u0187\u01af"+
		"\u01c8\u01ce\u01d0\u01d6\u01d8\u01e0\u01e2\u01e6\u01eb\u0226\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}