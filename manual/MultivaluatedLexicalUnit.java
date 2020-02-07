package jaime;

public class MultivaluatedLexicalUnit extends LexicalUnit {
    
    private String _lexeme;
    
    public MultivaluatedLexicalUnit (int row, int col, LexicalClass lexClass, String lexeme){
        super(row, col, lexClass);
        this._lexeme = lexeme;
    }
    
    public String lexeme(){
        return this._lexeme;
    }
    
    public String toString(){
        return "[Class: " + this._lexClass + ", row: " + this._row + ", col: " + this._col + ", lexeme: " + this._lexeme + "]";
    }
}