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
        return "[Class: " + lexClass() + ", row: " + row() + ", col: " + col() + ", lexeme: " + this._lexeme + "]";
    }
}