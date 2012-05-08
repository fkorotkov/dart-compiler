// $ANTLR 3.2 Sep 23, 2009 12:02:23 Dart.g 2012-05-08 23:43:57

  package org.dartlang;

  import org.dartlang.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class DartParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREAK", "CONST", "CONTINUE", "DEFAULT", "DO", "ELSE", "FALSE", "FINAL", "FOR", "IF", "IN", "NULL", "RETURN", "TRUE", "VAR", "VOID", "WHILE", "INT", "ID", "STRING", "WHITESPACE", "'('", "')'", "','", "'='", "'{'", "'}'", "';'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'+'", "'-'", "'*'", "'/'", "'%'", "'~/'", "'<<'", "'>'", "'=='", "'!='", "'==='", "'!=='"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int WHILE=20;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int CONST=5;
    public static final int DO=8;
    public static final int FOR=12;
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


        public DartParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DartParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return DartParser.tokenNames; }
    public String getGrammarFileName() { return "Dart.g"; }


    public static class topLevel_return extends ParserRuleReturnScope {
        public ASTNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevel"
    // Dart.g:43:1: topLevel returns [ASTNode root] : (child= stataemet )* ;
    public final DartParser.topLevel_return topLevel() throws RecognitionException {
        DartParser.topLevel_return retval = new DartParser.topLevel_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.stataemet_return child = null;



        try {
            // Dart.g:44:2: ( (child= stataemet )* )
            // Dart.g:44:4: (child= stataemet )*
            {
            root_0 = (CommonTree)adaptor.nil();

            final List<ASTNode> children = new ArrayList<ASTNode>();
            // Dart.g:45:4: (child= stataemet )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Dart.g:45:5: child= stataemet
            	    {
            	    pushFollow(FOLLOW_stataemet_in_topLevel397);
            	    child=stataemet();

            	    state._fsp--;

            	    adaptor.addChild(root_0, child.getTree());
            	    children.add(child.root);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            retval.root = new StatementsNode(children);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "topLevel"

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        public FunctionDeclarationNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDeclaration"
    // Dart.g:48:1: functionDeclaration returns [FunctionDeclarationNode root] : ( type )? ID '(' parameterList ')' block ;
    public final DartParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        DartParser.functionDeclaration_return retval = new DartParser.functionDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID2=null;
        Token char_literal3=null;
        Token char_literal5=null;
        DartParser.type_return type1 = null;

        DartParser.parameterList_return parameterList4 = null;

        DartParser.block_return block6 = null;


        CommonTree ID2_tree=null;
        CommonTree char_literal3_tree=null;
        CommonTree char_literal5_tree=null;

        try {
            // Dart.g:49:2: ( ( type )? ID '(' parameterList ')' block )
            // Dart.g:49:4: ( type )? ID '(' parameterList ')' block
            {
            root_0 = (CommonTree)adaptor.nil();

            // Dart.g:49:4: ( type )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // Dart.g:49:4: type
                    {
                    pushFollow(FOLLOW_type_in_functionDeclaration419);
                    type1=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type1.getTree());

                    }
                    break;

            }

            ID2=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration422); 
            ID2_tree = (CommonTree)adaptor.create(ID2);
            adaptor.addChild(root_0, ID2_tree);

            char_literal3=(Token)match(input,25,FOLLOW_25_in_functionDeclaration424); 
            char_literal3_tree = (CommonTree)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);

            pushFollow(FOLLOW_parameterList_in_functionDeclaration426);
            parameterList4=parameterList();

            state._fsp--;

            adaptor.addChild(root_0, parameterList4.getTree());
            char_literal5=(Token)match(input,26,FOLLOW_26_in_functionDeclaration428); 
            char_literal5_tree = (CommonTree)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);

            pushFollow(FOLLOW_block_in_functionDeclaration430);
            block6=block();

            state._fsp--;

            adaptor.addChild(root_0, block6.getTree());
            retval.root = new FunctionDeclarationNode((ID2!=null?ID2.getText():null), (parameterList4!=null?parameterList4.root:null), (type1!=null?type1.root:null), (block6!=null?block6.root:null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"

    public static class type_return extends ParserRuleReturnScope {
        public TypeNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // Dart.g:52:1: type returns [TypeNode root] : ID ;
    public final DartParser.type_return type() throws RecognitionException {
        DartParser.type_return retval = new DartParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID7=null;

        CommonTree ID7_tree=null;

        try {
            // Dart.g:53:2: ( ID )
            // Dart.g:53:4: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            ID7=(Token)match(input,ID,FOLLOW_ID_in_type446); 
            ID7_tree = (CommonTree)adaptor.create(ID7);
            adaptor.addChild(root_0, ID7_tree);

            retval.root = new TypeNode(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class parameter_return extends ParserRuleReturnScope {
        public ParameterNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // Dart.g:55:1: parameter returns [ParameterNode root] : type name= ID ;
    public final DartParser.parameter_return parameter() throws RecognitionException {
        DartParser.parameter_return retval = new DartParser.parameter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        DartParser.type_return type8 = null;


        CommonTree name_tree=null;

        try {
            // Dart.g:56:2: ( type name= ID )
            // Dart.g:56:4: type name= ID
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_type_in_parameter461);
            type8=type();

            state._fsp--;

            adaptor.addChild(root_0, type8.getTree());
            name=(Token)match(input,ID,FOLLOW_ID_in_parameter465); 
            name_tree = (CommonTree)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);

            retval.root = new ParameterNode((type8!=null?type8.root:null), (name!=null?name.getText():null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class parameterList_return extends ParserRuleReturnScope {
        public ParameterListNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterList"
    // Dart.g:58:1: parameterList returns [ParameterListNode root] : child1= parameter ( ',' child2= parameter )* ;
    public final DartParser.parameterList_return parameterList() throws RecognitionException {
        DartParser.parameterList_return retval = new DartParser.parameterList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal9=null;
        DartParser.parameter_return child1 = null;

        DartParser.parameter_return child2 = null;


        CommonTree char_literal9_tree=null;

        try {
            // Dart.g:59:2: (child1= parameter ( ',' child2= parameter )* )
            // Dart.g:59:4: child1= parameter ( ',' child2= parameter )*
            {
            root_0 = (CommonTree)adaptor.nil();

            final List<ASTNode> children = new ArrayList<ASTNode>();
            pushFollow(FOLLOW_parameter_in_parameterList488);
            child1=parameter();

            state._fsp--;

            adaptor.addChild(root_0, child1.getTree());
            children.add(child1.root);
            // Dart.g:60:50: ( ',' child2= parameter )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Dart.g:60:51: ',' child2= parameter
            	    {
            	    char_literal9=(Token)match(input,27,FOLLOW_27_in_parameterList493); 
            	    char_literal9_tree = (CommonTree)adaptor.create(char_literal9);
            	    adaptor.addChild(root_0, char_literal9_tree);

            	    pushFollow(FOLLOW_parameter_in_parameterList497);
            	    child2=parameter();

            	    state._fsp--;

            	    adaptor.addChild(root_0, child2.getTree());
            	    children.add(child2.root);

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            retval.root = new ParameterListNode(children);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameterList"

    public static class varDeclaration_return extends ParserRuleReturnScope {
        public VarDeclarationNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclaration"
    // Dart.g:63:1: varDeclaration returns [VarDeclarationNode root] : type ID varInit ;
    public final DartParser.varDeclaration_return varDeclaration() throws RecognitionException {
        DartParser.varDeclaration_return retval = new DartParser.varDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID11=null;
        DartParser.type_return type10 = null;

        DartParser.varInit_return varInit12 = null;


        CommonTree ID11_tree=null;

        try {
            // Dart.g:64:2: ( type ID varInit )
            // Dart.g:64:4: type ID varInit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_type_in_varDeclaration524);
            type10=type();

            state._fsp--;

            adaptor.addChild(root_0, type10.getTree());
            ID11=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration526); 
            ID11_tree = (CommonTree)adaptor.create(ID11);
            adaptor.addChild(root_0, ID11_tree);

            pushFollow(FOLLOW_varInit_in_varDeclaration528);
            varInit12=varInit();

            state._fsp--;

            adaptor.addChild(root_0, varInit12.getTree());
            retval.root = new VarDeclarationNode((ID11!=null?ID11.getText():null), (type10!=null?type10.root:null), (varInit12!=null?varInit12.root:null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDeclaration"

    public static class varInit_return extends ParserRuleReturnScope {
        public VarInitNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // Dart.g:66:1: varInit returns [VarInitNode root] : '=' expression ;
    public final DartParser.varInit_return varInit() throws RecognitionException {
        DartParser.varInit_return retval = new DartParser.varInit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal13=null;
        DartParser.expression_return expression14 = null;


        CommonTree char_literal13_tree=null;

        try {
            // Dart.g:67:2: ( '=' expression )
            // Dart.g:67:4: '=' expression
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal13=(Token)match(input,28,FOLLOW_28_in_varInit544); 
            char_literal13_tree = (CommonTree)adaptor.create(char_literal13);
            adaptor.addChild(root_0, char_literal13_tree);

            pushFollow(FOLLOW_expression_in_varInit546);
            expression14=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression14.getTree());
            new VarInitNode((expression14!=null?expression14.root:null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varInit"

    public static class block_return extends ParserRuleReturnScope {
        public StatementsNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // Dart.g:70:1: block returns [StatementsNode root] : '{' (child= stataemet )* '}' ;
    public final DartParser.block_return block() throws RecognitionException {
        DartParser.block_return retval = new DartParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal15=null;
        Token char_literal16=null;
        DartParser.stataemet_return child = null;


        CommonTree char_literal15_tree=null;
        CommonTree char_literal16_tree=null;

        try {
            // Dart.g:71:2: ( '{' (child= stataemet )* '}' )
            // Dart.g:71:4: '{' (child= stataemet )* '}'
            {
            root_0 = (CommonTree)adaptor.nil();

            final List<ASTNode> children = new ArrayList<ASTNode>();
            char_literal15=(Token)match(input,29,FOLLOW_29_in_block564); 
            char_literal15_tree = (CommonTree)adaptor.create(char_literal15);
            adaptor.addChild(root_0, char_literal15_tree);

            // Dart.g:72:4: (child= stataemet )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Dart.g:72:5: child= stataemet
            	    {
            	    pushFollow(FOLLOW_stataemet_in_block572);
            	    child=stataemet();

            	    state._fsp--;

            	    adaptor.addChild(root_0, child.getTree());
            	    children.add(child.root);

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            char_literal16=(Token)match(input,30,FOLLOW_30_in_block581); 
            char_literal16_tree = (CommonTree)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);

            retval.root = new StatementsNode(children);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class stataemet_return extends ParserRuleReturnScope {
        public ASTNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stataemet"
    // Dart.g:75:1: stataemet returns [ASTNode root] : ( varDeclaration ';' | functionDeclaration );
    public final DartParser.stataemet_return stataemet() throws RecognitionException {
        DartParser.stataemet_return retval = new DartParser.stataemet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal18=null;
        DartParser.varDeclaration_return varDeclaration17 = null;

        DartParser.functionDeclaration_return functionDeclaration19 = null;


        CommonTree char_literal18_tree=null;

        try {
            // Dart.g:76:2: ( varDeclaration ';' | functionDeclaration )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==25) ) {
                    alt5=2;
                }
                else if ( (LA5_1==ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==25) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==28) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Dart.g:76:4: varDeclaration ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_stataemet596);
                    varDeclaration17=varDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, varDeclaration17.getTree());
                    char_literal18=(Token)match(input,31,FOLLOW_31_in_stataemet598); 
                    char_literal18_tree = (CommonTree)adaptor.create(char_literal18);
                    adaptor.addChild(root_0, char_literal18_tree);

                    retval.root = (varDeclaration17!=null?varDeclaration17.root:null);

                    }
                    break;
                case 2 :
                    // Dart.g:77:4: functionDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_functionDeclaration_in_stataemet605);
                    functionDeclaration19=functionDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, functionDeclaration19.getTree());
                    retval.root = (functionDeclaration19!=null?functionDeclaration19.root:null);

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stataemet"

    public static class value_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // Dart.g:80:1: value returns [ExpressionNode root] : ( INT | callExpression | ID | STRING );
    public final DartParser.value_return value() throws RecognitionException {
        DartParser.value_return retval = new DartParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT20=null;
        Token ID22=null;
        Token STRING23=null;
        DartParser.callExpression_return callExpression21 = null;


        CommonTree INT20_tree=null;
        CommonTree ID22_tree=null;
        CommonTree STRING23_tree=null;

        try {
            // Dart.g:81:2: ( INT | callExpression | ID | STRING )
            int alt6=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt6=1;
                }
                break;
            case ID:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==25) ) {
                    alt6=2;
                }
                else if ( ((LA6_2>=26 && LA6_2<=27)||(LA6_2>=31 && LA6_2<=48)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRING:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // Dart.g:81:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT20=(Token)match(input,INT,FOLLOW_INT_in_value622); 
                    INT20_tree = (CommonTree)adaptor.create(INT20);
                    adaptor.addChild(root_0, INT20_tree);

                    retval.root = new IntegerValueNode(Integer.parseInt((INT20!=null?INT20.getText():null)));

                    }
                    break;
                case 2 :
                    // Dart.g:82:4: callExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_callExpression_in_value629);
                    callExpression21=callExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, callExpression21.getTree());
                    retval.root = (callExpression21!=null?callExpression21.root:null);

                    }
                    break;
                case 3 :
                    // Dart.g:83:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ID22=(Token)match(input,ID,FOLLOW_ID_in_value636); 
                    ID22_tree = (CommonTree)adaptor.create(ID22);
                    adaptor.addChild(root_0, ID22_tree);

                    retval.root = new IdentifierNode((ID22!=null?ID22.getText():null));

                    }
                    break;
                case 4 :
                    // Dart.g:84:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING23=(Token)match(input,STRING,FOLLOW_STRING_in_value643); 
                    STRING23_tree = (CommonTree)adaptor.create(STRING23);
                    adaptor.addChild(root_0, STRING23_tree);

                    retval.root = new StringValueNode((STRING23!=null?STRING23.getText():null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class callExpression_return extends ParserRuleReturnScope {
        public CallExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callExpression"
    // Dart.g:87:1: callExpression returns [CallExpressionNode root] : ID '(' child1= expression ( ',' child2= expression )* ')' ;
    public final DartParser.callExpression_return callExpression() throws RecognitionException {
        DartParser.callExpression_return retval = new DartParser.callExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        DartParser.expression_return child1 = null;

        DartParser.expression_return child2 = null;


        CommonTree ID24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal27_tree=null;

        try {
            // Dart.g:88:5: ( ID '(' child1= expression ( ',' child2= expression )* ')' )
            // Dart.g:88:7: ID '(' child1= expression ( ',' child2= expression )* ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            ID24=(Token)match(input,ID,FOLLOW_ID_in_callExpression663); 
            ID24_tree = (CommonTree)adaptor.create(ID24);
            adaptor.addChild(root_0, ID24_tree);

            char_literal25=(Token)match(input,25,FOLLOW_25_in_callExpression665); 
            char_literal25_tree = (CommonTree)adaptor.create(char_literal25);
            adaptor.addChild(root_0, char_literal25_tree);

            final List<ExpressionNode> children = new ArrayList<ExpressionNode>();
            pushFollow(FOLLOW_expression_in_callExpression683);
            child1=expression();

            state._fsp--;

            adaptor.addChild(root_0, child1.getTree());
            children.add((child1!=null?child1.root:null));
            // Dart.g:91:7: ( ',' child2= expression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Dart.g:91:8: ',' child2= expression
            	    {
            	    char_literal26=(Token)match(input,27,FOLLOW_27_in_callExpression694); 
            	    char_literal26_tree = (CommonTree)adaptor.create(char_literal26);
            	    adaptor.addChild(root_0, char_literal26_tree);

            	    pushFollow(FOLLOW_expression_in_callExpression698);
            	    child2=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, child2.getTree());
            	    children.add((child2!=null?child2.root:null));

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal27=(Token)match(input,26,FOLLOW_26_in_callExpression710); 
            char_literal27_tree = (CommonTree)adaptor.create(char_literal27);
            adaptor.addChild(root_0, char_literal27_tree);

            retval.root = new CallExpressionNode((ID24!=null?ID24.getText():null), children);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "callExpression"

    public static class expression_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // Dart.g:95:1: expression returns [ExpressionNode root] : logicalOrExpression ;
    public final DartParser.expression_return expression() throws RecognitionException {
        DartParser.expression_return retval = new DartParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.logicalOrExpression_return logicalOrExpression28 = null;



        try {
            // Dart.g:96:2: ( logicalOrExpression )
            // Dart.g:96:4: logicalOrExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_expression732);
            logicalOrExpression28=logicalOrExpression();

            state._fsp--;

            adaptor.addChild(root_0, logicalOrExpression28.getTree());
            retval.root = (logicalOrExpression28!=null?logicalOrExpression28.root:null);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class logicalOrExpression_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalOrExpression"
    // Dart.g:99:1: logicalOrExpression returns [ExpressionNode root] : logicalAndExpression ( '||' expression )? ;
    public final DartParser.logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        DartParser.logicalOrExpression_return retval = new DartParser.logicalOrExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal30=null;
        DartParser.logicalAndExpression_return logicalAndExpression29 = null;

        DartParser.expression_return expression31 = null;


        CommonTree string_literal30_tree=null;

        try {
            // Dart.g:100:5: ( logicalAndExpression ( '||' expression )? )
            // Dart.g:100:7: logicalAndExpression ( '||' expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression752);
            logicalAndExpression29=logicalAndExpression();

            state._fsp--;

            adaptor.addChild(root_0, logicalAndExpression29.getTree());
            retval.root = (logicalAndExpression29!=null?logicalAndExpression29.root:null);
            // Dart.g:101:7: ( '||' expression )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Dart.g:101:8: '||' expression
                    {
                    string_literal30=(Token)match(input,32,FOLLOW_32_in_logicalOrExpression763); 
                    string_literal30_tree = (CommonTree)adaptor.create(string_literal30);
                    adaptor.addChild(root_0, string_literal30_tree);

                    pushFollow(FOLLOW_expression_in_logicalOrExpression765);
                    expression31=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression31.getTree());
                    retval.root = new LogicalOrExpression((logicalAndExpression29!=null?logicalAndExpression29.root:null), (expression31!=null?expression31.root:null));

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalOrExpression"

    public static class logicalAndExpression_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalAndExpression"
    // Dart.g:104:1: logicalAndExpression returns [ExpressionNode root] : bitwiseOrExpression ( '&&' expression )? ;
    public final DartParser.logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        DartParser.logicalAndExpression_return retval = new DartParser.logicalAndExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal33=null;
        DartParser.bitwiseOrExpression_return bitwiseOrExpression32 = null;

        DartParser.expression_return expression34 = null;


        CommonTree string_literal33_tree=null;

        try {
            // Dart.g:105:5: ( bitwiseOrExpression ( '&&' expression )? )
            // Dart.g:105:7: bitwiseOrExpression ( '&&' expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseOrExpression_in_logicalAndExpression790);
            bitwiseOrExpression32=bitwiseOrExpression();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseOrExpression32.getTree());
            retval.root = (bitwiseOrExpression32!=null?bitwiseOrExpression32.root:null);
            // Dart.g:106:7: ( '&&' expression )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Dart.g:106:8: '&&' expression
                    {
                    string_literal33=(Token)match(input,33,FOLLOW_33_in_logicalAndExpression801); 
                    string_literal33_tree = (CommonTree)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);

                    pushFollow(FOLLOW_expression_in_logicalAndExpression803);
                    expression34=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression34.getTree());
                    retval.root = new LogicalAndExpression((bitwiseOrExpression32!=null?bitwiseOrExpression32.root:null), (expression34!=null?expression34.root:null));

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalAndExpression"

    public static class bitwiseOrExpression_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseOrExpression"
    // Dart.g:109:1: bitwiseOrExpression returns [ExpressionNode root] : bitwiseXorExpression ( '|' expression )? ;
    public final DartParser.bitwiseOrExpression_return bitwiseOrExpression() throws RecognitionException {
        DartParser.bitwiseOrExpression_return retval = new DartParser.bitwiseOrExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal36=null;
        DartParser.bitwiseXorExpression_return bitwiseXorExpression35 = null;

        DartParser.expression_return expression37 = null;


        CommonTree char_literal36_tree=null;

        try {
            // Dart.g:110:5: ( bitwiseXorExpression ( '|' expression )? )
            // Dart.g:110:7: bitwiseXorExpression ( '|' expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression828);
            bitwiseXorExpression35=bitwiseXorExpression();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseXorExpression35.getTree());
            retval.root = (bitwiseXorExpression35!=null?bitwiseXorExpression35.root:null);
            // Dart.g:111:7: ( '|' expression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Dart.g:111:8: '|' expression
                    {
                    char_literal36=(Token)match(input,34,FOLLOW_34_in_bitwiseOrExpression839); 
                    char_literal36_tree = (CommonTree)adaptor.create(char_literal36);
                    adaptor.addChild(root_0, char_literal36_tree);

                    pushFollow(FOLLOW_expression_in_bitwiseOrExpression841);
                    expression37=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression37.getTree());
                    retval.root = new BitwiseOrExpression((bitwiseXorExpression35!=null?bitwiseXorExpression35.root:null), (expression37!=null?expression37.root:null));

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseOrExpression"

    public static class bitwiseXorExpression_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseXorExpression"
    // Dart.g:114:1: bitwiseXorExpression returns [ExpressionNode root] : bitwiseAndExpression ( '^' expression )? ;
    public final DartParser.bitwiseXorExpression_return bitwiseXorExpression() throws RecognitionException {
        DartParser.bitwiseXorExpression_return retval = new DartParser.bitwiseXorExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal39=null;
        DartParser.bitwiseAndExpression_return bitwiseAndExpression38 = null;

        DartParser.expression_return expression40 = null;


        CommonTree char_literal39_tree=null;

        try {
            // Dart.g:115:5: ( bitwiseAndExpression ( '^' expression )? )
            // Dart.g:115:7: bitwiseAndExpression ( '^' expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression866);
            bitwiseAndExpression38=bitwiseAndExpression();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseAndExpression38.getTree());
            retval.root = (bitwiseAndExpression38!=null?bitwiseAndExpression38.root:null);
            // Dart.g:116:7: ( '^' expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Dart.g:116:8: '^' expression
                    {
                    char_literal39=(Token)match(input,35,FOLLOW_35_in_bitwiseXorExpression877); 
                    char_literal39_tree = (CommonTree)adaptor.create(char_literal39);
                    adaptor.addChild(root_0, char_literal39_tree);

                    pushFollow(FOLLOW_expression_in_bitwiseXorExpression879);
                    expression40=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression40.getTree());
                    retval.root = new BitwiseXorExpression((bitwiseAndExpression38!=null?bitwiseAndExpression38.root:null), (expression40!=null?expression40.root:null));

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseXorExpression"

    public static class bitwiseAndExpression_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseAndExpression"
    // Dart.g:119:1: bitwiseAndExpression returns [ExpressionNode root] : equalityExpression ( '&' expression )? ;
    public final DartParser.bitwiseAndExpression_return bitwiseAndExpression() throws RecognitionException {
        DartParser.bitwiseAndExpression_return retval = new DartParser.bitwiseAndExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal42=null;
        DartParser.equalityExpression_return equalityExpression41 = null;

        DartParser.expression_return expression43 = null;


        CommonTree char_literal42_tree=null;

        try {
            // Dart.g:120:5: ( equalityExpression ( '&' expression )? )
            // Dart.g:120:7: equalityExpression ( '&' expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseAndExpression904);
            equalityExpression41=equalityExpression();

            state._fsp--;

            adaptor.addChild(root_0, equalityExpression41.getTree());
            retval.root = (equalityExpression41!=null?equalityExpression41.root:null);
            // Dart.g:121:7: ( '&' expression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Dart.g:121:8: '&' expression
                    {
                    char_literal42=(Token)match(input,36,FOLLOW_36_in_bitwiseAndExpression915); 
                    char_literal42_tree = (CommonTree)adaptor.create(char_literal42);
                    adaptor.addChild(root_0, char_literal42_tree);

                    pushFollow(FOLLOW_expression_in_bitwiseAndExpression917);
                    expression43=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression43.getTree());
                    retval.root = new BitwiseAndExpression((equalityExpression41!=null?equalityExpression41.root:null), (expression43!=null?expression43.root:null));

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseAndExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // Dart.g:124:1: equalityExpression returns [ExpressionNode root] : shiftExpression ( equalityOperator expression )? ;
    public final DartParser.equalityExpression_return equalityExpression() throws RecognitionException {
        DartParser.equalityExpression_return retval = new DartParser.equalityExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.shiftExpression_return shiftExpression44 = null;

        DartParser.equalityOperator_return equalityOperator45 = null;

        DartParser.expression_return expression46 = null;



        try {
            // Dart.g:125:5: ( shiftExpression ( equalityOperator expression )? )
            // Dart.g:125:7: shiftExpression ( equalityOperator expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_equalityExpression942);
            shiftExpression44=shiftExpression();

            state._fsp--;

            adaptor.addChild(root_0, shiftExpression44.getTree());
            retval.root = (shiftExpression44!=null?shiftExpression44.root:null);
            // Dart.g:126:7: ( equalityOperator expression )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=45 && LA13_0<=48)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Dart.g:126:8: equalityOperator expression
                    {
                    pushFollow(FOLLOW_equalityOperator_in_equalityExpression953);
                    equalityOperator45=equalityOperator();

                    state._fsp--;

                    adaptor.addChild(root_0, equalityOperator45.getTree());
                    pushFollow(FOLLOW_expression_in_equalityExpression955);
                    expression46=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression46.getTree());
                    retval.root = new EqualityExpression((shiftExpression44!=null?shiftExpression44.root:null), (expression46!=null?expression46.root:null));

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class shiftExpression_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpression"
    // Dart.g:129:1: shiftExpression returns [ExpressionNode root] : additiveExpression ( shiftOperator expression )? ;
    public final DartParser.shiftExpression_return shiftExpression() throws RecognitionException {
        DartParser.shiftExpression_return retval = new DartParser.shiftExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.additiveExpression_return additiveExpression47 = null;

        DartParser.shiftOperator_return shiftOperator48 = null;

        DartParser.expression_return expression49 = null;



        try {
            // Dart.g:130:5: ( additiveExpression ( shiftOperator expression )? )
            // Dart.g:130:7: additiveExpression ( shiftOperator expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression980);
            additiveExpression47=additiveExpression();

            state._fsp--;

            adaptor.addChild(root_0, additiveExpression47.getTree());
            retval.root = (additiveExpression47!=null?additiveExpression47.root:null);
            // Dart.g:131:7: ( shiftOperator expression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            else if ( (LA14_0==44) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Dart.g:131:8: shiftOperator expression
                    {
                    pushFollow(FOLLOW_shiftOperator_in_shiftExpression991);
                    shiftOperator48=shiftOperator();

                    state._fsp--;

                    adaptor.addChild(root_0, shiftOperator48.getTree());
                    pushFollow(FOLLOW_expression_in_shiftExpression993);
                    expression49=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression49.getTree());
                    retval.root = new ShiftExpression((additiveExpression47!=null?additiveExpression47.root:null), (expression49!=null?expression49.root:null));

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "shiftExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // Dart.g:134:1: additiveExpression returns [ExpressionNode root] : multiplicativeExpression ( additiveOperator expression )? ;
    public final DartParser.additiveExpression_return additiveExpression() throws RecognitionException {
        DartParser.additiveExpression_return retval = new DartParser.additiveExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.multiplicativeExpression_return multiplicativeExpression50 = null;

        DartParser.additiveOperator_return additiveOperator51 = null;

        DartParser.expression_return expression52 = null;



        try {
            // Dart.g:135:5: ( multiplicativeExpression ( additiveOperator expression )? )
            // Dart.g:135:7: multiplicativeExpression ( additiveOperator expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1018);
            multiplicativeExpression50=multiplicativeExpression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicativeExpression50.getTree());
            retval.root = (multiplicativeExpression50!=null?multiplicativeExpression50.root:null);
            // Dart.g:136:7: ( additiveOperator expression )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=37 && LA15_0<=38)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Dart.g:136:8: additiveOperator expression
                    {
                    pushFollow(FOLLOW_additiveOperator_in_additiveExpression1029);
                    additiveOperator51=additiveOperator();

                    state._fsp--;

                    adaptor.addChild(root_0, additiveOperator51.getTree());
                    pushFollow(FOLLOW_expression_in_additiveExpression1031);
                    expression52=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression52.getTree());
                    retval.root = new AdditiveExpression((multiplicativeExpression50!=null?multiplicativeExpression50.root:null), (expression52!=null?expression52.root:null));

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // Dart.g:139:1: multiplicativeExpression returns [ExpressionNode root] : value ( multiplicativeOperator expression )? ;
    public final DartParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        DartParser.multiplicativeExpression_return retval = new DartParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.value_return value53 = null;

        DartParser.multiplicativeOperator_return multiplicativeOperator54 = null;

        DartParser.expression_return expression55 = null;



        try {
            // Dart.g:140:5: ( value ( multiplicativeOperator expression )? )
            // Dart.g:140:7: value ( multiplicativeOperator expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_value_in_multiplicativeExpression1056);
            value53=value();

            state._fsp--;

            adaptor.addChild(root_0, value53.getTree());
            retval.root = (value53!=null?value53.root:null);
            // Dart.g:141:7: ( multiplicativeOperator expression )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=39 && LA16_0<=42)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Dart.g:141:8: multiplicativeOperator expression
                    {
                    pushFollow(FOLLOW_multiplicativeOperator_in_multiplicativeExpression1067);
                    multiplicativeOperator54=multiplicativeOperator();

                    state._fsp--;

                    adaptor.addChild(root_0, multiplicativeOperator54.getTree());
                    pushFollow(FOLLOW_expression_in_multiplicativeExpression1069);
                    expression55=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression55.getTree());
                    retval.root = new MultiplicativeExpression((value53!=null?value53.root:null), (expression55!=null?expression55.root:null));

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class additiveOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveOperator"
    // Dart.g:144:1: additiveOperator : ( '+' | '-' );
    public final DartParser.additiveOperator_return additiveOperator() throws RecognitionException {
        DartParser.additiveOperator_return retval = new DartParser.additiveOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set56=null;

        CommonTree set56_tree=null;

        try {
            // Dart.g:145:5: ( '+' | '-' )
            // Dart.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set56=(Token)input.LT(1);
            if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set56));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveOperator"

    public static class multiplicativeOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeOperator"
    // Dart.g:149:1: multiplicativeOperator : ( '*' | '/' | '%' | '~/' );
    public final DartParser.multiplicativeOperator_return multiplicativeOperator() throws RecognitionException {
        DartParser.multiplicativeOperator_return retval = new DartParser.multiplicativeOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set57=null;

        CommonTree set57_tree=null;

        try {
            // Dart.g:150:5: ( '*' | '/' | '%' | '~/' )
            // Dart.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set57=(Token)input.LT(1);
            if ( (input.LA(1)>=39 && input.LA(1)<=42) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set57));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeOperator"

    public static class shiftOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftOperator"
    // Dart.g:156:1: shiftOperator : ( '<<' | '>' '>' '>' {...}? | '>' '>' {...}?);
    public final DartParser.shiftOperator_return shiftOperator() throws RecognitionException {
        DartParser.shiftOperator_return retval = new DartParser.shiftOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        Token char_literal59=null;
        Token char_literal60=null;
        Token char_literal61=null;
        Token char_literal62=null;
        Token char_literal63=null;

        CommonTree string_literal58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree char_literal62_tree=null;
        CommonTree char_literal63_tree=null;

        try {
            // Dart.g:157:5: ( '<<' | '>' '>' '>' {...}? | '>' '>' {...}?)
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            else if ( (LA17_0==44) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==44) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==44) ) {
                        alt17=2;
                    }
                    else if ( ((LA17_3>=INT && LA17_3<=STRING)) ) {
                        alt17=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // Dart.g:157:7: '<<'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal58=(Token)match(input,43,FOLLOW_43_in_shiftOperator1156); 
                    string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
                    adaptor.addChild(root_0, string_literal58_tree);


                    }
                    break;
                case 2 :
                    // Dart.g:158:7: '>' '>' '>' {...}?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal59=(Token)match(input,44,FOLLOW_44_in_shiftOperator1164); 
                    char_literal59_tree = (CommonTree)adaptor.create(char_literal59);
                    adaptor.addChild(root_0, char_literal59_tree);

                    char_literal60=(Token)match(input,44,FOLLOW_44_in_shiftOperator1166); 
                    char_literal60_tree = (CommonTree)adaptor.create(char_literal60);
                    adaptor.addChild(root_0, char_literal60_tree);

                    char_literal61=(Token)match(input,44,FOLLOW_44_in_shiftOperator1168); 
                    char_literal61_tree = (CommonTree)adaptor.create(char_literal61);
                    adaptor.addChild(root_0, char_literal61_tree);

                    if ( !(( ">>>".equals(input.toString(retval.start,input.LT(-1))) )) ) {
                        throw new FailedPredicateException(input, "shiftOperator", " \">>>\".equals($text) ");
                    }

                    }
                    break;
                case 3 :
                    // Dart.g:159:7: '>' '>' {...}?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal62=(Token)match(input,44,FOLLOW_44_in_shiftOperator1178); 
                    char_literal62_tree = (CommonTree)adaptor.create(char_literal62);
                    adaptor.addChild(root_0, char_literal62_tree);

                    char_literal63=(Token)match(input,44,FOLLOW_44_in_shiftOperator1180); 
                    char_literal63_tree = (CommonTree)adaptor.create(char_literal63);
                    adaptor.addChild(root_0, char_literal63_tree);

                    if ( !(( ">>".equals(input.toString(retval.start,input.LT(-1))) )) ) {
                        throw new FailedPredicateException(input, "shiftOperator", " \">>\".equals($text) ");
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "shiftOperator"

    public static class equalityOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityOperator"
    // Dart.g:162:1: equalityOperator : ( '==' | '!=' | '===' | '!==' );
    public final DartParser.equalityOperator_return equalityOperator() throws RecognitionException {
        DartParser.equalityOperator_return retval = new DartParser.equalityOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set64=null;

        CommonTree set64_tree=null;

        try {
            // Dart.g:163:5: ( '==' | '!=' | '===' | '!==' )
            // Dart.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set64=(Token)input.LT(1);
            if ( (input.LA(1)>=45 && input.LA(1)<=48) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set64));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_stataemet_in_topLevel397 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_type_in_functionDeclaration419 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration422 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_functionDeclaration424 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_parameterList_in_functionDeclaration426 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_functionDeclaration428 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_block_in_functionDeclaration430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter461 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_parameter465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameterList488 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_parameterList493 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_parameter_in_parameterList497 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration524 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration526 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclaration528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_varInit544 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_varInit546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_block564 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_stataemet_in_block572 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_30_in_block581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_stataemet596 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_stataemet598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_stataemet605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_value629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callExpression663 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_callExpression665 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_callExpression683 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_callExpression694 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_callExpression698 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_callExpression710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_expression732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression752 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_logicalOrExpression763 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_logicalOrExpression765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseOrExpression_in_logicalAndExpression790 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_logicalAndExpression801 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_logicalAndExpression803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression828 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_bitwiseOrExpression839 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_bitwiseOrExpression841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression866 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_bitwiseXorExpression877 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_bitwiseXorExpression879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseAndExpression904 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_bitwiseAndExpression915 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_bitwiseAndExpression917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_equalityExpression942 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_equalityOperator_in_equalityExpression953 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_equalityExpression955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression980 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_shiftOperator_in_shiftExpression991 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_shiftExpression993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1018 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_additiveOperator_in_additiveExpression1029 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_additiveExpression1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_multiplicativeExpression1056 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_multiplicativeOperator_in_multiplicativeExpression1067 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_multiplicativeExpression1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_additiveOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_shiftOperator1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_shiftOperator1164 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_shiftOperator1166 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_shiftOperator1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_shiftOperator1178 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_shiftOperator1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_equalityOperator0 = new BitSet(new long[]{0x0000000000000002L});

}