// $ANTLR 3.2 Sep 23, 2009 12:02:23 Dart.g 2012-05-14 00:03:08

  package org.dartlang;

  import org.dartlang.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class DartParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREAK", "CONST", "CONTINUE", "DEFAULT", "DO", "ELSE", "FALSE", "FINAL", "FOR", "IF", "IN", "NULL", "RETURN", "TRUE", "WHILE", "INT", "ID", "STRING", "WHITESPACE", "'('", "')'", "','", "';'", "'='", "'{'", "'}'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'+'", "'-'", "'*'", "'/'", "'%'", "'~/'", "'<<'", "'>'", "'=='", "'!='", "'==='", "'!=='"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int WHILE=18;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int CONST=5;
    public static final int DO=8;
    public static final int FOR=12;
    public static final int ID=20;
    public static final int EOF=-1;
    public static final int BREAK=4;
    public static final int IF=13;
    public static final int FINAL=11;
    public static final int IN=14;
    public static final int CONTINUE=6;
    public static final int RETURN=16;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int NULL=15;
    public static final int DEFAULT=7;
    public static final int ELSE=9;
    public static final int WHITESPACE=22;
    public static final int INT=19;
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
    public static final int STRING=21;

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
    // Dart.g:41:1: topLevel returns [ASTNode root] : (child= statement )* ;
    public final DartParser.topLevel_return topLevel() throws RecognitionException {
        DartParser.topLevel_return retval = new DartParser.topLevel_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.statement_return child = null;



        try {
            // Dart.g:42:2: ( (child= statement )* )
            // Dart.g:42:4: (child= statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            final List<ASTNode> children = new ArrayList<ASTNode>();
            // Dart.g:43:4: (child= statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RETURN||LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Dart.g:43:5: child= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_topLevel366);
            	    child=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, child.getTree());
            	    children.add((child!=null?child.root:null));

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
    // Dart.g:46:1: functionDeclaration returns [FunctionDeclarationNode root] : ( type )? ID '(' parameterList ')' block ;
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
            // Dart.g:47:2: ( ( type )? ID '(' parameterList ')' block )
            // Dart.g:47:4: ( type )? ID '(' parameterList ')' block
            {
            root_0 = (CommonTree)adaptor.nil();

            // Dart.g:47:4: ( type )?
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
                    // Dart.g:47:4: type
                    {
                    pushFollow(FOLLOW_type_in_functionDeclaration388);
                    type1=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type1.getTree());

                    }
                    break;

            }

            ID2=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration391); 
            ID2_tree = (CommonTree)adaptor.create(ID2);
            adaptor.addChild(root_0, ID2_tree);

            char_literal3=(Token)match(input,23,FOLLOW_23_in_functionDeclaration393); 
            char_literal3_tree = (CommonTree)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);

            pushFollow(FOLLOW_parameterList_in_functionDeclaration395);
            parameterList4=parameterList();

            state._fsp--;

            adaptor.addChild(root_0, parameterList4.getTree());
            char_literal5=(Token)match(input,24,FOLLOW_24_in_functionDeclaration397); 
            char_literal5_tree = (CommonTree)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);

            pushFollow(FOLLOW_block_in_functionDeclaration399);
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
    // Dart.g:50:1: type returns [TypeNode root] : ID ;
    public final DartParser.type_return type() throws RecognitionException {
        DartParser.type_return retval = new DartParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID7=null;

        CommonTree ID7_tree=null;

        try {
            // Dart.g:51:2: ( ID )
            // Dart.g:51:4: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            ID7=(Token)match(input,ID,FOLLOW_ID_in_type415); 
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
    // Dart.g:53:1: parameter returns [ParameterNode root] : type name= ID ;
    public final DartParser.parameter_return parameter() throws RecognitionException {
        DartParser.parameter_return retval = new DartParser.parameter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        DartParser.type_return type8 = null;


        CommonTree name_tree=null;

        try {
            // Dart.g:54:2: ( type name= ID )
            // Dart.g:54:4: type name= ID
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_type_in_parameter430);
            type8=type();

            state._fsp--;

            adaptor.addChild(root_0, type8.getTree());
            name=(Token)match(input,ID,FOLLOW_ID_in_parameter434); 
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
    // Dart.g:56:1: parameterList returns [ParameterListNode root] : (child1= parameter ( ',' child2= parameter )* )? ;
    public final DartParser.parameterList_return parameterList() throws RecognitionException {
        DartParser.parameterList_return retval = new DartParser.parameterList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal9=null;
        DartParser.parameter_return child1 = null;

        DartParser.parameter_return child2 = null;


        CommonTree char_literal9_tree=null;

        try {
            // Dart.g:57:2: ( (child1= parameter ( ',' child2= parameter )* )? )
            // Dart.g:57:4: (child1= parameter ( ',' child2= parameter )* )?
            {
            root_0 = (CommonTree)adaptor.nil();

            final List<ASTNode> children = new ArrayList<ASTNode>();
            // Dart.g:58:4: (child1= parameter ( ',' child2= parameter )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Dart.g:59:11: child1= parameter ( ',' child2= parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameterList469);
                    child1=parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, child1.getTree());
                    children.add(child1.root);
                    // Dart.g:59:57: ( ',' child2= parameter )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==25) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Dart.g:59:58: ',' child2= parameter
                    	    {
                    	    char_literal9=(Token)match(input,25,FOLLOW_25_in_parameterList474); 
                    	    char_literal9_tree = (CommonTree)adaptor.create(char_literal9);
                    	    adaptor.addChild(root_0, char_literal9_tree);

                    	    pushFollow(FOLLOW_parameter_in_parameterList478);
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


                    }
                    break;

            }

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

            pushFollow(FOLLOW_type_in_varDeclaration511);
            type10=type();

            state._fsp--;

            adaptor.addChild(root_0, type10.getTree());
            ID11=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration513); 
            ID11_tree = (CommonTree)adaptor.create(ID11);
            adaptor.addChild(root_0, ID11_tree);

            pushFollow(FOLLOW_varInit_in_varDeclaration515);
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

    public static class returnStatement_return extends ParserRuleReturnScope {
        public ReturnStatementNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnStatement"
    // Dart.g:66:1: returnStatement returns [ReturnStatementNode root] : RETURN expression ';' ;
    public final DartParser.returnStatement_return returnStatement() throws RecognitionException {
        DartParser.returnStatement_return retval = new DartParser.returnStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RETURN13=null;
        Token char_literal15=null;
        DartParser.expression_return expression14 = null;


        CommonTree RETURN13_tree=null;
        CommonTree char_literal15_tree=null;

        try {
            // Dart.g:67:5: ( RETURN expression ';' )
            // Dart.g:67:7: RETURN expression ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            RETURN13=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnStatement533); 
            RETURN13_tree = (CommonTree)adaptor.create(RETURN13);
            adaptor.addChild(root_0, RETURN13_tree);

            pushFollow(FOLLOW_expression_in_returnStatement535);
            expression14=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression14.getTree());
            char_literal15=(Token)match(input,26,FOLLOW_26_in_returnStatement537); 
            char_literal15_tree = (CommonTree)adaptor.create(char_literal15);
            adaptor.addChild(root_0, char_literal15_tree);

            retval.root = new ReturnStatementNode((expression14!=null?expression14.root:null));

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
    // $ANTLR end "returnStatement"

    public static class varInit_return extends ParserRuleReturnScope {
        public VarInitNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // Dart.g:69:1: varInit returns [VarInitNode root] : '=' expression ;
    public final DartParser.varInit_return varInit() throws RecognitionException {
        DartParser.varInit_return retval = new DartParser.varInit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal16=null;
        DartParser.expression_return expression17 = null;


        CommonTree char_literal16_tree=null;

        try {
            // Dart.g:70:2: ( '=' expression )
            // Dart.g:70:4: '=' expression
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal16=(Token)match(input,27,FOLLOW_27_in_varInit552); 
            char_literal16_tree = (CommonTree)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);

            pushFollow(FOLLOW_expression_in_varInit554);
            expression17=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression17.getTree());
            retval.root = new VarInitNode((expression17!=null?expression17.root:null));

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
    // Dart.g:73:1: block returns [StatementsNode root] : '{' (child= statement )* '}' ;
    public final DartParser.block_return block() throws RecognitionException {
        DartParser.block_return retval = new DartParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal18=null;
        Token char_literal19=null;
        DartParser.statement_return child = null;


        CommonTree char_literal18_tree=null;
        CommonTree char_literal19_tree=null;

        try {
            // Dart.g:74:2: ( '{' (child= statement )* '}' )
            // Dart.g:74:4: '{' (child= statement )* '}'
            {
            root_0 = (CommonTree)adaptor.nil();

            final List<ASTNode> children = new ArrayList<ASTNode>();
            char_literal18=(Token)match(input,28,FOLLOW_28_in_block572); 
            char_literal18_tree = (CommonTree)adaptor.create(char_literal18);
            adaptor.addChild(root_0, char_literal18_tree);

            // Dart.g:75:4: (child= statement )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RETURN||LA5_0==ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Dart.g:75:5: child= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block580);
            	    child=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, child.getTree());
            	    children.add((child!=null?child.root:null));

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            char_literal19=(Token)match(input,29,FOLLOW_29_in_block589); 
            char_literal19_tree = (CommonTree)adaptor.create(char_literal19);
            adaptor.addChild(root_0, char_literal19_tree);

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

    public static class statement_return extends ParserRuleReturnScope {
        public ASTNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // Dart.g:78:1: statement returns [ASTNode root] : ( varDeclaration ';' | functionDeclaration | returnStatement );
    public final DartParser.statement_return statement() throws RecognitionException {
        DartParser.statement_return retval = new DartParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal21=null;
        DartParser.varDeclaration_return varDeclaration20 = null;

        DartParser.functionDeclaration_return functionDeclaration22 = null;

        DartParser.returnStatement_return returnStatement23 = null;


        CommonTree char_literal21_tree=null;

        try {
            // Dart.g:79:2: ( varDeclaration ';' | functionDeclaration | returnStatement )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==23) ) {
                    alt6=2;
                }
                else if ( (LA6_1==ID) ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==23) ) {
                        alt6=2;
                    }
                    else if ( (LA6_4==27) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RETURN) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // Dart.g:79:4: varDeclaration ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_statement604);
                    varDeclaration20=varDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, varDeclaration20.getTree());
                    char_literal21=(Token)match(input,26,FOLLOW_26_in_statement606); 
                    char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
                    adaptor.addChild(root_0, char_literal21_tree);

                    retval.root = (varDeclaration20!=null?varDeclaration20.root:null);

                    }
                    break;
                case 2 :
                    // Dart.g:80:4: functionDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_functionDeclaration_in_statement613);
                    functionDeclaration22=functionDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, functionDeclaration22.getTree());
                    retval.root = (functionDeclaration22!=null?functionDeclaration22.root:null);

                    }
                    break;
                case 3 :
                    // Dart.g:81:4: returnStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statement620);
                    returnStatement23=returnStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, returnStatement23.getTree());
                    retval.root = (returnStatement23!=null?returnStatement23.root:null);

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
    // $ANTLR end "statement"

    public static class value_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // Dart.g:84:1: value returns [ExpressionNode root] : ( INT | callExpression | ID | STRING | '(' expression ')' );
    public final DartParser.value_return value() throws RecognitionException {
        DartParser.value_return retval = new DartParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT24=null;
        Token ID26=null;
        Token STRING27=null;
        Token char_literal28=null;
        Token char_literal30=null;
        DartParser.callExpression_return callExpression25 = null;

        DartParser.expression_return expression29 = null;


        CommonTree INT24_tree=null;
        CommonTree ID26_tree=null;
        CommonTree STRING27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal30_tree=null;

        try {
            // Dart.g:85:2: ( INT | callExpression | ID | STRING | '(' expression ')' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt7=1;
                }
                break;
            case ID:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==23) ) {
                    alt7=2;
                }
                else if ( ((LA7_2>=24 && LA7_2<=26)||(LA7_2>=30 && LA7_2<=46)) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRING:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // Dart.g:85:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT24=(Token)match(input,INT,FOLLOW_INT_in_value637); 
                    INT24_tree = (CommonTree)adaptor.create(INT24);
                    adaptor.addChild(root_0, INT24_tree);

                    retval.root = new IntegerValueNode(Integer.parseInt((INT24!=null?INT24.getText():null)));

                    }
                    break;
                case 2 :
                    // Dart.g:86:4: callExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_callExpression_in_value644);
                    callExpression25=callExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, callExpression25.getTree());
                    retval.root = (callExpression25!=null?callExpression25.root:null);

                    }
                    break;
                case 3 :
                    // Dart.g:87:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ID26=(Token)match(input,ID,FOLLOW_ID_in_value651); 
                    ID26_tree = (CommonTree)adaptor.create(ID26);
                    adaptor.addChild(root_0, ID26_tree);

                    retval.root = new IdentifierNode((ID26!=null?ID26.getText():null));

                    }
                    break;
                case 4 :
                    // Dart.g:88:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING27=(Token)match(input,STRING,FOLLOW_STRING_in_value658); 
                    STRING27_tree = (CommonTree)adaptor.create(STRING27);
                    adaptor.addChild(root_0, STRING27_tree);

                    retval.root = new StringValueNode((STRING27!=null?STRING27.getText():null));

                    }
                    break;
                case 5 :
                    // Dart.g:89:4: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal28=(Token)match(input,23,FOLLOW_23_in_value665); 
                    char_literal28_tree = (CommonTree)adaptor.create(char_literal28);
                    adaptor.addChild(root_0, char_literal28_tree);

                    pushFollow(FOLLOW_expression_in_value667);
                    expression29=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression29.getTree());
                    char_literal30=(Token)match(input,24,FOLLOW_24_in_value669); 
                    char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
                    adaptor.addChild(root_0, char_literal30_tree);

                    retval.root = (expression29!=null?expression29.root:null);

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
    // Dart.g:92:1: callExpression returns [CallExpressionNode root] : ID '(' (child1= expression ( ',' child2= expression )* ')' )? ')' ;
    public final DartParser.callExpression_return callExpression() throws RecognitionException {
        DartParser.callExpression_return retval = new DartParser.callExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID31=null;
        Token char_literal32=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token char_literal35=null;
        DartParser.expression_return child1 = null;

        DartParser.expression_return child2 = null;


        CommonTree ID31_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal35_tree=null;

        try {
            // Dart.g:93:5: ( ID '(' (child1= expression ( ',' child2= expression )* ')' )? ')' )
            // Dart.g:93:7: ID '(' (child1= expression ( ',' child2= expression )* ')' )? ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            ID31=(Token)match(input,ID,FOLLOW_ID_in_callExpression689); 
            ID31_tree = (CommonTree)adaptor.create(ID31);
            adaptor.addChild(root_0, ID31_tree);

            char_literal32=(Token)match(input,23,FOLLOW_23_in_callExpression691); 
            char_literal32_tree = (CommonTree)adaptor.create(char_literal32);
            adaptor.addChild(root_0, char_literal32_tree);

            final List<ExpressionNode> children = new ArrayList<ExpressionNode>();
            // Dart.g:95:7: (child1= expression ( ',' child2= expression )* ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=INT && LA9_0<=STRING)||LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Dart.g:96:11: child1= expression ( ',' child2= expression )* ')'
                    {
                    pushFollow(FOLLOW_expression_in_callExpression721);
                    child1=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, child1.getTree());
                    children.add((child1!=null?child1.root:null));
                    // Dart.g:97:11: ( ',' child2= expression )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==25) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Dart.g:97:12: ',' child2= expression
                    	    {
                    	    char_literal33=(Token)match(input,25,FOLLOW_25_in_callExpression736); 
                    	    char_literal33_tree = (CommonTree)adaptor.create(char_literal33);
                    	    adaptor.addChild(root_0, char_literal33_tree);

                    	    pushFollow(FOLLOW_expression_in_callExpression740);
                    	    child2=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, child2.getTree());
                    	    children.add((child2!=null?child2.root:null));

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    char_literal34=(Token)match(input,24,FOLLOW_24_in_callExpression756); 
                    char_literal34_tree = (CommonTree)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);


                    }
                    break;

            }

            char_literal35=(Token)match(input,24,FOLLOW_24_in_callExpression773); 
            char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
            adaptor.addChild(root_0, char_literal35_tree);

            retval.root = new CallExpressionNode((ID31!=null?ID31.getText():null), children);

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
    // Dart.g:103:1: expression returns [ExpressionNode root] : logicalOrExpression ;
    public final DartParser.expression_return expression() throws RecognitionException {
        DartParser.expression_return retval = new DartParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.logicalOrExpression_return logicalOrExpression36 = null;



        try {
            // Dart.g:104:2: ( logicalOrExpression )
            // Dart.g:104:4: logicalOrExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_expression795);
            logicalOrExpression36=logicalOrExpression();

            state._fsp--;

            adaptor.addChild(root_0, logicalOrExpression36.getTree());
            retval.root = (logicalOrExpression36!=null?logicalOrExpression36.root:null);

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
    // Dart.g:107:1: logicalOrExpression returns [ExpressionNode root] : expression1= logicalAndExpression ( '||' expression2= logicalAndExpression )* ;
    public final DartParser.logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        DartParser.logicalOrExpression_return retval = new DartParser.logicalOrExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal37=null;
        DartParser.logicalAndExpression_return expression1 = null;

        DartParser.logicalAndExpression_return expression2 = null;


        CommonTree string_literal37_tree=null;

        try {
            // Dart.g:108:5: (expression1= logicalAndExpression ( '||' expression2= logicalAndExpression )* )
            // Dart.g:108:7: expression1= logicalAndExpression ( '||' expression2= logicalAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression817);
            expression1=logicalAndExpression();

            state._fsp--;

            adaptor.addChild(root_0, expression1.getTree());
            retval.root = (expression1!=null?expression1.root:null);
            // Dart.g:109:7: ( '||' expression2= logicalAndExpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Dart.g:109:8: '||' expression2= logicalAndExpression
            	    {
            	    string_literal37=(Token)match(input,30,FOLLOW_30_in_logicalOrExpression828); 
            	    string_literal37_tree = (CommonTree)adaptor.create(string_literal37);
            	    adaptor.addChild(root_0, string_literal37_tree);

            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression832);
            	    expression2=logicalAndExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression2.getTree());
            	    retval.root = new LogicalOrExpression(retval.root, (expression2!=null?expression2.root:null));

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // Dart.g:112:1: logicalAndExpression returns [ExpressionNode root] : expression1= bitwiseOrExpression ( '&&' expression2= bitwiseOrExpression )* ;
    public final DartParser.logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        DartParser.logicalAndExpression_return retval = new DartParser.logicalAndExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal38=null;
        DartParser.bitwiseOrExpression_return expression1 = null;

        DartParser.bitwiseOrExpression_return expression2 = null;


        CommonTree string_literal38_tree=null;

        try {
            // Dart.g:113:5: (expression1= bitwiseOrExpression ( '&&' expression2= bitwiseOrExpression )* )
            // Dart.g:113:7: expression1= bitwiseOrExpression ( '&&' expression2= bitwiseOrExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseOrExpression_in_logicalAndExpression859);
            expression1=bitwiseOrExpression();

            state._fsp--;

            adaptor.addChild(root_0, expression1.getTree());
            retval.root = (expression1!=null?expression1.root:null);
            // Dart.g:114:7: ( '&&' expression2= bitwiseOrExpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Dart.g:114:8: '&&' expression2= bitwiseOrExpression
            	    {
            	    string_literal38=(Token)match(input,31,FOLLOW_31_in_logicalAndExpression870); 
            	    string_literal38_tree = (CommonTree)adaptor.create(string_literal38);
            	    adaptor.addChild(root_0, string_literal38_tree);

            	    pushFollow(FOLLOW_bitwiseOrExpression_in_logicalAndExpression874);
            	    expression2=bitwiseOrExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression2.getTree());
            	    retval.root = new LogicalAndExpression(retval.root, (expression2!=null?expression2.root:null));

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // Dart.g:117:1: bitwiseOrExpression returns [ExpressionNode root] : expression1= bitwiseXorExpression ( '|' expression2= bitwiseXorExpression )* ;
    public final DartParser.bitwiseOrExpression_return bitwiseOrExpression() throws RecognitionException {
        DartParser.bitwiseOrExpression_return retval = new DartParser.bitwiseOrExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal39=null;
        DartParser.bitwiseXorExpression_return expression1 = null;

        DartParser.bitwiseXorExpression_return expression2 = null;


        CommonTree char_literal39_tree=null;

        try {
            // Dart.g:118:5: (expression1= bitwiseXorExpression ( '|' expression2= bitwiseXorExpression )* )
            // Dart.g:118:7: expression1= bitwiseXorExpression ( '|' expression2= bitwiseXorExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression901);
            expression1=bitwiseXorExpression();

            state._fsp--;

            adaptor.addChild(root_0, expression1.getTree());
            retval.root = (expression1!=null?expression1.root:null);
            // Dart.g:119:7: ( '|' expression2= bitwiseXorExpression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Dart.g:119:8: '|' expression2= bitwiseXorExpression
            	    {
            	    char_literal39=(Token)match(input,32,FOLLOW_32_in_bitwiseOrExpression912); 
            	    char_literal39_tree = (CommonTree)adaptor.create(char_literal39);
            	    adaptor.addChild(root_0, char_literal39_tree);

            	    pushFollow(FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression916);
            	    expression2=bitwiseXorExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression2.getTree());
            	    retval.root = new BitwiseOrExpression(retval.root, (expression2!=null?expression2.root:null));

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // Dart.g:122:1: bitwiseXorExpression returns [ExpressionNode root] : expression1= bitwiseAndExpression ( '^' expression2= bitwiseAndExpression )* ;
    public final DartParser.bitwiseXorExpression_return bitwiseXorExpression() throws RecognitionException {
        DartParser.bitwiseXorExpression_return retval = new DartParser.bitwiseXorExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal40=null;
        DartParser.bitwiseAndExpression_return expression1 = null;

        DartParser.bitwiseAndExpression_return expression2 = null;


        CommonTree char_literal40_tree=null;

        try {
            // Dart.g:123:5: (expression1= bitwiseAndExpression ( '^' expression2= bitwiseAndExpression )* )
            // Dart.g:123:7: expression1= bitwiseAndExpression ( '^' expression2= bitwiseAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression943);
            expression1=bitwiseAndExpression();

            state._fsp--;

            adaptor.addChild(root_0, expression1.getTree());
            retval.root = (expression1!=null?expression1.root:null);
            // Dart.g:124:7: ( '^' expression2= bitwiseAndExpression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Dart.g:124:8: '^' expression2= bitwiseAndExpression
            	    {
            	    char_literal40=(Token)match(input,33,FOLLOW_33_in_bitwiseXorExpression954); 
            	    char_literal40_tree = (CommonTree)adaptor.create(char_literal40);
            	    adaptor.addChild(root_0, char_literal40_tree);

            	    pushFollow(FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression958);
            	    expression2=bitwiseAndExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression2.getTree());
            	    retval.root = new BitwiseXorExpression(retval.root, (expression2!=null?expression2.root:null));

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // Dart.g:127:1: bitwiseAndExpression returns [ExpressionNode root] : expression1= equalityExpression ( '&' expression2= equalityExpression )* ;
    public final DartParser.bitwiseAndExpression_return bitwiseAndExpression() throws RecognitionException {
        DartParser.bitwiseAndExpression_return retval = new DartParser.bitwiseAndExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal41=null;
        DartParser.equalityExpression_return expression1 = null;

        DartParser.equalityExpression_return expression2 = null;


        CommonTree char_literal41_tree=null;

        try {
            // Dart.g:128:5: (expression1= equalityExpression ( '&' expression2= equalityExpression )* )
            // Dart.g:128:7: expression1= equalityExpression ( '&' expression2= equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseAndExpression985);
            expression1=equalityExpression();

            state._fsp--;

            adaptor.addChild(root_0, expression1.getTree());
            retval.root = (expression1!=null?expression1.root:null);
            // Dart.g:129:7: ( '&' expression2= equalityExpression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Dart.g:129:8: '&' expression2= equalityExpression
            	    {
            	    char_literal41=(Token)match(input,34,FOLLOW_34_in_bitwiseAndExpression996); 
            	    char_literal41_tree = (CommonTree)adaptor.create(char_literal41);
            	    adaptor.addChild(root_0, char_literal41_tree);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseAndExpression1000);
            	    expression2=equalityExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression2.getTree());
            	    retval.root = new BitwiseAndExpression(retval.root, (expression2!=null?expression2.root:null));

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // Dart.g:132:1: equalityExpression returns [ExpressionNode root] : expression1= shiftExpression ( equalityOperator expression2= shiftExpression )* ;
    public final DartParser.equalityExpression_return equalityExpression() throws RecognitionException {
        DartParser.equalityExpression_return retval = new DartParser.equalityExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.shiftExpression_return expression1 = null;

        DartParser.shiftExpression_return expression2 = null;

        DartParser.equalityOperator_return equalityOperator42 = null;



        try {
            // Dart.g:133:5: (expression1= shiftExpression ( equalityOperator expression2= shiftExpression )* )
            // Dart.g:133:7: expression1= shiftExpression ( equalityOperator expression2= shiftExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_equalityExpression1027);
            expression1=shiftExpression();

            state._fsp--;

            adaptor.addChild(root_0, expression1.getTree());
            retval.root = (expression1!=null?expression1.root:null);
            // Dart.g:134:7: ( equalityOperator expression2= shiftExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=43 && LA15_0<=46)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Dart.g:134:8: equalityOperator expression2= shiftExpression
            	    {
            	    pushFollow(FOLLOW_equalityOperator_in_equalityExpression1038);
            	    equalityOperator42=equalityOperator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equalityOperator42.getTree());
            	    pushFollow(FOLLOW_shiftExpression_in_equalityExpression1042);
            	    expression2=shiftExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression2.getTree());
            	    retval.root = new EqualityExpression(retval.root, (expression2!=null?expression2.root:null));

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // Dart.g:137:1: shiftExpression returns [ExpressionNode root] : expression1= additiveExpression ( shiftOperator expression2= additiveExpression )* ;
    public final DartParser.shiftExpression_return shiftExpression() throws RecognitionException {
        DartParser.shiftExpression_return retval = new DartParser.shiftExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.additiveExpression_return expression1 = null;

        DartParser.additiveExpression_return expression2 = null;

        DartParser.shiftOperator_return shiftOperator43 = null;



        try {
            // Dart.g:138:5: (expression1= additiveExpression ( shiftOperator expression2= additiveExpression )* )
            // Dart.g:138:7: expression1= additiveExpression ( shiftOperator expression2= additiveExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression1069);
            expression1=additiveExpression();

            state._fsp--;

            adaptor.addChild(root_0, expression1.getTree());
            retval.root = (expression1!=null?expression1.root:null);
            // Dart.g:139:7: ( shiftOperator expression2= additiveExpression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=41 && LA16_0<=42)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Dart.g:139:8: shiftOperator expression2= additiveExpression
            	    {
            	    pushFollow(FOLLOW_shiftOperator_in_shiftExpression1080);
            	    shiftOperator43=shiftOperator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shiftOperator43.getTree());
            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression1084);
            	    expression2=additiveExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression2.getTree());
            	    retval.root = new ShiftExpression(retval.root, (expression2!=null?expression2.root:null));

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // Dart.g:142:1: additiveExpression returns [ExpressionNode root] : expression1= multiplicativeExpression ( additiveOperator expression2= multiplicativeExpression )* ;
    public final DartParser.additiveExpression_return additiveExpression() throws RecognitionException {
        DartParser.additiveExpression_return retval = new DartParser.additiveExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.multiplicativeExpression_return expression1 = null;

        DartParser.multiplicativeExpression_return expression2 = null;

        DartParser.additiveOperator_return additiveOperator44 = null;



        try {
            // Dart.g:143:5: (expression1= multiplicativeExpression ( additiveOperator expression2= multiplicativeExpression )* )
            // Dart.g:143:7: expression1= multiplicativeExpression ( additiveOperator expression2= multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1111);
            expression1=multiplicativeExpression();

            state._fsp--;

            adaptor.addChild(root_0, expression1.getTree());
            retval.root = (expression1!=null?expression1.root:null);
            // Dart.g:144:7: ( additiveOperator expression2= multiplicativeExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=35 && LA17_0<=36)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Dart.g:144:8: additiveOperator expression2= multiplicativeExpression
            	    {
            	    pushFollow(FOLLOW_additiveOperator_in_additiveExpression1122);
            	    additiveOperator44=additiveOperator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additiveOperator44.getTree());
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1126);
            	    expression2=multiplicativeExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression2.getTree());
            	    retval.root = new AdditiveExpression(retval.root, (expression2!=null?expression2.root:null));

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
    // Dart.g:147:1: multiplicativeExpression returns [ExpressionNode root] : value1= value ( multiplicativeOperator value2= value )* ;
    public final DartParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        DartParser.multiplicativeExpression_return retval = new DartParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.value_return value1 = null;

        DartParser.value_return value2 = null;

        DartParser.multiplicativeOperator_return multiplicativeOperator45 = null;



        try {
            // Dart.g:148:5: (value1= value ( multiplicativeOperator value2= value )* )
            // Dart.g:148:7: value1= value ( multiplicativeOperator value2= value )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_value_in_multiplicativeExpression1153);
            value1=value();

            state._fsp--;

            adaptor.addChild(root_0, value1.getTree());
            retval.root = (value1!=null?value1.root:null);
            // Dart.g:149:7: ( multiplicativeOperator value2= value )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=37 && LA18_0<=40)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Dart.g:149:8: multiplicativeOperator value2= value
            	    {
            	    pushFollow(FOLLOW_multiplicativeOperator_in_multiplicativeExpression1164);
            	    multiplicativeOperator45=multiplicativeOperator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicativeOperator45.getTree());
            	    pushFollow(FOLLOW_value_in_multiplicativeExpression1168);
            	    value2=value();

            	    state._fsp--;

            	    adaptor.addChild(root_0, value2.getTree());
            	    retval.root = new MultiplicativeExpression(retval.root, (value2!=null?value2.root:null));

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // Dart.g:152:1: additiveOperator : ( '+' | '-' );
    public final DartParser.additiveOperator_return additiveOperator() throws RecognitionException {
        DartParser.additiveOperator_return retval = new DartParser.additiveOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set46=null;

        CommonTree set46_tree=null;

        try {
            // Dart.g:153:5: ( '+' | '-' )
            // Dart.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set46=(Token)input.LT(1);
            if ( (input.LA(1)>=35 && input.LA(1)<=36) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set46));
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
    // Dart.g:157:1: multiplicativeOperator : ( '*' | '/' | '%' | '~/' );
    public final DartParser.multiplicativeOperator_return multiplicativeOperator() throws RecognitionException {
        DartParser.multiplicativeOperator_return retval = new DartParser.multiplicativeOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set47=null;

        CommonTree set47_tree=null;

        try {
            // Dart.g:158:5: ( '*' | '/' | '%' | '~/' )
            // Dart.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set47=(Token)input.LT(1);
            if ( (input.LA(1)>=37 && input.LA(1)<=40) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set47));
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
    // Dart.g:164:1: shiftOperator : ( '<<' | '>' '>' '>' {...}? | '>' '>' {...}?);
    public final DartParser.shiftOperator_return shiftOperator() throws RecognitionException {
        DartParser.shiftOperator_return retval = new DartParser.shiftOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal48=null;
        Token char_literal49=null;
        Token char_literal50=null;
        Token char_literal51=null;
        Token char_literal52=null;
        Token char_literal53=null;

        CommonTree string_literal48_tree=null;
        CommonTree char_literal49_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree char_literal52_tree=null;
        CommonTree char_literal53_tree=null;

        try {
            // Dart.g:165:5: ( '<<' | '>' '>' '>' {...}? | '>' '>' {...}?)
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            else if ( (LA19_0==42) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==42) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==42) ) {
                        alt19=2;
                    }
                    else if ( ((LA19_3>=INT && LA19_3<=STRING)||LA19_3==23) ) {
                        alt19=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // Dart.g:165:7: '<<'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal48=(Token)match(input,41,FOLLOW_41_in_shiftOperator1255); 
                    string_literal48_tree = (CommonTree)adaptor.create(string_literal48);
                    adaptor.addChild(root_0, string_literal48_tree);


                    }
                    break;
                case 2 :
                    // Dart.g:166:7: '>' '>' '>' {...}?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal49=(Token)match(input,42,FOLLOW_42_in_shiftOperator1263); 
                    char_literal49_tree = (CommonTree)adaptor.create(char_literal49);
                    adaptor.addChild(root_0, char_literal49_tree);

                    char_literal50=(Token)match(input,42,FOLLOW_42_in_shiftOperator1265); 
                    char_literal50_tree = (CommonTree)adaptor.create(char_literal50);
                    adaptor.addChild(root_0, char_literal50_tree);

                    char_literal51=(Token)match(input,42,FOLLOW_42_in_shiftOperator1267); 
                    char_literal51_tree = (CommonTree)adaptor.create(char_literal51);
                    adaptor.addChild(root_0, char_literal51_tree);

                    if ( !(( ">>>".equals(input.toString(retval.start,input.LT(-1))) )) ) {
                        throw new FailedPredicateException(input, "shiftOperator", " \">>>\".equals($text) ");
                    }

                    }
                    break;
                case 3 :
                    // Dart.g:167:7: '>' '>' {...}?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal52=(Token)match(input,42,FOLLOW_42_in_shiftOperator1277); 
                    char_literal52_tree = (CommonTree)adaptor.create(char_literal52);
                    adaptor.addChild(root_0, char_literal52_tree);

                    char_literal53=(Token)match(input,42,FOLLOW_42_in_shiftOperator1279); 
                    char_literal53_tree = (CommonTree)adaptor.create(char_literal53);
                    adaptor.addChild(root_0, char_literal53_tree);

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
    // Dart.g:170:1: equalityOperator : ( '==' | '!=' | '===' | '!==' );
    public final DartParser.equalityOperator_return equalityOperator() throws RecognitionException {
        DartParser.equalityOperator_return retval = new DartParser.equalityOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set54=null;

        CommonTree set54_tree=null;

        try {
            // Dart.g:171:5: ( '==' | '!=' | '===' | '!==' )
            // Dart.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set54=(Token)input.LT(1);
            if ( (input.LA(1)>=43 && input.LA(1)<=46) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set54));
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


 

    public static final BitSet FOLLOW_statement_in_topLevel366 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_type_in_functionDeclaration388 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration391 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_functionDeclaration393 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_parameterList_in_functionDeclaration395 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_functionDeclaration397 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_functionDeclaration399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter430 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_parameter434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameterList469 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_parameterList474 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parameter_in_parameterList478 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration511 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration513 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclaration515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement533 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_expression_in_returnStatement535 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_returnStatement537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_varInit552 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_expression_in_varInit554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_block572 = new BitSet(new long[]{0x0000000020110000L});
    public static final BitSet FOLLOW_statement_in_block580 = new BitSet(new long[]{0x0000000020110000L});
    public static final BitSet FOLLOW_29_in_block589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_statement604 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_statement613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statement620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_value644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_value665 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_expression_in_value667 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_value669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callExpression689 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_callExpression691 = new BitSet(new long[]{0x0000000001B80000L});
    public static final BitSet FOLLOW_expression_in_callExpression721 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_callExpression736 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_expression_in_callExpression740 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_callExpression756 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_callExpression773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_expression795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression817 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_logicalOrExpression828 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression832 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_bitwiseOrExpression_in_logicalAndExpression859 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_logicalAndExpression870 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_bitwiseOrExpression_in_logicalAndExpression874 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression901 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_bitwiseOrExpression912 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression916 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression943 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_bitwiseXorExpression954 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression958 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseAndExpression985 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_bitwiseAndExpression996 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseAndExpression1000 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_shiftExpression_in_equalityExpression1027 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_equalityOperator_in_equalityExpression1038 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_shiftExpression_in_equalityExpression1042 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1069 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_shiftOperator_in_shiftExpression1080 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1084 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1111 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_additiveOperator_in_additiveExpression1122 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1126 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_value_in_multiplicativeExpression1153 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_multiplicativeOperator_in_multiplicativeExpression1164 = new BitSet(new long[]{0x0000000000B80000L});
    public static final BitSet FOLLOW_value_in_multiplicativeExpression1168 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_set_in_additiveOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_multiplicativeOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_shiftOperator1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_shiftOperator1263 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_shiftOperator1265 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_shiftOperator1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_shiftOperator1277 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_shiftOperator1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_equalityOperator0 = new BitSet(new long[]{0x0000000000000002L});

}