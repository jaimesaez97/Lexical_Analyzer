package lex;

%%
%cup
%line
%class ProyectLexicalAnalyzer
%unicode
%public

%{
	private ALexOperations ops;
    private TinyErrorMgmt error;
    public String lexeme()      { return yytext();}
    public int row()            { return yyline+1;}
    public void setErrorMgmt(TinyErrorMgmt error){
	this.error = error;
    }
%}

%eofval{
        return ops.unitEOF();
%eofval}

%init{
    ops = new ALexOperations(this);
%init}

letter      = ([A-Z]|[a-z])
digPos      = ([1-9])
zero        = (0)
lowBar      = \_
digito      = ({digPos}|{zero})

end         = \&\&
suma        = \+
resta       = \-
mult        = \*
div         = \/
rest		= \%
menor       = \<
menorIgual  = \<\=
mayor       = \>
mayorIgual  = \>\=
equiv       = \=\=
disequiv    = \!\=
parAbier    = \(
parCerra    = \)
pycoma      = \; 
igual       = \=
corAbier	= \[
corCerra	= \]
llaAbier	= \{
llaCerra	= \}
punto		= \.
flecha		= \-\>
coma		= \,
umpersand	= \&


decimal		= {punto} ({digito}*){digPos}
exponencial	= [e,E] numInt

numInt		= ([\+,\-])?{digPos}({digito}*)
numReal		= ({entero}|{zero})({decimal} | {exponencial} | {decimal}{exponencial})
cadena		= \"  \"
iden	 	= {letter}({letter}|{digito}|{lowBar})*

int 		= int
real 		= real
bool 		= bool
string 		= string
and 		= and
or 			= or
not 		= not
null 		= null
true 		= true
false 		= false
proc 		= proc
if 			= if 
then 		= then
else 		= else
endif		= endif
while 		= while
do 			= do
endwhile 	= endwhile
call 		= call
record 		= record
array 		= array 
of 			= or
pointer 	= pointer
new 		= new
delete 		= delete
read 		= read
write 		= write
nl 			= nl
var 		= var
type 		= type

separator   = [ ,\r,\b,\n]
comentario	= # (caracter - \n)*
caracter 	= ¿?
%%