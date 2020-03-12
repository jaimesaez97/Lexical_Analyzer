package lex;
public class MultivaluatedLexicalUnit extends LexicalUnit {
    
    private String _lexeme;
    
    public MultivaluatedLexicalUnit (int row, LexicalClass lexClass, String lexeme){
        super(row, lexClass);
        this._lexeme = lexeme;
    }

	public String lexeme(){
        return this._lexeme;
    }
    
    public String toString(){
        return "[Class: " + lexClass() + ", row: " + row() + ", lexeme: " + this._lexeme + "]";
    }
}
