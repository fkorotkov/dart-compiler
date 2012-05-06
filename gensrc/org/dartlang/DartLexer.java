// $ANTLR 3.2 Sep 23, 2009 12:02:23 Dart.g 2012-05-07 01:56:17

  package org.dartlang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DartLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int WHILE=20;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int CONST=5;
    public static final int NULL=15;
    public static final int DEFAULT=7;
    public static final int ELSE=9;
    public static final int DO=8;
    public static final int FOR=12;
    public static final int INT=21;
    public static final int ID=22;
    public static final int EOF=-1;
    public static final int TRUE=17;
    public static final int BREAK=4;
    public static final int IF=13;
    public static final int FINAL=11;
    public static final int IN=14;
    public static final int CONTINUE=6;
    public static final int RETURN=16;
    public static final int VAR=18;
    public static final int VOID=19;
    public static final int FALSE=10;
    public static final int STRING=23;

    // delegates
    // delegators

    public DartLexer() {;} 
    public DartLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DartLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Dart.g"; }

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:7:7: ( 'break' )
            // Dart.g:7:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:8:7: ( 'const' )
            // Dart.g:8:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:9:10: ( 'continue' )
            // Dart.g:9:12: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:10:9: ( 'default' )
            // Dart.g:10:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:11:4: ( 'do' )
            // Dart.g:11:6: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:12:6: ( 'else' )
            // Dart.g:12:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:13:7: ( 'false' )
            // Dart.g:13:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FINAL"
    public final void mFINAL() throws RecognitionException {
        try {
            int _type = FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:14:7: ( 'final' )
            // Dart.g:14:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FINAL"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:15:5: ( 'for' )
            // Dart.g:15:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:16:4: ( 'if' )
            // Dart.g:16:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:17:4: ( 'in' )
            // Dart.g:17:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:18:6: ( 'null' )
            // Dart.g:18:8: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:19:8: ( 'return' )
            // Dart.g:19:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:20:6: ( 'true' )
            // Dart.g:20:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:21:5: ( 'var' )
            // Dart.g:21:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:22:6: ( 'void' )
            // Dart.g:22:8: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:23:7: ( 'while' )
            // Dart.g:23:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:24:7: ( '(' )
            // Dart.g:24:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:25:7: ( ')' )
            // Dart.g:25:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:26:7: ( ',' )
            // Dart.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:27:7: ( '=' )
            // Dart.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:28:7: ( '{' )
            // Dart.g:28:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:29:7: ( '}' )
            // Dart.g:29:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:38:5: ( ( '0' .. '9' )+ )
            // Dart.g:38:7: ( '0' .. '9' )+
            {
            // Dart.g:38:7: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Dart.g:38:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:39:4: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // Dart.g:39:6: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // Dart.g:39:6: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Dart.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:40:8: ( '\\'' ( options {greedy=false; } : . )* '\\'' )
            // Dart.g:40:10: '\\'' ( options {greedy=false; } : . )* '\\''
            {
            match('\''); 
            // Dart.g:40:15: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Dart.g:40:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\''); 
             setText(getText().substring(1, getText().length()-1)); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // Dart.g:1:8: ( BREAK | CONST | CONTINUE | DEFAULT | DO | ELSE | FALSE | FINAL | FOR | IF | IN | NULL | RETURN | TRUE | VAR | VOID | WHILE | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | INT | ID | STRING )
        int alt4=26;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // Dart.g:1:10: BREAK
                {
                mBREAK(); 

                }
                break;
            case 2 :
                // Dart.g:1:16: CONST
                {
                mCONST(); 

                }
                break;
            case 3 :
                // Dart.g:1:22: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 4 :
                // Dart.g:1:31: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 5 :
                // Dart.g:1:39: DO
                {
                mDO(); 

                }
                break;
            case 6 :
                // Dart.g:1:42: ELSE
                {
                mELSE(); 

                }
                break;
            case 7 :
                // Dart.g:1:47: FALSE
                {
                mFALSE(); 

                }
                break;
            case 8 :
                // Dart.g:1:53: FINAL
                {
                mFINAL(); 

                }
                break;
            case 9 :
                // Dart.g:1:59: FOR
                {
                mFOR(); 

                }
                break;
            case 10 :
                // Dart.g:1:63: IF
                {
                mIF(); 

                }
                break;
            case 11 :
                // Dart.g:1:66: IN
                {
                mIN(); 

                }
                break;
            case 12 :
                // Dart.g:1:69: NULL
                {
                mNULL(); 

                }
                break;
            case 13 :
                // Dart.g:1:74: RETURN
                {
                mRETURN(); 

                }
                break;
            case 14 :
                // Dart.g:1:81: TRUE
                {
                mTRUE(); 

                }
                break;
            case 15 :
                // Dart.g:1:86: VAR
                {
                mVAR(); 

                }
                break;
            case 16 :
                // Dart.g:1:90: VOID
                {
                mVOID(); 

                }
                break;
            case 17 :
                // Dart.g:1:95: WHILE
                {
                mWHILE(); 

                }
                break;
            case 18 :
                // Dart.g:1:101: T__24
                {
                mT__24(); 

                }
                break;
            case 19 :
                // Dart.g:1:107: T__25
                {
                mT__25(); 

                }
                break;
            case 20 :
                // Dart.g:1:113: T__26
                {
                mT__26(); 

                }
                break;
            case 21 :
                // Dart.g:1:119: T__27
                {
                mT__27(); 

                }
                break;
            case 22 :
                // Dart.g:1:125: T__28
                {
                mT__28(); 

                }
                break;
            case 23 :
                // Dart.g:1:131: T__29
                {
                mT__29(); 

                }
                break;
            case 24 :
                // Dart.g:1:137: INT
                {
                mINT(); 

                }
                break;
            case 25 :
                // Dart.g:1:141: ID
                {
                mID(); 

                }
                break;
            case 26 :
                // Dart.g:1:144: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\13\23\11\uffff\3\23\1\50\4\23\1\55\1\56\11\23\1\uffff\3"+
        "\23\1\74\2\uffff\3\23\1\100\6\23\1\107\2\23\1\uffff\1\112\1\23\1"+
        "\114\1\uffff\1\115\1\23\1\117\1\120\2\23\1\uffff\1\123\1\124\1\uffff"+
        "\1\23\2\uffff\1\126\2\uffff\2\23\2\uffff\1\131\1\uffff\1\23\1\133"+
        "\1\uffff\1\134\2\uffff";
    static final String DFA4_eofS =
        "\135\uffff";
    static final String DFA4_minS =
        "\1\47\1\162\1\157\1\145\1\154\1\141\1\146\1\165\1\145\1\162\1\141"+
        "\1\150\11\uffff\1\145\1\156\1\146\1\101\1\163\1\154\1\156\1\162"+
        "\2\101\1\154\1\164\1\165\1\162\2\151\1\141\1\163\1\141\1\uffff\1"+
        "\145\1\163\1\141\1\101\2\uffff\1\154\1\165\1\145\1\101\1\144\1\154"+
        "\1\153\1\164\1\151\1\165\1\101\1\145\1\154\1\uffff\1\101\1\162\1"+
        "\101\1\uffff\1\101\1\145\2\101\1\156\1\154\1\uffff\2\101\1\uffff"+
        "\1\156\2\uffff\1\101\2\uffff\1\165\1\164\2\uffff\1\101\1\uffff\1"+
        "\145\1\101\1\uffff\1\101\2\uffff";
    static final String DFA4_maxS =
        "\1\175\1\162\2\157\1\154\1\157\1\156\1\165\1\145\1\162\1\157\1\150"+
        "\11\uffff\1\145\1\156\1\146\1\172\1\163\1\154\1\156\1\162\2\172"+
        "\1\154\1\164\1\165\1\162\2\151\1\141\1\164\1\141\1\uffff\1\145\1"+
        "\163\1\141\1\172\2\uffff\1\154\1\165\1\145\1\172\1\144\1\154\1\153"+
        "\1\164\1\151\1\165\1\172\1\145\1\154\1\uffff\1\172\1\162\1\172\1"+
        "\uffff\1\172\1\145\2\172\1\156\1\154\1\uffff\2\172\1\uffff\1\156"+
        "\2\uffff\1\172\2\uffff\1\165\1\164\2\uffff\1\172\1\uffff\1\145\1"+
        "\172\1\uffff\1\172\2\uffff";
    static final String DFA4_acceptS =
        "\14\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\23\uffff"+
        "\1\5\4\uffff\1\12\1\13\15\uffff\1\11\3\uffff\1\17\6\uffff\1\6\2"+
        "\uffff\1\14\1\uffff\1\16\1\20\1\uffff\1\1\1\2\2\uffff\1\7\1\10\1"+
        "\uffff\1\21\2\uffff\1\15\1\uffff\1\4\1\3";
    static final String DFA4_specialS =
        "\135\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\24\1\14\1\15\2\uffff\1\16\3\uffff\12\22\3\uffff\1\17\3\uffff"+
            "\32\23\6\uffff\1\23\1\1\1\2\1\3\1\4\1\5\2\23\1\6\4\23\1\7\3"+
            "\23\1\10\1\23\1\11\1\23\1\12\1\13\3\23\1\20\1\uffff\1\21",
            "\1\25",
            "\1\26",
            "\1\27\11\uffff\1\30",
            "\1\31",
            "\1\32\7\uffff\1\33\5\uffff\1\34",
            "\1\35\7\uffff\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42\15\uffff\1\43",
            "\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "\32\23\6\uffff\32\23",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\32\23\6\uffff\32\23",
            "\32\23\6\uffff\32\23",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66\1\67",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\32\23\6\uffff\32\23",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\32\23\6\uffff\32\23",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\32\23\6\uffff\32\23",
            "\1\110",
            "\1\111",
            "",
            "\32\23\6\uffff\32\23",
            "\1\113",
            "\32\23\6\uffff\32\23",
            "",
            "\32\23\6\uffff\32\23",
            "\1\116",
            "\32\23\6\uffff\32\23",
            "\32\23\6\uffff\32\23",
            "\1\121",
            "\1\122",
            "",
            "\32\23\6\uffff\32\23",
            "\32\23\6\uffff\32\23",
            "",
            "\1\125",
            "",
            "",
            "\32\23\6\uffff\32\23",
            "",
            "",
            "\1\127",
            "\1\130",
            "",
            "",
            "\32\23\6\uffff\32\23",
            "",
            "\1\132",
            "\32\23\6\uffff\32\23",
            "",
            "\32\23\6\uffff\32\23",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BREAK | CONST | CONTINUE | DEFAULT | DO | ELSE | FALSE | FINAL | FOR | IF | IN | NULL | RETURN | TRUE | VAR | VOID | WHILE | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | INT | ID | STRING );";
        }
    }
 

}