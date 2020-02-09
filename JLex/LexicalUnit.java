package jaime;

public abstract class LexicalUnit {

	private LexicalClass _class;
	private int _row;
	
		/* CONSTRUCTOR */
	public LexicalUnit(int row, LexicalClass lexClass) {
		this._row = row;
		this._class = lexClass;
	}
	
		/* GETTERS */
	public LexicalClass lexClass() {
		return this._class;
	}
	
	public int row() {
		return this._row;
	}
	
	public abstract String lexeme() throws Exception;
	
	
	
}
