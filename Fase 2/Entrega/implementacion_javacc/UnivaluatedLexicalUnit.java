package jaime;

public class UnivaluatedLexicalUnit extends LexicalUnit {
    
    public String lexeme() throws Exception{
            /* Unsupported Operation */
        throw new Exception();
    }
    
    public UnivaluatedLexicalUnit (int row, LexicalClass lexClass){
        super(row, lexClass);
    }
    

	public String toString(){
        return "[Class: " + lexClass() + ", row: " + row() + "]";
    }    
}
