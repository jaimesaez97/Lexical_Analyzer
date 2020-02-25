import java.io.Reader;
import java.io.IOException;

public class TinySintaxAnalyzer {
    
    private LexicalUnit preview;
    private TinyLexicalAnalyzer lexa;
    private TinyErrorMgmt error;
    
    public TinySintaxAnalyzer(Reader input){
        error = new TinyErrorMgmt();
        alex = new TinyLexicalAnalyzer(input);
        alex.setErrorMgmt(error);
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
                error.sintaxError(preview.row(), preview.lexClass(), LexicalClass.INT, LexicalClass.REAL, LexicalClass.BOOL);
                
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
                error.sintaxError(preview.row(), preview.lexClass(), LexicalClass.INT, LexicalClass.REAL, LexicalClass.BOOL);
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
                error.sintaxError(preview.row(), preview.lexClass(), LexicalClass.INT, LexicalClass.REAL, LexicalClass.BOOL);
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
                error.sintaxError(preview.row(), preview.lexClass(), LexicalClass.INT, LexicalClass.REAL, LexicalClass.BOOL);
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
                error.sintaxError(preview.row(), preview.lexClass(), LexicalClass.SEMICOLON, LexicalClass.END);
        }
    }
    
    private void Si(){
        switch(preview.lexClass()){
            case VAR:
                pair(LexicalClass.VAR);
                pair(LexicalClass.EQUAL);
                E0();
                break();
            default:
                error.sintaxError(preview.row(), preview.lexClass(), LexicalClass.VAR);
        }
    }
    
    private void INS(){
        switch(preview.lexClass()){
            case SEMICOLON:
                pair(LexicalClass.SEMICOLON);
                I();
                INS();
                break();
            case EOF:
                break;
            default:
                error.sintaxError(preview.row(), preview.lexClass(), LexicalClass.SEMICOLON, LexicalClass.EOF);
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
                break();                
            default:
                error.sintaxError(preview.row(), preview.lexClass(), LexicalClass.MINUS, LexicalClass.NOT, LexicalClass.OPPAR, LexicalClass.VAR, LexicalClass.INT, LexicalClass.REAL, LexicalClass.TRUE LexicalClass.FALSE);
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
                break();
            case CLPAR:
            case SEMICOLON:
            case EOF:
                break;                
            default:
                error.sintaxError(preview.row(), preview.lexClass(), LexicalClass.PLUS, LexicalClass.MINUS, LexicalClass.PCE, LexicalClass.SEMICOLON, LexicalClass.EOF);
        }
    }
    
    private void E1(){
        switch (anticipo.clase()) {
            case MENOS:
            case NOT:
            case PAB:
            case IDEN:
            case NUMERO:
            case TRUE:
            case FALSE:
                E2();
                RE1();
                break;
            default:
                errores.errorSintactico(anticipo.fila(), anticipo.clase(), ClaseLexica.MENOS, ClaseLexica.NOT, ClaseLexica.PAB, ClaseLexica.IDEN, ClaseLexica.NUMERO, ClaseLexica.TRUE, ClaseLexica.FALSE);
        }
    }
}