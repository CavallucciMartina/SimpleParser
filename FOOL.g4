grammar FOOL;

@header {
import ast.*;
import java.util.ArrayList;
import java.util.HashMap;
}

@lexer::members {
int lexicalErrors=0;
}
@parser::members {
private  int nestingLevel = 0;
private ArrayList<HashMap<String,STentry>> symbolTable= new ArrayList<HashMap<String,STentry>>();
/*livello con dichiarazioni più esterne è 0(invece che 1 come nelle slide)
 il fronte della lista di tabelle è symboltable.get(nestinglevel)*/
}



/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/


prog  returns [Node ast]
 : {
	 	HashMap<String,STentry> hm = new HashMap<String,STentry>();
	 	symbolTable.add(hm);
	 }
	 ( // due casi o exp opppure let in seguito da esp
            e=exp           { $ast = new ProgNode($e.ast);}             
          | LET d=declist IN e=exp {$ast = new ProgLetInNode($d.astlist, $e.ast);}
       ) 
       {symbolTable.remove(0);
       	//qui sono alla fine del programma, sono uscito da tutti e non da ambiente globale
       	//rimuovo l'unico e solo rimasto
       }
       SEMIC EOF
     ;

declist returns [ArrayList<Node> astlist]: 
				{
					$astlist = new ArrayList<Node>();
				}
			( // sequenza di una o più (+) dichiarazioni di variabili nella forma 
		//ID COLON(:) type(bool o int per ora) ASS(=) esp e poi ;
        (   VAR i=ID COLON t=type ASS e=exp // dichiarazioni variabili
        {$astlist.add(new VarNode($i.text,$t.ast,$e.ast));
        	//aggiungo dichiarazione alla symboltable
        	HashMap<String,STentry> hm = symbolTable.get(nestingLevel);
        	if(hm.put($i.text,new STentry(nestingLevel))!=null)
        	{
        		 System.out.println("Var id "+ $i.text + "at line"+ $i.line+ " already declared!");
        	}
        }
          | FUN i=ID COLON t=type 
          {
          	FunNode f = new FunNode($i.text, $t.ast);
          	$astlist.add(f);
          	//aggiungo dichiarazione a symbol table
          	HashMap<String,STentry> hm = symbolTable.get(nestingLevel);
        	if(hm.put($i.text,new STentry(nestingLevel))!=null){
        		System.out.println("Fun id "+ $i.text + "at line"+ $i.line+ " already declared!");
        	}
          	//entro in un nuovo scope
          	nestingLevel ++;
          	symbolTable.add(new	HashMap<String,STentry>());
          }
          LPAR //comma è un token che + la virgola
          //potrei non avee parametri, potrei averne solo uno,
          //potrei avere due parametri ma con virgola davanti al secondo
          //mi rocca ripetere codice
          //X CASA RIEMPIRE PARENTESI GRAFFE 
          (ID COLON type {
          	$astlist.add(new ParNode($i.text,$t.ast));
          	//mettere campo parlist dentro a funnode uguale a declist
          	//prevederemo come la dec un addPar che aggiunge dichiarazione parametro alla volta
        	//aggiungo dichiarazione alla symboltable
        	hm.put($i.text,new STentry(nestingLevel));
        	if(hm.put($i.text,new STentry(nestingLevel))!=null)
        	{
        		 System.out.println("FUn id "+ $i.text + "at line"+ $i.line+ " already declared!");
        	}
          	//posso usare fronte della lista hm
          	//Creo il parNOde
          	//lo attacco al FunNode INVOCANDO ADD PAR
          	//AGGIUNGO UN STENTRY ALLA HASHMAP HM
          	//Prendere spunto da dichiarazione variabile ma senza assegnamento
          }
          	(COMMA ID COLON type{
          		
          		//posso usare fronte della lista hm
          	//Creo il parNOde
          	//lo attacco al FunNode INVOCANDO ADD PAR
          	//AGGIUNGO UN STENTRY ALLA HASHMAP HM
          	})*)? 
          RPAR 
          (LET d=declist IN{f.addDec($d.astlist);})? e=exp 
          {
          	f.addBody($e.ast);
          	//esco dallo scope dela funzione
          	//quindi rimuobo il fronte
          	symbolTable.remove(nestingLevel--);
          }
          //dichiarazioni funzioni, al posto assegnamento ho parentesi e poi parametri
          // con parametri opzionali, dentro a funzione posso avere elenco di dichiarazioni ricorsive
            ) SEMIC 
          )+
        ;
type returns [Node ast]: 
	  INT     	{ $ast = new IntTypeNode();}	      
     | BOOL  	{ $ast = new BoolTypeNode();}	    	
 	 ;         

	 	 
exp	returns [Node ast]
 	: f=term {$ast= $f.ast;}
 	    (PLUS l=term
 	     {$ast= new PlusNode ($ast,$l.ast);}
 	    )*
 	;
 	
term	returns [Node ast]  
	: f=factor {$ast= $f.ast;}
	    (TIMES l=factor
	     {$ast= new TimesNode ($ast,$l.ast);}
	    )*
	;
	
factor	returns [Node ast]  //
	: f=value {$ast= $f.ast;}
	    (EQ l=value 
	     {$ast= new EqualNode ($ast,$l.ast);}
	    )*
 	;	 	
 	          	
value	returns [Node ast]
	: n=INTEGER   
	  {$ast= new IntNode(Integer.parseInt($n.text));}  
	| TRUE 
	  {$ast= new BoolNode(true);}  //
| FALSE
  {$ast= new BoolNode(false);}  //
| LPAR e=exp RPAR
  {$ast= $e.ast;}  
| IF x=exp THEN CLPAR y=exp CRPAR  //
	   ELSE CLPAR z=exp CRPAR 
  {$ast= new IfNode($x.ast,$y.ast,$z.ast);}	 
| PRINT LPAR e=exp RPAR	//
  {$ast= new PrintNode($e.ast);} 	
| i=ID // ci consente di mettere uso delle variabili
 {
 	//cerco la sua dichiarazione in symbol table
 	int j = nestingLevel; // ci aiuta a risalre
 	STentry entry = null ; // pallina albero di natale
 	while(j >= 0 && entry==null)
 		entry = (symbolTable.get(j--)).get($i.text);
 	if(entry ==null) {
 		 System.out.println("Id "+ $i.text + "at line"+ $i.line+ " is not  declared!");
 	}
 	$ast = new IdNode($i.text,entry);
 }
; 

	
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
SEMIC	: ';' ;
EQ	: '==' ;
PLUS	: '+' ;
TIMES	: '*' ;
INTEGER	: ('-')?(('1'..'9')('0'..'9')*) | '0';
TRUE	: 'true' ;
FALSE	: 'false' ;
LPAR 	: '(' ;
RPAR	: ')' ;
CLPAR 	: '{' ;
CRPAR	: '}' ;
IF 	: 'if' ;
THEN 	: 'then' ;
ELSE 	: 'else' ;
PRINT	: 'print' ; 
// aggiungo token
LET : 'let' ;
IN  : 'in' ;
VAR : 'var' ;
FUN : 'fun' ;
ID  : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* ;
INT : 'int' ;
BOOL  : 'bool' ;
COLON : ':' ;
COMMA : ',' ;
ASS : '=' ;

WHITESP : (' '|'\t'|'\n'|'\r')+ -> channel(HIDDEN) ;
COMMENT : '/*' (.)*? '*/' -> channel(HIDDEN) ;

ERR	    : . { System.out.println("Invalid char: "+ getText()); lexicalErrors++; } -> channel(HIDDEN); 
