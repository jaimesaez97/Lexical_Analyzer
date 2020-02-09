package jaime;

public class UnivaluatedLexicalUnit extends LexicalUnit {

	public UnivaluatedLexicalUnit(int row, LexicalClass lexClass) {
		super(row, lexClass);
	}

	public String lexeme() {
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return "[Class: " + lexClass() +", row: " + row() + "]";
	}

}
