# java -cp jlex.jar JLex.Main List.l

package jaime;

%%
%line
%class TinyLexicalAnalyzer
%type LexicalUnit
%unicode

%{
    private ALexOperations ops;
    public String lexeme()      { return yytext();}
    public int row()            { return yyline+1;}
%}

%eofval{
    System.out.println("Unexpected character at row: " + row() + ", lexeme: " + lexeme() + ".);
%}

%init{
    ops = new ALexOperations(this);
%}

letter      = ([A-Z]|[a-z])
digPos      = ([1-9])
zero        = (0)
lowBar      = \_
digit       = ({digPos}|{zero})
separator   = [ ,\t,\r,\b,\n]
plus        = \+
minus       = \-
mult        = \*
div         = \/
minor       = \<
minorEqual  = \<\=
mayor       = \>
mayorEqual  = \>\=
openPar     = \(
closePar    = \)
equal       = \=
equiv       = \=\=
disequiv    = \!\=
semicolon   = \;
end         = \&\&
eof         = -1

decimalPart = \.{digit}*{digPos}
exponenPart = [e,E]([+, \-]){integer}

variable    = {letter}+({letter}|{digit}|{lowBar})*
integer     = {digPos}{digit}*
real        = ({integer}|0){decimalPart}
exponential = {real}{exponenPart}

int = int
real = real
bool = bool
true = true
false = false
and = and
or = or
not = not

%%
{separator}         {}
{real}              {return ops.unitReal();}
{int}               {return ops.unitInt();}
{bool}              {return ops.unitBool();}
{true}              {return ops.unitTrue();}
{false}             {return ops.unitFalse();}
{semicolon}         {return ops.unitSC();}
{end}               {return ops.unitEnd();}
{equal}             {return ops.unitEqual();}
{plus}              {return ops.unitPlus();}
{minus}             {return ops.unitMinus();}
{mult}              {return ops.unitMult();}
{div}               {return ops.unitDiv();}
{and}               {return ops.unitAnd();}
{or}                {return ops.unitOr();}
{not}               {return ops.unitNot();}
{mayor}             {return ops.unitMayor();}
{minor}             {return ops.unitMinor();}
{mayorEqual}        {return ops.unitMayorEqual();}
{minorEqual}        {return ops.unitMinorEqual();}
{equiv}             {return ops.unitEquiv();}
{disequiv}          {return ops.unitNonEquiv();}
{openPar}           {return ops.unitOpenPar();}
{closePar}          {return ops.unitClosePar();}

{variable}          {return ops.unitID();}
{real}              {return ops.unitNumber();}
{exponential}       {return ops.unitNumber();}
{integer}           {return ops.unitNumber();}

[^]		    {ops.error(); }
