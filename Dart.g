grammar Dart;

options {
    output=AST;
    ASTLabelType=CommonTree;
}

tokens {
  BREAK      = 'break';
  CONST      = 'const';
  CONTINUE   = 'continue';
  DEFAULT    = 'default';
  DO         = 'do';
  ELSE       = 'else';
  FALSE      = 'false';
  FINAL      = 'final';
  FOR        = 'for';
  IF         = 'if';
  IN         = 'in';
  NULL       = 'null';
  RETURN     = 'return';
  TRUE       = 'true';
  WHILE      = 'while';
}

@header {
  package org.dartlang;

  import org.dartlang.ast.*;
}

@lexer::header {
  package org.dartlang;
}

INT : '0'..'9'+;
ID : ('a'..'z'|'A'..'Z')+;
STRING : '\"' (options {greedy=false;} : .)* '\"' { setText(getText().substring(1, getText().length()-1)); };
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } ;

topLevel returns [ASTNode root]
	: {final List<ASTNode> children = new ArrayList<ASTNode>();}
	  (child=statement {children.add($child.root);})*
	  {$root = new StatementsNode(children);};

functionDeclaration returns [FunctionDeclarationNode root]
	: type? ID '(' parameterList ')' block
	{$root = new FunctionDeclarationNode($ID.text, $parameterList.root, $type.root, $block.root);};

type returns [TypeNode root]
	: ID {$root = new TypeNode($text);};

parameter returns [ParameterNode root]
	: type name=ID {$root = new ParameterNode($type.root, $name.text);};
	
parameterList returns [ParameterListNode root]
	: {final List<ASTNode> children = new ArrayList<ASTNode>();}
	  (
          child1=parameter {children.add(child1.root);} (',' child2=parameter {children.add(child2.root);})*
	  )?
	  {$root = new ParameterListNode(children);};
	    
varDeclaration returns [VarDeclarationNode root]
	: type ID varInit {$root = new VarDeclarationNode($ID.text, $type.root, $varInit.root);};

returnStatement returns [ReturnStatementNode root]
    : RETURN expression ';' {$root = new ReturnStatementNode($expression.root);};

varInit returns [VarInitNode root]
	: '=' expression {$root = new VarInitNode($expression.root);};


block returns [StatementsNode root]
	: {final List<ASTNode> children = new ArrayList<ASTNode>();} '{'
	  (child=statement {children.add($child.root);})*
	  '}' {$root = new StatementsNode(children);};

statement returns [ASTNode root]
	: varDeclaration ';' {$root = $varDeclaration.root;}
	| callExpression ';' {$root = $callExpression.root;}
	| functionDeclaration {$root = $functionDeclaration.root;}
	| returnStatement {$root = $returnStatement.root;}
	;

value returns [ExpressionNode root]
	: INT {$root = new IntegerValueNode(Integer.parseInt($INT.text));}
	| callExpression {$root = $callExpression.root;}
	| ID {$root = new IdentifierNode($ID.text);}
	| STRING {$root = new StringValueNode($STRING.text);}
	| '(' expression ')' {$root = $expression.root;}
	;

callExpression returns [CallExpressionNode root]
    : ID '('
      {final List<ExpressionNode> children = new ArrayList<ExpressionNode>();}
      (
          child1=expression {children.add($child1.root);}
          (',' child2=expression {children.add($child2.root);})*
      )?
      ')' {$root = new CallExpressionNode($ID.text, children);}
      ;

expression returns [ExpressionNode root]
	: logicalOrExpression {$root = $logicalOrExpression.root;}
	;

logicalOrExpression returns [ExpressionNode root]
    : expression1=logicalAndExpression {$root = $expression1.root;}
      ('||' expression2=logicalAndExpression {$root = new LogicalOrExpression($root, $expression2.root);})*
    ;

logicalAndExpression returns [ExpressionNode root]
    : expression1=bitwiseOrExpression {$root = $expression1.root;}
      ('&&' expression2=bitwiseOrExpression {$root = new LogicalAndExpression($root, $expression2.root);})*
    ;

bitwiseOrExpression returns [ExpressionNode root]
    : expression1=bitwiseXorExpression {$root = $expression1.root;}
      ('|' expression2=bitwiseXorExpression {$root = new BitwiseOrExpression($root, $expression2.root);})*
    ;

bitwiseXorExpression returns [ExpressionNode root]
    : expression1=bitwiseAndExpression {$root = $expression1.root;}
      ('^' expression2=bitwiseAndExpression {$root = new BitwiseXorExpression($root, $expression2.root);})*
    ;

bitwiseAndExpression returns [ExpressionNode root]
    : expression1=equalityExpression {$root = $expression1.root;}
      ('&' expression2=equalityExpression {$root = new BitwiseAndExpression($root, $expression2.root);})*
    ;

equalityExpression returns [ExpressionNode root]
    : expression1=shiftExpression {$root = $expression1.root;}
      (equalityOperator expression2=shiftExpression {$root = new EqualityExpression($root, $expression2.root);})*
    ;

shiftExpression returns [ExpressionNode root]
    : expression1=additiveExpression {$root = $expression1.root;}
      (shiftOperator expression2=additiveExpression {$root = new ShiftExpression($root, $expression2.root);})*
    ;

additiveExpression returns [ExpressionNode root]
    : expression1=multiplicativeExpression {$root = $expression1.root;}
      (additiveOperator expression2=multiplicativeExpression {$root = new AdditiveExpression($root, $expression2.root);})*
    ;

multiplicativeExpression returns [ExpressionNode root]
    : value1=value {$root = $value1.root;}
      (multiplicativeOperator value2=value {$root = new MultiplicativeExpression($root, $value2.root);})*
    ;

additiveOperator
    : '+'
    | '-'
    ;

multiplicativeOperator
    : '*'
    | '/'
    | '%'
    | '~/'
    ;

shiftOperator
    : '<<'
    | '>' '>' '>' { ">>>".equals($text) }?
    | '>' '>' { ">>".equals($text) }?
    ;

equalityOperator
    : '=='
    | '!='
    | '==='
    | '!=='
    ;