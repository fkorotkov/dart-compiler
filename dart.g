grammar dart;

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
  INT 	     = '0'..'9'+;
  ID  	     = ('a'..'z'|'A'..'Z')+;
  STRING     = '\'' (options {greedy=false;} : .)* '\'' { setText(getText().substring(1, getText().length()-1)); };
}

topLevel
	: varDeclaration*;

functionDeclaration
	: type? ID '(' parameterList ')' block;

type
	: ID;

parameter
	: type ID;	
	
parameterList
	: parameter parameterListTail*;	

parameterListTail
	: ',' parameter;
	    
varDeclaration 
	: (VAR | FINAL | CONST) ID varInit;
	
varInit
	: '=' expression;

expression
	: value;
		
value 
	: INT | ID | STRING;
	
block
	: '{' stataemet* '}';
	
stataemet
	: varDeclaration;