// Generated from c:\workspace\antlr\RqlGrammar\RqlGrammar\RqlParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RqlParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FROM=1, AS=2, SELECT=3, WHERE=4, INDEX=5, GROUP_BY=6, NAME=7, DECLARE=8, 
		ORDER_BY=9, LOAD=10, INCLUDE=11, WITH=12, MATCH=13, ALL_DOCS=14, BETWEEN=15, 
		IN=16, AND=17, MORE_CHAR=18, MORE_OR_EQUAL=19, LESS_CHAR=20, LESS_OR_EQUAL=21, 
		EQUAL=22, NOT_EQUAL=23, ALL_IN=24, OR=25, WORD=26, QUOTE=27, BACK_SLASH=28, 
		FORWARD_SLASH=29, DIGIT=30, COMMA=31, DOT=32, OPEN_CURLY=33, CLOSE_CURLY=34, 
		OPEN_PAREN=35, CLOSE_PAREN=36, OPEN_BRACKET=37, CLOSE_BRACKET=38, WS=39;
	public static final int
		RULE_prog = 0, RULE_fromPart = 1, RULE_indexStatement = 2, RULE_selectStatement = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fromPart", "indexStatement", "selectStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'@all_docs'", null, null, null, "'>'", "'>='", "'<'", "'<='", 
			null, null, null, null, null, "'''", "'\\'", "'/'", null, "','", "'.'", 
			"'{'", "'}'", "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FROM", "AS", "SELECT", "WHERE", "INDEX", "GROUP_BY", "NAME", "DECLARE", 
			"ORDER_BY", "LOAD", "INCLUDE", "WITH", "MATCH", "ALL_DOCS", "BETWEEN", 
			"IN", "AND", "MORE_CHAR", "MORE_OR_EQUAL", "LESS_CHAR", "LESS_OR_EQUAL", 
			"EQUAL", "NOT_EQUAL", "ALL_IN", "OR", "WORD", "QUOTE", "BACK_SLASH", 
			"FORWARD_SLASH", "DIGIT", "COMMA", "DOT", "OPEN_CURLY", "CLOSE_CURLY", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "WS"
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

	@Override
	public String getGrammarFileName() { return "RqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RqlParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public FromPartContext fromPart() {
			return getRuleContext(FromPartContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RqlParserParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(12);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				fromPart();
				setState(9);
				selectStatement();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromPartContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(RqlParserParser.FROM, 0); }
		public List<TerminalNode> WORD() { return getTokens(RqlParserParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(RqlParserParser.WORD, i);
		}
		public TerminalNode INDEX() { return getToken(RqlParserParser.INDEX, 0); }
		public TerminalNode AS() { return getToken(RqlParserParser.AS, 0); }
		public TerminalNode ALL_DOCS() { return getToken(RqlParserParser.ALL_DOCS, 0); }
		public FromPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromPart; }
	}

	public final FromPartContext fromPart() throws RecognitionException {
		FromPartContext _localctx = new FromPartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fromPart);
		int _la;
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(FROM);
				setState(15);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(16);
					match(AS);
					setState(17);
					match(WORD);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(FROM);
				setState(21);
				match(ALL_DOCS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexStatementContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(RqlParserParser.INDEX, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(RqlParserParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(RqlParserParser.QUOTE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(RqlParserParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(RqlParserParser.WORD, i);
		}
		public List<TerminalNode> FORWARD_SLASH() { return getTokens(RqlParserParser.FORWARD_SLASH); }
		public TerminalNode FORWARD_SLASH(int i) {
			return getToken(RqlParserParser.FORWARD_SLASH, i);
		}
		public IndexStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexStatement; }
	}

	public final IndexStatementContext indexStatement() throws RecognitionException {
		IndexStatementContext _localctx = new IndexStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_indexStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(INDEX);
			setState(25);
			match(QUOTE);
			setState(26);
			match(WORD);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				match(FORWARD_SLASH);
				setState(28);
				match(WORD);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FORWARD_SLASH );
			setState(33);
			match(QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(RqlParserParser.SELECT, 0); }
		public List<TerminalNode> WORD() { return getTokens(RqlParserParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(RqlParserParser.WORD, i);
		}
		public TerminalNode COMMA() { return getToken(RqlParserParser.COMMA, 0); }
		public List<TerminalNode> DOT() { return getTokens(RqlParserParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RqlParserParser.DOT, i);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(SELECT);
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(36);
				match(WORD);
				setState(37);
				match(DOT);
				}
				break;
			}
			setState(40);
			match(WORD);
			{
			setState(41);
			match(COMMA);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					match(WORD);
					setState(43);
					match(DOT);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(49);
			match(WORD);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\66\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\3\3\5\3\25\n"+
		"\3\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\4\6\4 \n\4\r\4\16\4!\3\4\3\4\3"+
		"\5\3\5\3\5\5\5)\n\5\3\5\3\5\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3\5\3\5"+
		"\3\5\2\2\6\2\4\6\b\2\3\4\2\7\7\34\34\2\67\2\16\3\2\2\2\4\30\3\2\2\2\6"+
		"\32\3\2\2\2\b%\3\2\2\2\n\13\5\4\3\2\13\f\5\b\5\2\f\17\3\2\2\2\r\17\7\2"+
		"\2\3\16\n\3\2\2\2\16\r\3\2\2\2\17\3\3\2\2\2\20\21\7\3\2\2\21\24\t\2\2"+
		"\2\22\23\7\4\2\2\23\25\7\34\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\31\3\2"+
		"\2\2\26\27\7\3\2\2\27\31\7\20\2\2\30\20\3\2\2\2\30\26\3\2\2\2\31\5\3\2"+
		"\2\2\32\33\7\7\2\2\33\34\7\35\2\2\34\37\7\34\2\2\35\36\7\37\2\2\36 \7"+
		"\34\2\2\37\35\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7"+
		"\35\2\2$\7\3\2\2\2%(\7\5\2\2&\'\7\34\2\2\')\7\"\2\2(&\3\2\2\2()\3\2\2"+
		"\2)*\3\2\2\2*+\7\34\2\2+\60\7!\2\2,-\7\34\2\2-/\7\"\2\2.,\3\2\2\2/\62"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7"+
		"\34\2\2\64\t\3\2\2\2\b\16\24\30!(\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}