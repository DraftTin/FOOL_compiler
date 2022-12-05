// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FoolParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000;\u01c4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u00b2\b\u0016\n\u0016\f\u0016\u00b5\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00bd"+
		"\b\u0017\n\u0017\f\u0017\u00c0\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00c8\b\u0018\n\u0018"+
		"\f\u0018\u00cb\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u00d7\b\u0019\n\u0019\f\u0019\u00da\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0003"+
		"\u001a\u00e3\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0003\u001b\u00eb\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0004\u001c\u00f0\b\u001c\u000b\u001c\f\u001c\u00f1\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u00f8\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u017a\b4\u00015\u0001"+
		"5\u00015\u00055\u017f\b5\n5\f5\u0182\t5\u00035\u0184\b5\u00016\u00016"+
		"\u00036\u0188\b6\u00016\u00016\u00017\u00037\u018d\b7\u00017\u00017\u0001"+
		"7\u00047\u0192\b7\u000b7\f7\u0193\u00017\u00037\u0197\b7\u00017\u0003"+
		"7\u019a\b7\u00017\u00017\u00017\u00017\u00037\u01a0\b7\u00017\u00037\u01a3"+
		"\b7\u00018\u00018\u00058\u01a7\b8\n8\f8\u01aa\t8\u00019\u00019\u00059"+
		"\u01ae\b9\n9\f9\u01b1\t9\u0001:\u0001:\u0005:\u01b5\b:\n:\f:\u01b8\t:"+
		"\u0001:\u0001:\u0001:\u0005:\u01bd\b:\n:\f:\u01c0\t:\u0001:\u0003:\u01c3"+
		"\b:\u0002\u00c9\u00d8\u0000;\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s"+
		":u;\u0001\u0000\u000b\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u0001\u0000"+
		"19\u0001\u000009\u0002\u0000EEee\u0002\u0000++--\u0002\u0000__az\u0004"+
		"\u000009AZ__az\u0001\u0000AZ\u0001\u0000\"\"\u0001\u0000\'\'\u01db\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000"+
		"\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000"+
		"\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g"+
		"\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000"+
		"\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000"+
		"\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u"+
		"\u0001\u0000\u0000\u0000\u0001w\u0001\u0000\u0000\u0000\u0003y\u0001\u0000"+
		"\u0000\u0000\u0005{\u0001\u0000\u0000\u0000\u0007}\u0001\u0000\u0000\u0000"+
		"\t\u0080\u0001\u0000\u0000\u0000\u000b\u0082\u0001\u0000\u0000\u0000\r"+
		"\u0084\u0001\u0000\u0000\u0000\u000f\u0086\u0001\u0000\u0000\u0000\u0011"+
		"\u0088\u0001\u0000\u0000\u0000\u0013\u008a\u0001\u0000\u0000\u0000\u0015"+
		"\u008c\u0001\u0000\u0000\u0000\u0017\u008e\u0001\u0000\u0000\u0000\u0019"+
		"\u0091\u0001\u0000\u0000\u0000\u001b\u0094\u0001\u0000\u0000\u0000\u001d"+
		"\u0097\u0001\u0000\u0000\u0000\u001f\u009a\u0001\u0000\u0000\u0000!\u009d"+
		"\u0001\u0000\u0000\u0000#\u00a0\u0001\u0000\u0000\u0000%\u00a3\u0001\u0000"+
		"\u0000\u0000\'\u00a6\u0001\u0000\u0000\u0000)\u00a9\u0001\u0000\u0000"+
		"\u0000+\u00ac\u0001\u0000\u0000\u0000-\u00af\u0001\u0000\u0000\u0000/"+
		"\u00b8\u0001\u0000\u0000\u00001\u00c3\u0001\u0000\u0000\u00003\u00d1\u0001"+
		"\u0000\u0000\u00005\u00e2\u0001\u0000\u0000\u00007\u00ea\u0001\u0000\u0000"+
		"\u00009\u00ef\u0001\u0000\u0000\u0000;\u00f5\u0001\u0000\u0000\u0000="+
		"\u00fd\u0001\u0000\u0000\u0000?\u0103\u0001\u0000\u0000\u0000A\u0106\u0001"+
		"\u0000\u0000\u0000C\u010b\u0001\u0000\u0000\u0000E\u0110\u0001\u0000\u0000"+
		"\u0000G\u0116\u0001\u0000\u0000\u0000I\u011a\u0001\u0000\u0000\u0000K"+
		"\u011e\u0001\u0000\u0000\u0000M\u0122\u0001\u0000\u0000\u0000O\u0126\u0001"+
		"\u0000\u0000\u0000Q\u012a\u0001\u0000\u0000\u0000S\u012d\u0001\u0000\u0000"+
		"\u0000U\u0131\u0001\u0000\u0000\u0000W\u0137\u0001\u0000\u0000\u0000Y"+
		"\u0140\u0001\u0000\u0000\u0000[\u0145\u0001\u0000\u0000\u0000]\u014c\u0001"+
		"\u0000\u0000\u0000_\u0151\u0001\u0000\u0000\u0000a\u0157\u0001\u0000\u0000"+
		"\u0000c\u015c\u0001\u0000\u0000\u0000e\u0163\u0001\u0000\u0000\u0000g"+
		"\u016a\u0001\u0000\u0000\u0000i\u0179\u0001\u0000\u0000\u0000k\u0183\u0001"+
		"\u0000\u0000\u0000m\u0185\u0001\u0000\u0000\u0000o\u01a2\u0001\u0000\u0000"+
		"\u0000q\u01a4\u0001\u0000\u0000\u0000s\u01ab\u0001\u0000\u0000\u0000u"+
		"\u01c2\u0001\u0000\u0000\u0000wx\u0005:\u0000\u0000x\u0002\u0001\u0000"+
		"\u0000\u0000yz\u0005=\u0000\u0000z\u0004\u0001\u0000\u0000\u0000{|\u0005"+
		",\u0000\u0000|\u0006\u0001\u0000\u0000\u0000}~\u0005-\u0000\u0000~\u007f"+
		"\u0005>\u0000\u0000\u007f\b\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		".\u0000\u0000\u0081\n\u0001\u0000\u0000\u0000\u0082\u0083\u0005*\u0000"+
		"\u0000\u0083\f\u0001\u0000\u0000\u0000\u0084\u0085\u0005\\\u0000\u0000"+
		"\u0085\u000e\u0001\u0000\u0000\u0000\u0086\u0087\u0005+\u0000\u0000\u0087"+
		"\u0010\u0001\u0000\u0000\u0000\u0088\u0089\u0005-\u0000\u0000\u0089\u0012"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005<\u0000\u0000\u008b\u0014\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005>\u0000\u0000\u008d\u0016\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005<\u0000\u0000\u008f\u0090\u0005=\u0000\u0000"+
		"\u0090\u0018\u0001\u0000\u0000\u0000\u0091\u0092\u0005>\u0000\u0000\u0092"+
		"\u0093\u0005=\u0000\u0000\u0093\u001a\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005=\u0000\u0000\u0095\u0096\u0005=\u0000\u0000\u0096\u001c\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005&\u0000\u0000\u0098\u0099\u0005&\u0000\u0000"+
		"\u0099\u001e\u0001\u0000\u0000\u0000\u009a\u009b\u0005|\u0000\u0000\u009b"+
		"\u009c\u0005|\u0000\u0000\u009c \u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"(\u0000\u0000\u009e\u009f\u0006\u0010\u0000\u0000\u009f\"\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005)\u0000\u0000\u00a1\u00a2\u0006\u0011\u0001"+
		"\u0000\u00a2$\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005{\u0000\u0000\u00a4"+
		"\u00a5\u0006\u0012\u0002\u0000\u00a5&\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005}\u0000\u0000\u00a7\u00a8\u0006\u0013\u0003\u0000\u00a8(\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0005[\u0000\u0000\u00aa\u00ab\u0006\u0014\u0004"+
		"\u0000\u00ab*\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005]\u0000\u0000\u00ad"+
		"\u00ae\u0006\u0015\u0005\u0000\u00ae,\u0001\u0000\u0000\u0000\u00af\u00b3"+
		"\u0005#\u0000\u0000\u00b0\u00b2\b\u0000\u0000\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006"+
		"\u0016\u0006\u0000\u00b7.\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005/\u0000"+
		"\u0000\u00b9\u00ba\u0005/\u0000\u0000\u00ba\u00be\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\b\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0006\u0017\u0006\u0000\u00c2"+
		"0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005/\u0000\u0000\u00c4\u00c5\u0005"+
		"*\u0000\u0000\u00c5\u00c9\u0001\u0000\u0000\u0000\u00c6\u00c8\t\u0000"+
		"\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005*\u0000\u0000\u00cd\u00ce\u0005/\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0006\u0018\u0006\u0000"+
		"\u00d02\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\'\u0000\u0000\u00d2"+
		"\u00d3\u0005\'\u0000\u0000\u00d3\u00d4\u0005\'\u0000\u0000\u00d4\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d7\t\u0000\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00db\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"\'\u0000\u0000\u00dc\u00dd\u0005\'\u0000\u0000\u00dd\u00de\u0005\'\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0006\u0019\u0006"+
		"\u0000\u00e04\u0001\u0000\u0000\u0000\u00e1\u00e3\u0005\r\u0000\u0000"+
		"\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\n\u0000\u0000\u00e5"+
		"\u00e6\u0004\u001a\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0006\u001a\u0006\u0000\u00e86\u0001\u0000\u0000\u0000\u00e9\u00eb"+
		"\u0005\r\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005"+
		"\n\u0000\u0000\u00ed8\u0001\u0000\u0000\u0000\u00ee\u00f0\u0007\u0001"+
		"\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0006\u001c"+
		"\u0006\u0000\u00f4:\u0001\u0000\u0000\u0000\u00f5\u00f7\u0005\\\u0000"+
		"\u0000\u00f6\u00f8\u0005\r\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0005\n\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0006\u001d\u0006\u0000\u00fc<\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0005c\u0000\u0000\u00fe\u00ff\u0005l\u0000\u0000\u00ff\u0100\u0005a"+
		"\u0000\u0000\u0100\u0101\u0005s\u0000\u0000\u0101\u0102\u0005s\u0000\u0000"+
		"\u0102>\u0001\u0000\u0000\u0000\u0103\u0104\u0005i\u0000\u0000\u0104\u0105"+
		"\u0005f\u0000\u0000\u0105@\u0001\u0000\u0000\u0000\u0106\u0107\u0005e"+
		"\u0000\u0000\u0107\u0108\u0005l\u0000\u0000\u0108\u0109\u0005s\u0000\u0000"+
		"\u0109\u010a\u0005e\u0000\u0000\u010aB\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0005w\u0000\u0000\u010c\u010d\u0005h\u0000\u0000\u010d\u010e\u0005e"+
		"\u0000\u0000\u010e\u010f\u0005n\u0000\u0000\u010fD\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005w\u0000\u0000\u0111\u0112\u0005h\u0000\u0000\u0112\u0113"+
		"\u0005i\u0000\u0000\u0113\u0114\u0005l\u0000\u0000\u0114\u0115\u0005e"+
		"\u0000\u0000\u0115F\u0001\u0000\u0000\u0000\u0116\u0117\u0005v\u0000\u0000"+
		"\u0117\u0118\u0005a\u0000\u0000\u0118\u0119\u0005r\u0000\u0000\u0119H"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0005v\u0000\u0000\u011b\u011c\u0005"+
		"a\u0000\u0000\u011c\u011d\u0005l\u0000\u0000\u011dJ\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0005d\u0000\u0000\u011f\u0120\u0005e\u0000\u0000\u0120"+
		"\u0121\u0005f\u0000\u0000\u0121L\u0001\u0000\u0000\u0000\u0122\u0123\u0005"+
		"n\u0000\u0000\u0123\u0124\u0005o\u0000\u0000\u0124\u0125\u0005t\u0000"+
		"\u0000\u0125N\u0001\u0000\u0000\u0000\u0126\u0127\u0005N\u0000\u0000\u0127"+
		"\u0128\u0005I\u0000\u0000\u0128\u0129\u0005L\u0000\u0000\u0129P\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0005i\u0000\u0000\u012b\u012c\u0005s\u0000"+
		"\u0000\u012cR\u0001\u0000\u0000\u0000\u012d\u012e\u0005n\u0000\u0000\u012e"+
		"\u012f\u0005e\u0000\u0000\u012f\u0130\u0005w\u0000\u0000\u0130T\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0005b\u0000\u0000\u0132\u0133\u0005r\u0000"+
		"\u0000\u0133\u0134\u0005e\u0000\u0000\u0134\u0135\u0005a\u0000\u0000\u0135"+
		"\u0136\u0005k\u0000\u0000\u0136V\u0001\u0000\u0000\u0000\u0137\u0138\u0005"+
		"c\u0000\u0000\u0138\u0139\u0005o\u0000\u0000\u0139\u013a\u0005n\u0000"+
		"\u0000\u013a\u013b\u0005t\u0000\u0000\u013b\u013c\u0005i\u0000\u0000\u013c"+
		"\u013d\u0005n\u0000\u0000\u013d\u013e\u0005u\u0000\u0000\u013e\u013f\u0005"+
		"e\u0000\u0000\u013fX\u0001\u0000\u0000\u0000\u0140\u0141\u0005t\u0000"+
		"\u0000\u0141\u0142\u0005h\u0000\u0000\u0142\u0143\u0005i\u0000\u0000\u0143"+
		"\u0144\u0005s\u0000\u0000\u0144Z\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"r\u0000\u0000\u0146\u0147\u0005e\u0000\u0000\u0147\u0148\u0005t\u0000"+
		"\u0000\u0148\u0149\u0005u\u0000\u0000\u0149\u014a\u0005r\u0000\u0000\u014a"+
		"\u014b\u0005n\u0000\u0000\u014b\\\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0005r\u0000\u0000\u014d\u014e\u0005e\u0000\u0000\u014e\u014f\u0005a"+
		"\u0000\u0000\u014f\u0150\u0005d\u0000\u0000\u0150^\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0005w\u0000\u0000\u0152\u0153\u0005r\u0000\u0000\u0153\u0154"+
		"\u0005i\u0000\u0000\u0154\u0155\u0005t\u0000\u0000\u0155\u0156\u0005e"+
		"\u0000\u0000\u0156`\u0001\u0000\u0000\u0000\u0157\u0158\u0005o\u0000\u0000"+
		"\u0158\u0159\u0005p\u0000\u0000\u0159\u015a\u0005e\u0000\u0000\u015a\u015b"+
		"\u0005n\u0000\u0000\u015bb\u0001\u0000\u0000\u0000\u015c\u015d\u0005i"+
		"\u0000\u0000\u015d\u015e\u0005m\u0000\u0000\u015e\u015f\u0005p\u0000\u0000"+
		"\u015f\u0160\u0005o\u0000\u0000\u0160\u0161\u0005r\u0000\u0000\u0161\u0162"+
		"\u0005t\u0000\u0000\u0162d\u0001\u0000\u0000\u0000\u0163\u0164\u0005a"+
		"\u0000\u0000\u0164\u0165\u0005s\u0000\u0000\u0165\u0166\u0005s\u0000\u0000"+
		"\u0166\u0167\u0005e\u0000\u0000\u0167\u0168\u0005r\u0000\u0000\u0168\u0169"+
		"\u0005t\u0000\u0000\u0169f\u0001\u0000\u0000\u0000\u016a\u016b\u0005s"+
		"\u0000\u0000\u016b\u016c\u0005u\u0000\u0000\u016c\u016d\u0005p\u0000\u0000"+
		"\u016d\u016e\u0005e\u0000\u0000\u016e\u016f\u0005r\u0000\u0000\u016fh"+
		"\u0001\u0000\u0000\u0000\u0170\u0171\u0005t\u0000\u0000\u0171\u0172\u0005"+
		"r\u0000\u0000\u0172\u0173\u0005u\u0000\u0000\u0173\u017a\u0005e\u0000"+
		"\u0000\u0174\u0175\u0005f\u0000\u0000\u0175\u0176\u0005a\u0000\u0000\u0176"+
		"\u0177\u0005l\u0000\u0000\u0177\u0178\u0005s\u0000\u0000\u0178\u017a\u0005"+
		"e\u0000\u0000\u0179\u0170\u0001\u0000\u0000\u0000\u0179\u0174\u0001\u0000"+
		"\u0000\u0000\u017aj\u0001\u0000\u0000\u0000\u017b\u0184\u00050\u0000\u0000"+
		"\u017c\u0180\u0007\u0002\u0000\u0000\u017d\u017f\u0007\u0003\u0000\u0000"+
		"\u017e\u017d\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000"+
		"\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000"+
		"\u0183\u017b\u0001\u0000\u0000\u0000\u0183\u017c\u0001\u0000\u0000\u0000"+
		"\u0184l\u0001\u0000\u0000\u0000\u0185\u0187\u0007\u0004\u0000\u0000\u0186"+
		"\u0188\u0007\u0005\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0003k5\u0000\u018an\u0001\u0000\u0000\u0000\u018b\u018d\u0005"+
		"-\u0000\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0003k5\u0000"+
		"\u018f\u0191\u0005.\u0000\u0000\u0190\u0192\u0007\u0003\u0000\u0000\u0191"+
		"\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193"+
		"\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194"+
		"\u0196\u0001\u0000\u0000\u0000\u0195\u0197\u0003m6\u0000\u0196\u0195\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u01a3\u0001"+
		"\u0000\u0000\u0000\u0198\u019a\u0005-\u0000\u0000\u0199\u0198\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0003k5\u0000\u019c\u019d\u0003m6\u0000\u019d"+
		"\u01a3\u0001\u0000\u0000\u0000\u019e\u01a0\u0005-\u0000\u0000\u019f\u019e"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a3\u0003k5\u0000\u01a2\u018c\u0001\u0000"+
		"\u0000\u0000\u01a2\u0199\u0001\u0000\u0000\u0000\u01a2\u019f\u0001\u0000"+
		"\u0000\u0000\u01a3p\u0001\u0000\u0000\u0000\u01a4\u01a8\u0007\u0006\u0000"+
		"\u0000\u01a5\u01a7\u0007\u0007\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9r\u0001\u0000\u0000\u0000"+
		"\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01af\u0007\b\u0000\u0000\u01ac"+
		"\u01ae\u0007\u0007\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ae"+
		"\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b0t\u0001\u0000\u0000\u0000\u01b1\u01af"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b6\u0005\"\u0000\u0000\u01b3\u01b5\b"+
		"\t\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b9\u01c3\u0005\"\u0000\u0000\u01ba\u01be\u0005\'\u0000"+
		"\u0000\u01bb\u01bd\b\n\u0000\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01c3\u0005\'\u0000\u0000\u01c2"+
		"\u01b2\u0001\u0000\u0000\u0000\u01c2\u01ba\u0001\u0000\u0000\u0000\u01c3"+
		"v\u0001\u0000\u0000\u0000\u0018\u0000\u00b3\u00be\u00c9\u00d8\u00e2\u00ea"+
		"\u00f1\u00f7\u0179\u0180\u0183\u0187\u018c\u0193\u0196\u0199\u019f\u01a2"+
		"\u01a8\u01af\u01b6\u01be\u01c2\u0007\u0001\u0010\u0000\u0001\u0011\u0001"+
		"\u0001\u0012\u0002\u0001\u0013\u0003\u0001\u0014\u0004\u0001\u0015\u0005"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}