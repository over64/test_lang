// Generated from /home/over/build/test_lang/grammar/M2Parser.g4 by ANTLR 4.5.3
package grammar2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class M2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MINUS=1, PLUS=2, MUL=3, DIV=4, EXCL=5, DOT=6, RB=7, LB=8, COMMA=9, MORE_=10, 
		MORE_EQ=11, LESS=12, LESS_EQ=13, EQ=14, EQEQ=15, NOTEQ=16, SEMI=17, IF=18, 
		THEN=19, ELSE=20, CBO=21, CBC=22, LOGIC_OR=23, LOGIC_AND=24, WHILE=25, 
		VAL=26, VAR=27, CON=28, ARROW_RIGHT=29, TYPE=30, BACK_SLASH=31, SELF=32, 
		DEF=33, LlBegin=34, WS=35, NL=36, COMMENT=37, LlLiteral=38, IntLiteral=39, 
		FloatLiteral=40, BooleanLiteral=41, StringLiteral=42, Id=43, IrInline=44, 
		LlEnd=45;
	public static final int
		RULE_literal = 0, RULE_realdId = 1, RULE_expression = 2, RULE_store = 3, 
		RULE_fnArg = 4, RULE_block = 5, RULE_blockBody = 6, RULE_lambdaBlock = 7, 
		RULE_tuple = 8, RULE_scalarTypeHint = 9, RULE_fnTypeHintField = 10, RULE_fnTypeHint = 11, 
		RULE_typeHint = 12, RULE_variable = 13, RULE_scalarType = 14, RULE_typeField = 15, 
		RULE_factorType = 16, RULE_type = 17, RULE_function = 18, RULE_level1 = 19, 
		RULE_module = 20;
	public static final String[] ruleNames = {
		"literal", "realdId", "expression", "store", "fnArg", "block", "blockBody", 
		"lambdaBlock", "tuple", "scalarTypeHint", "fnTypeHintField", "fnTypeHint", 
		"typeHint", "variable", "scalarType", "typeField", "factorType", "type", 
		"function", "level1", "module"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'+'", "'*'", "'/'", "'!'", "'.'", "')'", "'('", "','", "'>'", 
		"'>='", "'<'", "'<='", "'='", "'=='", "'!='", "';'", "'if'", "'then'", 
		"'else'", "'{'", "'}'", "'||'", "'&&'", "'while'", "'val'", "'var'", "':'", 
		"'->'", "'type'", "'\\'", "'self'", "'def'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MINUS", "PLUS", "MUL", "DIV", "EXCL", "DOT", "RB", "LB", "COMMA", 
		"MORE_", "MORE_EQ", "LESS", "LESS_EQ", "EQ", "EQEQ", "NOTEQ", "SEMI", 
		"IF", "THEN", "ELSE", "CBO", "CBC", "LOGIC_OR", "LOGIC_AND", "WHILE", 
		"VAL", "VAR", "CON", "ARROW_RIGHT", "TYPE", "BACK_SLASH", "SELF", "DEF", 
		"LlBegin", "WS", "NL", "COMMENT", "LlLiteral", "IntLiteral", "FloatLiteral", 
		"BooleanLiteral", "StringLiteral", "Id", "IrInline", "LlEnd"
	};
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
	public String getGrammarFileName() { return "M2Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public M2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntLiteral() { return getToken(M2Parser.IntLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(M2Parser.FloatLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(M2Parser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(M2Parser.StringLiteral, 0); }
		public TerminalNode Id() { return getToken(M2Parser.Id, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << BooleanLiteral) | (1L << StringLiteral) | (1L << Id))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class RealdIdContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(M2Parser.Id, 0); }
		public RealdIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realdId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitRealdId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealdIdContext realdId() throws RecognitionException {
		RealdIdContext _localctx = new RealdIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_realdId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==SELF || _la==Id) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprParenContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPropContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Id() { return getToken(M2Parser.Id, 0); }
		public ExprPropContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitExprProp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTupleContext extends ExpressionContext {
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public ExprTupleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprWhileContext extends ExpressionContext {
		public ExpressionContext cond;
		public BlockContext then_block;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(M2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(M2Parser.NL, i);
		}
		public ExprWhileContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitExprWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprUnaryCallContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprUnaryCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitExprUnaryCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprInfixCallContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Id() { return getToken(M2Parser.Id, 0); }
		public ExprInfixCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitExprInfixCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprLiteralContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitExprLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBlockContext extends ExpressionContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprBlockContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitExprBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIfElseContext extends ExpressionContext {
		public ExpressionContext cond;
		public ExpressionContext then_expr;
		public BlockContext then_block;
		public ExpressionContext else_expr;
		public BlockContext else_block;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(M2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(M2Parser.NL, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExprIfElseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitExprIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprLambdaContext extends ExpressionContext {
		public LambdaBlockContext lambdaBlock() {
			return getRuleContext(LambdaBlockContext.class,0);
		}
		public ExprLambdaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitExprLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprApplyContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public ExprApplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitExprApply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new ExprLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(47);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(LB);
				setState(49);
				expression(0);
				setState(50);
				match(RB);
				}
				break;
			case 3:
				{
				_localctx = new ExprTupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				tuple();
				}
				break;
			case 4:
				{
				_localctx = new ExprBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				block();
				}
				break;
			case 5:
				{
				_localctx = new ExprLambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				lambdaBlock();
				}
				break;
			case 6:
				{
				_localctx = new ExprUnaryCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				((ExprUnaryCallContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==EXCL) ) {
					((ExprUnaryCallContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(56);
				expression(8);
				}
				break;
			case 7:
				{
				_localctx = new ExprIfElseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(IF);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(58);
					match(NL);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				((ExprIfElseContext)_localctx).cond = expression(0);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(65);
					match(NL);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				switch (_input.LA(1)) {
				case THEN:
					{
					{
					setState(71);
					match(THEN);
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(72);
						match(NL);
						}
						}
						setState(77);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(78);
					((ExprIfElseContext)_localctx).then_expr = expression(0);
					}
					}
					break;
				case CBO:
					{
					setState(79);
					((ExprIfElseContext)_localctx).then_block = block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(82);
						match(NL);
						}
						}
						setState(87);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(88);
					match(ELSE);
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(89);
						match(NL);
						}
						}
						setState(94);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(95);
						((ExprIfElseContext)_localctx).else_expr = expression(0);
						}
						break;
					case 2:
						{
						setState(96);
						((ExprIfElseContext)_localctx).else_block = block();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new ExprWhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(WHILE);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(102);
					match(NL);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				((ExprWhileContext)_localctx).cond = expression(0);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(109);
					match(NL);
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				((ExprWhileContext)_localctx).then_block = block();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprInfixCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(120);
						((ExprInfixCallContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprInfixCallContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(121);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprInfixCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(123);
						((ExprInfixCallContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << Id))) != 0)) ) {
							((ExprInfixCallContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(124);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprInfixCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(126);
						((ExprInfixCallContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MORE_) | (1L << MORE_EQ) | (1L << LESS) | (1L << LESS_EQ))) != 0)) ) {
							((ExprInfixCallContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(127);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprInfixCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(129);
						((ExprInfixCallContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==NOTEQ) ) {
							((ExprInfixCallContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(130);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprInfixCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(132);
						((ExprInfixCallContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LOGIC_OR || _la==LOGIC_AND) ) {
							((ExprInfixCallContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(133);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprPropContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(135);
						match(DOT);
						setState(136);
						((ExprPropContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << MUL) | (1L << DIV) | (1L << MORE_) | (1L << MORE_EQ) | (1L << LESS) | (1L << LESS_EQ) | (1L << EQEQ) | (1L << NOTEQ) | (1L << LOGIC_OR) | (1L << LOGIC_AND) | (1L << Id))) != 0)) ) {
							((ExprPropContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					case 7:
						{
						_localctx = new ExprApplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(138);
						tuple();
						}
						break;
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class StoreContext extends ParserRuleContext {
		public List<RealdIdContext> realdId() {
			return getRuleContexts(RealdIdContext.class);
		}
		public RealdIdContext realdId(int i) {
			return getRuleContext(RealdIdContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public StoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitStore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreContext store() throws RecognitionException {
		StoreContext _localctx = new StoreContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_store);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			realdId();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(145);
				match(DOT);
				setState(146);
				realdId();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_la = _input.LA(1);
			if (_la==LB) {
				{
				setState(152);
				tuple();
				}
			}

			setState(155);
			match(EQ);
			setState(156);
			expression(0);
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

	public static class FnArgContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(M2Parser.Id, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public FnArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnArg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitFnArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnArgContext fnArg() throws RecognitionException {
		FnArgContext _localctx = new FnArgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fnArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==SELF || _la==Id) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(161);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(159);
				match(CON);
				setState(160);
				typeHint();
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

	public static class BlockContext extends ParserRuleContext {
		public List<FnArgContext> fnArg() {
			return getRuleContexts(FnArgContext.class);
		}
		public FnArgContext fnArg(int i) {
			return getRuleContext(FnArgContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(M2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(M2Parser.NL, i);
		}
		public List<BlockBodyContext> blockBody() {
			return getRuleContexts(BlockBodyContext.class);
		}
		public BlockBodyContext blockBody(int i) {
			return getRuleContext(BlockBodyContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(CBO);
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(164);
				fnArg();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(165);
					match(COMMA);
					setState(166);
					fnArg();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				match(ARROW_RIGHT);
				}
				break;
			}
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					match(NL);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(198);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCL) | (1L << LB) | (1L << IF) | (1L << CBO) | (1L << WHILE) | (1L << VAL) | (1L << VAR) | (1L << BACK_SLASH) | (1L << SELF) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << BooleanLiteral) | (1L << StringLiteral) | (1L << Id))) != 0)) {
				{
				setState(182);
				blockBody();
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(190);
						switch (_input.LA(1)) {
						case MINUS:
						case EXCL:
						case LB:
						case IF:
						case CBO:
						case WHILE:
						case VAL:
						case VAR:
						case BACK_SLASH:
						case SELF:
						case NL:
						case IntLiteral:
						case FloatLiteral:
						case BooleanLiteral:
						case StringLiteral:
						case Id:
							{
							setState(186);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NL) {
								{
								{
								setState(183);
								match(NL);
								}
								}
								setState(188);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case SEMI:
							{
							setState(189);
							match(SEMI);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(192);
						blockBody();
						}
						} 
					}
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(200);
				match(NL);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(CBC);
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

	public static class BlockBodyContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StoreContext store() {
			return getRuleContext(StoreContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockBodyContext blockBody() throws RecognitionException {
		BlockBodyContext _localctx = new BlockBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(208);
				variable();
				}
				break;
			case 2:
				{
				setState(209);
				store();
				}
				break;
			case 3:
				{
				setState(210);
				expression(0);
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

	public static class LambdaBlockContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<FnArgContext> fnArg() {
			return getRuleContexts(FnArgContext.class);
		}
		public FnArgContext fnArg(int i) {
			return getRuleContext(FnArgContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(M2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(M2Parser.NL, i);
		}
		public LambdaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitLambdaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBlockContext lambdaBlock() throws RecognitionException {
		LambdaBlockContext _localctx = new LambdaBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(BACK_SLASH);
			setState(222);
			_la = _input.LA(1);
			if (_la==SELF || _la==Id) {
				{
				setState(214);
				fnArg();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(215);
					match(COMMA);
					setState(216);
					fnArg();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(224);
			match(ARROW_RIGHT);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(225);
				match(NL);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			expression(0);
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

	public static class TupleContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(LB);
			setState(242);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCL) | (1L << LB) | (1L << IF) | (1L << CBO) | (1L << WHILE) | (1L << BACK_SLASH) | (1L << SELF) | (1L << IntLiteral) | (1L << FloatLiteral) | (1L << BooleanLiteral) | (1L << StringLiteral) | (1L << Id))) != 0)) {
				{
				setState(234);
				expression(0);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(235);
					match(COMMA);
					setState(236);
					expression(0);
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(244);
			match(RB);
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

	public static class ScalarTypeHintContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(M2Parser.Id, 0); }
		public ScalarTypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarTypeHint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitScalarTypeHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarTypeHintContext scalarTypeHint() throws RecognitionException {
		ScalarTypeHintContext _localctx = new ScalarTypeHintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scalarTypeHint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(Id);
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

	public static class FnTypeHintFieldContext extends ParserRuleContext {
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode Id() { return getToken(M2Parser.Id, 0); }
		public FnTypeHintFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnTypeHintField; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitFnTypeHintField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnTypeHintFieldContext fnTypeHintField() throws RecognitionException {
		FnTypeHintFieldContext _localctx = new FnTypeHintFieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fnTypeHintField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(_la==SELF || _la==Id) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(249);
			match(CON);
			setState(250);
			typeHint();
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

	public static class FnTypeHintContext extends ParserRuleContext {
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<FnTypeHintFieldContext> fnTypeHintField() {
			return getRuleContexts(FnTypeHintFieldContext.class);
		}
		public FnTypeHintFieldContext fnTypeHintField(int i) {
			return getRuleContext(FnTypeHintFieldContext.class,i);
		}
		public FnTypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnTypeHint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitFnTypeHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnTypeHintContext fnTypeHint() throws RecognitionException {
		FnTypeHintContext _localctx = new FnTypeHintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fnTypeHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(LB);
			setState(261);
			_la = _input.LA(1);
			if (_la==SELF || _la==Id) {
				{
				setState(253);
				fnTypeHintField();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(254);
					match(COMMA);
					setState(255);
					fnTypeHintField();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(263);
			match(RB);
			setState(264);
			match(ARROW_RIGHT);
			setState(265);
			typeHint();
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

	public static class TypeHintContext extends ParserRuleContext {
		public ScalarTypeHintContext scalarTypeHint() {
			return getRuleContext(ScalarTypeHintContext.class,0);
		}
		public FnTypeHintContext fnTypeHint() {
			return getRuleContext(FnTypeHintContext.class,0);
		}
		public TypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeHint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitTypeHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		TypeHintContext _localctx = new TypeHintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeHint);
		try {
			setState(269);
			switch (_input.LA(1)) {
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				scalarTypeHint();
				}
				break;
			case LB:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				fnTypeHint();
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

	public static class VariableContext extends ParserRuleContext {
		public Token valVar;
		public TerminalNode Id() { return getToken(M2Parser.Id, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(M2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(M2Parser.NL, i);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			((VariableContext)_localctx).valVar = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
				((VariableContext)_localctx).valVar = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(272);
				match(NL);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(Id);
			setState(281);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(279);
				match(CON);
				setState(280);
				typeHint();
				}
			}

			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(283);
				match(NL);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(EQ);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(290);
				match(NL);
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			expression(0);
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

	public static class ScalarTypeContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(M2Parser.Id, 0); }
		public TerminalNode LlLiteral() { return getToken(M2Parser.LlLiteral, 0); }
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scalarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(TYPE);
			setState(299);
			match(Id);
			setState(300);
			match(EQ);
			setState(301);
			match(LlLiteral);
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

	public static class TypeFieldContext extends ParserRuleContext {
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode Id() { return getToken(M2Parser.Id, 0); }
		public TypeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeField; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitTypeField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFieldContext typeField() throws RecognitionException {
		TypeFieldContext _localctx = new TypeFieldContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(303);
				match(SELF);
				}
				break;
			}
			setState(306);
			_la = _input.LA(1);
			if ( !(_la==SELF || _la==Id) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(307);
			match(CON);
			setState(308);
			typeHint();
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

	public static class FactorTypeContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(M2Parser.Id, 0); }
		public List<TypeFieldContext> typeField() {
			return getRuleContexts(TypeFieldContext.class);
		}
		public TypeFieldContext typeField(int i) {
			return getRuleContext(TypeFieldContext.class,i);
		}
		public FactorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitFactorType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorTypeContext factorType() throws RecognitionException {
		FactorTypeContext _localctx = new FactorTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factorType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(TYPE);
			setState(311);
			match(Id);
			setState(312);
			match(EQ);
			setState(313);
			match(LB);
			setState(314);
			typeField();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(315);
				match(COMMA);
				setState(316);
				typeField();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			match(RB);
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

	public static class TypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public FactorTypeContext factorType() {
			return getRuleContext(FactorTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				scalarType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				factorType();
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

	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode Id() { return getToken(M2Parser.Id, 0); }
		public LambdaBlockContext lambdaBlock() {
			return getRuleContext(LambdaBlockContext.class,0);
		}
		public TerminalNode LlLiteral() { return getToken(M2Parser.LlLiteral, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FnTypeHintContext fnTypeHint() {
			return getRuleContext(FnTypeHintContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(M2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(M2Parser.NL, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(DEF);
			setState(329);
			((FunctionContext)_localctx).name = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << MUL) | (1L << DIV) | (1L << MORE_) | (1L << MORE_EQ) | (1L << LESS) | (1L << LESS_EQ) | (1L << EQEQ) | (1L << NOTEQ) | (1L << LOGIC_OR) | (1L << LOGIC_AND) | (1L << SELF) | (1L << Id))) != 0)) ) {
				((FunctionContext)_localctx).name = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(332);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(330);
				match(CON);
				setState(331);
				fnTypeHint();
				}
			}

			setState(334);
			match(EQ);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(335);
				match(NL);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(341);
				lambdaBlock();
				}
				break;
			case 2:
				{
				{
				setState(342);
				block();
				setState(343);
				match(CON);
				setState(344);
				typeHint();
				}
				}
				break;
			case 3:
				{
				setState(346);
				match(LlLiteral);
				}
				break;
			case 4:
				{
				setState(347);
				expression(0);
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

	public static class Level1Context extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitLevel1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level1Context level1() throws RecognitionException {
		Level1Context _localctx = new Level1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_level1);
		try {
			setState(352);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				type();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				function();
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

	public static class ModuleContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(M2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(M2Parser.NL, i);
		}
		public List<Level1Context> level1() {
			return getRuleContexts(Level1Context.class);
		}
		public Level1Context level1(int i) {
			return getRuleContext(Level1Context.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof M2ParserVisitor ) return ((M2ParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(354);
				match(NL);
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			_la = _input.LA(1);
			if (_la==TYPE || _la==DEF) {
				{
				setState(360);
				level1();
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(362); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(361);
							match(NL);
							}
							}
							setState(364); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NL );
						setState(366);
						level1();
						}
						} 
					}
					setState(371);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(372);
					match(NL);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u017f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4"+
		"\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4\5\4S"+
		"\n\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\4\3"+
		"\4\5\4d\n\4\5\4f\n\4\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\3\4\3\4\7\4q\n\4"+
		"\f\4\16\4t\13\4\3\4\3\4\5\4x\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u008e\n\4\f\4\16\4\u0091"+
		"\13\4\3\5\3\5\3\5\7\5\u0096\n\5\f\5\16\5\u0099\13\5\3\5\5\5\u009c\n\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u00a4\n\6\3\7\3\7\3\7\3\7\7\7\u00aa\n\7\f"+
		"\7\16\7\u00ad\13\7\3\7\3\7\5\7\u00b1\n\7\3\7\7\7\u00b4\n\7\f\7\16\7\u00b7"+
		"\13\7\3\7\3\7\7\7\u00bb\n\7\f\7\16\7\u00be\13\7\3\7\5\7\u00c1\n\7\3\7"+
		"\7\7\u00c4\n\7\f\7\16\7\u00c7\13\7\5\7\u00c9\n\7\3\7\7\7\u00cc\n\7\f\7"+
		"\16\7\u00cf\13\7\3\7\3\7\3\b\3\b\3\b\5\b\u00d6\n\b\3\t\3\t\3\t\3\t\7\t"+
		"\u00dc\n\t\f\t\16\t\u00df\13\t\5\t\u00e1\n\t\3\t\3\t\7\t\u00e5\n\t\f\t"+
		"\16\t\u00e8\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00f0\n\n\f\n\16\n\u00f3"+
		"\13\n\5\n\u00f5\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\7\r\u0103\n\r\f\r\16\r\u0106\13\r\5\r\u0108\n\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\5\16\u0110\n\16\3\17\3\17\7\17\u0114\n\17\f\17\16\17\u0117\13\17"+
		"\3\17\3\17\3\17\5\17\u011c\n\17\3\17\7\17\u011f\n\17\f\17\16\17\u0122"+
		"\13\17\3\17\3\17\7\17\u0126\n\17\f\17\16\17\u0129\13\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\5\21\u0133\n\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0140\n\22\f\22\16\22\u0143\13\22\3\22"+
		"\3\22\3\23\3\23\5\23\u0149\n\23\3\24\3\24\3\24\3\24\5\24\u014f\n\24\3"+
		"\24\3\24\7\24\u0153\n\24\f\24\16\24\u0156\13\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u015f\n\24\3\25\3\25\5\25\u0163\n\25\3\26\7\26\u0166"+
		"\n\26\f\26\16\26\u0169\13\26\3\26\3\26\6\26\u016d\n\26\r\26\16\26\u016e"+
		"\3\26\7\26\u0172\n\26\f\26\16\26\u0175\13\26\3\26\7\26\u0178\n\26\f\26"+
		"\16\26\u017b\13\26\5\26\u017d\n\26\3\26\2\3\6\27\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*\2\r\4\2\"\")-\4\2\"\"--\4\2\3\3\7\7\3\2\5\6"+
		"\4\2\3\4--\3\2\f\17\3\2\21\22\3\2\31\32\7\2\3\6\f\17\21\22\31\32--\3\2"+
		"\34\35\b\2\3\6\f\17\21\22\31\32\"\"--\u01a8\2,\3\2\2\2\4.\3\2\2\2\6w\3"+
		"\2\2\2\b\u0092\3\2\2\2\n\u00a0\3\2\2\2\f\u00a5\3\2\2\2\16\u00d5\3\2\2"+
		"\2\20\u00d7\3\2\2\2\22\u00eb\3\2\2\2\24\u00f8\3\2\2\2\26\u00fa\3\2\2\2"+
		"\30\u00fe\3\2\2\2\32\u010f\3\2\2\2\34\u0111\3\2\2\2\36\u012c\3\2\2\2 "+
		"\u0132\3\2\2\2\"\u0138\3\2\2\2$\u0148\3\2\2\2&\u014a\3\2\2\2(\u0162\3"+
		"\2\2\2*\u0167\3\2\2\2,-\t\2\2\2-\3\3\2\2\2./\t\3\2\2/\5\3\2\2\2\60\61"+
		"\b\4\1\2\61x\5\2\2\2\62\63\7\n\2\2\63\64\5\6\4\2\64\65\7\t\2\2\65x\3\2"+
		"\2\2\66x\5\22\n\2\67x\5\f\7\28x\5\20\t\29:\t\4\2\2:x\5\6\4\n;?\7\24\2"+
		"\2<>\7&\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2"+
		"\2BF\5\6\4\2CE\7&\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GR\3\2\2"+
		"\2HF\3\2\2\2IM\7\25\2\2JL\7&\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2NP\3\2\2\2OM\3\2\2\2PS\5\6\4\2QS\5\f\7\2RI\3\2\2\2RQ\3\2\2\2Se\3\2\2"+
		"\2TV\7&\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2"+
		"\2Z^\7\26\2\2[]\7&\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_c\3\2"+
		"\2\2`^\3\2\2\2ad\5\6\4\2bd\5\f\7\2ca\3\2\2\2cb\3\2\2\2df\3\2\2\2eW\3\2"+
		"\2\2ef\3\2\2\2fx\3\2\2\2gk\7\33\2\2hj\7&\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2"+
		"\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2nr\5\6\4\2oq\7&\2\2po\3\2\2\2qt\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\5\f\7\2vx\3\2\2\2w\60\3"+
		"\2\2\2w\62\3\2\2\2w\66\3\2\2\2w\67\3\2\2\2w8\3\2\2\2w9\3\2\2\2w;\3\2\2"+
		"\2wg\3\2\2\2x\u008f\3\2\2\2yz\f\t\2\2z{\t\5\2\2{\u008e\5\6\4\n|}\f\b\2"+
		"\2}~\t\6\2\2~\u008e\5\6\4\t\177\u0080\f\7\2\2\u0080\u0081\t\7\2\2\u0081"+
		"\u008e\5\6\4\b\u0082\u0083\f\6\2\2\u0083\u0084\t\b\2\2\u0084\u008e\5\6"+
		"\4\7\u0085\u0086\f\5\2\2\u0086\u0087\t\t\2\2\u0087\u008e\5\6\4\6\u0088"+
		"\u0089\f\16\2\2\u0089\u008a\7\b\2\2\u008a\u008e\t\n\2\2\u008b\u008c\f"+
		"\r\2\2\u008c\u008e\5\22\n\2\u008dy\3\2\2\2\u008d|\3\2\2\2\u008d\177\3"+
		"\2\2\2\u008d\u0082\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0088\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\7\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0097\5\4\3\2\u0093\u0094"+
		"\7\b\2\2\u0094\u0096\5\4\3\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009c\5\22\n\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\7\20\2\2\u009e\u009f\5\6\4\2\u009f\t\3\2\2"+
		"\2\u00a0\u00a3\t\3\2\2\u00a1\u00a2\7\36\2\2\u00a2\u00a4\5\32\16\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\13\3\2\2\2\u00a5\u00b0\7\27\2"+
		"\2\u00a6\u00ab\5\n\6\2\u00a7\u00a8\7\13\2\2\u00a8\u00aa\5\n\6\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\37\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00a6\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b5\3\2"+
		"\2\2\u00b2\u00b4\7&\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00c8\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00c5\5\16\b\2\u00b9\u00bb\7&\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c1\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\7\23\2\2\u00c0\u00bc\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\5\16\b\2\u00c3\u00c0\3"+
		"\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00b8\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cc\7&\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\30\2\2\u00d1\r\3\2\2\2\u00d2\u00d6"+
		"\5\34\17\2\u00d3\u00d6\5\b\5\2\u00d4\u00d6\5\6\4\2\u00d5\u00d2\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\17\3\2\2\2\u00d7\u00e0"+
		"\7!\2\2\u00d8\u00dd\5\n\6\2\u00d9\u00da\7\13\2\2\u00da\u00dc\5\n\6\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e6\7\37\2\2\u00e3\u00e5\7"+
		"&\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\5\6"+
		"\4\2\u00ea\21\3\2\2\2\u00eb\u00f4\7\n\2\2\u00ec\u00f1\5\6\4\2\u00ed\u00ee"+
		"\7\13\2\2\u00ee\u00f0\5\6\4\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\7\t\2\2\u00f7\23\3\2\2\2\u00f8\u00f9\7-\2\2\u00f9\25\3\2\2\2\u00fa"+
		"\u00fb\t\3\2\2\u00fb\u00fc\7\36\2\2\u00fc\u00fd\5\32\16\2\u00fd\27\3\2"+
		"\2\2\u00fe\u0107\7\n\2\2\u00ff\u0104\5\26\f\2\u0100\u0101\7\13\2\2\u0101"+
		"\u0103\5\26\f\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3"+
		"\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u00ff\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7\t"+
		"\2\2\u010a\u010b\7\37\2\2\u010b\u010c\5\32\16\2\u010c\31\3\2\2\2\u010d"+
		"\u0110\5\24\13\2\u010e\u0110\5\30\r\2\u010f\u010d\3\2\2\2\u010f\u010e"+
		"\3\2\2\2\u0110\33\3\2\2\2\u0111\u0115\t\13\2\2\u0112\u0114\7&\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011b\7-\2\2\u0119"+
		"\u011a\7\36\2\2\u011a\u011c\5\32\16\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u0120\3\2\2\2\u011d\u011f\7&\2\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123\u0127\7\20\2\2\u0124\u0126\7&\2\2\u0125"+
		"\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\5\6\4\2\u012b"+
		"\35\3\2\2\2\u012c\u012d\7 \2\2\u012d\u012e\7-\2\2\u012e\u012f\7\20\2\2"+
		"\u012f\u0130\7(\2\2\u0130\37\3\2\2\2\u0131\u0133\7\"\2\2\u0132\u0131\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\t\3\2\2\u0135"+
		"\u0136\7\36\2\2\u0136\u0137\5\32\16\2\u0137!\3\2\2\2\u0138\u0139\7 \2"+
		"\2\u0139\u013a\7-\2\2\u013a\u013b\7\20\2\2\u013b\u013c\7\n\2\2\u013c\u0141"+
		"\5 \21\2\u013d\u013e\7\13\2\2\u013e\u0140\5 \21\2\u013f\u013d\3\2\2\2"+
		"\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7\t\2\2\u0145#\3\2\2\2\u0146"+
		"\u0149\5\36\20\2\u0147\u0149\5\"\22\2\u0148\u0146\3\2\2\2\u0148\u0147"+
		"\3\2\2\2\u0149%\3\2\2\2\u014a\u014b\7#\2\2\u014b\u014e\t\f\2\2\u014c\u014d"+
		"\7\36\2\2\u014d\u014f\5\30\r\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2"+
		"\u014f\u0150\3\2\2\2\u0150\u0154\7\20\2\2\u0151\u0153\7&\2\2\u0152\u0151"+
		"\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u015e\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015f\5\20\t\2\u0158\u0159\5"+
		"\f\7\2\u0159\u015a\7\36\2\2\u015a\u015b\5\32\16\2\u015b\u015f\3\2\2\2"+
		"\u015c\u015f\7(\2\2\u015d\u015f\5\6\4\2\u015e\u0157\3\2\2\2\u015e\u0158"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\'\3\2\2\2\u0160"+
		"\u0163\5$\23\2\u0161\u0163\5&\24\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2"+
		"\2\2\u0163)\3\2\2\2\u0164\u0166\7&\2\2\u0165\u0164\3\2\2\2\u0166\u0169"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u017c\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u016a\u0173\5(\25\2\u016b\u016d\7&\2\2\u016c\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0172\5(\25\2\u0171\u016c\3\2\2\2\u0172\u0175\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0179\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0178\7&\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017d\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u016a\3\2\2\2\u017c\u017d\3\2\2\2\u017d+\3\2\2\2"+
		"\63?FMRW^cekrw\u008d\u008f\u0097\u009b\u00a3\u00ab\u00b0\u00b5\u00bc\u00c0"+
		"\u00c5\u00c8\u00cd\u00d5\u00dd\u00e0\u00e6\u00f1\u00f4\u0104\u0107\u010f"+
		"\u0115\u011b\u0120\u0127\u0132\u0141\u0148\u014e\u0154\u015e\u0162\u0167"+
		"\u016e\u0173\u0179\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}