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
  VAR        = 'var';
  VOID       = 'void';
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
STRING : '\'' (options {greedy=false;} : .)* '\'' { setText(getText().substring(1, getText().length()-1)); };
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } ;

topLevel returns [ASTNode root]
	: {final List<ASTNode> children = new ArrayList<ASTNode>();}
	  (child=stataemet {children.add(child.root);})*
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
	  child1=parameter {children.add(child1.root);} (',' child2=parameter {children.add(child2.root);})*
	  {$root = new ParameterListNode(children);};
	    
varDeclaration returns [VarDeclarationNode root]
	: type ID varInit {$root = new VarDeclarationNode($ID.text, $type.root, $varInit.root);};
	
varInit returns [VarInitNode root]
	: '=' expression {new VarInitNode($expression.root);};


block returns [StatementsNode root]
	: {final List<ASTNode> children = new ArrayList<ASTNode>();} '{'
	  (child=stataemet {children.add(child.root);})*
	  '}' {$root = new StatementsNode(children);};

stataemet returns [ASTNode root]
	: varDeclaration ';' {$root = $varDeclaration.root;}
	| functionDeclaration {$root = $functionDeclaration.root;}
	;

value returns [ExpressionNode root]
	: INT {$root = new IntegerValueNode(Integer.parseInt($INT.text));}
	| callExpression {$root = $callExpression.root;}
	| ID {$root = new IdentifierNode($ID.text);}
	| STRING {$root = new StringValueNode($STRING.text);}
	;

callExpression returns [CallExpressionNode root]
    : ID '('
      {final List<ExpressionNode> children = new ArrayList<ExpressionNode>();}
      child1=expression {children.add($child1.root);}
      (',' child2=expression {children.add($child2.root);})*
      ')' {$root = new CallExpressionNode($ID.text, children);}
      ;

expression returns [ExpressionNode root]
	: logicalOrExpression {$root = $logicalOrExpression.root;}
	;

logicalOrExpression returns [ExpressionNode root]
    : logicalAndExpression {$root = $logicalAndExpression.root;}
      ('||' expression {$root = new LogicalOrExpression($logicalAndExpression.root, $expression.root);})?
    ;

logicalAndExpression returns [ExpressionNode root]
    : bitwiseOrExpression {$root = $bitwiseOrExpression.root;}
      ('&&' expression {$root = new LogicalAndExpression($bitwiseOrExpression.root, $expression.root);})?
    ;

bitwiseOrExpression returns [ExpressionNode root]
    : bitwiseXorExpression {$root = $bitwiseXorExpression.root;}
      ('|' expression {$root = new BitwiseOrExpression($bitwiseXorExpression.root, $expression.root);})?
    ;

bitwiseXorExpression returns [ExpressionNode root]
    : bitwiseAndExpression {$root = $bitwiseAndExpression.root;}
      ('^' expression {$root = new BitwiseXorExpression($bitwiseAndExpression.root, $expression.root);})?
    ;

bitwiseAndExpression returns [ExpressionNode root]
    : equalityExpression {$root = $equalityExpression.root;}
      ('&' expression {$root = new BitwiseAndExpression($equalityExpression.root, $expression.root);})?
    ;

equalityExpression returns [ExpressionNode root]
    : shiftExpression {$root = $shiftExpression.root;}
      (equalityOperator expression {$root = new EqualityExpression($shiftExpression.root, $expression.root);})?
    ;

shiftExpression returns [ExpressionNode root]
    : additiveExpression {$root = $additiveExpression.root;}
      (shiftOperator expression {$root = new ShiftExpression($additiveExpression.root, $expression.root);})?
    ;

additiveExpression returns [ExpressionNode root]
    : multiplicativeExpression {$root = $multiplicativeExpression.root;}
      (additiveOperator expression {$root = new AdditiveExpression($multiplicativeExpression.root, $expression.root);})?
    ;

multiplicativeExpression returns [ExpressionNode root]
    : value {$root = $value.root;}
      (multiplicativeOperator expression {$root = new MultiplicativeExpression($value.root, $expression.root);})?
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