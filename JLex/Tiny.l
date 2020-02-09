package jaime;

%%
%line
%class TinyLexicalAnalyzer
%type LexicalUnit
%unicode

%{
	private ALexOperations ops;
	public String lexeme()  { return yytext(); }
	public int row()		{ return yyline+1; }
%}

%eofval{
	return ops.EOFunity()
%eofval}

%init{
	ops = new ALexOperations(this);
%init}

letter = ([A-Z][a-z])
posDigit = [1-9]
digit = ({posDigit}|0)
decimalPart = \.{digit}*{posDigit}
exponencialPart = \e(\+,\-])?{digit}+
separator = [ \t\r\b\n]
num = num
bool = bool
true = true
false = false
and = and
or = or
not = not
identifier = {letter}({letter}|{digit}|\_)*
number = ([\+,\-])?{digit}+({decimalPart})?({exponencialPart})?
plusOp = \+
difOp = \-
multOp = \*
divOp = /
openPar = \(
closePar = \)
equal = \=
dis = \!
coma = \,
mayor = \>
mayorEqual = \>\=
minor = \<
minorEqual = \<\=
end = \&\&
sc = \;


%%
{separator}				{ }
{num}					{ return ops.unitNum(); }
{bool}					{ return ops.unitBool(); }
{number}				{ return ops.unitNumber(); }
{true}					{ return ops.unitTrue(); }
{false}					{ return ops.unitFalse(); }
{SCoperator}			{ return ops.unitSC(); }
{EndOperator}			{ return ops.unitEnd(); }
{equal}					{ return ops.unitEqual(); }
{plusOp}				{ return ops.unitPlus(); }
{difOp}					{ return ops.unitMinus(); }
{multOp}				{ return ops.unitMult(); }
{divOp}					{ return ops.unitDiv(); }
{and}					{ return ops.unitAnd(); }
{or}					{ return ops.unitOr(); }
{not}					{ return ops.unitNot(); }
{mayor}					{ return ops.unitMayor(); }
{minor}					{ return ops.unitMinor(); }
{mayorEqual}			{ return ops.unitMayorEqual(); }
{minorEqual}			{ return ops.unitMinorEqual(); }
{equiv}					{ return ops.unitEquiv(); }
{nonequiv}				{ return ops.unitNonEquiv(); }
{openPar}				{ return ops.unitOpenPar(); }
{closePar}				{ return ops.unitClosePar(); }
{iden}					{ return ops.unitId(); }
[^]						{ return ops.error(); }





