// Generated from FOOL.g4 by ANTLR 4.7

	import ast.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FOOLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMIC=1, PLUS=2, TIMES=3, EQ=4, TRUE=5, FALSE=6, PRINT=7, IF=8, THEN=9, 
		ELSE=10, LPAR=11, RPAR=12, CLPAR=13, CRPAR=14, INTEGER=15, WHITESP=16, 
		COMMENT=17, ERR=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMIC", "PLUS", "TIMES", "EQ", "TRUE", "FALSE", "PRINT", "IF", "THEN", 
		"ELSE", "LPAR", "RPAR", "CLPAR", "CRPAR", "INTEGER", "WHITESP", "COMMENT", 
		"ERR"
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


		int lexicalErrors;


	public FOOLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FOOL.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 17:
			ERR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("Invalid char"+getText());
				lexicalErrors++;

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\5\20Y\n\20\3\20\3\20\7\20]\n\20\f\20\16\20`\13\20\5\20b\n\20"+
		"\3\21\6\21e\n\21\r\21\16\21f\3\21\3\21\3\22\3\22\3\22\3\22\7\22o\n\22"+
		"\f\22\16\22r\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"p\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\3\2\3\5\2\13\f\17\17\"\"\2\u0081\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13\60\3\2\2\2\r\65\3\2"+
		"\2\2\17;\3\2\2\2\21A\3\2\2\2\23D\3\2\2\2\25I\3\2\2\2\27N\3\2\2\2\31P\3"+
		"\2\2\2\33R\3\2\2\2\35T\3\2\2\2\37a\3\2\2\2!d\3\2\2\2#j\3\2\2\2%x\3\2\2"+
		"\2\'(\7=\2\2(\4\3\2\2\2)*\7-\2\2*\6\3\2\2\2+,\7,\2\2,\b\3\2\2\2-.\7?\2"+
		"\2./\7?\2\2/\n\3\2\2\2\60\61\7v\2\2\61\62\7t\2\2\62\63\7w\2\2\63\64\7"+
		"g\2\2\64\f\3\2\2\2\65\66\7h\2\2\66\67\7c\2\2\678\7n\2\289\7u\2\29:\7g"+
		"\2\2:\16\3\2\2\2;<\7r\2\2<=\7t\2\2=>\7k\2\2>?\7p\2\2?@\7v\2\2@\20\3\2"+
		"\2\2AB\7k\2\2BC\7h\2\2C\22\3\2\2\2DE\7v\2\2EF\7j\2\2FG\7g\2\2GH\7p\2\2"+
		"H\24\3\2\2\2IJ\7g\2\2JK\7n\2\2KL\7u\2\2LM\7g\2\2M\26\3\2\2\2NO\7*\2\2"+
		"O\30\3\2\2\2PQ\7+\2\2Q\32\3\2\2\2RS\7}\2\2S\34\3\2\2\2TU\7\177\2\2U\36"+
		"\3\2\2\2Vb\7\62\2\2WY\7/\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z^\4\63;\2["+
		"]\4\62;\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2"+
		"\2aV\3\2\2\2aX\3\2\2\2b \3\2\2\2ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2"+
		"\2fg\3\2\2\2gh\3\2\2\2hi\b\21\2\2i\"\3\2\2\2jk\7\61\2\2kl\7,\2\2lp\3\2"+
		"\2\2mo\13\2\2\2nm\3\2\2\2or\3\2\2\2pq\3\2\2\2pn\3\2\2\2qs\3\2\2\2rp\3"+
		"\2\2\2st\7,\2\2tu\7\61\2\2uv\3\2\2\2vw\b\22\2\2w$\3\2\2\2xy\13\2\2\2y"+
		"z\b\23\3\2z{\3\2\2\2{|\b\23\2\2|&\3\2\2\2\b\2X^afp\4\2\3\2\3\23\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}