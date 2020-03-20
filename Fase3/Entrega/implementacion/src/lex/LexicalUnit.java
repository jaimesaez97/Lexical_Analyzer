package lex;

import java_cup.runtime.Symbol;

public abstract class LexicalUnit extends Symbol {
    
    private int _row;
    
    public LexicalUnit(int row, int lexClass, String lexeme){
        super(lexClass, lexeme);
        this._row = row;
    }
    
    
    /* GETTERS */
    public int lexClass(){
        return sym;
    }
    
    public int row(){
        return this._row;
    }
    
    public abstract String lexeme();
}