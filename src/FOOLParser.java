// Generated from FOOL.g4 by ANTLR 4.7

	import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FOOLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMIC=1, PLUS=2, TIMES=3, EQ=4, TRUE=5, FALSE=6, PRINT=7, IF=8, THEN=9, 
		ELSE=10, LPAR=11, RPAR=12, CLPAR=13, CRPAR=14, INTEGER=15, WHITESP=16, 
		COMMENT=17, ERR=18;
	public static final int
		RULE_prog = 0, RULE_exp = 1, RULE_term = 2, RULE_factor = 3, RULE_value = 4;
	public static final String[] ruleNames = {
		"prog", "exp", "term", "factor", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'+'", "'*'", "'=='", "'true'", "'false'", "'print'", "'if'", 
		"'then'", "'else'", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMIC", "PLUS", "TIMES", "EQ", "TRUE", "FALSE", "PRINT", "IF", 
		"THEN", "ELSE", "LPAR", "RPAR", "CLPAR", "CRPAR", "INTEGER", "WHITESP", 
		"COMMENT", "ERR"
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
	public String getGrammarFileName() { return "FOOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FOOLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Node ast;
		public ExpContext e;
		public TerminalNode SEMIC() { return getToken(FOOLParser.SEMIC, 0); }
		public TerminalNode EOF() { return getToken(FOOLParser.EOF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((ProgContext)_localctx).e = exp();
			 ((ProgContext)_localctx).ast = new ProgNode(((ProgContext)_localctx).e.ast);
			setState(12);
			match(SEMIC);
			setState(13);
			match(EOF);
			 System.out.println("Parsing finished!");
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

	public static class ExpContext extends ParserRuleContext {
		public Node ast;
		public TermContext t;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(FOOLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(FOOLParser.PLUS, i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((ExpContext)_localctx).t = term();
			((ExpContext)_localctx).ast =  ((ExpContext)_localctx).t.ast;
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(18);
				match(PLUS);
				setState(19);
				((ExpContext)_localctx).t2 = term();
				((ExpContext)_localctx).ast =  new PlusNode(_localctx.ast,((ExpContext)_localctx).t2.ast);
				}
				}
				setState(26);
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

	public static class TermContext extends ParserRuleContext {
		public Node ast;
		public FactorContext v;
		public FactorContext v2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(FOOLParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(FOOLParser.TIMES, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((TermContext)_localctx).v = factor();
			((TermContext)_localctx).ast =  ((TermContext)_localctx).v.ast;
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES) {
				{
				{
				setState(29);
				match(TIMES);
				setState(30);
				((TermContext)_localctx).v2 = factor();
				((TermContext)_localctx).ast = new MultNode(_localctx.ast,((TermContext)_localctx).v2.ast);
				}
				}
				setState(37);
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

	public static class FactorContext extends ParserRuleContext {
		public Node ast;
		public ValueContext v;
		public ValueContext v2;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode EQ() { return getToken(FOOLParser.EQ, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((FactorContext)_localctx).v = value();
			((FactorContext)_localctx).ast = ((FactorContext)_localctx).v.ast;
			{
			setState(40);
			match(EQ);
			setState(41);
			((FactorContext)_localctx).v2 = value();
			((FactorContext)_localctx).ast =  new EqualNode(_localctx.ast,((FactorContext)_localctx).v2.ast);
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

	public static class ValueContext extends ParserRuleContext {
		public Node ast;
		public Token n;
		public ExpContext e;
		public ExpContext x;
		public ExpContext y;
		public ExpContext z;
		public TerminalNode INTEGER() { return getToken(FOOLParser.INTEGER, 0); }
		public TerminalNode TRUE() { return getToken(FOOLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FOOLParser.FALSE, 0); }
		public TerminalNode LPAR() { return getToken(FOOLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FOOLParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode IF() { return getToken(FOOLParser.IF, 0); }
		public TerminalNode THEN() { return getToken(FOOLParser.THEN, 0); }
		public List<TerminalNode> CLPAR() { return getTokens(FOOLParser.CLPAR); }
		public TerminalNode CLPAR(int i) {
			return getToken(FOOLParser.CLPAR, i);
		}
		public List<TerminalNode> CRPAR() { return getTokens(FOOLParser.CRPAR); }
		public TerminalNode CRPAR(int i) {
			return getToken(FOOLParser.CRPAR, i);
		}
		public TerminalNode ELSE() { return getToken(FOOLParser.ELSE, 0); }
		public TerminalNode PRINT() { return getToken(FOOLParser.PRINT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				((ValueContext)_localctx).n = match(INTEGER);
				((ValueContext)_localctx).ast = new IntNode(Integer.parseInt((((ValueContext)_localctx).n!=null?((ValueContext)_localctx).n.getText():null)));
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(TRUE);
				((ValueContext)_localctx).ast =  new BoolNode(true);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(FALSE);
				((ValueContext)_localctx).ast =  new BoolNode(false);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(LPAR);
				setState(51);
				((ValueContext)_localctx).e = exp();
				((ValueContext)_localctx).ast = ((ValueContext)_localctx).e.ast;
				setState(53);
				match(RPAR);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(IF);
				setState(56);
				((ValueContext)_localctx).x = exp();
				setState(57);
				match(THEN);
				setState(58);
				match(CLPAR);
				setState(59);
				((ValueContext)_localctx).y = exp();
				setState(60);
				match(CRPAR);
				setState(61);
				match(ELSE);
				setState(62);
				match(CLPAR);
				setState(63);
				((ValueContext)_localctx).z = exp();
				setState(64);
				match(CRPAR);
				((ValueContext)_localctx).ast =  new IfNode(((ValueContext)_localctx).x.ast,((ValueContext)_localctx).y.ast,((ValueContext)_localctx).z.ast);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				match(PRINT);
				setState(68);
				match(LPAR);
				setState(69);
				((ValueContext)_localctx).e = exp();
				setState(70);
				match(RPAR);
				((ValueContext)_localctx).ast = new PrintNode(((ValueContext)_localctx).e.ast);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4$\n\4\f\4"+
		"\16\4\'\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6L\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2O\2\f\3\2\2\2\4\22\3\2"+
		"\2\2\6\35\3\2\2\2\b(\3\2\2\2\nK\3\2\2\2\f\r\5\4\3\2\r\16\b\2\1\2\16\17"+
		"\7\3\2\2\17\20\7\2\2\3\20\21\b\2\1\2\21\3\3\2\2\2\22\23\5\6\4\2\23\32"+
		"\b\3\1\2\24\25\7\4\2\2\25\26\5\6\4\2\26\27\b\3\1\2\27\31\3\2\2\2\30\24"+
		"\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\32"+
		"\3\2\2\2\35\36\5\b\5\2\36%\b\4\1\2\37 \7\5\2\2 !\5\b\5\2!\"\b\4\1\2\""+
		"$\3\2\2\2#\37\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\7\3\2\2\2\'%\3\2"+
		"\2\2()\5\n\6\2)*\b\5\1\2*+\7\6\2\2+,\5\n\6\2,-\b\5\1\2-\t\3\2\2\2./\7"+
		"\21\2\2/L\b\6\1\2\60\61\7\7\2\2\61L\b\6\1\2\62\63\7\b\2\2\63L\b\6\1\2"+
		"\64\65\7\r\2\2\65\66\5\4\3\2\66\67\b\6\1\2\678\7\16\2\28L\3\2\2\29:\7"+
		"\n\2\2:;\5\4\3\2;<\7\13\2\2<=\7\17\2\2=>\5\4\3\2>?\7\20\2\2?@\7\f\2\2"+
		"@A\7\17\2\2AB\5\4\3\2BC\7\20\2\2CD\b\6\1\2DL\3\2\2\2EF\7\t\2\2FG\7\r\2"+
		"\2GH\5\4\3\2HI\7\16\2\2IJ\b\6\1\2JL\3\2\2\2K.\3\2\2\2K\60\3\2\2\2K\62"+
		"\3\2\2\2K\64\3\2\2\2K9\3\2\2\2KE\3\2\2\2L\13\3\2\2\2\5\32%K";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}