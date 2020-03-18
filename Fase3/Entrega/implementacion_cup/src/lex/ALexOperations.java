package lex;

import synt.LexicalClass;

public class ALexOperations {
	
	private TinyLexicalAnalyzer _lexa;
	
	public ALexOperations(TinyLexicalAnalyzer lexa) {
		this._lexa = lexa;
	}
	
	public LexicalUnit unitVar() {
		return new MultivaluatedLexicalUnit(_lexa.row(), LexicalClass.VAR, _lexa.lexeme());
	}
	
	public LexicalUnit unitNumInt() {
		return new MultivaluatedLexicalUnit(_lexa.row(), LexicalClass.INT, _lexa.lexeme());
	}
	
	public LexicalUnit unitNumReal() {
		return new MultivaluatedLexicalUnit(_lexa.row(), LexicalClass.REAL, _lexa.lexeme());
	}
	
	public LexicalUnit unitReal() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.REAL, "real");
	}
	
	public LexicalUnit unitInt() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.INT, "int");
	}
	
	public LexicalUnit unitBool() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.BOOL, "bool");
	}
	
	public LexicalUnit unitTrue() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.TRUE, "true");
	}
	
	public LexicalUnit unitFalse() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.FALSE, "false");
	}
	
	public LexicalUnit unitSC() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.SEMICOLON, ";");
	}
	
	public LexicalUnit unitEnd() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.END, "end");
	}
	
	public LexicalUnit unitEqual() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.EQUAL, "=");
	}
	
	public LexicalUnit unitPlus() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.PLUS, "+");
	}
	
	public LexicalUnit unitMinus() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.MINUS, "-");
	}
	
	public LexicalUnit unitMult() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.MULT, "*");
	}
	
	public LexicalUnit unitDiv() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.DIV, "/");
	}
	
	public LexicalUnit unitAnd() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.AND, "and");
	}
	
	public LexicalUnit unitOr() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.OR, "or");
	}
	
	public LexicalUnit unitNot() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.NOT, "not");
	}
	
	public LexicalUnit unitMayor() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.MAYOR, ">");
	}
	
	public LexicalUnit unitMinor() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.MINOR, "<");
	}
	
	public LexicalUnit unitMayorEqual() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.MAYOREQUAL, ">=");
	}
	
	public LexicalUnit unitMinorEqual() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.MINOREQUAL, "<=");
	}
	
	public LexicalUnit unitEquiv() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.EQUIV, "==");
	}
	
	public LexicalUnit unitDisequiv() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.DISEQUIV, "!=");
	}
	
	public LexicalUnit unitOpenPar() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.OPPAR, "(");
	}
	
	public LexicalUnit unitClosePar() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.CLPAR, ")");
	}
	
	public LexicalUnit unitEOF() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.EOF, "<EOF>");
	}
}
