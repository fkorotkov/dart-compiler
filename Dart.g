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

topLevel returns [ASTNode root]
	: {final List<ASTNode> children = new ArrayList<ASTNode>();}
	  (child=stataemet {children.add(child.root);})*
	  {$root = new StatementsNode(children);};

functionDeclaration
	: type? ID '(' parameterList ')' block;

type returns [TypeNode root]
	: ID {$root = new TypeNode($text);};

parameter returns [ParameterNode root]
	: type name=ID {$root = new ParameterNode($type.root, $name.text);};
	
parameterList
	: parameter (',' parameter)*;
	    
varDeclaration returns [VarDeclarationNode root]
	: (VAR | FINAL | CONST) ID varInit {$root = new VarDeclarationNode($ID.text, $varInit.root);};
	
varInit returns [VarInitNode root]
	: '=' expression {new VarInitNode($expression.root);};

expression returns [ExpressionNode root]
	: value {$root = $value.root;};
		
value returns [ExpressionNode root]
	: INT {$root = new IntegerValueNode(Integer.parseInt($INT.text));}
	| ID {$root = new IdentifierNode($ID.text);}
	| STRING {$root = new StringValueNode($STRING.text);} ;

block returns [StatementsNode root]
	: {final List<ASTNode> children = new ArrayList<ASTNode>();} '{'
	  (child=stataemet {children.add(child.root);})*
	  '}' {$root = new StatementsNode(children);};

stataemet returns [ASTNode root]
	: varDeclaration {$root = $varDeclaration.root};