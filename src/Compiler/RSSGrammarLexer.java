package Compiler;
// Generated from RSSGrammar.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RSSGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Print=9, 
		If=10, Else=11, End=12, For=13, Till=14, While=15, Func=16, Class=17, 
		Return=18, Returns=19, Scope=20, Equals=21, NEquals=22, GTEquals=23, LTEquals=24, 
		GT=25, LT=26, Add=27, Subtract=28, Multiply=29, Divide=30, Assign=31, 
		Number=32, Identifier=33, String=34, Comment=35, Space=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Print", 
		"If", "Else", "End", "For", "Till", "While", "Func", "Class", "Return", 
		"Returns", "Scope", "Equals", "NEquals", "GTEquals", "LTEquals", "GT", 
		"LT", "Add", "Subtract", "Multiply", "Divide", "Assign", "Number", "Identifier", 
		"String", "Comment", "Space", "Int", "Digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'('", "')'", "','", "'%'", "'&&'", "'||'", "'print'", 
		"'if'", "'else'", "'end'", "'for'", "'till'", "'while'", "'func'", "'class'", 
		"'return'", "'returns'", "'::'", "'=='", "'!='", "'>='", "'<='", "'>'", 
		"'<'", "'+'", "'-'", "'*'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "Print", "If", "Else", 
		"End", "For", "Till", "While", "Func", "Class", "Return", "Returns", "Scope", 
		"Equals", "NEquals", "GTEquals", "LTEquals", "GT", "LT", "Add", "Subtract", 
		"Multiply", "Divide", "Assign", "Number", "Identifier", "String", "Comment", 
		"Space"
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


	public RSSGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RSSGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u0104\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\7\"\u00be"+
		"\n\"\f\"\16\"\u00c1\13\"\3#\3#\3#\3#\3#\3#\7#\u00c9\n#\f#\16#\u00cc\13"+
		"#\3#\3#\3#\3#\3#\3#\3#\7#\u00d5\n#\f#\16#\u00d8\13#\3#\5#\u00db\n#\3$"+
		"\3$\3$\3$\7$\u00e1\n$\f$\16$\u00e4\13$\3$\3$\3$\3$\7$\u00ea\n$\f$\16$"+
		"\u00ed\13$\3$\3$\5$\u00f1\n$\3$\3$\3%\3%\3%\3%\3&\3&\7&\u00fb\n&\f&\16"+
		"&\u00fe\13&\3&\5&\u0101\n&\3\'\3\'\3\u00eb\2(\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2\3\2"+
		"\13\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\5\2\f\f\17\17$$\3\2))\4\2\f\f\17\17"+
		"\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\u010e\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3O\3\2\2\2\5Q"+
		"\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rY\3\2\2\2\17[\3\2\2\2\21^"+
		"\3\2\2\2\23a\3\2\2\2\25g\3\2\2\2\27j\3\2\2\2\31o\3\2\2\2\33s\3\2\2\2\35"+
		"w\3\2\2\2\37|\3\2\2\2!\u0082\3\2\2\2#\u0087\3\2\2\2%\u008d\3\2\2\2\'\u0094"+
		"\3\2\2\2)\u009c\3\2\2\2+\u009f\3\2\2\2-\u00a2\3\2\2\2/\u00a5\3\2\2\2\61"+
		"\u00a8\3\2\2\2\63\u00ab\3\2\2\2\65\u00ad\3\2\2\2\67\u00af\3\2\2\29\u00b1"+
		"\3\2\2\2;\u00b3\3\2\2\2=\u00b5\3\2\2\2?\u00b7\3\2\2\2A\u00b9\3\2\2\2C"+
		"\u00bb\3\2\2\2E\u00da\3\2\2\2G\u00f0\3\2\2\2I\u00f4\3\2\2\2K\u0100\3\2"+
		"\2\2M\u0102\3\2\2\2OP\7]\2\2P\4\3\2\2\2QR\7_\2\2R\6\3\2\2\2ST\7*\2\2T"+
		"\b\3\2\2\2UV\7+\2\2V\n\3\2\2\2WX\7.\2\2X\f\3\2\2\2YZ\7\'\2\2Z\16\3\2\2"+
		"\2[\\\7(\2\2\\]\7(\2\2]\20\3\2\2\2^_\7~\2\2_`\7~\2\2`\22\3\2\2\2ab\7r"+
		"\2\2bc\7t\2\2cd\7k\2\2de\7p\2\2ef\7v\2\2f\24\3\2\2\2gh\7k\2\2hi\7h\2\2"+
		"i\26\3\2\2\2jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2n\30\3\2\2\2op\7g\2\2"+
		"pq\7p\2\2qr\7f\2\2r\32\3\2\2\2st\7h\2\2tu\7q\2\2uv\7t\2\2v\34\3\2\2\2"+
		"wx\7v\2\2xy\7k\2\2yz\7n\2\2z{\7n\2\2{\36\3\2\2\2|}\7y\2\2}~\7j\2\2~\177"+
		"\7k\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081 \3\2\2\2\u0082\u0083"+
		"\7h\2\2\u0083\u0084\7w\2\2\u0084\u0085\7p\2\2\u0085\u0086\7e\2\2\u0086"+
		"\"\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7n\2\2\u0089\u008a\7c\2\2\u008a"+
		"\u008b\7u\2\2\u008b\u008c\7u\2\2\u008c$\3\2\2\2\u008d\u008e\7t\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\7v\2\2\u0090\u0091\7w\2\2\u0091\u0092\7t\2\2"+
		"\u0092\u0093\7p\2\2\u0093&\3\2\2\2\u0094\u0095\7t\2\2\u0095\u0096\7g\2"+
		"\2\u0096\u0097\7v\2\2\u0097\u0098\7w\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7p\2\2\u009a\u009b\7u\2\2\u009b(\3\2\2\2\u009c\u009d\7<\2\2\u009d\u009e"+
		"\7<\2\2\u009e*\3\2\2\2\u009f\u00a0\7?\2\2\u00a0\u00a1\7?\2\2\u00a1,\3"+
		"\2\2\2\u00a2\u00a3\7#\2\2\u00a3\u00a4\7?\2\2\u00a4.\3\2\2\2\u00a5\u00a6"+
		"\7@\2\2\u00a6\u00a7\7?\2\2\u00a7\60\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa\62\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac\64\3\2\2\2\u00ad\u00ae"+
		"\7>\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7-\2\2\u00b08\3\2\2\2\u00b1\u00b2"+
		"\7/\2\2\u00b2:\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4<\3\2\2\2\u00b5\u00b6\7"+
		"\61\2\2\u00b6>\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8@\3\2\2\2\u00b9\u00ba\5"+
		"K&\2\u00baB\3\2\2\2\u00bb\u00bf\t\2\2\2\u00bc\u00be\t\3\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"D\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00ca\t\4\2\2\u00c3\u00c9\n\5\2\2"+
		"\u00c4\u00c5\7^\2\2\u00c5\u00c9\7^\2\2\u00c6\u00c7\7^\2\2\u00c7\u00c9"+
		"\7$\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00db\t\4\2\2\u00ce\u00d6\t\6\2\2\u00cf"+
		"\u00d5\n\5\2\2\u00d0\u00d1\7^\2\2\u00d1\u00d5\7^\2\2\u00d2\u00d3\7^\2"+
		"\2\u00d3\u00d5\7$\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\t\6\2\2\u00da\u00c2\3\2"+
		"\2\2\u00da\u00ce\3\2\2\2\u00dbF\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd\u00de"+
		"\7\61\2\2\u00de\u00e2\3\2\2\2\u00df\u00e1\n\7\2\2\u00e0\u00df\3\2\2\2"+
		"\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00f1"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7\7,\2\2\u00e7"+
		"\u00eb\3\2\2\2\u00e8\u00ea\13\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f1\7\61\2\2\u00f0\u00dc\3\2"+
		"\2\2\u00f0\u00e5\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b$\2\2\u00f3"+
		"H\3\2\2\2\u00f4\u00f5\t\b\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b%\2\2\u00f7"+
		"J\3\2\2\2\u00f8\u00fc\t\t\2\2\u00f9\u00fb\5M\'\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0101\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\7\62\2\2\u0100\u00f8\3\2\2\2\u0100"+
		"\u00ff\3\2\2\2\u0101L\3\2\2\2\u0102\u0103\t\n\2\2\u0103N\3\2\2\2\16\2"+
		"\u00bf\u00c8\u00ca\u00d4\u00d6\u00da\u00e2\u00eb\u00f0\u00fc\u0100\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}