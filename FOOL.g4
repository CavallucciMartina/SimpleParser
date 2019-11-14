grammar FOOL;
@header {
	import ast.*;
}
// PARSER RULES
@lexer::members{
	int lexicalErrors;
}

prog returns [Node ast]: e=exp { $ast=new ProgNode($e.ast);} SEMIC EOF { System.out.println("Parsing finished!");};

exp returns [Node ast]: t=term {$ast = $t.ast;} (PLUS t2=term {$ast= new PlusNode($ast,$t2.ast);})*;
term returns [Node ast]: v=factor {$ast = $v.ast;} (TIMES v2=factor {$ast=new MultNode($ast,$v2.ast);})*;
factor returns [Node ast]: v=value {$ast =$v.ast;} (EQ v2=value {$ast = new EqualNode($ast,$v2.ast);})*;
value returns [Node ast] :
				n= INTEGER{$ast=new IntNode(Integer.parseInt($n.text));}
				|TRUE
					{$ast = new BoolNode(true);}
				|FALSE
					{$ast = new BoolNode(false);}
				| LPAR e=exp {$ast=$e.ast;} RPAR
				|IF x=exp THEN CLPAR y=exp CRPAR
					ELSE CLPAR z=exp CRPAR
					{$ast = new IfNode($x.ast,$y.ast,$z.ast);}
				| PRINT LPAR e=exp RPAR
					{$ast=new PrintNode($e.ast);};




// LEXER RULES
SEMIC :';';
PLUS: '+';
TIMES : '*';
EQ :'==';

TRUE :'true';
FALSE :'false';
PRINT :'print';

IF :'if';
THEN :'then';
ELSE :'else';
LPAR : '(';
RPAR : ')';
CLPAR: '{';
CRPAR :'}';
INTEGER:'0'| ('-')?('1'..'9')('0'..'9')*;

WHITESP: (' '| '\t'|'\n'|'\r')+ ->channel(HIDDEN);
COMMENT : '/*' .*?  '*/' -> channel(HIDDEN);
/*STELLA NON GREEDY, NON MANGIONA, NON MAXIMAL MATCH *? */
ERR: . {System.out.println("Invalid char"+getText());
	lexicalErrors++;
}->channel(HIDDEN); 
