package jaime;

public class MultivaluatedLexicalUnit extends LexicalUnit {

	public String _lexeme;
	
	public MultivaluatedLexicalUnit(int row, LexicalClass lexClass, String lexeme) {
		super(row, lexClass);
		this._lexeme = lexeme;
	}

	@Override
	public String lexeme() {
		return this._lexeme;
	}
	
	public String toString() {
		return "[Class: " + lexClass() + ", row: "+ row() + ",lexeme: " + lexeme() + "]"; 
	}

}
