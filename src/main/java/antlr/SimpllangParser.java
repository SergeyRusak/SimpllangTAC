// Generated from C:/Users/Kevin/IdeaProjects/SimpleLangTACgen/src/Simpllang.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpllangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, NUM=15, BOOL=16, STRING=17, 
		ASTERISK=18, SLASH=19, PLUS=20, MINUS=21, AND=22, OR=23, EQUAL=24, NOT_EQUAL=25, 
		LESS=26, LESS_OR_EQUAL=27, GREATER=28, GREATER_OR_EQUAL=29, SPACE=30, 
		COMMENT=31, LINE_COMMENT=32;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_expr = 2, RULE_compOperator = 3, 
		RULE_varDecl = 4, RULE_assignment = 5, RULE_print = 6, RULE_ifstmt = 7, 
		RULE_elifstmt = 8, RULE_elsestmt = 9, RULE_whilestmt = 10, RULE_forstmt = 11, 
		RULE_varDeclFor = 12, RULE_assignmentFor = 13, RULE_blockstmt = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "expr", "compOperator", "varDecl", "assignment", "print", 
			"ifstmt", "elifstmt", "elsestmt", "whilestmt", "forstmt", "varDeclFor", 
			"assignmentFor", "blockstmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'var'", "'='", "';'", "'print'", "'if'", "'elif'", 
			"'else'", "'while'", "'for'", "'{'", "'}'", null, null, null, null, "'*'", 
			"'/'", "'+'", "'-'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'<='", "'>'", 
			"'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "NUM", "BOOL", "STRING", "ASTERISK", "SLASH", "PLUS", 
			"MINUS", "AND", "OR", "EQUAL", "NOT_EQUAL", "LESS", "LESS_OR_EQUAL", 
			"GREATER", "GREATER_OR_EQUAL", "SPACE", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Simpllang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpllangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpllangParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 23752L) != 0)) {
				{
				{
				setState(30);
				stmt();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public BlockstmtContext blockstmt() {
			return getRuleContext(BlockstmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				varDecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				assignment();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				print();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				ifstmt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				whilestmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				forstmt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				blockstmt();
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(SimpllangParser.STRING, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(SimpllangParser.AND, 0); }
		public TerminalNode OR() { return getToken(SimpllangParser.OR, 0); }
		public LogicalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterLogicalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitLogicalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitLogicalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public CompOperatorContext compOperator() {
			return getRuleContext(CompOperatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SimpllangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SimpllangParser.MINUS, 0); }
		public PlusMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterPlusMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitPlusMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitPlusMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(SimpllangParser.BOOL, 0); }
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterParenthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitParenthesisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitParenthesisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SimpllangParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SimpllangParser.SLASH, 0); }
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumExprContext extends ExprContext {
		public TerminalNode NUM() { return getToken(SimpllangParser.NUM, 0); }
		public NumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(SimpllangParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ParenthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(48);
				match(T__0);
				setState(49);
				expr(0);
				setState(50);
				match(T__1);
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(ID);
				}
				break;
			case NUM:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(NUM);
				}
				break;
			case BOOL:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(BOOL);
				}
				break;
			case STRING:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						((MulDivExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(58);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(59);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ASTERISK || _la==SLASH) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(60);
						((MulDivExprContext)_localctx).right = expr(9);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusExprContext(new ExprContext(_parentctx, _parentState));
						((PlusMinusExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(62);
						((PlusMinusExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(63);
						((PlusMinusExprContext)_localctx).right = expr(8);
						}
						break;
					case 3:
						{
						_localctx = new LogicalExprContext(new ExprContext(_parentctx, _parentState));
						((LogicalExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(64);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(65);
						((LogicalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(66);
						((LogicalExprContext)_localctx).right = expr(7);
						}
						break;
					case 4:
						{
						_localctx = new CompExprContext(new ExprContext(_parentctx, _parentState));
						((CompExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(68);
						compOperator();
						setState(69);
						((CompExprContext)_localctx).right = expr(6);
						}
						break;
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompOperatorContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LESS() { return getToken(SimpllangParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(SimpllangParser.LESS_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(SimpllangParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SimpllangParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(SimpllangParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(SimpllangParser.GREATER_OR_EQUAL, 0); }
		public CompOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterCompOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitCompOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitCompOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOperatorContext compOperator() throws RecognitionException {
		CompOperatorContext _localctx = new CompOperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((CompOperatorContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) ) {
				((CompOperatorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpllangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__2);
			setState(79);
			match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(80);
				match(T__3);
				setState(81);
				expr(0);
				}
			}

			setState(84);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpllangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			match(T__3);
			setState(88);
			expr(0);
			setState(89);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__5);
			setState(92);
			match(T__0);
			setState(93);
			expr(0);
			setState(94);
			match(T__1);
			setState(95);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfstmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<ElifstmtContext> elifstmt() {
			return getRuleContexts(ElifstmtContext.class);
		}
		public ElifstmtContext elifstmt(int i) {
			return getRuleContext(ElifstmtContext.class,i);
		}
		public ElsestmtContext elsestmt() {
			return getRuleContext(ElsestmtContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__6);
			setState(98);
			match(T__0);
			setState(99);
			expr(0);
			setState(100);
			match(T__1);
			setState(101);
			stmt();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					elifstmt();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(108);
				elsestmt();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElifstmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ElifstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterElifstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitElifstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitElifstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifstmtContext elifstmt() throws RecognitionException {
		ElifstmtContext _localctx = new ElifstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__7);
			setState(112);
			match(T__0);
			setState(113);
			expr(0);
			setState(114);
			match(T__1);
			setState(115);
			stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElsestmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ElsestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterElsestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitElsestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitElsestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestmtContext elsestmt() throws RecognitionException {
		ElsestmtContext _localctx = new ElsestmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elsestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__8);
			setState(118);
			stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhilestmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__9);
			setState(121);
			match(T__0);
			setState(122);
			expr(0);
			setState(123);
			match(T__1);
			setState(124);
			stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForstmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public VarDeclForContext varDeclFor() {
			return getRuleContext(VarDeclForContext.class,0);
		}
		public List<AssignmentForContext> assignmentFor() {
			return getRuleContexts(AssignmentForContext.class);
		}
		public AssignmentForContext assignmentFor(int i) {
			return getRuleContext(AssignmentForContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitForstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitForstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__10);
			setState(127);
			match(T__0);
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(128);
				varDeclFor();
				}
				break;
			case ID:
				{
				setState(129);
				assignmentFor();
				}
				break;
			case T__4:
				break;
			default:
				break;
			}
			setState(132);
			match(T__4);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 245762L) != 0)) {
				{
				setState(133);
				expr(0);
				}
			}

			setState(136);
			match(T__4);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(137);
				assignmentFor();
				}
			}

			setState(140);
			match(T__1);
			setState(141);
			stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclForContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpllangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterVarDeclFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitVarDeclFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitVarDeclFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclForContext varDeclFor() throws RecognitionException {
		VarDeclForContext _localctx = new VarDeclForContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDeclFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__2);
			setState(144);
			match(ID);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(145);
				match(T__3);
				setState(146);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentForContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpllangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterAssignmentFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitAssignmentFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitAssignmentFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentForContext assignmentFor() throws RecognitionException {
		AssignmentForContext _localctx = new AssignmentForContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			setState(150);
			match(T__3);
			setState(151);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockstmtContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).enterBlockstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpllangListener ) ((SimpllangListener)listener).exitBlockstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpllangVisitor ) return ((SimpllangVisitor<? extends T>)visitor).visitBlockstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockstmtContext blockstmt() throws RecognitionException {
		BlockstmtContext _localctx = new BlockstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__11);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 23752L) != 0)) {
				{
				{
				setState(154);
				stmt();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__12);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u00a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"9\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004S\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007h\b\u0007\n\u0007\f\u0007"+
		"k\t\u0007\u0001\u0007\u0003\u0007n\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0083\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0087\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u008b\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0094\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u009c\b\u000e"+
		"\n\u000e\f\u000e\u009f\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0000"+
		"\u0001\u0004\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0004\u0001\u0000\u0012\u0013\u0001\u0000"+
		"\u0014\u0015\u0001\u0000\u0016\u0017\u0001\u0000\u0018\u001d\u00ab\u0000"+
		"!\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00048\u0001"+
		"\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000"+
		"\u0000\nV\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000\u000ea\u0001"+
		"\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012u\u0001\u0000\u0000"+
		"\u0000\u0014x\u0001\u0000\u0000\u0000\u0016~\u0001\u0000\u0000\u0000\u0018"+
		"\u008f\u0001\u0000\u0000\u0000\u001a\u0095\u0001\u0000\u0000\u0000\u001c"+
		"\u0099\u0001\u0000\u0000\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e"+
		"\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000$%\u0005\u0000\u0000\u0001%\u0001\u0001\u0000\u0000"+
		"\u0000&.\u0003\b\u0004\u0000\'.\u0003\n\u0005\u0000(.\u0003\f\u0006\u0000"+
		").\u0003\u000e\u0007\u0000*.\u0003\u0014\n\u0000+.\u0003\u0016\u000b\u0000"+
		",.\u0003\u001c\u000e\u0000-&\u0001\u0000\u0000\u0000-\'\u0001\u0000\u0000"+
		"\u0000-(\u0001\u0000\u0000\u0000-)\u0001\u0000\u0000\u0000-*\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0003"+
		"\u0001\u0000\u0000\u0000/0\u0006\u0002\uffff\uffff\u000001\u0005\u0001"+
		"\u0000\u000012\u0003\u0004\u0002\u000023\u0005\u0002\u0000\u000039\u0001"+
		"\u0000\u0000\u000049\u0005\u000e\u0000\u000059\u0005\u000f\u0000\u0000"+
		"69\u0005\u0010\u0000\u000079\u0005\u0011\u0000\u00008/\u0001\u0000\u0000"+
		"\u000084\u0001\u0000\u0000\u000085\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u000087\u0001\u0000\u0000\u00009I\u0001\u0000\u0000\u0000:;\n\b"+
		"\u0000\u0000;<\u0007\u0000\u0000\u0000<H\u0003\u0004\u0002\t=>\n\u0007"+
		"\u0000\u0000>?\u0007\u0001\u0000\u0000?H\u0003\u0004\u0002\b@A\n\u0006"+
		"\u0000\u0000AB\u0007\u0002\u0000\u0000BH\u0003\u0004\u0002\u0007CD\n\u0005"+
		"\u0000\u0000DE\u0003\u0006\u0003\u0000EF\u0003\u0004\u0002\u0006FH\u0001"+
		"\u0000\u0000\u0000G:\u0001\u0000\u0000\u0000G=\u0001\u0000\u0000\u0000"+
		"G@\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0005\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0007\u0003\u0000\u0000"+
		"M\u0007\u0001\u0000\u0000\u0000NO\u0005\u0003\u0000\u0000OR\u0005\u000e"+
		"\u0000\u0000PQ\u0005\u0004\u0000\u0000QS\u0003\u0004\u0002\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0005\u0000\u0000U\t\u0001\u0000\u0000\u0000VW\u0005\u000e\u0000"+
		"\u0000WX\u0005\u0004\u0000\u0000XY\u0003\u0004\u0002\u0000YZ\u0005\u0005"+
		"\u0000\u0000Z\u000b\u0001\u0000\u0000\u0000[\\\u0005\u0006\u0000\u0000"+
		"\\]\u0005\u0001\u0000\u0000]^\u0003\u0004\u0002\u0000^_\u0005\u0002\u0000"+
		"\u0000_`\u0005\u0005\u0000\u0000`\r\u0001\u0000\u0000\u0000ab\u0005\u0007"+
		"\u0000\u0000bc\u0005\u0001\u0000\u0000cd\u0003\u0004\u0002\u0000de\u0005"+
		"\u0002\u0000\u0000ei\u0003\u0002\u0001\u0000fh\u0003\u0010\b\u0000gf\u0001"+
		"\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000ln\u0003\u0012\t\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000n\u000f\u0001\u0000\u0000\u0000op\u0005\b\u0000\u0000pq\u0005\u0001"+
		"\u0000\u0000qr\u0003\u0004\u0002\u0000rs\u0005\u0002\u0000\u0000st\u0003"+
		"\u0002\u0001\u0000t\u0011\u0001\u0000\u0000\u0000uv\u0005\t\u0000\u0000"+
		"vw\u0003\u0002\u0001\u0000w\u0013\u0001\u0000\u0000\u0000xy\u0005\n\u0000"+
		"\u0000yz\u0005\u0001\u0000\u0000z{\u0003\u0004\u0002\u0000{|\u0005\u0002"+
		"\u0000\u0000|}\u0003\u0002\u0001\u0000}\u0015\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\u000b\u0000\u0000\u007f\u0082\u0005\u0001\u0000\u0000\u0080"+
		"\u0083\u0003\u0018\f\u0000\u0081\u0083\u0003\u001a\r\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\u0005\u0005\u0000\u0000\u0085\u0087\u0003\u0004\u0002\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u008a\u0005\u0005\u0000\u0000\u0089\u008b"+
		"\u0003\u001a\r\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\u0002\u0000\u0000\u008d\u008e\u0003\u0002\u0001\u0000\u008e\u0017\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005\u0003\u0000\u0000\u0090\u0093\u0005"+
		"\u000e\u0000\u0000\u0091\u0092\u0005\u0004\u0000\u0000\u0092\u0094\u0003"+
		"\u0004\u0002\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0019\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u000e\u0000\u0000\u0096\u0097\u0005\u0004\u0000\u0000\u0097\u0098\u0003"+
		"\u0004\u0002\u0000\u0098\u001b\u0001\u0000\u0000\u0000\u0099\u009d\u0005"+
		"\f\u0000\u0000\u009a\u009c\u0003\u0002\u0001\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\r\u0000"+
		"\u0000\u00a1\u001d\u0001\u0000\u0000\u0000\r!-8GIRim\u0082\u0086\u008a"+
		"\u0093\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}