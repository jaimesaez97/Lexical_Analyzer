package jaime;

public class UnivaluatedLexicalUnit extends LexicalUnit {
    
    public String lexeme(){
            /* Unsupported Operation */
        throw new Exception();
    }
    
    public UnivaluatedLexicalUnit (int row, int col, LexicalClass lexClass){
        super(row, col, lexClass);
    }
    
    public String toString(){
        return "[Class: " + this._lexClass + ", row: " + this._row + ", col: " + this._col + "]";
    }    
}