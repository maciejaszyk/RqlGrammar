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
public class RqlParser extends Parser {
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
		OPEN_PAREN=35, CLOSE_PAREN=36, OPEN_BRACKET=37, CLOSE_BRACKET=38, AT=39, 
		UNDERSCORE=40, WS=41;
	public static final int
		RULE_prog = 0, RULE_fromStatement = 1, RULE_indexName = 2, RULE_whereStatement = 3, 
		RULE_selectStatement = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fromStatement", "indexName", "whereStatement", "selectStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'@all_docs'", null, null, null, "'>'", "'>='", "'<'", "'<='", 
			null, null, null, null, null, "'''", "'\\'", "'/'", null, "','", "'.'", 
			"'{'", "'}'", "'('", "')'", "'['", "']'", "'@'", "'_'"
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
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "AT", "UNDERSCORE", 
			"WS"
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

	public RqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode GROUP_BY() { return getToken(RqlParser.GROUP_BY, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			fromStatement();
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP_BY) {
				{
				setState(11);
				match(GROUP_BY);
				}
			}

			setState(14);
			selectStatement();
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

	public static class FromStatementContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(RqlParser.FROM, 0); }
		public TerminalNode ALL_DOCS() { return getToken(RqlParser.ALL_DOCS, 0); }
		public TerminalNode INDEX() { return getToken(RqlParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public List<TerminalNode> WORD() { return getTokens(RqlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(RqlParser.WORD, i);
		}
		public TerminalNode AS() { return getToken(RqlParser.AS, 0); }
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fromStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(FROM);
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_DOCS:
				{
				setState(17);
				match(ALL_DOCS);
				}
				break;
			case INDEX:
			case WORD:
				{
				{
				setState(21);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INDEX:
					{
					setState(18);
					match(INDEX);
					setState(19);
					indexName();
					}
					break;
				case WORD:
					{
					setState(20);
					match(WORD);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(23);
					match(AS);
					setState(24);
					match(WORD);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IndexNameContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(RqlParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(RqlParser.QUOTE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(RqlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(RqlParser.WORD, i);
		}
		public List<TerminalNode> FORWARD_SLASH() { return getTokens(RqlParser.FORWARD_SLASH); }
		public TerminalNode FORWARD_SLASH(int i) {
			return getToken(RqlParser.FORWARD_SLASH, i);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_indexName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(QUOTE);
			setState(30);
			match(WORD);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				match(FORWARD_SLASH);
				setState(32);
				match(WORD);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FORWARD_SLASH );
			setState(37);
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

	public static class WhereStatementContext extends ParserRuleContext {
		public WhereStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereStatement; }
	}

	public final WhereStatementContext whereStatement() throws RecognitionException {
		WhereStatementContext _localctx = new WhereStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public TerminalNode SELECT() { return getToken(RqlParser.SELECT, 0); }
		public List<TerminalNode> WORD() { return getTokens(RqlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(RqlParser.WORD, i);
		}
		public List<TerminalNode> DOT() { return getTokens(RqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RqlParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RqlParser.COMMA, i);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(SELECT);
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(42);
				match(WORD);
				setState(43);
				match(DOT);
				}
				break;
			}
			setState(46);
			match(WORD);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(47);
				match(COMMA);
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(48);
						match(WORD);
						setState(49);
						match(DOT);
						}
						} 
					}
					setState(54);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(55);
				match(WORD);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+@\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\30\n\3\3\3\3\3\5\3\34\n\3\5\3\36\n\3\3\4\3\4\3\4\3\4\6\4$\n\4\r"+
		"\4\16\4%\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5\6/\n\6\3\6\3\6\3\6\3\6\7\6\65\n"+
		"\6\f\6\16\68\13\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\6\2\2\7\2\4\6\b\n\2\2"+
		"\2B\2\f\3\2\2\2\4\22\3\2\2\2\6\37\3\2\2\2\b)\3\2\2\2\n+\3\2\2\2\f\16\5"+
		"\4\3\2\r\17\7\b\2\2\16\r\3\2\2\2\16\17\3\2\2\2\17\20\3\2\2\2\20\21\5\n"+
		"\6\2\21\3\3\2\2\2\22\35\7\3\2\2\23\36\7\20\2\2\24\25\7\7\2\2\25\30\5\6"+
		"\4\2\26\30\7\34\2\2\27\24\3\2\2\2\27\26\3\2\2\2\30\33\3\2\2\2\31\32\7"+
		"\4\2\2\32\34\7\34\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\23"+
		"\3\2\2\2\35\27\3\2\2\2\36\5\3\2\2\2\37 \7\35\2\2 #\7\34\2\2!\"\7\37\2"+
		"\2\"$\7\34\2\2#!\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7"+
		"\35\2\2(\7\3\2\2\2)*\3\2\2\2*\t\3\2\2\2+.\7\5\2\2,-\7\34\2\2-/\7\"\2\2"+
		".,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60<\7\34\2\2\61\66\7!\2\2\62\63\7\34"+
		"\2\2\63\65\7\"\2\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2"+
		"\2\679\3\2\2\28\66\3\2\2\29;\7\34\2\2:\61\3\2\2\2;>\3\2\2\2<:\3\2\2\2"+
		"<=\3\2\2\2=\13\3\2\2\2><\3\2\2\2\n\16\27\33\35%.\66<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}