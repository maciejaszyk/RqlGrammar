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
		FROM=1, AS=2, SELECT=3, WHERE=4, INDEX=5, GROUP_BY=6, DECLARE=7, ORDER_BY=8, 
		LOAD=9, INCLUDE=10, WITH=11, MATCH=12, ALL_DOCS=13, BETWEEN=14, IN=15, 
		AND=16, NOT=17, MATH_OPERATOR=18, MORE_CHAR=19, MORE_OR_EQUAL=20, LESS_CHAR=21, 
		LESS_OR_EQUAL=22, EQUAL=23, NOT_EQUAL=24, ALL_IN=25, OR=26, WORD=27, INT=28, 
		DOUBLE=29, QUOTE=30, BACK_SLASH=31, FORWARD_SLASH=32, DIGIT=33, COMMA=34, 
		DOT=35, OPEN_CURLY=36, CLOSE_CURLY=37, OPEN_PAREN=38, CLOSE_PAREN=39, 
		OPEN_BRACKET=40, CLOSE_BRACKET=41, AT=42, UNDERSCORE=43, WS=44;
	public static final int
		RULE_prog = 0, RULE_fromStatement = 1, RULE_indexName = 2, RULE_selectStatement = 3, 
		RULE_whereStatement = 4, RULE_expr = 5, RULE_array = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fromStatement", "indexName", "selectStatement", "whereStatement", 
			"expr", "array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'@all_docs'", null, null, null, null, null, "'>'", "'>='", "'<'", 
			"'<='", null, null, null, null, null, null, null, "'''", "'\\'", "'/'", 
			null, "','", "'.'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'@'", 
			"'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FROM", "AS", "SELECT", "WHERE", "INDEX", "GROUP_BY", "DECLARE", 
			"ORDER_BY", "LOAD", "INCLUDE", "WITH", "MATCH", "ALL_DOCS", "BETWEEN", 
			"IN", "AND", "NOT", "MATH_OPERATOR", "MORE_CHAR", "MORE_OR_EQUAL", "LESS_CHAR", 
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
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
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
			setState(14);
			fromStatement();
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(15);
				whereStatement();
				}
			}

			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECT) {
				{
				setState(18);
				selectStatement();
				}
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
			setState(21);
			match(FROM);
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_DOCS:
				{
				setState(22);
				match(ALL_DOCS);
				}
				break;
			case INDEX:
			case WORD:
				{
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INDEX:
					{
					setState(23);
					match(INDEX);
					setState(24);
					indexName();
					}
					break;
				case WORD:
					{
					setState(25);
					match(WORD);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(28);
					match(AS);
					setState(29);
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
			setState(34);
			match(QUOTE);
			setState(35);
			match(WORD);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				match(FORWARD_SLASH);
				setState(37);
				match(WORD);
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FORWARD_SLASH );
			setState(42);
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
		public TerminalNode SELECT() { return getToken(RqlParser.SELECT, 0); }
		public List<TerminalNode> WORD() { return getTokens(RqlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(RqlParser.WORD, i);
		}
		public List<TerminalNode> DOT() { return getTokens(RqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RqlParser.DOT, i);
		}
		public List<TerminalNode> AS() { return getTokens(RqlParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(RqlParser.AS, i);
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
		enterRule(_localctx, 6, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(SELECT);
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(45);
				match(WORD);
				setState(46);
				match(DOT);
				}
				break;
			}
			setState(49);
			match(WORD);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(50);
				match(AS);
				setState(51);
				match(WORD);
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(54);
				match(COMMA);
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(55);
					match(WORD);
					setState(56);
					match(DOT);
					}
					break;
				}
				setState(59);
				match(WORD);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(60);
					match(AS);
					setState(61);
					match(WORD);
					}
				}

				}
				}
				setState(68);
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

	public static class WhereStatementContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(RqlParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereStatement; }
	}

	public final WhereStatementContext whereStatement() throws RecognitionException {
		WhereStatementContext _localctx = new WhereStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(WHERE);
			setState(70);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(RqlParser.OPEN_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(RqlParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> WORD() { return getTokens(RqlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(RqlParser.WORD, i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode IN() { return getToken(RqlParser.IN, 0); }
		public TerminalNode ALL_IN() { return getToken(RqlParser.ALL_IN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(RqlParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(RqlParser.CLOSE_BRACKET, 0); }
		public TerminalNode DOT() { return getToken(RqlParser.DOT, 0); }
		public TerminalNode BETWEEN() { return getToken(RqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(RqlParser.AND, 0); }
		public List<TerminalNode> INT() { return getTokens(RqlParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(RqlParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(RqlParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(RqlParser.DOUBLE, i);
		}
		public TerminalNode MATH_OPERATOR() { return getToken(RqlParser.MATH_OPERATOR, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(RqlParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(RqlParser.QUOTE, i);
		}
		public TerminalNode OR() { return getToken(RqlParser.OR, 0); }
		public TerminalNode NOT() { return getToken(RqlParser.NOT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(73);
				match(OPEN_PAREN);
				setState(74);
				expr(0);
				setState(75);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				{
				setState(77);
				match(WORD);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(78);
					match(OPEN_BRACKET);
					setState(79);
					match(CLOSE_BRACKET);
					setState(80);
					match(DOT);
					}
				}

				setState(83);
				match(WORD);
				setState(84);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==ALL_IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(85);
				match(OPEN_PAREN);
				setState(86);
				array();
				setState(87);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				{
				setState(89);
				match(WORD);
				setState(90);
				match(BETWEEN);
				setState(91);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==DOUBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(92);
				match(AND);
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==DOUBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				{
				setState(94);
				match(MATH_OPERATOR);
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(95);
					match(INT);
					}
					break;
				case DOUBLE:
					{
					setState(96);
					match(DOUBLE);
					}
					break;
				case QUOTE:
					{
					setState(97);
					match(QUOTE);
					setState(98);
					match(WORD);
					setState(99);
					match(QUOTE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(104);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(105);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(106);
						match(NOT);
						}
					}

					setState(109);
					expr(2);
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WordListExpressionContext extends ArrayContext {
		public List<TerminalNode> QUOTE() { return getTokens(RqlParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(RqlParser.QUOTE, i);
		}
		public List<TerminalNode> WORD() { return getTokens(RqlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(RqlParser.WORD, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RqlParser.COMMA, i);
		}
		public WordListExpressionContext(ArrayContext ctx) { copyFrom(ctx); }
	}
	public static class NumberListExpressionContext extends ArrayContext {
		public List<TerminalNode> INT() { return getTokens(RqlParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(RqlParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(RqlParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(RqlParser.DOUBLE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RqlParser.COMMA, i);
		}
		public NumberListExpressionContext(ArrayContext ctx) { copyFrom(ctx); }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
				_localctx = new WordListExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(QUOTE);
				setState(116);
				match(WORD);
				setState(117);
				match(QUOTE);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(118);
					match(COMMA);
					setState(119);
					match(QUOTE);
					setState(120);
					match(WORD);
					setState(121);
					match(QUOTE);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case INT:
			case DOUBLE:
				_localctx = new NumberListExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==DOUBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(128);
					match(COMMA);
					setState(129);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==DOUBLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u008c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\5\2\23\n\2\3\2"+
		"\5\2\26\n\2\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\3\3\3\5\3!\n\3\5\3#\n\3\3"+
		"\4\3\4\3\4\3\4\6\4)\n\4\r\4\16\4*\3\4\3\4\3\5\3\5\3\5\5\5\62\n\5\3\5\3"+
		"\5\3\5\5\5\67\n\5\3\5\3\5\3\5\5\5<\n\5\3\5\3\5\3\5\5\5A\n\5\7\5C\n\5\f"+
		"\5\16\5F\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7g\n\7\5\7i\n\7\3\7\3\7\3\7\5\7n\n\7\3\7\7\7q\n\7\f\7\16\7t\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13\b\3\b\3\b\3\b\7\b"+
		"\u0085\n\b\f\b\16\b\u0088\13\b\5\b\u008a\n\b\3\b\2\3\f\t\2\4\6\b\n\f\16"+
		"\2\5\4\2\21\21\33\33\3\2\36\37\4\2\22\22\34\34\2\u009a\2\20\3\2\2\2\4"+
		"\27\3\2\2\2\6$\3\2\2\2\b.\3\2\2\2\nG\3\2\2\2\fh\3\2\2\2\16\u0089\3\2\2"+
		"\2\20\22\5\4\3\2\21\23\5\n\6\2\22\21\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2"+
		"\2\24\26\5\b\5\2\25\24\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\"\7\3\2\2"+
		"\30#\7\17\2\2\31\32\7\7\2\2\32\35\5\6\4\2\33\35\7\35\2\2\34\31\3\2\2\2"+
		"\34\33\3\2\2\2\35 \3\2\2\2\36\37\7\4\2\2\37!\7\35\2\2 \36\3\2\2\2 !\3"+
		"\2\2\2!#\3\2\2\2\"\30\3\2\2\2\"\34\3\2\2\2#\5\3\2\2\2$%\7 \2\2%(\7\35"+
		"\2\2&\'\7\"\2\2\')\7\35\2\2(&\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,"+
		"\3\2\2\2,-\7 \2\2-\7\3\2\2\2.\61\7\5\2\2/\60\7\35\2\2\60\62\7%\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\66\7\35\2\2\64\65\7\4\2\2\65"+
		"\67\7\35\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67D\3\2\2\28;\7$\2\29:\7\35\2"+
		"\2:<\7%\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=@\7\35\2\2>?\7\4\2\2?A\7\35"+
		"\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B8\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2"+
		"\2\2E\t\3\2\2\2FD\3\2\2\2GH\7\6\2\2HI\5\f\7\2I\13\3\2\2\2JK\b\7\1\2KL"+
		"\7(\2\2LM\5\f\7\2MN\7)\2\2Ni\3\2\2\2OS\7\35\2\2PQ\7*\2\2QR\7+\2\2RT\7"+
		"%\2\2SP\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\35\2\2VW\t\2\2\2WX\7(\2\2XY\5"+
		"\16\b\2YZ\7)\2\2Zi\3\2\2\2[\\\7\35\2\2\\]\7\20\2\2]^\t\3\2\2^_\7\22\2"+
		"\2_i\t\3\2\2`f\7\24\2\2ag\7\36\2\2bg\7\37\2\2cd\7 \2\2de\7\35\2\2eg\7"+
		" \2\2fa\3\2\2\2fb\3\2\2\2fc\3\2\2\2gi\3\2\2\2hJ\3\2\2\2hO\3\2\2\2h[\3"+
		"\2\2\2h`\3\2\2\2ir\3\2\2\2jk\f\3\2\2km\t\4\2\2ln\7\23\2\2ml\3\2\2\2mn"+
		"\3\2\2\2no\3\2\2\2oq\5\f\7\4pj\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s"+
		"\r\3\2\2\2tr\3\2\2\2uv\7 \2\2vw\7\35\2\2w~\7 \2\2xy\7$\2\2yz\7 \2\2z{"+
		"\7\35\2\2{}\7 \2\2|x\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u008a\3\2\2\2\u0080~\3\2\2\2\u0081\u0086\t\3\2\2\u0082\u0083\7$\2\2\u0083"+
		"\u0085\t\3\2\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"u\3\2\2\2\u0089\u0081\3\2\2\2\u008a\17\3\2\2\2\25\22\25\34 \"*\61\66;"+
		"@DSfhmr~\u0086\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}