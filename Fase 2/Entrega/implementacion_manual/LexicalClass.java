/*
    SEMICOLON: ;
    OPPAR: (
    CLPAR: )
    IDEN: 
*/
public enum LexicalClass{
    EOF, SEPARATOR, INT, REAL, BOOL, VAR, SEMICOLON, TRUE, 
    FALSE, EQUAL, PLUS, MINUS, MULT, DIV, OR, AND, NOT, MAJOR, 
    MINOR, MEQUAL, LEQUAL, EQUIV, NONEQUIV, NEG, OPPAR, CLPAR, 
    END,
}