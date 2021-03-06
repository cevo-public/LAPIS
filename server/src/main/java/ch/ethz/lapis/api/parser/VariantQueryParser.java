// Generated from ch\ethz\lapis\api\parser\VariantQuery.g4 by ANTLR 4.9.3

    package ch.ethz.lapis.api.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VariantQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
		T__9=10, T__10=11, A=12, B=13, C=14, D=15, E=16, F=17, G=18, H=19, I=20,
		J=21, K=22, L=23, M=24, N=25, O=26, P=27, Q=28, R=29, S=30, T=31, U=32,
		V=33, W=34, X=35, Y=36, Z=37, MINUS=38, DOT=39, ASTERISK=40, ORF=41, NUMBER=42,
		WHITESPACE=43;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_single = 2, RULE_nuc_mut = 3, RULE_aa_mut = 4,
		RULE_position = 5, RULE_aa = 6, RULE_aa_mutated = 7, RULE_nuc = 8, RULE_nuc_mutated = 9,
		RULE_gene = 10, RULE_pango_query = 11, RULE_pango_include_sub = 12, RULE_pango_lineage = 13,
		RULE_pango_number_component = 14, RULE_nextclade_pango_lineage_prefix = 15,
		RULE_nextclade_pango_query = 16, RULE_gisaid_clade = 17, RULE_gisaid_clade_prefix = 18,
		RULE_gisaid_clade_query = 19, RULE_nextstrain_clade = 20, RULE_nextstrain_clade_prefix = 21,
		RULE_nextstrain_clade_query = 22, RULE_character = 23, RULE_n_of = 24,
		RULE_n_of_exactly = 25, RULE_n_of_n = 26, RULE_n_of_exprs = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "single", "nuc_mut", "aa_mut", "position", "aa", "aa_mutated",
			"nuc", "nuc_mutated", "gene", "pango_query", "pango_include_sub", "pango_lineage",
			"pango_number_component", "nextclade_pango_lineage_prefix", "nextclade_pango_query",
			"gisaid_clade", "gisaid_clade_prefix", "gisaid_clade_query", "nextstrain_clade",
			"nextstrain_clade_prefix", "nextstrain_clade_query", "character", "n_of",
			"n_of_exactly", "n_of_n", "n_of_exprs"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'&'", "'|'", "'('", "')'", "':'", "'['", "'-OF:'", "']'",
			"'EXACTLY-'", "','", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'",
			"'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'",
			"'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", "'-'",
			"'.'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null,
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "MINUS",
			"DOT", "ASTERISK", "ORF", "NUMBER", "WHITESPACE"
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
	public String getGrammarFileName() { return "VariantQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VariantQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(VariantQueryParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			expr(0);
			setState(57);
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
	public static class ParContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitPar(this);
		}
	}
	public static class UniContext extends ExprContext {
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public UniContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterUni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitUni(this);
		}
	}
	public static class NegContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitNeg(this);
		}
	}
	public static class OrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitOr(this);
		}
	}
	public static class AndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitAnd(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
			case ORF:
			case NUMBER:
				{
				_localctx = new UniContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(60);
				single();
				}
				break;
			case T__0:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(T__0);
				setState(62);
				expr(4);
				}
				break;
			case T__3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(T__3);
				setState(64);
				expr(0);
				setState(65);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(70);
						match(T__1);
						setState(71);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(72);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(73);
						match(T__2);
						setState(74);
						expr(3);
						}
						break;
					}
					}
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class SingleContext extends ParserRuleContext {
		public Aa_mutContext aa_mut() {
			return getRuleContext(Aa_mutContext.class,0);
		}
		public Nuc_mutContext nuc_mut() {
			return getRuleContext(Nuc_mutContext.class,0);
		}
		public Pango_queryContext pango_query() {
			return getRuleContext(Pango_queryContext.class,0);
		}
		public Nextclade_pango_queryContext nextclade_pango_query() {
			return getRuleContext(Nextclade_pango_queryContext.class,0);
		}
		public Gisaid_clade_queryContext gisaid_clade_query() {
			return getRuleContext(Gisaid_clade_queryContext.class,0);
		}
		public Nextstrain_clade_queryContext nextstrain_clade_query() {
			return getRuleContext(Nextstrain_clade_queryContext.class,0);
		}
		public N_ofContext n_of() {
			return getRuleContext(N_ofContext.class,0);
		}
		public SingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitSingle(this);
		}
	}

	public final SingleContext single() throws RecognitionException {
		SingleContext _localctx = new SingleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_single);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				aa_mut();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				nuc_mut();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				pango_query();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				nextclade_pango_query();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				gisaid_clade_query();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				nextstrain_clade_query();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				n_of();
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

	public static class Nuc_mutContext extends ParserRuleContext {
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public NucContext nuc() {
			return getRuleContext(NucContext.class,0);
		}
		public Nuc_mutatedContext nuc_mutated() {
			return getRuleContext(Nuc_mutatedContext.class,0);
		}
		public Nuc_mutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuc_mut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterNuc_mut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitNuc_mut(this);
		}
	}

	public final Nuc_mutContext nuc_mut() throws RecognitionException {
		Nuc_mutContext _localctx = new Nuc_mutContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nuc_mut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << C) | (1L << G) | (1L << T))) != 0)) {
				{
				setState(89);
				nuc();
				}
			}

			setState(92);
			position();
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(93);
				nuc_mutated();
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

	public static class Aa_mutContext extends ParserRuleContext {
		public GeneContext gene() {
			return getRuleContext(GeneContext.class,0);
		}
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public AaContext aa() {
			return getRuleContext(AaContext.class,0);
		}
		public Aa_mutatedContext aa_mutated() {
			return getRuleContext(Aa_mutatedContext.class,0);
		}
		public Aa_mutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aa_mut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterAa_mut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitAa_mut(this);
		}
	}

	public final Aa_mutContext aa_mut() throws RecognitionException {
		Aa_mutContext _localctx = new Aa_mutContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aa_mut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			gene();
			setState(97);
			match(T__5);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << V) | (1L << W) | (1L << Y) | (1L << ASTERISK))) != 0)) {
				{
				setState(98);
				aa();
				}
			}

			setState(101);
			position();
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(102);
				aa_mutated();
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

	public static class PositionContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(VariantQueryParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(VariantQueryParser.NUMBER, i);
		}
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitPosition(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_position);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(105);
					match(NUMBER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AaContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(VariantQueryParser.A, 0); }
		public TerminalNode R() { return getToken(VariantQueryParser.R, 0); }
		public TerminalNode N() { return getToken(VariantQueryParser.N, 0); }
		public TerminalNode D() { return getToken(VariantQueryParser.D, 0); }
		public TerminalNode C() { return getToken(VariantQueryParser.C, 0); }
		public TerminalNode E() { return getToken(VariantQueryParser.E, 0); }
		public TerminalNode Q() { return getToken(VariantQueryParser.Q, 0); }
		public TerminalNode G() { return getToken(VariantQueryParser.G, 0); }
		public TerminalNode H() { return getToken(VariantQueryParser.H, 0); }
		public TerminalNode I() { return getToken(VariantQueryParser.I, 0); }
		public TerminalNode L() { return getToken(VariantQueryParser.L, 0); }
		public TerminalNode K() { return getToken(VariantQueryParser.K, 0); }
		public TerminalNode M() { return getToken(VariantQueryParser.M, 0); }
		public TerminalNode F() { return getToken(VariantQueryParser.F, 0); }
		public TerminalNode P() { return getToken(VariantQueryParser.P, 0); }
		public TerminalNode S() { return getToken(VariantQueryParser.S, 0); }
		public TerminalNode T() { return getToken(VariantQueryParser.T, 0); }
		public TerminalNode W() { return getToken(VariantQueryParser.W, 0); }
		public TerminalNode Y() { return getToken(VariantQueryParser.Y, 0); }
		public TerminalNode V() { return getToken(VariantQueryParser.V, 0); }
		public TerminalNode ASTERISK() { return getToken(VariantQueryParser.ASTERISK, 0); }
		public AaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterAa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitAa(this);
		}
	}

	public final AaContext aa() throws RecognitionException {
		AaContext _localctx = new AaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_aa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << V) | (1L << W) | (1L << Y) | (1L << ASTERISK))) != 0)) ) {
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

	public static class Aa_mutatedContext extends ParserRuleContext {
		public AaContext aa() {
			return getRuleContext(AaContext.class,0);
		}
		public TerminalNode X() { return getToken(VariantQueryParser.X, 0); }
		public TerminalNode MINUS() { return getToken(VariantQueryParser.MINUS, 0); }
		public Aa_mutatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aa_mutated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterAa_mutated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitAa_mutated(this);
		}
	}

	public final Aa_mutatedContext aa_mutated() throws RecognitionException {
		Aa_mutatedContext _localctx = new Aa_mutatedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aa_mutated);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case K:
			case L:
			case M:
			case N:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case V:
			case W:
			case Y:
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				aa();
				}
				break;
			case X:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(X);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(MINUS);
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

	public static class NucContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(VariantQueryParser.A, 0); }
		public TerminalNode C() { return getToken(VariantQueryParser.C, 0); }
		public TerminalNode G() { return getToken(VariantQueryParser.G, 0); }
		public TerminalNode T() { return getToken(VariantQueryParser.T, 0); }
		public NucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterNuc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitNuc(this);
		}
	}

	public final NucContext nuc() throws RecognitionException {
		NucContext _localctx = new NucContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nuc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << C) | (1L << G) | (1L << T))) != 0)) ) {
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

	public static class Nuc_mutatedContext extends ParserRuleContext {
		public NucContext nuc() {
			return getRuleContext(NucContext.class,0);
		}
		public TerminalNode M() { return getToken(VariantQueryParser.M, 0); }
		public TerminalNode R() { return getToken(VariantQueryParser.R, 0); }
		public TerminalNode W() { return getToken(VariantQueryParser.W, 0); }
		public TerminalNode S() { return getToken(VariantQueryParser.S, 0); }
		public TerminalNode Y() { return getToken(VariantQueryParser.Y, 0); }
		public TerminalNode K() { return getToken(VariantQueryParser.K, 0); }
		public TerminalNode V() { return getToken(VariantQueryParser.V, 0); }
		public TerminalNode H() { return getToken(VariantQueryParser.H, 0); }
		public TerminalNode D() { return getToken(VariantQueryParser.D, 0); }
		public TerminalNode B() { return getToken(VariantQueryParser.B, 0); }
		public TerminalNode N() { return getToken(VariantQueryParser.N, 0); }
		public TerminalNode MINUS() { return getToken(VariantQueryParser.MINUS, 0); }
		public Nuc_mutatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuc_mutated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterNuc_mutated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitNuc_mutated(this);
		}
	}

	public final Nuc_mutatedContext nuc_mutated() throws RecognitionException {
		Nuc_mutatedContext _localctx = new Nuc_mutatedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nuc_mutated);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
			case C:
			case G:
			case T:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				nuc();
				}
				break;
			case M:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(M);
				}
				break;
			case R:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(R);
				}
				break;
			case W:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(W);
				}
				break;
			case S:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(S);
				}
				break;
			case Y:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(Y);
				}
				break;
			case K:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				match(K);
				}
				break;
			case V:
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				match(V);
				}
				break;
			case H:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				match(H);
				}
				break;
			case D:
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				match(D);
				}
				break;
			case B:
				enterOuterAlt(_localctx, 11);
				{
				setState(129);
				match(B);
				}
				break;
			case N:
				enterOuterAlt(_localctx, 12);
				{
				setState(130);
				match(N);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 13);
				{
				setState(131);
				match(MINUS);
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

	public static class GeneContext extends ParserRuleContext {
		public TerminalNode E() { return getToken(VariantQueryParser.E, 0); }
		public TerminalNode M() { return getToken(VariantQueryParser.M, 0); }
		public TerminalNode N() { return getToken(VariantQueryParser.N, 0); }
		public TerminalNode S() { return getToken(VariantQueryParser.S, 0); }
		public TerminalNode ORF() { return getToken(VariantQueryParser.ORF, 0); }
		public GeneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterGene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitGene(this);
		}
	}

	public final GeneContext gene() throws RecognitionException {
		GeneContext _localctx = new GeneContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_gene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << E) | (1L << M) | (1L << N) | (1L << S) | (1L << ORF))) != 0)) ) {
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

	public static class Pango_queryContext extends ParserRuleContext {
		public Pango_lineageContext pango_lineage() {
			return getRuleContext(Pango_lineageContext.class,0);
		}
		public Pango_include_subContext pango_include_sub() {
			return getRuleContext(Pango_include_subContext.class,0);
		}
		public Pango_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pango_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterPango_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitPango_query(this);
		}
	}

	public final Pango_queryContext pango_query() throws RecognitionException {
		Pango_queryContext _localctx = new Pango_queryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pango_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			pango_lineage();
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(137);
				pango_include_sub();
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

	public static class Pango_include_subContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(VariantQueryParser.ASTERISK, 0); }
		public TerminalNode DOT() { return getToken(VariantQueryParser.DOT, 0); }
		public Pango_include_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pango_include_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterPango_include_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitPango_include_sub(this);
		}
	}

	public final Pango_include_subContext pango_include_sub() throws RecognitionException {
		Pango_include_subContext _localctx = new Pango_include_subContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pango_include_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(140);
				match(DOT);
				}
			}

			setState(143);
			match(ASTERISK);
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

	public static class Pango_lineageContext extends ParserRuleContext {
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public List<Pango_number_componentContext> pango_number_component() {
			return getRuleContexts(Pango_number_componentContext.class);
		}
		public Pango_number_componentContext pango_number_component(int i) {
			return getRuleContext(Pango_number_componentContext.class,i);
		}
		public Pango_lineageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pango_lineage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterPango_lineage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitPango_lineage(this);
		}
	}

	public final Pango_lineageContext pango_lineage() throws RecognitionException {
		Pango_lineageContext _localctx = new Pango_lineageContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pango_lineage);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			character();
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(146);
				character();
				}
				break;
			}
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					pango_number_component();
					}
					}
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Pango_number_componentContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(VariantQueryParser.DOT, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(VariantQueryParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(VariantQueryParser.NUMBER, i);
		}
		public Pango_number_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pango_number_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterPango_number_component(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitPango_number_component(this);
		}
	}

	public final Pango_number_componentContext pango_number_component() throws RecognitionException {
		Pango_number_componentContext _localctx = new Pango_number_componentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pango_number_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(DOT);
			setState(156);
			match(NUMBER);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(157);
				match(NUMBER);
				}
				break;
			}
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(160);
				match(NUMBER);
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

	public static class Nextclade_pango_lineage_prefixContext extends ParserRuleContext {
		public List<TerminalNode> N() { return getTokens(VariantQueryParser.N); }
		public TerminalNode N(int i) {
			return getToken(VariantQueryParser.N, i);
		}
		public List<TerminalNode> E() { return getTokens(VariantQueryParser.E); }
		public TerminalNode E(int i) {
			return getToken(VariantQueryParser.E, i);
		}
		public TerminalNode X() { return getToken(VariantQueryParser.X, 0); }
		public TerminalNode T() { return getToken(VariantQueryParser.T, 0); }
		public TerminalNode C() { return getToken(VariantQueryParser.C, 0); }
		public List<TerminalNode> L() { return getTokens(VariantQueryParser.L); }
		public TerminalNode L(int i) {
			return getToken(VariantQueryParser.L, i);
		}
		public List<TerminalNode> A() { return getTokens(VariantQueryParser.A); }
		public TerminalNode A(int i) {
			return getToken(VariantQueryParser.A, i);
		}
		public TerminalNode D() { return getToken(VariantQueryParser.D, 0); }
		public TerminalNode P() { return getToken(VariantQueryParser.P, 0); }
		public List<TerminalNode> G() { return getTokens(VariantQueryParser.G); }
		public TerminalNode G(int i) {
			return getToken(VariantQueryParser.G, i);
		}
		public TerminalNode O() { return getToken(VariantQueryParser.O, 0); }
		public TerminalNode I() { return getToken(VariantQueryParser.I, 0); }
		public Nextclade_pango_lineage_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextclade_pango_lineage_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterNextclade_pango_lineage_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitNextclade_pango_lineage_prefix(this);
		}
	}

	public final Nextclade_pango_lineage_prefixContext nextclade_pango_lineage_prefix() throws RecognitionException {
		Nextclade_pango_lineage_prefixContext _localctx = new Nextclade_pango_lineage_prefixContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nextclade_pango_lineage_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(N);
			setState(164);
			match(E);
			setState(165);
			match(X);
			setState(166);
			match(T);
			setState(167);
			match(C);
			setState(168);
			match(L);
			setState(169);
			match(A);
			setState(170);
			match(D);
			setState(171);
			match(E);
			setState(172);
			match(P);
			setState(173);
			match(A);
			setState(174);
			match(N);
			setState(175);
			match(G);
			setState(176);
			match(O);
			setState(177);
			match(L);
			setState(178);
			match(I);
			setState(179);
			match(N);
			setState(180);
			match(E);
			setState(181);
			match(A);
			setState(182);
			match(G);
			setState(183);
			match(E);
			setState(184);
			match(T__5);
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

	public static class Nextclade_pango_queryContext extends ParserRuleContext {
		public Nextclade_pango_lineage_prefixContext nextclade_pango_lineage_prefix() {
			return getRuleContext(Nextclade_pango_lineage_prefixContext.class,0);
		}
		public Pango_queryContext pango_query() {
			return getRuleContext(Pango_queryContext.class,0);
		}
		public Nextclade_pango_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextclade_pango_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterNextclade_pango_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitNextclade_pango_query(this);
		}
	}

	public final Nextclade_pango_queryContext nextclade_pango_query() throws RecognitionException {
		Nextclade_pango_queryContext _localctx = new Nextclade_pango_queryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nextclade_pango_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			nextclade_pango_lineage_prefix();
			setState(187);
			pango_query();
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

	public static class Gisaid_cladeContext extends ParserRuleContext {
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public Gisaid_cladeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gisaid_clade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterGisaid_clade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitGisaid_clade(this);
		}
	}

	public final Gisaid_cladeContext gisaid_clade() throws RecognitionException {
		Gisaid_cladeContext _localctx = new Gisaid_cladeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_gisaid_clade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			character();
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(190);
				character();
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

	public static class Gisaid_clade_prefixContext extends ParserRuleContext {
		public TerminalNode G() { return getToken(VariantQueryParser.G, 0); }
		public List<TerminalNode> I() { return getTokens(VariantQueryParser.I); }
		public TerminalNode I(int i) {
			return getToken(VariantQueryParser.I, i);
		}
		public TerminalNode S() { return getToken(VariantQueryParser.S, 0); }
		public TerminalNode A() { return getToken(VariantQueryParser.A, 0); }
		public TerminalNode D() { return getToken(VariantQueryParser.D, 0); }
		public Gisaid_clade_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gisaid_clade_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterGisaid_clade_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitGisaid_clade_prefix(this);
		}
	}

	public final Gisaid_clade_prefixContext gisaid_clade_prefix() throws RecognitionException {
		Gisaid_clade_prefixContext _localctx = new Gisaid_clade_prefixContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_gisaid_clade_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(G);
			setState(194);
			match(I);
			setState(195);
			match(S);
			setState(196);
			match(A);
			setState(197);
			match(I);
			setState(198);
			match(D);
			setState(199);
			match(T__5);
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

	public static class Gisaid_clade_queryContext extends ParserRuleContext {
		public Gisaid_clade_prefixContext gisaid_clade_prefix() {
			return getRuleContext(Gisaid_clade_prefixContext.class,0);
		}
		public Gisaid_cladeContext gisaid_clade() {
			return getRuleContext(Gisaid_cladeContext.class,0);
		}
		public Gisaid_clade_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gisaid_clade_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterGisaid_clade_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitGisaid_clade_query(this);
		}
	}

	public final Gisaid_clade_queryContext gisaid_clade_query() throws RecognitionException {
		Gisaid_clade_queryContext _localctx = new Gisaid_clade_queryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_gisaid_clade_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			gisaid_clade_prefix();
			setState(202);
			gisaid_clade();
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

	public static class Nextstrain_cladeContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(VariantQueryParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(VariantQueryParser.NUMBER, i);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public Nextstrain_cladeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextstrain_clade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterNextstrain_clade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitNextstrain_clade(this);
		}
	}

	public final Nextstrain_cladeContext nextstrain_clade() throws RecognitionException {
		Nextstrain_cladeContext _localctx = new Nextstrain_cladeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nextstrain_clade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(NUMBER);
			setState(205);
			match(NUMBER);
			setState(206);
			character();
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

	public static class Nextstrain_clade_prefixContext extends ParserRuleContext {
		public List<TerminalNode> N() { return getTokens(VariantQueryParser.N); }
		public TerminalNode N(int i) {
			return getToken(VariantQueryParser.N, i);
		}
		public List<TerminalNode> E() { return getTokens(VariantQueryParser.E); }
		public TerminalNode E(int i) {
			return getToken(VariantQueryParser.E, i);
		}
		public TerminalNode X() { return getToken(VariantQueryParser.X, 0); }
		public List<TerminalNode> T() { return getTokens(VariantQueryParser.T); }
		public TerminalNode T(int i) {
			return getToken(VariantQueryParser.T, i);
		}
		public TerminalNode S() { return getToken(VariantQueryParser.S, 0); }
		public TerminalNode R() { return getToken(VariantQueryParser.R, 0); }
		public List<TerminalNode> A() { return getTokens(VariantQueryParser.A); }
		public TerminalNode A(int i) {
			return getToken(VariantQueryParser.A, i);
		}
		public TerminalNode I() { return getToken(VariantQueryParser.I, 0); }
		public TerminalNode C() { return getToken(VariantQueryParser.C, 0); }
		public TerminalNode L() { return getToken(VariantQueryParser.L, 0); }
		public TerminalNode D() { return getToken(VariantQueryParser.D, 0); }
		public Nextstrain_clade_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextstrain_clade_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterNextstrain_clade_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitNextstrain_clade_prefix(this);
		}
	}

	public final Nextstrain_clade_prefixContext nextstrain_clade_prefix() throws RecognitionException {
		Nextstrain_clade_prefixContext _localctx = new Nextstrain_clade_prefixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nextstrain_clade_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(N);
			setState(209);
			match(E);
			setState(210);
			match(X);
			setState(211);
			match(T);
			setState(212);
			match(S);
			setState(213);
			match(T);
			setState(214);
			match(R);
			setState(215);
			match(A);
			setState(216);
			match(I);
			setState(217);
			match(N);
			setState(218);
			match(C);
			setState(219);
			match(L);
			setState(220);
			match(A);
			setState(221);
			match(D);
			setState(222);
			match(E);
			setState(223);
			match(T__5);
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

	public static class Nextstrain_clade_queryContext extends ParserRuleContext {
		public Nextstrain_clade_prefixContext nextstrain_clade_prefix() {
			return getRuleContext(Nextstrain_clade_prefixContext.class,0);
		}
		public Nextstrain_cladeContext nextstrain_clade() {
			return getRuleContext(Nextstrain_cladeContext.class,0);
		}
		public Nextstrain_clade_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextstrain_clade_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterNextstrain_clade_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitNextstrain_clade_query(this);
		}
	}

	public final Nextstrain_clade_queryContext nextstrain_clade_query() throws RecognitionException {
		Nextstrain_clade_queryContext _localctx = new Nextstrain_clade_queryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nextstrain_clade_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			nextstrain_clade_prefix();
			setState(226);
			nextstrain_clade();
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

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(VariantQueryParser.A, 0); }
		public TerminalNode B() { return getToken(VariantQueryParser.B, 0); }
		public TerminalNode C() { return getToken(VariantQueryParser.C, 0); }
		public TerminalNode D() { return getToken(VariantQueryParser.D, 0); }
		public TerminalNode E() { return getToken(VariantQueryParser.E, 0); }
		public TerminalNode F() { return getToken(VariantQueryParser.F, 0); }
		public TerminalNode G() { return getToken(VariantQueryParser.G, 0); }
		public TerminalNode H() { return getToken(VariantQueryParser.H, 0); }
		public TerminalNode I() { return getToken(VariantQueryParser.I, 0); }
		public TerminalNode J() { return getToken(VariantQueryParser.J, 0); }
		public TerminalNode K() { return getToken(VariantQueryParser.K, 0); }
		public TerminalNode L() { return getToken(VariantQueryParser.L, 0); }
		public TerminalNode M() { return getToken(VariantQueryParser.M, 0); }
		public TerminalNode N() { return getToken(VariantQueryParser.N, 0); }
		public TerminalNode O() { return getToken(VariantQueryParser.O, 0); }
		public TerminalNode P() { return getToken(VariantQueryParser.P, 0); }
		public TerminalNode Q() { return getToken(VariantQueryParser.Q, 0); }
		public TerminalNode R() { return getToken(VariantQueryParser.R, 0); }
		public TerminalNode S() { return getToken(VariantQueryParser.S, 0); }
		public TerminalNode T() { return getToken(VariantQueryParser.T, 0); }
		public TerminalNode U() { return getToken(VariantQueryParser.U, 0); }
		public TerminalNode V() { return getToken(VariantQueryParser.V, 0); }
		public TerminalNode W() { return getToken(VariantQueryParser.W, 0); }
		public TerminalNode X() { return getToken(VariantQueryParser.X, 0); }
		public TerminalNode Y() { return getToken(VariantQueryParser.Y, 0); }
		public TerminalNode Z() { return getToken(VariantQueryParser.Z, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z))) != 0)) ) {
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

	public static class N_ofContext extends ParserRuleContext {
		public N_of_nContext n_of_n() {
			return getRuleContext(N_of_nContext.class,0);
		}
		public N_of_exprsContext n_of_exprs() {
			return getRuleContext(N_of_exprsContext.class,0);
		}
		public N_of_exactlyContext n_of_exactly() {
			return getRuleContext(N_of_exactlyContext.class,0);
		}
		public N_ofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_of; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterN_of(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitN_of(this);
		}
	}

	public final N_ofContext n_of() throws RecognitionException {
		N_ofContext _localctx = new N_ofContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_n_of);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__6);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(231);
				n_of_exactly();
				}
			}

			setState(234);
			n_of_n();
			setState(235);
			match(T__7);
			setState(236);
			n_of_exprs();
			setState(237);
			match(T__8);
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

	public static class N_of_exactlyContext extends ParserRuleContext {
		public N_of_exactlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_of_exactly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterN_of_exactly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitN_of_exactly(this);
		}
	}

	public final N_of_exactlyContext n_of_exactly() throws RecognitionException {
		N_of_exactlyContext _localctx = new N_of_exactlyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_n_of_exactly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__9);
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

	public static class N_of_nContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(VariantQueryParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(VariantQueryParser.NUMBER, i);
		}
		public N_of_nContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_of_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterN_of_n(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitN_of_n(this);
		}
	}

	public final N_of_nContext n_of_n() throws RecognitionException {
		N_of_nContext _localctx = new N_of_nContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_n_of_n);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				match(NUMBER);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
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

	public static class N_of_exprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public N_of_exprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_of_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).enterN_of_exprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VariantQueryListener ) ((VariantQueryListener)listener).exitN_of_exprs(this);
		}
	}

	public final N_of_exprsContext n_of_exprs() throws RecognitionException {
		N_of_exprsContext _localctx = new N_of_exprsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_n_of_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			expr(0);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(247);
				match(T__10);
				setState(248);
				expr(0);
				}
				}
				setState(253);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3F\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16\3Q\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\5\5]\n\5\3\5\3\5\5\5a\n\5"+
		"\3\6\3\6\3\6\5\6f\n\6\3\6\3\6\5\6j\n\6\3\7\6\7m\n\7\r\7\16\7n\3\b\3\b"+
		"\3\t\3\t\3\t\5\tv\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0087\n\13\3\f\3\f\3\r\3\r\5\r\u008d\n"+
		"\r\3\16\5\16\u0090\n\16\3\16\3\16\3\17\3\17\5\17\u0096\n\17\3\17\7\17"+
		"\u0099\n\17\f\17\16\17\u009c\13\17\3\20\3\20\3\20\5\20\u00a1\n\20\3\20"+
		"\5\20\u00a4\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\5\23\u00c2\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\5\32\u00eb\n\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\6\34\u00f5\n\34\r\34\16\34\u00f6\3\35\3\35\3\35\7\35\u00fc\n\35\f\35"+
		"\16\35\u00ff\13\35\3\35\2\3\4\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668\2\6\t\2\16\16\20\26\30\33\35!#$&&**\6\2\16\16\20"+
		"\20\24\24!!\6\2\22\22\32\33  ++\3\2\16\'\2\u010b\2:\3\2\2\2\4E\3\2\2\2"+
		"\6Y\3\2\2\2\b\\\3\2\2\2\nb\3\2\2\2\fl\3\2\2\2\16p\3\2\2\2\20u\3\2\2\2"+
		"\22w\3\2\2\2\24\u0086\3\2\2\2\26\u0088\3\2\2\2\30\u008a\3\2\2\2\32\u008f"+
		"\3\2\2\2\34\u0093\3\2\2\2\36\u009d\3\2\2\2 \u00a5\3\2\2\2\"\u00bc\3\2"+
		"\2\2$\u00bf\3\2\2\2&\u00c3\3\2\2\2(\u00cb\3\2\2\2*\u00ce\3\2\2\2,\u00d2"+
		"\3\2\2\2.\u00e3\3\2\2\2\60\u00e6\3\2\2\2\62\u00e8\3\2\2\2\64\u00f1\3\2"+
		"\2\2\66\u00f4\3\2\2\28\u00f8\3\2\2\2:;\5\4\3\2;<\7\2\2\3<\3\3\2\2\2=>"+
		"\b\3\1\2>F\5\6\4\2?@\7\3\2\2@F\5\4\3\6AB\7\6\2\2BC\5\4\3\2CD\7\7\2\2D"+
		"F\3\2\2\2E=\3\2\2\2E?\3\2\2\2EA\3\2\2\2FO\3\2\2\2GH\f\5\2\2HI\7\4\2\2"+
		"IN\5\4\3\6JK\f\4\2\2KL\7\5\2\2LN\5\4\3\5MG\3\2\2\2MJ\3\2\2\2NQ\3\2\2\2"+
		"OM\3\2\2\2OP\3\2\2\2P\5\3\2\2\2QO\3\2\2\2RZ\5\n\6\2SZ\5\b\5\2TZ\5\30\r"+
		"\2UZ\5\"\22\2VZ\5(\25\2WZ\5.\30\2XZ\5\62\32\2YR\3\2\2\2YS\3\2\2\2YT\3"+
		"\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\7\3\2\2\2[]\5\22\n\2\\"+
		"[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\5\f\7\2_a\5\24\13\2`_\3\2\2\2`a\3\2\2"+
		"\2a\t\3\2\2\2bc\5\26\f\2ce\7\b\2\2df\5\16\b\2ed\3\2\2\2ef\3\2\2\2fg\3"+
		"\2\2\2gi\5\f\7\2hj\5\20\t\2ih\3\2\2\2ij\3\2\2\2j\13\3\2\2\2km\7,\2\2l"+
		"k\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\r\3\2\2\2pq\t\2\2\2q\17\3\2\2"+
		"\2rv\5\16\b\2sv\7%\2\2tv\7(\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\21\3\2"+
		"\2\2wx\t\3\2\2x\23\3\2\2\2y\u0087\5\22\n\2z\u0087\7\32\2\2{\u0087\7\37"+
		"\2\2|\u0087\7$\2\2}\u0087\7 \2\2~\u0087\7&\2\2\177\u0087\7\30\2\2\u0080"+
		"\u0087\7#\2\2\u0081\u0087\7\25\2\2\u0082\u0087\7\21\2\2\u0083\u0087\7"+
		"\17\2\2\u0084\u0087\7\33\2\2\u0085\u0087\7(\2\2\u0086y\3\2\2\2\u0086z"+
		"\3\2\2\2\u0086{\3\2\2\2\u0086|\3\2\2\2\u0086}\3\2\2\2\u0086~\3\2\2\2\u0086"+
		"\177\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2"+
		"\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\25"+
		"\3\2\2\2\u0088\u0089\t\4\2\2\u0089\27\3\2\2\2\u008a\u008c\5\34\17\2\u008b"+
		"\u008d\5\32\16\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\31\3\2"+
		"\2\2\u008e\u0090\7)\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\7*\2\2\u0092\33\3\2\2\2\u0093\u0095\5\60\31"+
		"\2\u0094\u0096\5\60\31\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u009a\3\2\2\2\u0097\u0099\5\36\20\2\u0098\u0097\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\35\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7)\2\2\u009e\u00a0\7,\2\2\u009f\u00a1\7,\2"+
		"\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a4"+
		"\7,\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\37\3\2\2\2\u00a5"+
		"\u00a6\7\33\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\7%\2\2\u00a8\u00a9\7"+
		"!\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ab\7\31\2\2\u00ab\u00ac\7\16\2\2\u00ac"+
		"\u00ad\7\21\2\2\u00ad\u00ae\7\22\2\2\u00ae\u00af\7\35\2\2\u00af\u00b0"+
		"\7\16\2\2\u00b0\u00b1\7\33\2\2\u00b1\u00b2\7\24\2\2\u00b2\u00b3\7\34\2"+
		"\2\u00b3\u00b4\7\31\2\2\u00b4\u00b5\7\26\2\2\u00b5\u00b6\7\33\2\2\u00b6"+
		"\u00b7\7\22\2\2\u00b7\u00b8\7\16\2\2\u00b8\u00b9\7\24\2\2\u00b9\u00ba"+
		"\7\22\2\2\u00ba\u00bb\7\b\2\2\u00bb!\3\2\2\2\u00bc\u00bd\5 \21\2\u00bd"+
		"\u00be\5\30\r\2\u00be#\3\2\2\2\u00bf\u00c1\5\60\31\2\u00c0\u00c2\5\60"+
		"\31\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2%\3\2\2\2\u00c3\u00c4"+
		"\7\24\2\2\u00c4\u00c5\7\26\2\2\u00c5\u00c6\7 \2\2\u00c6\u00c7\7\16\2\2"+
		"\u00c7\u00c8\7\26\2\2\u00c8\u00c9\7\21\2\2\u00c9\u00ca\7\b\2\2\u00ca\'"+
		"\3\2\2\2\u00cb\u00cc\5&\24\2\u00cc\u00cd\5$\23\2\u00cd)\3\2\2\2\u00ce"+
		"\u00cf\7,\2\2\u00cf\u00d0\7,\2\2\u00d0\u00d1\5\60\31\2\u00d1+\3\2\2\2"+
		"\u00d2\u00d3\7\33\2\2\u00d3\u00d4\7\22\2\2\u00d4\u00d5\7%\2\2\u00d5\u00d6"+
		"\7!\2\2\u00d6\u00d7\7 \2\2\u00d7\u00d8\7!\2\2\u00d8\u00d9\7\37\2\2\u00d9"+
		"\u00da\7\16\2\2\u00da\u00db\7\26\2\2\u00db\u00dc\7\33\2\2\u00dc\u00dd"+
		"\7\20\2\2\u00dd\u00de\7\31\2\2\u00de\u00df\7\16\2\2\u00df\u00e0\7\21\2"+
		"\2\u00e0\u00e1\7\22\2\2\u00e1\u00e2\7\b\2\2\u00e2-\3\2\2\2\u00e3\u00e4"+
		"\5,\27\2\u00e4\u00e5\5*\26\2\u00e5/\3\2\2\2\u00e6\u00e7\t\5\2\2\u00e7"+
		"\61\3\2\2\2\u00e8\u00ea\7\t\2\2\u00e9\u00eb\5\64\33\2\u00ea\u00e9\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\5\66\34\2\u00ed"+
		"\u00ee\7\n\2\2\u00ee\u00ef\58\35\2\u00ef\u00f0\7\13\2\2\u00f0\63\3\2\2"+
		"\2\u00f1\u00f2\7\f\2\2\u00f2\65\3\2\2\2\u00f3\u00f5\7,\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\67\3\2\2\2\u00f8\u00fd\5\4\3\2\u00f9\u00fa\7\r\2\2\u00fa\u00fc\5\4\3"+
		"\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe9\3\2\2\2\u00ff\u00fd\3\2\2\2\27EMOY\\`einu\u0086\u008c"+
		"\u008f\u0095\u009a\u00a0\u00a3\u00c1\u00ea\u00f6\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
