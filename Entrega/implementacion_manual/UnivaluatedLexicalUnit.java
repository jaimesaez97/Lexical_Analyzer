public class UnivaluatedLexicalUnit extends LexicalUnit {
    
    public String lexeme() throws Exception{
            /* Unsupported Operation */
        throw new Exception();
    }
    
    public UnivaluatedLexicalUnit (int row, int col, LexicalClass lexClass){
        super(row, col, lexClass);
    }
    

	public String toString(){
        return "[Class: " + lexClass() + ", row: " + row() + ", col: " + col() + "]";
    }    
}