package lex;

public class UnivaluatedLexicalUnit extends LexicalUnit {

	public UnivaluatedLexicalUnit(int row, int lexClass, String lexeme) {
		super(row, lexClass, lexeme);
	}

	@Override
	public String lexeme() {
		throw new UnsupportedOperationException("lexeme");
	}
	
	@Override
	public String toString() {
		return "[Class: " + lexClass() + ", row: " + row() + "]";
	}

}
