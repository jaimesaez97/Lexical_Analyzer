package lex;
/*
SEMICOLON: ;
OPPAR: (
CLPAR: )
IDEN: 
*/
public enum LexicalClass{
	EOF, SEPARATOR, INT, REAL, BOOL, NUMINT, NUMREAL, VAR, TRUE,
	SEMICOLON, FALSE, EQUAL, PLUS, MINUS, MULT, DIV, OR, AND, NOT,
	MAYOR, MINOR, MAYOREQUAL, MINOREQUAL, EQUIV, DISEQUIV, OPPAR, 
	CLPAR, END, ERR

}