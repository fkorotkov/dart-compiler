// $ANTLR 3.2 Sep 23, 2009 12:02:23 Dart.g 2012-05-08 23:43:58

  package org.dartlang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DartLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int WHILE=20;
    public static final int T__25=25;
    public static final int CONST=5;
    public static final int FOR=12;
    public static final int DO=8;
    public static final int ID=22;
    public static final int EOF=-1;
    public static final int BREAK=4;
    public static final int IF=13;
    public static final int FINAL=11;
    public static final int IN=14;
    public static final int CONTINUE=6;
    public static final int RETURN=16;
    public static final int VAR=18;
    public static final int VOID=19;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int NULL=15;
    public static final int DEFAULT=7;
    public static final int ELSE=9;
    public static final int WHITESPACE=24;
    public static final int INT=21;
    public static final int TRUE=17;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:30:7: ( ';' )
            // Dart.g:30:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:31:7: ( '||' )
            // Dart.g:31:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:32:7: ( '&&' )
            // Dart.g:32:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:33:7: ( '|' )
            // Dart.g:33:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:34:7: ( '^' )
            // Dart.g:34:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:35:7: ( '&' )
            // Dart.g:35:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:36:7: ( '+' )
            // Dart.g:36:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:37:7: ( '-' )
            // Dart.g:37:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:38:7: ( '*' )
            // Dart.g:38:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:39:7: ( '/' )
            // Dart.g:39:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:40:7: ( '%' )
            // Dart.g:40:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:41:7: ( '~/' )
            // Dart.g:41:9: '~/'
            {
            match("~/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:42:7: ( '<<' )
            // Dart.g:42:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:43:7: ( '>' )
            // Dart.g:43:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:44:7: ( '==' )
            // Dart.g:44:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:45:7: ( '!=' )
            // Dart.g:45:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:46:7: ( '===' )
            // Dart.g:46:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:47:7: ( '!==' )
            // Dart.g:47:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Dart.g:41:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // Dart.g:41:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // Dart.g:41:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||(LA4_0>='\f' && LA4_0<='\r')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Dart.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // Dart.g:1:8: ( BREAK | CONST | CONTINUE | DEFAULT | DO | ELSE | FALSE | FINAL | FOR | IF | IN | NULL | RETURN | TRUE | VAR | VOID | WHILE | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | INT | ID | STRING | WHITESPACE )
        int alt5=45;
        alt5 = dfa5.predict(input);
        switch (alt5) {
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
                // Dart.g:1:101: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // Dart.g:1:107: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // Dart.g:1:113: T__27
                {
                mT__27(); 

                }
                break;
            case 21 :
                // Dart.g:1:119: T__28
                {
                mT__28(); 

                }
                break;
            case 22 :
                // Dart.g:1:125: T__29
                {
                mT__29(); 

                }
                break;
            case 23 :
                // Dart.g:1:131: T__30
                {
                mT__30(); 

                }
                break;
            case 24 :
                // Dart.g:1:137: T__31
                {
                mT__31(); 

                }
                break;
            case 25 :
                // Dart.g:1:143: T__32
                {
                mT__32(); 

                }
                break;
            case 26 :
                // Dart.g:1:149: T__33
                {
                mT__33(); 

                }
                break;
            case 27 :
                // Dart.g:1:155: T__34
                {
                mT__34(); 

                }
                break;
            case 28 :
                // Dart.g:1:161: T__35
                {
                mT__35(); 

                }
                break;
            case 29 :
                // Dart.g:1:167: T__36
                {
                mT__36(); 

                }
                break;
            case 30 :
                // Dart.g:1:173: T__37
                {
                mT__37(); 

                }
                break;
            case 31 :
                // Dart.g:1:179: T__38
                {
                mT__38(); 

                }
                break;
            case 32 :
                // Dart.g:1:185: T__39
                {
                mT__39(); 

                }
                break;
            case 33 :
                // Dart.g:1:191: T__40
                {
                mT__40(); 

                }
                break;
            case 34 :
                // Dart.g:1:197: T__41
                {
                mT__41(); 

                }
                break;
            case 35 :
                // Dart.g:1:203: T__42
                {
                mT__42(); 

                }
                break;
            case 36 :
                // Dart.g:1:209: T__43
                {
                mT__43(); 

                }
                break;
            case 37 :
                // Dart.g:1:215: T__44
                {
                mT__44(); 

                }
                break;
            case 38 :
                // Dart.g:1:221: T__45
                {
                mT__45(); 

                }
                break;
            case 39 :
                // Dart.g:1:227: T__46
                {
                mT__46(); 

                }
                break;
            case 40 :
                // Dart.g:1:233: T__47
                {
                mT__47(); 

                }
                break;
            case 41 :
                // Dart.g:1:239: T__48
                {
                mT__48(); 

                }
                break;
            case 42 :
                // Dart.g:1:245: INT
                {
                mINT(); 

                }
                break;
            case 43 :
                // Dart.g:1:249: ID
                {
                mID(); 

                }
                break;
            case 44 :
                // Dart.g:1:252: STRING
                {
                mSTRING(); 

                }
                break;
            case 45 :
                // Dart.g:1:259: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\13\40\3\uffff\1\64\3\uffff\1\66\1\70\16\uffff\3\40\1\75"+
        "\4\40\1\102\1\103\6\40\1\113\5\uffff\1\115\3\40\1\uffff\3\40\1\125"+
        "\2\uffff\3\40\1\131\2\40\4\uffff\4\40\1\140\2\40\1\uffff\1\143\1"+
        "\40\1\145\1\uffff\1\146\1\40\1\150\1\151\2\40\1\uffff\1\154\1\155"+
        "\1\uffff\1\40\2\uffff\1\157\2\uffff\2\40\2\uffff\1\162\1\uffff\1"+
        "\40\1\164\1\uffff\1\165\2\uffff";
    static final String DFA5_eofS =
        "\166\uffff";
    static final String DFA5_minS =
        "\1\11\1\162\1\157\1\145\1\154\1\141\1\146\1\165\1\145\1\162\1\141"+
        "\1\150\3\uffff\1\75\3\uffff\1\174\1\46\11\uffff\1\75\4\uffff\1\145"+
        "\1\156\1\146\1\101\1\163\1\154\1\156\1\162\2\101\1\154\1\164\1\165"+
        "\1\162\2\151\1\75\5\uffff\1\75\1\141\1\163\1\141\1\uffff\1\145\1"+
        "\163\1\141\1\101\2\uffff\1\154\1\165\1\145\1\101\1\144\1\154\4\uffff"+
        "\1\153\1\164\1\151\1\165\1\101\1\145\1\154\1\uffff\1\101\1\162\1"+
        "\101\1\uffff\1\101\1\145\2\101\1\156\1\154\1\uffff\2\101\1\uffff"+
        "\1\156\2\uffff\1\101\2\uffff\1\165\1\164\2\uffff\1\101\1\uffff\1"+
        "\145\1\101\1\uffff\1\101\2\uffff";
    static final String DFA5_maxS =
        "\1\176\1\162\2\157\1\154\1\157\1\156\1\165\1\145\1\162\1\157\1\150"+
        "\3\uffff\1\75\3\uffff\1\174\1\46\11\uffff\1\75\4\uffff\1\145\1\156"+
        "\1\146\1\172\1\163\1\154\1\156\1\162\2\172\1\154\1\164\1\165\1\162"+
        "\2\151\1\75\5\uffff\1\75\1\141\1\164\1\141\1\uffff\1\145\1\163\1"+
        "\141\1\172\2\uffff\1\154\1\165\1\145\1\172\1\144\1\154\4\uffff\1"+
        "\153\1\164\1\151\1\165\1\172\1\145\1\154\1\uffff\1\172\1\162\1\172"+
        "\1\uffff\1\172\1\145\2\172\1\156\1\154\1\uffff\2\172\1\uffff\1\156"+
        "\2\uffff\1\172\2\uffff\1\165\1\164\2\uffff\1\172\1\uffff\1\145\1"+
        "\172\1\uffff\1\172\2\uffff";
    static final String DFA5_acceptS =
        "\14\uffff\1\22\1\23\1\24\1\uffff\1\26\1\27\1\30\2\uffff\1\34\1\36"+
        "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\uffff\1\52\1\53\1\54\1\55"+
        "\21\uffff\1\25\1\31\1\33\1\32\1\35\4\uffff\1\5\4\uffff\1\12\1\13"+
        "\6\uffff\1\50\1\46\1\51\1\47\7\uffff\1\11\3\uffff\1\17\6\uffff\1"+
        "\6\2\uffff\1\14\1\uffff\1\16\1\20\1\uffff\1\1\1\2\2\uffff\1\7\1"+
        "\10\1\uffff\1\21\2\uffff\1\15\1\uffff\1\4\1\3";
    static final String DFA5_specialS =
        "\166\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\42\1\uffff\2\42\22\uffff\1\42\1\36\3\uffff\1\32\1\24\1\41"+
            "\1\14\1\15\1\30\1\26\1\16\1\27\1\uffff\1\31\12\37\1\uffff\1"+
            "\22\1\34\1\17\1\35\2\uffff\32\40\3\uffff\1\25\2\uffff\1\40\1"+
            "\1\1\2\1\3\1\4\1\5\2\40\1\6\4\40\1\7\3\40\1\10\1\40\1\11\1\40"+
            "\1\12\1\13\3\40\1\20\1\23\1\21\1\33",
            "\1\43",
            "\1\44",
            "\1\45\11\uffff\1\46",
            "\1\47",
            "\1\50\7\uffff\1\51\5\uffff\1\52",
            "\1\53\7\uffff\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60\15\uffff\1\61",
            "\1\62",
            "",
            "",
            "",
            "\1\63",
            "",
            "",
            "",
            "\1\65",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\32\40\6\uffff\32\40",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\32\40\6\uffff\32\40",
            "\32\40\6\uffff\32\40",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "\1\116",
            "\1\117\1\120",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\32\40\6\uffff\32\40",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\32\40\6\uffff\32\40",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\32\40\6\uffff\32\40",
            "\1\141",
            "\1\142",
            "",
            "\32\40\6\uffff\32\40",
            "\1\144",
            "\32\40\6\uffff\32\40",
            "",
            "\32\40\6\uffff\32\40",
            "\1\147",
            "\32\40\6\uffff\32\40",
            "\32\40\6\uffff\32\40",
            "\1\152",
            "\1\153",
            "",
            "\32\40\6\uffff\32\40",
            "\32\40\6\uffff\32\40",
            "",
            "\1\156",
            "",
            "",
            "\32\40\6\uffff\32\40",
            "",
            "",
            "\1\160",
            "\1\161",
            "",
            "",
            "\32\40\6\uffff\32\40",
            "",
            "\1\163",
            "\32\40\6\uffff\32\40",
            "",
            "\32\40\6\uffff\32\40",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BREAK | CONST | CONTINUE | DEFAULT | DO | ELSE | FALSE | FINAL | FOR | IF | IN | NULL | RETURN | TRUE | VAR | VOID | WHILE | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | INT | ID | STRING | WHITESPACE );";
        }
    }
 

}