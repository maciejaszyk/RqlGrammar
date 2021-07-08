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
		CL_CUR=1, CL_PAR=2, CL_Q=3, COMMA=4, DOT=5, D_QUOTE=6, EQUAL=7, MATH=8, 
		OP_CUR=9, OP_PAR=10, OP_Q=11, SLASH=12, ALL=13, ALL_DOCS=14, ALPHANUMERIC=15, 
		AND=16, AS=17, BETWEEN=18, DECLARE=19, DOUBLE=20, ENDS_WITH=21, FALSE=22, 
		FROM=23, GROUP_BY=24, IN=25, INCLUDE=26, INDEX=27, INTERSECT=28, LOAD=29, 
		LONG=30, MATCH=31, MORELIKETHIS=32, NOT=33, NULL=34, OR=35, ORDER_BY=36, 
		SELECT=37, SORTING=38, STARTS_WITH=39, STRING_W=40, TRUE=41, WHERE=42, 
		WITH=43, JS_BODY=44, JS_FUNCTION_DECLARATION=45, NUM=46, STRING=47, WORD=48, 
		WS=49;
	public static final int
		RULE_prog = 0, RULE_fromStatement = 1, RULE_indexName = 2, RULE_loadStatment = 3, 
		RULE_selectStatement = 4, RULE_jsFunction = 5, RULE_jsCode = 6, RULE_alias = 7, 
		RULE_variable = 8, RULE_function = 9, RULE_whereStatement = 10, RULE_groupByStatement = 11, 
		RULE_orderByStatement = 12, RULE_orderBySorting = 13, RULE_expr = 14, 
		RULE_specialFunctions = 15, RULE_specialParam = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fromStatement", "indexName", "loadStatment", "selectStatement", 
			"jsFunction", "jsCode", "alias", "variable", "function", "whereStatement", 
			"groupByStatement", "orderByStatement", "orderBySorting", "expr", "specialFunctions", 
			"specialParam"
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
		public TerminalNode EOF() { return getToken(RqlParser.EOF, 0); }
		public List<JsFunctionContext> jsFunction() {
			return getRuleContexts(JsFunctionContext.class);
		}
		public JsFunctionContext jsFunction(int i) {
			return getRuleContext(JsFunctionContext.class,i);
		}
		public LoadStatmentContext loadStatment() {
			return getRuleContext(LoadStatmentContext.class,0);
		}
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public GroupByStatementContext groupByStatement() {
			return getRuleContext(GroupByStatementContext.class,0);
		}
		public OrderByStatementContext orderByStatement() {
			return getRuleContext(OrderByStatementContext.class,0);
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JS_FUNCTION_DECLARATION) {
				{
				{
				setState(34);
				jsFunction();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			fromStatement();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOAD) {
				{
				setState(41);
				loadStatment();
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(44);
				whereStatement();
				}
			}

			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP_BY) {
				{
				setState(47);
				groupByStatement();
				}
			}

			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_BY) {
				{
				setState(50);
				orderByStatement();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECT) {
				{
				setState(53);
				selectStatement();
				}
			}

			setState(56);
			match(EOF);
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
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
	 
		public FromStatementContext() { }
		public void copyFrom(FromStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CollectionByNameContext extends FromStatementContext {
		public TerminalNode FROM() { return getToken(RqlParser.FROM, 0); }
		public TerminalNode WORD() { return getToken(RqlParser.WORD, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public CollectionByNameContext(FromStatementContext ctx) { copyFrom(ctx); }
	}
	public static class AllCollectionsContext extends FromStatementContext {
		public TerminalNode FROM() { return getToken(RqlParser.FROM, 0); }
		public TerminalNode ALL_DOCS() { return getToken(RqlParser.ALL_DOCS, 0); }
		public AllCollectionsContext(FromStatementContext ctx) { copyFrom(ctx); }
	}
	public static class CollectionByIndexContext extends FromStatementContext {
		public TerminalNode FROM() { return getToken(RqlParser.FROM, 0); }
		public TerminalNode INDEX() { return getToken(RqlParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public CollectionByIndexContext(FromStatementContext ctx) { copyFrom(ctx); }
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fromStatement);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new CollectionByNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(FROM);
				setState(59);
				match(WORD);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(60);
					alias();
					}
				}

				}
				break;
			case 2:
				_localctx = new CollectionByIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(FROM);
				setState(64);
				match(INDEX);
				setState(65);
				indexName();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(66);
					alias();
					}
				}

				}
				break;
			case 3:
				_localctx = new AllCollectionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(FROM);
				setState(70);
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

	public static class IndexNameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(RqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(RqlParser.STRING, i);
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
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				match(STRING);
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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

	public static class LoadStatmentContext extends ParserRuleContext {
		public LoadStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadStatment; }
	 
		public LoadStatmentContext() { }
		public void copyFrom(LoadStatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoadAdditionalCollectionContext extends LoadStatmentContext {
		public TerminalNode LOAD() { return getToken(RqlParser.LOAD, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode AS() { return getToken(RqlParser.AS, 0); }
		public TerminalNode WORD() { return getToken(RqlParser.WORD, 0); }
		public LoadAdditionalCollectionContext(LoadStatmentContext ctx) { copyFrom(ctx); }
	}

	public final LoadStatmentContext loadStatment() throws RecognitionException {
		LoadStatmentContext _localctx = new LoadStatmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loadStatment);
		try {
			_localctx = new LoadAdditionalCollectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LOAD);
			setState(79);
			variable();
			setState(80);
			match(AS);
			setState(81);
			match(WORD);
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
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	 
		public SelectStatementContext() { }
		public void copyFrom(SelectStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavascriptCodeContext extends SelectStatementContext {
		public TerminalNode SELECT() { return getToken(RqlParser.SELECT, 0); }
		public JsCodeContext jsCode() {
			return getRuleContext(JsCodeContext.class,0);
		}
		public JavascriptCodeContext(SelectStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ProjectIndividualFieldsContext extends SelectStatementContext {
		public TerminalNode SELECT() { return getToken(RqlParser.SELECT, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RqlParser.COMMA, i);
		}
		public ProjectIndividualFieldsContext(SelectStatementContext ctx) { copyFrom(ctx); }
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectStatement);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ProjectIndividualFieldsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(SELECT);
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(84);
					function();
					}
					break;
				case 2:
					{
					setState(85);
					variable();
					}
					break;
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(88);
					alias();
					}
				}

				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(91);
					match(COMMA);
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(92);
						function();
						}
						break;
					case 2:
						{
						setState(93);
						variable();
						}
						break;
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(96);
						alias();
						}
					}

					}
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new JavascriptCodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(SELECT);
				setState(105);
				jsCode();
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

	public static class JsFunctionContext extends ParserRuleContext {
		public TerminalNode JS_BODY() { return getToken(RqlParser.JS_BODY, 0); }
		public TerminalNode JS_FUNCTION_DECLARATION() { return getToken(RqlParser.JS_FUNCTION_DECLARATION, 0); }
		public List<TerminalNode> WORD() { return getTokens(RqlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(RqlParser.WORD, i);
		}
		public TerminalNode OP_PAR() { return getToken(RqlParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(RqlParser.CL_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RqlParser.COMMA, i);
		}
		public JsFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsFunction; }
	}

	public final JsFunctionContext jsFunction() throws RecognitionException {
		JsFunctionContext _localctx = new JsFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jsFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(108);
			match(JS_FUNCTION_DECLARATION);
			setState(109);
			match(WORD);
			setState(110);
			match(OP_PAR);
			setState(111);
			match(WORD);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(112);
				match(COMMA);
				setState(113);
				match(WORD);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(CL_PAR);
			}
			setState(121);
			match(JS_BODY);
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

	public static class JsCodeContext extends ParserRuleContext {
		public TerminalNode JS_BODY() { return getToken(RqlParser.JS_BODY, 0); }
		public JsCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsCode; }
	}

	public final JsCodeContext jsCode() throws RecognitionException {
		JsCodeContext _localctx = new JsCodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jsCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(JS_BODY);
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

	public static class AliasContext extends ParserRuleContext {
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	 
		public AliasContext() { }
		public void copyFrom(AliasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AliasNodeContext extends AliasContext {
		public TerminalNode AS() { return getToken(RqlParser.AS, 0); }
		public TerminalNode WORD() { return getToken(RqlParser.WORD, 0); }
		public AliasNodeContext(AliasContext ctx) { copyFrom(ctx); }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alias);
		try {
			_localctx = new AliasNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(AS);
			setState(126);
			match(WORD);
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(RqlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(RqlParser.WORD, i);
		}
		public TerminalNode DOT() { return getToken(RqlParser.DOT, 0); }
		public TerminalNode OP_Q() { return getToken(RqlParser.OP_Q, 0); }
		public TerminalNode CL_Q() { return getToken(RqlParser.CL_Q, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(128);
				match(WORD);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_Q) {
					{
					setState(129);
					match(OP_Q);
					setState(130);
					match(CL_Q);
					}
				}

				setState(133);
				match(DOT);
				}
				break;
			}
			setState(136);
			match(WORD);
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

	public static class FunctionContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode OP_PAR() { return getToken(RqlParser.OP_PAR, 0); }
		public TerminalNode CL_PAR() { return getToken(RqlParser.CL_PAR, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> NUM() { return getTokens(RqlParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(RqlParser.NUM, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RqlParser.COMMA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(RqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(RqlParser.STRING, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138);
			variable();
			setState(139);
			match(OP_PAR);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(140);
					function();
					}
					break;
				case 2:
					{
					setState(141);
					variable();
					}
					break;
				case 3:
					{
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(142);
						match(STRING);
						}
						}
						setState(145); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==STRING );
					}
					break;
				case 4:
					{
					setState(147);
					match(NUM);
					}
					break;
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(150);
					match(COMMA);
					setState(159);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(151);
						function();
						}
						break;
					case 2:
						{
						setState(152);
						variable();
						}
						break;
					case 3:
						{
						setState(154); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(153);
							match(STRING);
							}
							}
							setState(156); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==STRING );
						}
						break;
					case 4:
						{
						setState(158);
						match(NUM);
						}
						break;
					}
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(168);
			match(CL_PAR);
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
		enterRule(_localctx, 20, RULE_whereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(WHERE);
			setState(171);
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

	public static class GroupByStatementContext extends ParserRuleContext {
		public TerminalNode GROUP_BY() { return getToken(RqlParser.GROUP_BY, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RqlParser.COMMA, i);
		}
		public GroupByStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByStatement; }
	}

	public final GroupByStatementContext groupByStatement() throws RecognitionException {
		GroupByStatementContext _localctx = new GroupByStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_groupByStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(GROUP_BY);
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(174);
				function();
				}
				break;
			case 2:
				{
				setState(175);
				variable();
				}
				break;
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(179);
					function();
					}
					break;
				case 2:
					{
					setState(180);
					variable();
					}
					break;
				}
				}
				}
				setState(187);
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

	public static class OrderByStatementContext extends ParserRuleContext {
		public TerminalNode ORDER_BY() { return getToken(RqlParser.ORDER_BY, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RqlParser.COMMA, i);
		}
		public OrderBySortingContext orderBySorting() {
			return getRuleContext(OrderBySortingContext.class,0);
		}
		public TerminalNode SORTING() { return getToken(RqlParser.SORTING, 0); }
		public OrderByStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByStatement; }
	}

	public final OrderByStatementContext orderByStatement() throws RecognitionException {
		OrderByStatementContext _localctx = new OrderByStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orderByStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ORDER_BY);
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(189);
				variable();
				}
				break;
			case 2:
				{
				setState(190);
				function();
				}
				break;
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(193);
				match(COMMA);
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(194);
					variable();
					}
					break;
				case 2:
					{
					setState(195);
					function();
					}
					break;
				}
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(203);
				orderBySorting();
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTING) {
				{
				setState(206);
				match(SORTING);
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

	public static class OrderBySortingContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(RqlParser.AS, 0); }
		public TerminalNode STRING_W() { return getToken(RqlParser.STRING_W, 0); }
		public TerminalNode ALPHANUMERIC() { return getToken(RqlParser.ALPHANUMERIC, 0); }
		public TerminalNode LONG() { return getToken(RqlParser.LONG, 0); }
		public TerminalNode DOUBLE() { return getToken(RqlParser.DOUBLE, 0); }
		public OrderBySortingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderBySorting; }
	}

	public final OrderBySortingContext orderBySorting() throws RecognitionException {
		OrderBySortingContext _localctx = new OrderBySortingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orderBySorting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(AS);
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHANUMERIC) | (1L << DOUBLE) | (1L << LONG) | (1L << STRING_W))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(RqlParser.AND, 0); }
		public TerminalNode NOT() { return getToken(RqlParser.NOT, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class WordValueExprContext extends ExprContext {
		public TerminalNode COMMA() { return getToken(RqlParser.COMMA, 0); }
		public List<TerminalNode> STRING() { return getTokens(RqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(RqlParser.STRING, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WordValueExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(RqlParser.EQUAL, 0); }
		public EqualExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionExprContext extends ExprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BetweenExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(RqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(RqlParser.AND, 0); }
		public BetweenExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MathOperatorExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MATH() { return getToken(RqlParser.MATH, 0); }
		public MathOperatorExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(RqlParser.OR, 0); }
		public TerminalNode NOT() { return getToken(RqlParser.NOT, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParentissExprContext extends ExprContext {
		public TerminalNode OP_PAR() { return getToken(RqlParser.OP_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CL_PAR() { return getToken(RqlParser.CL_PAR, 0); }
		public ParentissExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NumExprContext extends ExprContext {
		public TerminalNode NUM() { return getToken(RqlParser.NUM, 0); }
		public NumExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VariableExprContext extends ExprContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ListExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(RqlParser.IN, 0); }
		public TerminalNode ALL() { return getToken(RqlParser.ALL, 0); }
		public ListExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SpecialFunctionExprContext extends ExprContext {
		public SpecialFunctionsContext specialFunctions() {
			return getRuleContext(SpecialFunctionsContext.class,0);
		}
		public SpecialFunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(RqlParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(RqlParser.TRUE, 0); }
		public BooleanExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				_localctx = new SpecialFunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(213);
				specialFunctions();
				}
				break;
			case 2:
				{
				_localctx = new ParentissExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(OP_PAR);
				setState(215);
				expr(0);
				setState(216);
				match(CL_PAR);
				}
				break;
			case 3:
				{
				_localctx = new WordValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(218);
					match(COMMA);
					}
				}

				setState(222); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(221);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(224); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(226);
					expr(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(NUM);
				}
				break;
			case 5:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				function();
				}
				break;
			case 7:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				variable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(236);
						match(EQUAL);
						setState(237);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new MathOperatorExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(239);
						match(MATH);
						setState(240);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new BetweenExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(242);
						match(BETWEEN);
						setState(243);
						expr(0);
						setState(244);
						match(AND);
						setState(245);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(248);
						match(AND);
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(249);
							match(NOT);
							}
						}

						setState(252);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(254);
						match(OR);
						setState(256);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(255);
							match(NOT);
							}
						}

						setState(258);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ListExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL) {
							{
							setState(260);
							match(ALL);
							}
						}

						setState(263);
						match(IN);
						setState(264);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class SpecialFunctionsContext extends ParserRuleContext {
		public TerminalNode OP_PAR() { return getToken(RqlParser.OP_PAR, 0); }
		public List<SpecialParamContext> specialParam() {
			return getRuleContexts(SpecialParamContext.class);
		}
		public SpecialParamContext specialParam(int i) {
			return getRuleContext(SpecialParamContext.class,i);
		}
		public TerminalNode CL_PAR() { return getToken(RqlParser.CL_PAR, 0); }
		public TerminalNode MORELIKETHIS() { return getToken(RqlParser.MORELIKETHIS, 0); }
		public TerminalNode INTERSECT() { return getToken(RqlParser.INTERSECT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RqlParser.COMMA, i);
		}
		public SpecialFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunctions; }
	}

	public final SpecialFunctionsContext specialFunctions() throws RecognitionException {
		SpecialFunctionsContext _localctx = new SpecialFunctionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_specialFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==INTERSECT || _la==MORELIKETHIS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(271);
			match(OP_PAR);
			setState(272);
			specialParam(0);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(273);
				match(COMMA);
				setState(274);
				specialParam(0);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(CL_PAR);
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

	public static class SpecialParamContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(RqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(RqlParser.STRING, i);
		}
		public TerminalNode NUM() { return getToken(RqlParser.NUM, 0); }
		public List<SpecialParamContext> specialParam() {
			return getRuleContexts(SpecialParamContext.class);
		}
		public SpecialParamContext specialParam(int i) {
			return getRuleContext(SpecialParamContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(RqlParser.EQUAL, 0); }
		public TerminalNode AND() { return getToken(RqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(RqlParser.OR, 0); }
		public SpecialParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialParam; }
	}

	public final SpecialParamContext specialParam() throws RecognitionException {
		return specialParam(0);
	}

	private SpecialParamContext specialParam(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SpecialParamContext _localctx = new SpecialParamContext(_ctx, _parentState);
		SpecialParamContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_specialParam, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(283);
				function();
				}
				break;
			case 2:
				{
				setState(284);
				variable();
				}
				break;
			case 3:
				{
				setState(286); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(285);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(288); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
				setState(290);
				match(NUM);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new SpecialParamContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_specialParam);
						setState(293);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(294);
						match(EQUAL);
						setState(295);
						specialParam(8);
						}
						break;
					case 2:
						{
						_localctx = new SpecialParamContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_specialParam);
						setState(296);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(297);
						match(AND);
						setState(298);
						specialParam(7);
						}
						break;
					case 3:
						{
						_localctx = new SpecialParamContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_specialParam);
						setState(299);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(300);
						match(OR);
						setState(301);
						specialParam(6);
						}
						break;
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 16:
			return specialParam_sempred((SpecialParamContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean specialParam_sempred(SpecialParamContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0136\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\5\2-\n\2\3\2\5\2\60\n\2\3\2\5\2\63"+
		"\n\2\3\2\5\2\66\n\2\3\2\5\29\n\2\3\2\3\2\3\3\3\3\3\3\5\3@\n\3\3\3\3\3"+
		"\3\3\3\3\5\3F\n\3\3\3\3\3\5\3J\n\3\3\4\6\4M\n\4\r\4\16\4N\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\5\6Y\n\6\3\6\5\6\\\n\6\3\6\3\6\3\6\5\6a\n\6\3\6\5"+
		"\6d\n\6\7\6f\n\6\f\6\16\6i\13\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7u\n\7\f\7\16\7x\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\5\n\u0086\n\n\3\n\5\n\u0089\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\6\13\u0092\n\13\r\13\16\13\u0093\3\13\5\13\u0097\n\13\3\13\3\13\3\13"+
		"\3\13\6\13\u009d\n\13\r\13\16\13\u009e\3\13\5\13\u00a2\n\13\7\13\u00a4"+
		"\n\13\f\13\16\13\u00a7\13\13\5\13\u00a9\n\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\5\r\u00b3\n\r\3\r\3\r\3\r\5\r\u00b8\n\r\7\r\u00ba\n\r\f\r\16"+
		"\r\u00bd\13\r\3\16\3\16\3\16\5\16\u00c2\n\16\3\16\3\16\3\16\5\16\u00c7"+
		"\n\16\7\16\u00c9\n\16\f\16\16\16\u00cc\13\16\3\16\5\16\u00cf\n\16\3\16"+
		"\5\16\u00d2\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00de\n\20\3\20\6\20\u00e1\n\20\r\20\16\20\u00e2\3\20\5\20\u00e6\n\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00ec\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fd\n\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0103\n\20\3\20\3\20\3\20\5\20\u0108\n\20\3\20\3\20\7\20\u010c"+
		"\n\20\f\20\16\20\u010f\13\20\3\21\3\21\3\21\3\21\3\21\7\21\u0116\n\21"+
		"\f\21\16\21\u0119\13\21\3\21\3\21\3\22\3\22\3\22\3\22\6\22\u0121\n\22"+
		"\r\22\16\22\u0122\3\22\5\22\u0126\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u0131\n\22\f\22\16\22\u0134\13\22\3\22\2\4\36\"\23"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\6\2\21\21\26\26  **\4\2"+
		"\30\30++\4\2\36\36\"\"\2\u0164\2\'\3\2\2\2\4I\3\2\2\2\6L\3\2\2\2\bP\3"+
		"\2\2\2\nl\3\2\2\2\fn\3\2\2\2\16}\3\2\2\2\20\177\3\2\2\2\22\u0088\3\2\2"+
		"\2\24\u008c\3\2\2\2\26\u00ac\3\2\2\2\30\u00af\3\2\2\2\32\u00be\3\2\2\2"+
		"\34\u00d3\3\2\2\2\36\u00eb\3\2\2\2 \u0110\3\2\2\2\"\u0125\3\2\2\2$&\5"+
		"\f\7\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2"+
		"*,\5\4\3\2+-\5\b\5\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\5\26\f\2/.\3\2"+
		"\2\2/\60\3\2\2\2\60\62\3\2\2\2\61\63\5\30\r\2\62\61\3\2\2\2\62\63\3\2"+
		"\2\2\63\65\3\2\2\2\64\66\5\32\16\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2"+
		"\2\2\679\5\n\6\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\2\2\3;\3\3\2\2\2"+
		"<=\7\31\2\2=?\7\62\2\2>@\5\20\t\2?>\3\2\2\2?@\3\2\2\2@J\3\2\2\2AB\7\31"+
		"\2\2BC\7\35\2\2CE\5\6\4\2DF\5\20\t\2ED\3\2\2\2EF\3\2\2\2FJ\3\2\2\2GH\7"+
		"\31\2\2HJ\7\20\2\2I<\3\2\2\2IA\3\2\2\2IG\3\2\2\2J\5\3\2\2\2KM\7\61\2\2"+
		"LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\7\3\2\2\2PQ\7\37\2\2QR\5\22"+
		"\n\2RS\7\23\2\2ST\7\62\2\2T\t\3\2\2\2UX\7\'\2\2VY\5\24\13\2WY\5\22\n\2"+
		"XV\3\2\2\2XW\3\2\2\2Y[\3\2\2\2Z\\\5\20\t\2[Z\3\2\2\2[\\\3\2\2\2\\g\3\2"+
		"\2\2]`\7\6\2\2^a\5\24\13\2_a\5\22\n\2`^\3\2\2\2`_\3\2\2\2ac\3\2\2\2bd"+
		"\5\20\t\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2e]\3\2\2\2fi\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2hm\3\2\2\2ig\3\2\2\2jk\7\'\2\2km\5\16\b\2lU\3\2\2\2lj\3\2\2"+
		"\2m\13\3\2\2\2no\7/\2\2op\7\62\2\2pq\7\f\2\2qv\7\62\2\2rs\7\6\2\2su\7"+
		"\62\2\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz"+
		"\7\4\2\2z{\3\2\2\2{|\7.\2\2|\r\3\2\2\2}~\7.\2\2~\17\3\2\2\2\177\u0080"+
		"\7\23\2\2\u0080\u0081\7\62\2\2\u0081\21\3\2\2\2\u0082\u0085\7\62\2\2\u0083"+
		"\u0084\7\r\2\2\u0084\u0086\7\5\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0089\7\7\2\2\u0088\u0082\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\62\2\2\u008b\23\3\2\2"+
		"\2\u008c\u008d\5\22\n\2\u008d\u00a8\7\f\2\2\u008e\u0097\5\24\13\2\u008f"+
		"\u0097\5\22\n\2\u0090\u0092\7\61\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0097\7\60\2\2\u0096\u008e\3\2\2\2\u0096\u008f\3\2\2\2\u0096\u0091\3"+
		"\2\2\2\u0096\u0095\3\2\2\2\u0097\u00a5\3\2\2\2\u0098\u00a1\7\6\2\2\u0099"+
		"\u00a2\5\24\13\2\u009a\u00a2\5\22\n\2\u009b\u009d\7\61\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u00a2\7\60\2\2\u00a1\u0099\3\2\2\2\u00a1\u009a\3"+
		"\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u0098\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u0096\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\4\2\2\u00ab\25\3\2\2"+
		"\2\u00ac\u00ad\7,\2\2\u00ad\u00ae\5\36\20\2\u00ae\27\3\2\2\2\u00af\u00b2"+
		"\7\32\2\2\u00b0\u00b3\5\24\13\2\u00b1\u00b3\5\22\n\2\u00b2\u00b0\3\2\2"+
		"\2\u00b2\u00b1\3\2\2\2\u00b3\u00bb\3\2\2\2\u00b4\u00b7\7\6\2\2\u00b5\u00b8"+
		"\5\24\13\2\u00b6\u00b8\5\22\n\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2"+
		"\2\u00b8\u00ba\3\2\2\2\u00b9\u00b4\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00c1\7&\2\2\u00bf\u00c2\5\22\n\2\u00c0\u00c2\5\24\13\2\u00c1\u00bf\3"+
		"\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00ca\3\2\2\2\u00c3\u00c6\7\6\2\2\u00c4"+
		"\u00c7\5\22\n\2\u00c5\u00c7\5\24\13\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00cf\5\34\17\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00d2\7(\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\33\3\2\2\2\u00d3\u00d4\7\23\2\2\u00d4\u00d5\t\2\2\2\u00d5\35"+
		"\3\2\2\2\u00d6\u00d7\b\20\1\2\u00d7\u00ec\5 \21\2\u00d8\u00d9\7\f\2\2"+
		"\u00d9\u00da\5\36\20\2\u00da\u00db\7\4\2\2\u00db\u00ec\3\2\2\2\u00dc\u00de"+
		"\7\6\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00e1\7\61\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e6\5\36\20\2\u00e5"+
		"\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ec\3\2\2\2\u00e7\u00ec\7\60"+
		"\2\2\u00e8\u00ec\t\3\2\2\u00e9\u00ec\5\24\13\2\u00ea\u00ec\5\22\n\2\u00eb"+
		"\u00d6\3\2\2\2\u00eb\u00d8\3\2\2\2\u00eb\u00dd\3\2\2\2\u00eb\u00e7\3\2"+
		"\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u010d\3\2\2\2\u00ed\u00ee\f\r\2\2\u00ee\u00ef\7\t\2\2\u00ef\u010c\5\36"+
		"\20\16\u00f0\u00f1\f\f\2\2\u00f1\u00f2\7\n\2\2\u00f2\u010c\5\36\20\r\u00f3"+
		"\u00f4\f\13\2\2\u00f4\u00f5\7\24\2\2\u00f5\u00f6\5\36\20\2\u00f6\u00f7"+
		"\7\22\2\2\u00f7\u00f8\5\36\20\f\u00f8\u010c\3\2\2\2\u00f9\u00fa\f\n\2"+
		"\2\u00fa\u00fc\7\22\2\2\u00fb\u00fd\7#\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u010c\5\36\20\13\u00ff\u0100\f\t\2"+
		"\2\u0100\u0102\7%\2\2\u0101\u0103\7#\2\2\u0102\u0101\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u010c\5\36\20\n\u0105\u0107\f\b\2\2"+
		"\u0106\u0108\7\17\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010a\7\33\2\2\u010a\u010c\5\36\20\t\u010b\u00ed\3\2\2"+
		"\2\u010b\u00f0\3\2\2\2\u010b\u00f3\3\2\2\2\u010b\u00f9\3\2\2\2\u010b\u00ff"+
		"\3\2\2\2\u010b\u0105\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\37\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\t\4\2"+
		"\2\u0111\u0112\7\f\2\2\u0112\u0117\5\"\22\2\u0113\u0114\7\6\2\2\u0114"+
		"\u0116\5\"\22\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\7\4\2\2\u011b!\3\2\2\2\u011c\u011d\b\22\1\2\u011d\u0126\5\24\13"+
		"\2\u011e\u0126\5\22\n\2\u011f\u0121\7\61\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0126\7\60\2\2\u0125\u011c\3\2\2\2\u0125\u011e\3\2\2\2\u0125"+
		"\u0120\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u0132\3\2\2\2\u0127\u0128\f\t"+
		"\2\2\u0128\u0129\7\t\2\2\u0129\u0131\5\"\22\n\u012a\u012b\f\b\2\2\u012b"+
		"\u012c\7\22\2\2\u012c\u0131\5\"\22\t\u012d\u012e\f\7\2\2\u012e\u012f\7"+
		"%\2\2\u012f\u0131\5\"\22\b\u0130\u0127\3\2\2\2\u0130\u012a\3\2\2\2\u0130"+
		"\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133#\3\2\2\2\u0134\u0132\3\2\2\2\61\',/\62\658?EINX[`cglv\u0085"+
		"\u0088\u0093\u0096\u009e\u00a1\u00a5\u00a8\u00b2\u00b7\u00bb\u00c1\u00c6"+
		"\u00ca\u00ce\u00d1\u00dd\u00e2\u00e5\u00eb\u00fc\u0102\u0107\u010b\u010d"+
		"\u0117\u0122\u0125\u0130\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}