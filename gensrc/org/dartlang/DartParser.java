// $ANTLR 3.2 Sep 23, 2009 12:02:23 Dart.g 2012-05-08 00:40:49

  package org.dartlang;

  import org.dartlang.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class DartParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREAK", "CONST", "CONTINUE", "DEFAULT", "DO", "ELSE", "FALSE", "FINAL", "FOR", "IF", "IN", "NULL", "RETURN", "TRUE", "VAR", "VOID", "WHILE", "INT", "ID", "STRING", "'('", "')'", "','", "'='", "'{'", "'}'"
    };
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
    // Dart.g:42:1: topLevel returns [ASTNode root] : (child= stataemet )* ;
    public final DartParser.topLevel_return topLevel() throws RecognitionException {
        DartParser.topLevel_return retval = new DartParser.topLevel_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.stataemet_return child = null;



        try {
            // Dart.g:43:2: ( (child= stataemet )* )
            // Dart.g:43:4: (child= stataemet )*
            {
            root_0 = (CommonTree)adaptor.nil();

            final List<ASTNode> children = new ArrayList<ASTNode>();
            // Dart.g:44:4: (child= stataemet )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CONST||LA1_0==FINAL||LA1_0==VAR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Dart.g:44:5: child= stataemet
            	    {
            	    pushFollow(FOLLOW_stataemet_in_topLevel367);
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
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDeclaration"
    // Dart.g:47:1: functionDeclaration : ( type )? ID '(' parameterList ')' block ;
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
            // Dart.g:48:2: ( ( type )? ID '(' parameterList ')' block )
            // Dart.g:48:4: ( type )? ID '(' parameterList ')' block
            {
            root_0 = (CommonTree)adaptor.nil();

            // Dart.g:48:4: ( type )?
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
                    // Dart.g:48:4: type
                    {
                    pushFollow(FOLLOW_type_in_functionDeclaration385);
                    type1=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type1.getTree());

                    }
                    break;

            }

            ID2=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration388); 
            ID2_tree = (CommonTree)adaptor.create(ID2);
            adaptor.addChild(root_0, ID2_tree);

            char_literal3=(Token)match(input,24,FOLLOW_24_in_functionDeclaration390); 
            char_literal3_tree = (CommonTree)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);

            pushFollow(FOLLOW_parameterList_in_functionDeclaration392);
            parameterList4=parameterList();

            state._fsp--;

            adaptor.addChild(root_0, parameterList4.getTree());
            char_literal5=(Token)match(input,25,FOLLOW_25_in_functionDeclaration394); 
            char_literal5_tree = (CommonTree)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);

            pushFollow(FOLLOW_block_in_functionDeclaration396);
            block6=block();

            state._fsp--;

            adaptor.addChild(root_0, block6.getTree());

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

            ID7=(Token)match(input,ID,FOLLOW_ID_in_type409); 
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

            pushFollow(FOLLOW_type_in_parameter424);
            type8=type();

            state._fsp--;

            adaptor.addChild(root_0, type8.getTree());
            name=(Token)match(input,ID,FOLLOW_ID_in_parameter428); 
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
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterList"
    // Dart.g:56:1: parameterList : parameter ( ',' parameter )* ;
    public final DartParser.parameterList_return parameterList() throws RecognitionException {
        DartParser.parameterList_return retval = new DartParser.parameterList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal10=null;
        DartParser.parameter_return parameter9 = null;

        DartParser.parameter_return parameter11 = null;


        CommonTree char_literal10_tree=null;

        try {
            // Dart.g:57:2: ( parameter ( ',' parameter )* )
            // Dart.g:57:4: parameter ( ',' parameter )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_parameter_in_parameterList440);
            parameter9=parameter();

            state._fsp--;

            adaptor.addChild(root_0, parameter9.getTree());
            // Dart.g:57:14: ( ',' parameter )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Dart.g:57:15: ',' parameter
            	    {
            	    char_literal10=(Token)match(input,26,FOLLOW_26_in_parameterList443); 
            	    char_literal10_tree = (CommonTree)adaptor.create(char_literal10);
            	    adaptor.addChild(root_0, char_literal10_tree);

            	    pushFollow(FOLLOW_parameter_in_parameterList445);
            	    parameter11=parameter();

            	    state._fsp--;

            	    adaptor.addChild(root_0, parameter11.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "parameterList"

    public static class varDeclaration_return extends ParserRuleReturnScope {
        public VarDeclarationNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclaration"
    // Dart.g:59:1: varDeclaration returns [VarDeclarationNode root] : ( VAR | FINAL | CONST ) ID varInit ;
    public final DartParser.varDeclaration_return varDeclaration() throws RecognitionException {
        DartParser.varDeclaration_return retval = new DartParser.varDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;
        Token ID13=null;
        DartParser.varInit_return varInit14 = null;


        CommonTree set12_tree=null;
        CommonTree ID13_tree=null;

        try {
            // Dart.g:60:2: ( ( VAR | FINAL | CONST ) ID varInit )
            // Dart.g:60:4: ( VAR | FINAL | CONST ) ID varInit
            {
            root_0 = (CommonTree)adaptor.nil();

            set12=(Token)input.LT(1);
            if ( input.LA(1)==CONST||input.LA(1)==FINAL||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set12));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            ID13=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration477); 
            ID13_tree = (CommonTree)adaptor.create(ID13);
            adaptor.addChild(root_0, ID13_tree);

            pushFollow(FOLLOW_varInit_in_varDeclaration479);
            varInit14=varInit();

            state._fsp--;

            adaptor.addChild(root_0, varInit14.getTree());
            retval.root = new VarDeclarationNode((ID13!=null?ID13.getText():null), (varInit14!=null?varInit14.root:null));

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
    // Dart.g:62:1: varInit returns [VarInitNode root] : '=' expression ;
    public final DartParser.varInit_return varInit() throws RecognitionException {
        DartParser.varInit_return retval = new DartParser.varInit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal15=null;
        DartParser.expression_return expression16 = null;


        CommonTree char_literal15_tree=null;

        try {
            // Dart.g:63:2: ( '=' expression )
            // Dart.g:63:4: '=' expression
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal15=(Token)match(input,27,FOLLOW_27_in_varInit495); 
            char_literal15_tree = (CommonTree)adaptor.create(char_literal15);
            adaptor.addChild(root_0, char_literal15_tree);

            pushFollow(FOLLOW_expression_in_varInit497);
            expression16=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression16.getTree());
            new VarInitNode((expression16!=null?expression16.root:null));

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

    public static class expression_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // Dart.g:65:1: expression returns [ExpressionNode root] : value ;
    public final DartParser.expression_return expression() throws RecognitionException {
        DartParser.expression_return retval = new DartParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.value_return value17 = null;



        try {
            // Dart.g:66:2: ( value )
            // Dart.g:66:4: value
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_value_in_expression512);
            value17=value();

            state._fsp--;

            adaptor.addChild(root_0, value17.getTree());
            retval.root = (value17!=null?value17.root:null);

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

    public static class value_return extends ParserRuleReturnScope {
        public ExpressionNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // Dart.g:68:1: value returns [ExpressionNode root] : ( INT | ID | STRING );
    public final DartParser.value_return value() throws RecognitionException {
        DartParser.value_return retval = new DartParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT18=null;
        Token ID19=null;
        Token STRING20=null;

        CommonTree INT18_tree=null;
        CommonTree ID19_tree=null;
        CommonTree STRING20_tree=null;

        try {
            // Dart.g:69:2: ( INT | ID | STRING )
            int alt4=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                alt4=2;
                }
                break;
            case STRING:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // Dart.g:69:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT18=(Token)match(input,INT,FOLLOW_INT_in_value529); 
                    INT18_tree = (CommonTree)adaptor.create(INT18);
                    adaptor.addChild(root_0, INT18_tree);

                    retval.root = new IntegerValueNode(Integer.parseInt((INT18!=null?INT18.getText():null)));

                    }
                    break;
                case 2 :
                    // Dart.g:70:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ID19=(Token)match(input,ID,FOLLOW_ID_in_value536); 
                    ID19_tree = (CommonTree)adaptor.create(ID19);
                    adaptor.addChild(root_0, ID19_tree);

                    retval.root = new IdentifierNode((ID19!=null?ID19.getText():null));

                    }
                    break;
                case 3 :
                    // Dart.g:71:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING20=(Token)match(input,STRING,FOLLOW_STRING_in_value543); 
                    STRING20_tree = (CommonTree)adaptor.create(STRING20);
                    adaptor.addChild(root_0, STRING20_tree);

                    retval.root = new StringValueNode((STRING20!=null?STRING20.getText():null));

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

    public static class block_return extends ParserRuleReturnScope {
        public StatementsNode root;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // Dart.g:73:1: block returns [StatementsNode root] : '{' (child= stataemet )* '}' ;
    public final DartParser.block_return block() throws RecognitionException {
        DartParser.block_return retval = new DartParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal21=null;
        Token char_literal22=null;
        DartParser.stataemet_return child = null;


        CommonTree char_literal21_tree=null;
        CommonTree char_literal22_tree=null;

        try {
            // Dart.g:74:2: ( '{' (child= stataemet )* '}' )
            // Dart.g:74:4: '{' (child= stataemet )* '}'
            {
            root_0 = (CommonTree)adaptor.nil();

            final List<ASTNode> children = new ArrayList<ASTNode>();
            char_literal21=(Token)match(input,28,FOLLOW_28_in_block561); 
            char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
            adaptor.addChild(root_0, char_literal21_tree);

            // Dart.g:75:4: (child= stataemet )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CONST||LA5_0==FINAL||LA5_0==VAR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Dart.g:75:5: child= stataemet
            	    {
            	    pushFollow(FOLLOW_stataemet_in_block569);
            	    child=stataemet();

            	    state._fsp--;

            	    adaptor.addChild(root_0, child.getTree());
            	    children.add(child.root);

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            char_literal22=(Token)match(input,29,FOLLOW_29_in_block578); 
            char_literal22_tree = (CommonTree)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);

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
    // Dart.g:78:1: stataemet returns [ASTNode root] : varDeclaration ;
    public final DartParser.stataemet_return stataemet() throws RecognitionException {
        DartParser.stataemet_return retval = new DartParser.stataemet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DartParser.varDeclaration_return varDeclaration23 = null;



        try {
            // Dart.g:79:2: ( varDeclaration )
            // Dart.g:79:4: varDeclaration
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_varDeclaration_in_stataemet593);
            varDeclaration23=varDeclaration();

            state._fsp--;

            adaptor.addChild(root_0, varDeclaration23.getTree());
            retval.root = (varDeclaration23!=null?varDeclaration23.root:null)

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

    // Delegated rules


 

    public static final BitSet FOLLOW_stataemet_in_topLevel367 = new BitSet(new long[]{0x0000000000040822L});
    public static final BitSet FOLLOW_type_in_functionDeclaration385 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_functionDeclaration388 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_functionDeclaration390 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_parameterList_in_functionDeclaration392 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_functionDeclaration394 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_functionDeclaration396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter424 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_parameter428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameterList440 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_parameterList443 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_parameter_in_parameterList445 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_set_in_varDeclaration465 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration477 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclaration479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_varInit495 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_expression_in_varInit497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_expression512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_block561 = new BitSet(new long[]{0x0000000020040820L});
    public static final BitSet FOLLOW_stataemet_in_block569 = new BitSet(new long[]{0x0000000020040820L});
    public static final BitSet FOLLOW_29_in_block578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_stataemet593 = new BitSet(new long[]{0x0000000000000002L});

}