package asint;

import java_cup.runtime.*;
import lex.TinyLexicalAnalyzer;
import lex.LexicalUnit;
import err.TinyErrorMgmt;

scan with {: return getScanner().next_token(); :};
parser code {:
	private TinyErrorMgmt error;
	public void syntax_error(Symbol lexicalUnit){
		error.syntaxError((LexicalUnit)lexicalUnit);
	}
:};
init with {:
	error = new TinyErrorMgmt();
	TinyLexicalAnalyzer lex = (TinyLexicalAnalyzer)getScanner();
	lex.setErrorMgmt(error);
:};

terminal	INT, REAL, BOOL, IDEN, TRUE, FALSE, AND, OR,
		MAYOR, MINOR, MAYOREQUAL, MINOREQUAL, EQUAL,
		EQUIV, DISEQUIV, PLUS, MINUS, MULT, DIV, NOT,
		SEMICOLON, END, NUMREAL, NUMINT, OPPAR, CLPAR;

non terminal	S, Sd, D, DEC, T, Si, I, INS, E0, EE0, E1, EE1
		E2, EE2, E3, EE3, E4, E5, OP;

S	::= Sd END Si ;
Sd	::= D DEC ;
D	::= T IDEN ;
DEC	::= SEMICOLON D DEC | ;
T	::= INT | REAL | BOOL ;
Si	::= I INS ;
I	::= IDEN EQUAL E0 ;
INS	::= SEMICOLON I INS | ;
E0	::= E1 EE0 ;
EE0	::= PLUS E1 EE0 | MINUS E1 EE0 | ;
E1	::= E2 EE1 ;
EE1	::= AND E1 | OR E2 | ;
E2	::= E3 EE2
EE2	::= OP E3 | E3
E3	::= E4 EE3
EE3	::= MUL E4 E3 | DIV E4 E3 | \e
E4	::= MINUS E4 | NOT E5 | E5
E5	::= OPPAR E0 CLPAR | IDEN | REAL | INT | TRUE | FALSE
OP	::= MINOR | MAYOR | MINOREQUAL | MAYOREQUAL | EQUIV | DISEQUIV
