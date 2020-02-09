package jaime;

public class ALexOperations {

	private TinyLexicalAnalyzer _alex;
	
	public ALexOperations(TinyLexicalAnalyzer alex) {
		this._alex = alex;
	}
	
	public LexicalUnit unitId() {
		return new MultivaluatedLexicalUnit(_alex.row(), LexicalClass.VAR, _alex.lexeme());
	}

	public LexicalUnit unitNumber() {
		return new MultivaluatedLexicalUnit(_alex.row(), LexicalClass.NUMBER, _alex.lexeme());
	}

	public LexicalUnit unitFalse() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.FALSE);	
	}

	public LexicalUnit unitBool() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.BOOL);	
	}

	public LexicalUnit unitAnd() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.AND);	
	}

	public LexicalUnit unitNot() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.NOT);
	}

	public LexicalUnit unitNum() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.NUM);
	}

	public LexicalUnit unitNonEquiv() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.NONEQUIV);
	}

	public LexicalUnit unitMayorEqual() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.MEQUAL);
	}

	public LexicalUnit unitMinorEqual() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.LEQUAL);
	}

	public LexicalUnit unitEquiv() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.EQUIV);
	}

	public LexicalUnit unitEnd() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.END);
	}

	public LexicalUnit unitOr() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.OR);
	}

	public LexicalUnit unitClosePar() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.OPPAR);
	}

	public LexicalUnit unitOpenPar() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.CLPAR);
	}

	public LexicalUnit unitMinor() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.MINOR);
	}

	public LexicalUnit unitDiv() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.DIV);
	}

	public LexicalUnit unitMayor() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.MAYOR);
	}

	public LexicalUnit unitMult() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.MULT);
	}

	public LexicalUnit unitPlus() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.PLUS);
	}

	public LexicalUnit unitEqual() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.EQUAL);
	}

	public LexicalUnit unitSC() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.SEMICOLON);
	}

	public LexicalUnit unitMinus() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.MINUS);
	}

	public LexicalUnit unitTrue() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.TRUE);
	}

	public LexicalUnit unidadEof() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.EOF);
	}
	
	public void error() {
		System.out.println("Error: Character at row "+_alex.row() + " unrecognizable (" + this._alex.lexeme() + ").");
		
	}
	
}
