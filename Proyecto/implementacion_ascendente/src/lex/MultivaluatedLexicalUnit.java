package lex;

public class MultivaluatedLexicalUnit extends LexicalUnit {

	private String _lexeme;
	
	public MultivaluatedLexicalUnit(int row, int lexClass, String lexeme) {
		super(row, lexClass, lexeme);
		this._lexeme = lexeme;
	}

	@Override
	public String lexeme() {
		return this._lexeme;
	}
	
	@Override
	public String toString() {
		return "[Class: " + lexClass() + ", row: " + row() + ", lexeme: " + this._lexeme + "]";
	}

}
