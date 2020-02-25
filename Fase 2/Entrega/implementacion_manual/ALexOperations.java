public class ALexOperations {
	
	private TinyLexicalAnalyzer _lexa;
	
	public ALexOperations(TinyLexicalAnalyzer lexa) {
		this._lexa = lexa;
	}
	
	public LexicalUnit unitID() {
		return new MultivaluatedLexicalUnit(_lexa.row(), LexicalClass.VAR, _lexa.lexeme());
	}
	
	public LexicalUnit unitInteger() {
		return new MultivaluatedLexicalUnit(_lexa.row(), LexicalClass.INT, _lexa.lexeme());
	}
	
	public LexicalUnit unitNumReal() {
		return new MultivaluatedLexicalUnit(_lexa.row(), LexicalClass.REAL, _lexa.lexeme());
	}
	
	public LexicalUnit unitReal() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.REAL);
	}
	
	public LexicalUnit unitInt() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.INT);
	}
	
	public LexicalUnit unitBool() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.BOOL);
	}
	
	public LexicalUnit unitTrue() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.TRUE);
	}
	
	public LexicalUnit unitFalse() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.FALSE);
	}
	
	public LexicalUnit unitSC() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.SEMICOLON);
	}
	
	public LexicalUnit unitEnd() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.END);
	}
	
	public LexicalUnit unitEqual() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.EQUAL);
	}
	
	public LexicalUnit unitPlus() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.PLUS);
	}
	
	public LexicalUnit unitMinus() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.MINUS);
	}
	
	public LexicalUnit unitMult() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.MULT);
	}
	
	public LexicalUnit unitDiv() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.DIV);
	}
	
	public LexicalUnit unitAnd() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.AND);
	}
	
	public LexicalUnit unitOr() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.OR);
	}
	
	public LexicalUnit unitNot() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.NOT);
	}
	
	public LexicalUnit unitMayor() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.MAYOR);
	}
	
	public LexicalUnit unitMinor() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.MINOR);
	}
	
	public LexicalUnit unitMayorEqual() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.MEQUAL);
	}
	
	public LexicalUnit unitMinorEqual() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.LEQUAL);
	}
	
	public LexicalUnit unitEquiv() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.EQUIV);
	}
	
	public LexicalUnit unitNonEquiv() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.NONEQUIV);
	}
	
	public LexicalUnit unitOpenPar() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.OPPAR);
	}
	
	public LexicalUnit unitClosePar() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.CLPAR);
	}
	
	public LexicalUnit unitError() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.ERR);
	}
	
	public LexicalUnit unitEOF() {
		return new UnivaluatedLexicalUnit(_lexa.row(), LexicalClass.EOF);
	}
}
