// Generated from /Users/ningyuheng/workspace/FOOL_compiler/src/FoolParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FoolParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, LPAREN=17, 
		RPAREN=18, LBRACE=19, RBRACE=20, LBRACK=21, RBRACK=22, COMMENT1=23, COMMENT2=24, 
		COMMENT3=25, COMMENT4=26, IGNORE_NEWLINE=27, NEWLINE=28, WS=29, LINE_ESCAPE=30, 
		CLASS=31, IF=32, ELSE=33, WHEN=34, WHILE=35, VAR=36, VAL=37, DEF=38, NOT=39, 
		NIL=40, IS=41, NEW=42, BREAK=43, CONTINUE=44, THIS=45, RETURN=46, READ=47, 
		WRITE=48, OPENFILE=49, IMPORT=50, ASSERT=51, SUPER=52, BOOL=53, INT=54, 
		EXP=55, NUMBER=56, ID=57, TYPE=58, STRING=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "COMMENT1", "COMMENT2", 
			"COMMENT3", "COMMENT4", "IGNORE_NEWLINE", "NEWLINE", "WS", "LINE_ESCAPE", 
			"CLASS", "IF", "ELSE", "WHEN", "WHILE", "VAR", "VAL", "DEF", "NOT", "NIL", 
			"IS", "NEW", "BREAK", "CONTINUE", "THIS", "RETURN", "READ", "WRITE", 
			"OPENFILE", "IMPORT", "ASSERT", "SUPER", "BOOL", "INT", "EXP", "NUMBER", 
			"ID", "TYPE", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "','", "'->'", "'.'", "'*'", "'\\'", "'+'", "'-'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'&&'", "'||'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", null, null, null, null, null, null, null, null, 
			"'class'", "'if'", "'else'", "'when'", "'while'", "'var'", "'val'", "'def'", 
			"'not'", "'NIL'", "'is'", "'new'", "'break'", "'continue'", "'this'", 
			"'return'", "'read'", "'write'", "'open'", "'import'", "'assert'", "'super'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "COMMENT1", "COMMENT2", "COMMENT3", "COMMENT4", "IGNORE_NEWLINE", 
			"NEWLINE", "WS", "LINE_ESCAPE", "CLASS", "IF", "ELSE", "WHEN", "WHILE", 
			"VAR", "VAL", "DEF", "NOT", "NIL", "IS", "NEW", "BREAK", "CONTINUE", 
			"THIS", "RETURN", "READ", "WRITE", "OPENFILE", "IMPORT", "ASSERT", "SUPER", 
			"BOOL", "INT", "EXP", "NUMBER", "ID", "TYPE", "STRING"
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

	 
	    int nesting = 0;


	public FoolParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FoolParser.g4"; }

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
		case 16:
			LPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			RPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			LBRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			RBRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			LBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			RBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			nesting++;
			break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			nesting--;
			break;
		}
	}
	private void LBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			nesting -= 10000;
			break;
		}
	}
	private void RBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			nesting += 10000;
			break;
		}
	}
	private void LBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			nesting++;
			break;
		}
	}
	private void RBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			nesting--;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return IGNORE_NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean IGNORE_NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return nesting>0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\7\30\u00b4\n\30\f\30"+
		"\16\30\u00b7\13\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00bf\n\31\f\31"+
		"\16\31\u00c2\13\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00ca\n\32\f\32"+
		"\16\32\u00cd\13\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\7"+
		"\33\u00d9\n\33\f\33\16\33\u00dc\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\5\34\u00e5\n\34\3\34\3\34\3\34\3\34\3\34\3\35\5\35\u00ed\n\35\3\35"+
		"\3\35\3\36\6\36\u00f2\n\36\r\36\16\36\u00f3\3\36\3\36\3\37\3\37\5\37\u00fa"+
		"\n\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u017c\n\66\3\67\3\67\3\67\7\67\u0181\n\67\f\67\16\67\u0184"+
		"\13\67\5\67\u0186\n\67\38\38\58\u018a\n8\38\38\39\59\u018f\n9\39\39\3"+
		"9\69\u0194\n9\r9\169\u0195\39\59\u0199\n9\39\59\u019c\n9\39\39\39\39\5"+
		"9\u01a2\n9\39\59\u01a5\n9\3:\3:\7:\u01a9\n:\f:\16:\u01ac\13:\3;\3;\7;"+
		"\u01b0\n;\f;\16;\u01b3\13;\3<\3<\7<\u01b7\n<\f<\16<\u01ba\13<\3<\3<\3"+
		"<\7<\u01bf\n<\f<\16<\u01c2\13<\3<\5<\u01c5\n<\4\u00cb\u00da\2=\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=\3\2\r\4\2\f\f\17\17\4\2\13\13\"\"\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4"+
		"\2aac|\6\2\62;C\\aac|\3\2C\\\3\2$$\3\2))\2\u01dd\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7}\3\2\2\2\t"+
		"\177\3\2\2\2\13\u0082\3\2\2\2\r\u0084\3\2\2\2\17\u0086\3\2\2\2\21\u0088"+
		"\3\2\2\2\23\u008a\3\2\2\2\25\u008c\3\2\2\2\27\u008e\3\2\2\2\31\u0090\3"+
		"\2\2\2\33\u0093\3\2\2\2\35\u0096\3\2\2\2\37\u0099\3\2\2\2!\u009c\3\2\2"+
		"\2#\u009f\3\2\2\2%\u00a2\3\2\2\2\'\u00a5\3\2\2\2)\u00a8\3\2\2\2+\u00ab"+
		"\3\2\2\2-\u00ae\3\2\2\2/\u00b1\3\2\2\2\61\u00ba\3\2\2\2\63\u00c5\3\2\2"+
		"\2\65\u00d3\3\2\2\2\67\u00e4\3\2\2\29\u00ec\3\2\2\2;\u00f1\3\2\2\2=\u00f7"+
		"\3\2\2\2?\u00ff\3\2\2\2A\u0105\3\2\2\2C\u0108\3\2\2\2E\u010d\3\2\2\2G"+
		"\u0112\3\2\2\2I\u0118\3\2\2\2K\u011c\3\2\2\2M\u0120\3\2\2\2O\u0124\3\2"+
		"\2\2Q\u0128\3\2\2\2S\u012c\3\2\2\2U\u012f\3\2\2\2W\u0133\3\2\2\2Y\u0139"+
		"\3\2\2\2[\u0142\3\2\2\2]\u0147\3\2\2\2_\u014e\3\2\2\2a\u0153\3\2\2\2c"+
		"\u0159\3\2\2\2e\u015e\3\2\2\2g\u0165\3\2\2\2i\u016c\3\2\2\2k\u017b\3\2"+
		"\2\2m\u0185\3\2\2\2o\u0187\3\2\2\2q\u01a4\3\2\2\2s\u01a6\3\2\2\2u\u01ad"+
		"\3\2\2\2w\u01c4\3\2\2\2yz\7<\2\2z\4\3\2\2\2{|\7?\2\2|\6\3\2\2\2}~\7.\2"+
		"\2~\b\3\2\2\2\177\u0080\7/\2\2\u0080\u0081\7@\2\2\u0081\n\3\2\2\2\u0082"+
		"\u0083\7\60\2\2\u0083\f\3\2\2\2\u0084\u0085\7,\2\2\u0085\16\3\2\2\2\u0086"+
		"\u0087\7^\2\2\u0087\20\3\2\2\2\u0088\u0089\7-\2\2\u0089\22\3\2\2\2\u008a"+
		"\u008b\7/\2\2\u008b\24\3\2\2\2\u008c\u008d\7>\2\2\u008d\26\3\2\2\2\u008e"+
		"\u008f\7@\2\2\u008f\30\3\2\2\2\u0090\u0091\7>\2\2\u0091\u0092\7?\2\2\u0092"+
		"\32\3\2\2\2\u0093\u0094\7@\2\2\u0094\u0095\7?\2\2\u0095\34\3\2\2\2\u0096"+
		"\u0097\7?\2\2\u0097\u0098\7?\2\2\u0098\36\3\2\2\2\u0099\u009a\7(\2\2\u009a"+
		"\u009b\7(\2\2\u009b \3\2\2\2\u009c\u009d\7~\2\2\u009d\u009e\7~\2\2\u009e"+
		"\"\3\2\2\2\u009f\u00a0\7*\2\2\u00a0\u00a1\b\22\2\2\u00a1$\3\2\2\2\u00a2"+
		"\u00a3\7+\2\2\u00a3\u00a4\b\23\3\2\u00a4&\3\2\2\2\u00a5\u00a6\7}\2\2\u00a6"+
		"\u00a7\b\24\4\2\u00a7(\3\2\2\2\u00a8\u00a9\7\177\2\2\u00a9\u00aa\b\25"+
		"\5\2\u00aa*\3\2\2\2\u00ab\u00ac\7]\2\2\u00ac\u00ad\b\26\6\2\u00ad,\3\2"+
		"\2\2\u00ae\u00af\7_\2\2\u00af\u00b0\b\27\7\2\u00b0.\3\2\2\2\u00b1\u00b5"+
		"\7%\2\2\u00b2\u00b4\n\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00b9\b\30\b\2\u00b9\60\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb"+
		"\u00bc\7\61\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\n\2\2\2\u00be\u00bd\3"+
		"\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\b\31\b\2\u00c4\62\3\2\2"+
		"\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7\7,\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00ca"+
		"\13\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00cc\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf"+
		"\7,\2\2\u00cf\u00d0\7\61\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\32\b\2"+
		"\u00d2\64\3\2\2\2\u00d3\u00d4\7)\2\2\u00d4\u00d5\7)\2\2\u00d5\u00d6\7"+
		")\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d9\13\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7)\2\2\u00de\u00df\7)\2\2\u00df\u00e0"+
		"\7)\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\33\b\2\u00e2\66\3\2\2\2\u00e3"+
		"\u00e5\7\17\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\u00e7\7\f\2\2\u00e7\u00e8\6\34\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\b\34\b\2\u00ea8\3\2\2\2\u00eb\u00ed\7\17\2\2\u00ec\u00eb\3\2\2"+
		"\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\f\2\2\u00ef:"+
		"\3\2\2\2\u00f0\u00f2\t\3\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\36"+
		"\b\2\u00f6<\3\2\2\2\u00f7\u00f9\7^\2\2\u00f8\u00fa\7\17\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\f\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\b\37\b\2\u00fe>\3\2\2\2\u00ff\u0100\7e\2\2"+
		"\u0100\u0101\7n\2\2\u0101\u0102\7c\2\2\u0102\u0103\7u\2\2\u0103\u0104"+
		"\7u\2\2\u0104@\3\2\2\2\u0105\u0106\7k\2\2\u0106\u0107\7h\2\2\u0107B\3"+
		"\2\2\2\u0108\u0109\7g\2\2\u0109\u010a\7n\2\2\u010a\u010b\7u\2\2\u010b"+
		"\u010c\7g\2\2\u010cD\3\2\2\2\u010d\u010e\7y\2\2\u010e\u010f\7j\2\2\u010f"+
		"\u0110\7g\2\2\u0110\u0111\7p\2\2\u0111F\3\2\2\2\u0112\u0113\7y\2\2\u0113"+
		"\u0114\7j\2\2\u0114\u0115\7k\2\2\u0115\u0116\7n\2\2\u0116\u0117\7g\2\2"+
		"\u0117H\3\2\2\2\u0118\u0119\7x\2\2\u0119\u011a\7c\2\2\u011a\u011b\7t\2"+
		"\2\u011bJ\3\2\2\2\u011c\u011d\7x\2\2\u011d\u011e\7c\2\2\u011e\u011f\7"+
		"n\2\2\u011fL\3\2\2\2\u0120\u0121\7f\2\2\u0121\u0122\7g\2\2\u0122\u0123"+
		"\7h\2\2\u0123N\3\2\2\2\u0124\u0125\7p\2\2\u0125\u0126\7q\2\2\u0126\u0127"+
		"\7v\2\2\u0127P\3\2\2\2\u0128\u0129\7P\2\2\u0129\u012a\7K\2\2\u012a\u012b"+
		"\7N\2\2\u012bR\3\2\2\2\u012c\u012d\7k\2\2\u012d\u012e\7u\2\2\u012eT\3"+
		"\2\2\2\u012f\u0130\7p\2\2\u0130\u0131\7g\2\2\u0131\u0132\7y\2\2\u0132"+
		"V\3\2\2\2\u0133\u0134\7d\2\2\u0134\u0135\7t\2\2\u0135\u0136\7g\2\2\u0136"+
		"\u0137\7c\2\2\u0137\u0138\7m\2\2\u0138X\3\2\2\2\u0139\u013a\7e\2\2\u013a"+
		"\u013b\7q\2\2\u013b\u013c\7p\2\2\u013c\u013d\7v\2\2\u013d\u013e\7k\2\2"+
		"\u013e\u013f\7p\2\2\u013f\u0140\7w\2\2\u0140\u0141\7g\2\2\u0141Z\3\2\2"+
		"\2\u0142\u0143\7v\2\2\u0143\u0144\7j\2\2\u0144\u0145\7k\2\2\u0145\u0146"+
		"\7u\2\2\u0146\\\3\2\2\2\u0147\u0148\7t\2\2\u0148\u0149\7g\2\2\u0149\u014a"+
		"\7v\2\2\u014a\u014b\7w\2\2\u014b\u014c\7t\2\2\u014c\u014d\7p\2\2\u014d"+
		"^\3\2\2\2\u014e\u014f\7t\2\2\u014f\u0150\7g\2\2\u0150\u0151\7c\2\2\u0151"+
		"\u0152\7f\2\2\u0152`\3\2\2\2\u0153\u0154\7y\2\2\u0154\u0155\7t\2\2\u0155"+
		"\u0156\7k\2\2\u0156\u0157\7v\2\2\u0157\u0158\7g\2\2\u0158b\3\2\2\2\u0159"+
		"\u015a\7q\2\2\u015a\u015b\7r\2\2\u015b\u015c\7g\2\2\u015c\u015d\7p\2\2"+
		"\u015dd\3\2\2\2\u015e\u015f\7k\2\2\u015f\u0160\7o\2\2\u0160\u0161\7r\2"+
		"\2\u0161\u0162\7q\2\2\u0162\u0163\7t\2\2\u0163\u0164\7v\2\2\u0164f\3\2"+
		"\2\2\u0165\u0166\7c\2\2\u0166\u0167\7u\2\2\u0167\u0168\7u\2\2\u0168\u0169"+
		"\7g\2\2\u0169\u016a\7t\2\2\u016a\u016b\7v\2\2\u016bh\3\2\2\2\u016c\u016d"+
		"\7u\2\2\u016d\u016e\7w\2\2\u016e\u016f\7r\2\2\u016f\u0170\7g\2\2\u0170"+
		"\u0171\7t\2\2\u0171j\3\2\2\2\u0172\u0173\7v\2\2\u0173\u0174\7t\2\2\u0174"+
		"\u0175\7w\2\2\u0175\u017c\7g\2\2\u0176\u0177\7h\2\2\u0177\u0178\7c\2\2"+
		"\u0178\u0179\7n\2\2\u0179\u017a\7u\2\2\u017a\u017c\7g\2\2\u017b\u0172"+
		"\3\2\2\2\u017b\u0176\3\2\2\2\u017cl\3\2\2\2\u017d\u0186\7\62\2\2\u017e"+
		"\u0182\t\4\2\2\u017f\u0181\t\5\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0185\u017d\3\2\2\2\u0185\u017e\3\2\2\2\u0186n\3\2\2\2"+
		"\u0187\u0189\t\6\2\2\u0188\u018a\t\7\2\2\u0189\u0188\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\5m\67\2\u018cp\3\2\2\2\u018d"+
		"\u018f\7/\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0191\5m\67\2\u0191\u0193\7\60\2\2\u0192\u0194\t\5\2\2\u0193"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0198\3\2\2\2\u0197\u0199\5o8\2\u0198\u0197\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u01a5\3\2\2\2\u019a\u019c\7/\2\2\u019b\u019a\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\5m\67\2\u019e\u019f\5o"+
		"8\2\u019f\u01a5\3\2\2\2\u01a0\u01a2\7/\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\5m\67\2\u01a4\u018e\3\2\2\2\u01a4"+
		"\u019b\3\2\2\2\u01a4\u01a1\3\2\2\2\u01a5r\3\2\2\2\u01a6\u01aa\t\b\2\2"+
		"\u01a7\u01a9\t\t\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abt\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad"+
		"\u01b1\t\n\2\2\u01ae\u01b0\t\t\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2v\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b4\u01b8\7$\2\2\u01b5\u01b7\n\13\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01c5\7$\2\2\u01bc\u01c0\7)\2\2\u01bd\u01bf"+
		"\n\f\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c5\7)"+
		"\2\2\u01c4\u01b4\3\2\2\2\u01c4\u01bc\3\2\2\2\u01c5x\3\2\2\2\32\2\u00b5"+
		"\u00c0\u00cb\u00da\u00e4\u00ec\u00f3\u00f9\u017b\u0182\u0185\u0189\u018e"+
		"\u0195\u0198\u019b\u01a1\u01a4\u01aa\u01b1\u01b8\u01c0\u01c4\t\3\22\2"+
		"\3\23\3\3\24\4\3\25\5\3\26\6\3\27\7\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}