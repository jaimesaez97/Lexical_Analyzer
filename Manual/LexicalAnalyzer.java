package jaime;

import java.io.Reader;
import java.io.IOException;

public class LexicalAnalyzer{
    private Reader _input;
    private StringBuffer _lex;
    private int _nextChar;
    private int _initRow;
    private int _initCol;
    private int _curRow;
    private int _curCol;
    private static String _LS = System.getProperty("line.separator");
    
    /*
        REC_SEM: ;
        REC_DEC: decimal
        REC_DIS: !=
        REC_LET: <=
        REC_GET: >=
        REC_OPAR: (
        REC_CPAR: )
    */
    private static enum State{
        INIT, REC_SEM, REC_VAR, REC_PLUS, REC_MINUS,
        REC_NUM, REC_DEC_NF, REC_DEC, REC_EXP_NF, REC_EXP, REC_DIS_NF,
        REC_DIS, REC_EQU, REC_EQUIV, REC_DIV, REC_LT, REC_LET, REC_GT, 
        REC_GET, REC_OPAR, REC_CPAR, REC_EOF, REC_END
    }
    
    private State _status;
    
    public LexicalAnalyzer(Reader input) throws IOException {
        this._input = input;
        this._lex = new StringBuffer();
        this._sigChar = input.read();
        this._actRow = 1;
        this._actCol = 1;
    }
    
    public LexicalUnit nextToken() throws IOException {
        this._status = State.INIT;
        this._initRow = this._curRow;
        this._initCol = this._curCol;
        this._lex.delete(0, this._lex.length());
        
        while(true){
            switch(this._status){
                case INIT:
                    if(semicolon())     nextState(State.REC_SEM);
                    if(separator())     nextStateIgnored(State.INIT);
                    if(letter())        nextState(State.REC_VAR);
                    if(digit())         nextState(State.REC_NUM);
                    if(digit())         nextState(State.REC_NUM)
                    if(plus())          nextState(State.REC_PLUS);
                    if(minus())         nextState(State.REC_MINUS);
                    if(diseq())         nextState(State.REC_DIS_NF);
                    if(equal())         nextState(State.REC_EQU);
                    if(div())           nextState(State.REC_DIV);
                    if(minor())         nextState(State.REC_LT);
                    if(major())         nextState(State.REC_GT);
                    if(openPar())       nextState(State.REC_OPAR);
                    if(closePar())      nextState(State.REC_CPAR);
                    if(end())           nextState(State.REC_END);
                    if(eof())           nextState(State.REC_EOF);
                    else error();
                    break;
                case REC_VAR:
                    if(letter() || digit() || lowBar)   nextState(State.REC_VAR);
                    else return unitId();
                    break;
                case REC_NUM:
                    if(point())         nextState(State.REC_DEC);
                    else if (exp())     nextState(State.REC_EXP);
                    else if(digit())    nextState(State.REC_NUM);
                    else return unitNumber();
                case REC_SEM:
                    return unitSC();
                case REC_PLUS:
                    if(posDig())        nextState(State.REC_NUM);
                    else return unitPlus();
                    break;
                case REC_MINUS:
                    if(posDig())        nextState(State.REC_NUM);
                    else return unitMinus();
                    break;
                case REC_
            }
        }
    }
    
    /*      STATUS TRANSITION
        1. Append next character to string buffer.
        2. Read next Character into this._nextChar.
        3. Change status.
    */
    public void nextState(State next) throws IOException {
        this._lex.append((char) this._nextChar);
        nextChar();
        _status = next;
    }
    
    /*      IGNORED STATUS TRANSITION
        1. Read next character into this._nextChar.
        2. Set init (row, col) as current (row, col).   
        
        This functions is used to return to initial status
        when a '&&' simbol appears.
    */
    public void nextStateIgnored(State next) throws IOException {
        nextChar();
        this._initRow = this._curRow;
        this._initCol = this._curCol;
        this._status = next;
    }
    
    public void skipEOL(){
        int i = 1;
        
        for(; i < _SN.length(); ++i){
            this._nextChar = input.read();
            if(this._nextChar != _SN.charAt(i))
                error();
        }
        
        this._nextChar = '\n';
    }
    
    private void nextChar() throws IOException {
        this._nextChar = input.read();  /* Read Character from Reader */
        
        if(this._nextChar == _SN.charAt(0))
            skipEOL();
        if(this._nextChar == '\n'){
            this._actRow = this._actRow + 1;
            this._actCol = 0;
        }
        else{
            this._actCol = this._actCol + 1;
        }
    }
    
    
        /* Character-Recognizers */
    private boolean letter()    { return this._nextChar >= 'a' && this._nextChar <= 'z' || this._nextChar >= 'A' && this._nextChar <= 'Z'};
    private boolean lowBar()    { return this._nextChar == '_'};
    private boolean posDig()    { return this._nextChar >= '1' && this._nextChar <= '9'};
    private boolean digit()     { return this._nextChar >= '0' && this._nextChar <= '9'};
    private boolean zero()      { return this._nextChar == '0'};
    private boolean plus()      { return this._nextChar == '+'};
    private boolean minus()     { return this._nextChar == '-'};
    private boolean mult()      { return this._nextChar == '*'};
    private boolean div()       { return this._nextChar == '/'};
    private boolean openPar()   { return this._nextChar == '('};
    private boolean closePar()  { return this._nextChar == ')'};
    private boolean minor()     { return this._nextChar == '<'};
    private boolean major()     { return this._nextChar == '>'};
    private boolean semicolon() { return this._nextChar == ';'};
    private boolean separator() { return this._nextChar == '&'};
    private boolean space()     { return this._nextChar == ' ' /* || this._nextChar == '\t' */};
    private boolean exp()       { return this._nextChar == 'e'};
    private boolean equal()     { return this._nextChar == '='};
    private boolean diseq()     { return this._nextChar == '!'};
    private boolean point()     { return this._nextChar == '.'};
    private boolean EOF()       { return this._nextChar == -1};
    
    private LexicalUnit unitID(){
        switch(this._lex.toString()){
            case "bool":
                return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.BOOL);
            case "num":
                return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.NUM);
            case "true":
                return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.TRUE);
            case "false":
                return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.FALSE);
            case "and":
                return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.AND);
            case "or":
                return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.OR);
            case "not":
                return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.NOT);
            default:
                return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.VAR, this._lex.toString());
        }
    }
    
    private LexicalUnit unitNumber(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.NUMBER);
    }
    
    private LexicalUnit unitPlus(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.PLUS);
    }
    
    private LexicalUnit unitMinus(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.MINUS);
    }
    
    private LexicalUnit unitMult(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.MULT);
    }
    
    private LexicalUnit unitDiv(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.DIV);
    }
    
    private LexicalUnit unitOpenPar(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.OPPAR);
    }
    
    private LexicalUnit unitClosePar(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.CLPAR);
    }
    
    private LexicalUnit unitEqual(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.EQUAL);
    }
    
    private LexicalUnit unitSC(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.SEMICOLON);
    }
    
    private LexicalUnit unitEquiv(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.EQUIV);
    }
    
    private LexicalUnit unitNonEquiv(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.NONEQUIV);
    }
    
    private LexicalUnit unitMajor(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.MAJOR);
    }
    
    private LexicalUnit unitMinor(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.MINOR);
    }
    
    private LexicalUnit unitMajorEqual(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.MEQUAL);
    }
    
    private LexicalUnit unitMinorEqual(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.LEQUAL);
    }
    
    private LexicalUnit end(){
		return new UnidadLexicaUnivaluada(this._initRow, this._initCol, ClaseLexica.END);
    }
    
    private LexicalUnit eof(){
        return new MultivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.EOF);
    }
    
    private void error(){
        System.out.println("Character at (" + this._actRow + ", " + this._actCol + ") unrecognizable");
        System.exit(1);
    }
}