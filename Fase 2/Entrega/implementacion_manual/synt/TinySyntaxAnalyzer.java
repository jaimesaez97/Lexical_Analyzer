package synt;
import java.io.Reader;

import err.TinyErrorMgmt;
import lex.LexicalClass;
import lex.LexicalUnit;
import lex.TinyLexicalAnalyzer;

import java.io.IOException;

public class TinySyntaxAnalyzer {
    
    private LexicalUnit preview;
    private TinyLexicalAnalyzer lexa;
    private TinyErrorMgmt error;
    
    public TinySyntaxAnalyzer(Reader input){
        error = new TinyErrorMgmt();
        lexa = new TinyLexicalAnalyzer(input);
        lexa.setErrorMgmt(error);
        nextToken();
    }
    
    public void Sp(){
        S();
        pair(LexicalClass.EOF);
    }
    
    private void S(){
        switch(preview.lexClass()){
            case INT:
            case REAL:
            case BOOL:
                Sd();
                pair(LexicalClass.END);
                Si();
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.INT, LexicalClass.REAL, LexicalClass.BOOL);
                
        }
    }
    
    private void Sd(){
        switch(preview.lexClass()){
            case INT:
            case REAL:
            case BOOL:
                D();
                DEC();
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.INT, LexicalClass.REAL, LexicalClass.BOOL);
        }
    }
    
    private void D(){
        switch(preview.lexClass()){
            case INT:
            case REAL:
            case BOOL:
                T();
                pair(LexicalClass.VAR);
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.INT, LexicalClass.REAL, LexicalClass.BOOL);
        }
    }
    
    private void T(){
        switch(preview.lexClass()){
            case INT:
                pair(LexicalClass.INT);
                break;
            case REAL:
                pair(LexicalClass.REAL);
                break;
            case BOOL:
                pair(LexicalClass.BOOL);
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.INT, LexicalClass.REAL, LexicalClass.BOOL);
        }
    }

    private void DEC(){
        switch(preview.lexClass()){
            case SEMICOLON:
                pair(LexicalClass.SEMICOLON);
                D();
                DEC();
                break;
            case END:
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.SEMICOLON);
        }
    }
    
    private void Si(){
        switch(preview.lexClass()){
            case VAR:
                I();
                INS();
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.VAR);
        }
    }

    private void I(){
        switch(preview.lexClass()){
            case VAR:
                pair(LexicalClass.VAR);
                pair(LexicalClass.EQUAL);
                E0();
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.VAR);
        }
    }
    
    private void INS(){
        switch(preview.lexClass()){
            case SEMICOLON:
                pair(LexicalClass.SEMICOLON);
                I();
                INS();
                break;
            case EOF:
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.SEMICOLON, LexicalClass.EOF);
        }
    }
    
    private void E0(){
        switch(preview.lexClass()){
            case MINUS:
            case NOT:
            case OPPAR:
            case VAR:
            case INT:
            case REAL:
            case TRUE:
            case FALSE:
                E1();
                E0_1();
                break;                
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.MINUS, LexicalClass.NOT, LexicalClass.OPPAR, LexicalClass.VAR, LexicalClass.INT, LexicalClass.REAL, LexicalClass.TRUE, LexicalClass.FALSE);
        }
    }
        /* Represents E0' */
    private void E0_1(){
        switch(preview.lexClass()){
            case PLUS:
                pair(LexicalClass.PLUS);
                E1();
                E0_1();
                break;
            case MINUS:
                pair(LexicalClass.MINUS);
                E1();
                E0_1();
                break;
            case CLPAR:
            case SEMICOLON:
            case EOF:
                break;                
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.PLUS, LexicalClass.MINUS, LexicalClass.CLPAR, LexicalClass.SEMICOLON, LexicalClass.EOF);
        }
    }
    
    private void E1(){
        switch (preview.lexClass()){
            case MINUS:
            case NOT:
            case OPPAR:
            case VAR:
            case INT:
            case REAL:
            case TRUE:
            case FALSE:
                E2();
                E1_1();
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.MINUS, LexicalClass.NOT, LexicalClass.OPPAR, LexicalClass.VAR, LexicalClass.INT, LexicalClass.REAL, LexicalClass.TRUE, LexicalClass.FALSE);
        }
    }
        /* Represents EE1 */
    private void E1_1(){
        switch (preview.lexClass()) {
            case AND:
                pair(LexicalClass.AND);
                E1();
                break;
            case OR:
                pair(LexicalClass.OR);
                E2();
                break;
            case PLUS:
            case MINUS:
            case CLPAR:
            case SEMICOLON:
            case EOF:
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.AND, LexicalClass.OR);
        }
    }

    private void E2(){
        switch(preview.lexClass()){
            case MINUS:
            case NOT:
            case OPPAR:
            case VAR:
            case INT:
            case REAL:
            case TRUE:
            case FALSE:
                E3();
                E2_1();
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.AND, LexicalClass.OR);
        }
    }
        /* Represents EE2 */
    private void E2_1(){
        switch(preview.lexClass()){
            case MINOR:
            case MAYOR:
            case LEQUAL:
            case MEQUAL:
            case EQUIV:
            case NONEQUIV:
                OP();
                E3();
                break;
            case AND:
            case OR:
            case PLUS:
            case MINUS:
            case CLPAR:
            case SEMICOLON:
            case EOF:
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.MINOR, LexicalClass.MAYOR, LexicalClass.LEQUAL , LexicalClass.MEQUAL , LexicalClass.EQUIV, LexicalClass.NONEQUIV);

        }
    }

    private void E3(){
        switch(preview.lexClass()){
            case MINUS:
            case NOT:
            case OPPAR:
            case VAR:
            case INT:
            case REAL:
            case TRUE:
            case FALSE:
                E4();
                E3_1();
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.MINOR, LexicalClass.MAYOR, LexicalClass.LEQUAL , LexicalClass.MEQUAL , LexicalClass.EQUIV, LexicalClass.NONEQUIV);

        }
    }
        /* Represents E3' */
    private void E3_1(){
        switch(preview.lexClass()){
            case MULT:
                pair(LexicalClass.MULT);
                E4();
                E3_1();
                break;
            case DIV:
                pair(LexicalClass.DIV);
                E4();
                E3_1();
                break;
            case MINOR:
            case MAYOR:
            case LEQUAL:
            case MEQUAL:
            case EQUIV:
            case NONEQUIV:
            case AND:
            case OR:
            case PLUS:
            case MINUS:
            case CLPAR:
            case SEMICOLON:
            case EOF:
            case NOT:
            case OPPAR:
            case VAR:
            case INT:
            case REAL:
            case TRUE:
            case FALSE:
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.MULT, LexicalClass.DIV);
        }
    }

    private void E4(){
        switch(preview.lexClass()){
            case MINUS:
                pair(LexicalClass.MINUS);
                E4();
                break;
            case NOT:
                pair(LexicalClass.NOT);
                E5();
                break;
            case OPPAR:
            case VAR:
            case INT:
            case REAL:
            case TRUE:
            case FALSE:
                E5();
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.MINUS, LexicalClass.NOT, LexicalClass.OPPAR , LexicalClass.VAR , LexicalClass.INT, LexicalClass.REAL, LexicalClass.TRUE, LexicalClass.FALSE);
        }
    }

    private void E5(){
        switch(preview.lexClass()){
            case OPPAR:
                pair(LexicalClass.OPPAR);
                E0();
                pair(LexicalClass.CLPAR);
                break;
            case VAR:
                pair(LexicalClass.VAR);
                break;
            case INT:
                pair(LexicalClass.INT);
                break;
            case REAL:
                pair(LexicalClass.REAL);
                break;
            case TRUE:
                pair(LexicalClass.TRUE);
                break;
            case FALSE:
                pair(LexicalClass.FALSE);
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.OPPAR, LexicalClass.VAR, LexicalClass.INT, LexicalClass.REAL, LexicalClass.TRUE, LexicalClass.FALSE);
        }
    }

    private void OP(){
        switch(preview.lexClass()){
            case MINOR:
                pair(LexicalClass.MINOR);
                break;
            case MAYOR:
                pair(LexicalClass.MAYOR);
                break;
            case LEQUAL:
                pair(LexicalClass.LEQUAL);
                break;
            case MEQUAL:
                pair(LexicalClass.MEQUAL);
                break;
            case EQUIV:
                pair(LexicalClass.EQUIV);
                break;
            case NONEQUIV:
                pair(LexicalClass.NONEQUIV);
                break;
            default:
                error.syntaxError(preview.row(), preview.lexClass(), LexicalClass.OPPAR, LexicalClass.VAR, LexicalClass.INT, LexicalClass.REAL, LexicalClass.TRUE, LexicalClass.FALSE);
        }
    }

    private void pair(LexicalClass expectedClass){
        if(preview.lexClass() == expectedClass)
            nextToken();
        else
            error.syntaxError(preview.row(), preview.lexClass(), expectedClass);
    }

    private void nextToken(){
        try{
            preview = lexa.yylex();
        } catch(IOException e){
            error.fatalError(e);
        }
    }
}