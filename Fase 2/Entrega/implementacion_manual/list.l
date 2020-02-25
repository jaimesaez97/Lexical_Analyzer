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
        return ops.unitEOF();
%eofval}

%init{
    ops = new ALexOperations(this);
%init}

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

variable    = {letter}+({letter}|{digit}|{lowBar})*

integer     = ([\+,\-])?{digPos}({digit}*)
decimal     = ({integer}|{posZero}){parteDec}
exponencial = ({integer}|{decimal}){parteExp}
real        = ({integer}|{posZero}){parteDec}{parteExp}
parteDec    = \.(({digit})*{digPos}|{zero})
parteExp    = [e,E]{integer}
posZero     = ([\+,\-])?{zero}

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
{real}              {return ops.unitNumReal();}
{integer}           {return ops.unitInteger();}
{exponencial}       {return ops.unitNumReal();}
{decimal}           {return ops.unitNumReal();}
{zero}              {return ops.unitInteger();}
[^]                 {return ops.unitError(); }
