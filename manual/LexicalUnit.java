package jaime;

public abstract class LexicalUnit{
    
    private LexicalClass _class;
    private int _row;
    private int _col;
    
    public LexicalUnit(int row, int col, LexicalClass lexClass){
        this._row = row;
        this._col = col;
        this._class = lexclass;
    }
    
    
    /* GETTERS */
    public LexicalClass lexClass(){
        return this._class;
    }
    
    public int row(){
        return this._row;
    }
    
    public int col(){
        return this._col;
    }
}