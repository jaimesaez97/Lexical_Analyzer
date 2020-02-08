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
        REC_VAR: variable
        REC_NUM: numero
        REC_SEM: ;
        REC_PLUS: +
        REC_MINUS: -
        REC_DEC_NF: decimal (no terminado, sólo ha encontrado .)
        REC_DEC: decimal
        REC_EXP_NF: exponente (solo ha encontrado e)
        REC_EXP_AUX: exponente (solo ha encontrado e+ ó e-)
        REC_EXP: exponente
        REC_DIS_NF: !
        REC_DIS: !=
        REC_PÒR: *
        REC_DIV: /
        REC_OPAR: (
        REC_CPAR: )
        REC_EQU: =
        REC_EQUIV: ==
        REC_GT: >
        REC_GET: >=
        REC_LT: <
        REC_LET: <=
        REC_END: &
        REC_END2: &&
        REC_EOF: EOF
    */
    private static enum State{
        INIT, REC_VAR, REC_NUM, REC_SEM, REC_PLUS, REC_MINUS,
        REC_DEC_NF, REC_DEC, REC_EXP_NF, REC_AUX_EXP, REC_EXP,
        REC_DIS_NF, REC_DIS, REC_MULT, REC_DIV, REC_OPAR, REC_CPAR,
        REC_EQU, REC_EQUIV, REC_GT, REC_GET, REC_LT, REC_LET,
        REC_END, REC_END2, REC_EOF
    }
    
    private State _status;
    
    /*      CONSTRUCTOR
    */
    public LexicalAnalyzer(Reader input) throws IOException {
        this._input = input;
        this._lex = new StringBuffer();
        this._nextChar = input.read();
        this._curRow = 1;
        this._curCol = 1;
    }
    

    /*      NEXT TOKEN FUNCTION
        - Implements the whole functionnality.
        1. Works as the transition diagram:
            - (STATE, CHARASCTER) -> (NEW_STATE).
    */
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
                    if(mult())			nextState(State.REC_MULT);
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
                    if(EOF())           nextState(State.REC_EOF);
                    else error();
                    break;
                case REC_VAR:
                    if(letter() || digit() || lowBar())   nextState(State.REC_VAR);
                    else return unitID();
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
                case REC_DEC_NF:
                    if(digit())         nextState(State.REC_DEC);
                    else error();
                    break;
                case REC_DEC:
                    if(digit())         nextState(State.REC_DEC);
                    else if(exp())           nextState(State.REC_EXP_NF);
                    else return unitNumber();
                    break;
                case REC_EXP_NF:
                    if(plus()||minus()) nextState(State.REC_AUX_EXP);
                    if(digit())         nextState(State.REC_EXP);
                    else error();
                    break;
                case REC_AUX_EXP:
                    if(digit())         nextState(State.REC_EXP);
                    else error();
                    break;
                case REC_EXP:
                    if(digit())         nextState(State.REC_EXP);
                    else return unitNumber();
                    break;
                case REC_DIS_NF:
                    if(equal())         nextState(State.REC_DIS);
                    else error();
                    break;
                case REC_DIS:           return unitNonEquiv();
                case REC_MULT:          return unitMult();
                case REC_DIV:           return unitDiv();
                case REC_OPAR:          return unitOpenPar();
                case REC_CPAR:          return unitClosePar();
                case REC_EQU:
                    if(equal())         nextState(State.REC_EQUIV);
                    else return unitEqual();
                    break;
                case REC_EQUIV:         return unitEquiv();
                case REC_GT:
                    if(equal())         nextState(State.REC_GET);
                    else return unitMajor();
                    break;
                case REC_GET:           return unitMajorEqual();
                case REC_LT:
                    if(equal())         nextState(State.REC_LET);
                    else return unitMinor();
                case REC_LET:           return unitMinorEqual();
                case REC_END:
                    if(end())           nextState(State.REC_END2);
                    else error();
                    break;
                case REC_END2:          return unitEnd();
                case REC_EOF:           return unitEOF();
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
    
    /*      END OF LINE SKIP
        1. Reads '\n' character and updats (row, col).
    */
    public void skipEOL() throws IOException{
        int i = 1;
        
        for(; i < _LS.length(); ++i){
            this._nextChar = this._input.read();
            if(this._nextChar != _LS.charAt(i))
                error();
        }
        
        this._nextChar = '\n';
    }
    
    /*      READ NEXT CHARACTER
        1. Read next character from _input.read() into _nextChar.
        2. Updates (row, col).

    */
    private void nextChar() throws IOException {
        this._nextChar = this._input.read();  /* Read Character from Reader */
        
        if(this._nextChar == _LS.charAt(0))
            skipEOL();
        if(this._nextChar == '\n'){
            this._curRow = this._curRow + 1;
            this._curCol = 0;
        }
        else{
            this._curCol = this._curCol + 1;
        }
    }
    
    
        /* Character-Recognizers */
    private boolean letter()    { return this._nextChar >= 'a' && this._nextChar <= 'z' || this._nextChar >= 'A' && this._nextChar <= 'Z';};
    private boolean lowBar()    { return this._nextChar == '_';};
    private boolean posDig()    { return this._nextChar >= '1' && this._nextChar <= '9';};
    private boolean digit()     { return this._nextChar >= '0' && this._nextChar <= '9';};
    private boolean plus()      { return this._nextChar == '+';};
    private boolean minus()     { return this._nextChar == '-';};
    private boolean mult()      { return this._nextChar == '*';};
    private boolean div()       { return this._nextChar == '/';};
    private boolean openPar()   { return this._nextChar == '(';};
    private boolean closePar()  { return this._nextChar == ')';};
    private boolean minor()     { return this._nextChar == '<';};
    private boolean major()     { return this._nextChar == '>';};
    private boolean semicolon() { return this._nextChar == ';';};
    private boolean end()       { return this._nextChar == '&';};
    private boolean exp()       { return this._nextChar == 'e';};
    private boolean equal()     { return this._nextChar == '=';};
    private boolean diseq()     { return this._nextChar == '!';};
    private boolean point()     { return this._nextChar == '.';};
    private boolean EOF()       { return this._nextChar == -1;};
    private boolean separator() { return this._nextChar == ' ' || this._nextChar == '\t' || this._nextChar == '\n';};
    

    /*      unitX GENERATOR
        1. Generates a Univaluated Lexaical UYnit

    */

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
        return (LexicalUnit) new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.NUMBER);
    }
    
    private LexicalUnit unitPlus(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.PLUS);
    }
    
    private LexicalUnit unitMinus(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.MINUS);
    }
    
    private LexicalUnit unitMult(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.MULT);
    }
    
    private LexicalUnit unitDiv(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.DIV);
    }
    
    private LexicalUnit unitOpenPar(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.OPPAR);
    }
    
    private LexicalUnit unitClosePar(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.CLPAR);
    }
    
    private LexicalUnit unitEqual(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.EQUAL);
    }
    
    private LexicalUnit unitSC(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.SEMICOLON);
    }
    
    private LexicalUnit unitEquiv(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.EQUIV);
    }
    
    private LexicalUnit unitNonEquiv(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.NONEQUIV);
    }
    
    private LexicalUnit unitMajor(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.MAJOR);
    }
    
    private LexicalUnit unitMinor(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.MINOR);
    }
    
    private LexicalUnit unitMajorEqual(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.MEQUAL);
    }
    
    private LexicalUnit unitMinorEqual(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.LEQUAL);
    }
    
    private LexicalUnit unitEnd(){
		return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.END);
    }
    
    private LexicalUnit unitEOF(){
        return new UnivaluatedLexicalUnit(this._initRow, this._initCol, LexicalClass.EOF);
    }
    

    /*      ERROR LOG
        1. Prints error with (row, col) associated.
    */  
    private void error(){
        System.out.println("Character at (" + this._curRow + ", " + this._curCol + ") unrecognizable");
        System.exit(1);
    }
}