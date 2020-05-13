package ast;

import ast.Sc;
import ast.Sp;
import ast.TArray;

public class ASProyect {

		/* Program constructors */
	public Programa progIns(Si si) { return new ProgIns(si); }
	public Programa decIns(Si si, Sd sd) {return new DecIns(si, sd); }
	
		/* Declaration section constructors */
	public Sd dSimple(DSimple dec) {return new DSimple(dec); }
	public Sd dCompuesta(Sd sd, DSimple dec) {return new DCompuesta(sd, dec); }

		/* Declaration constructors */
	public DSimple decVar(T tipo, String id_lex) {return new DecVar(id_lex, tipo); }
	public DSimple decTipo(T tipo, String id_lex) {return new DecType(id_lex, tipo); }
	public DSimple decProc(String id_lex, Sp param, B bloque) {return new DecProc(id_lex, param, bloque); }
	
		/* Parameter constructors */
	public Sp parSimple(T tipo, String id_lex) { return new PSimple(id_lex, tipo); }
	public Sp parCompuesta(T tipo, String id_lex, Sp param) {return new PCompuesto(param, tipo, id_lex, true); }
	public Parametros secParam(Sp p) {return new Parametros(p); }
	
		/* Type constructors */
	public T tInt() {return new TInt(); }
	public T tReal() { return new TReal(); }
	public T tBool() { return new TBool(); }
	public T tString() {return new TString(); }
	public T tIden(String name) {return new TIden(name); }
	public T tArray(int tam, T tipo) {return new TArray(tam, tipo); }
	public T tRecord(Sc campos) {return new TRecord(campos); }
	public T tPointer(T tipo) {return new TPointer(tipo); }
	
		/* Field constructors */
	public Sc campoSimple(T tipo, String id_lex) {return new CSimple(tipo, id_lex); }
	public Sc campoCompuesta(T tipo, String id_lex, Sc campos) {return new CCompuesta(tipo, id_lex, campos); }
		
		/* Instruction section constructors */
	public Si iSimple(ISimple ins) {return new Si(); }
	public Si iCompuesta(ISimple ins, Si si) {return new ICompuesta(); }
	
		/* Instruction constructors */
	public ISimple insAsig(E opnd1, E opnd2) {return new Asig(opnd1, opnd2); }
	public ISimple insIf(E opnd, Si ins) {return new If(opnd, ins); }
	public ISimple insIfElse(E opnd, Si ins1, Si ins2) {return new IfElse(opnd, ins1, ins2); }
	public ISimple insWhile(E opnd, Si ins) {return new While(opnd, ins); }
	public ISimple insRead(E opnd) {return new Read(opnd); }
	public ISimple insWrite(E opnd) {return new Write(opnd); }
	public ISimple insNl() {return new Nl(); }
	public ISimple insNew(E opnd) {return new New(opnd); }
	public ISimple insDelete(E opnd) {return new Delete(opnd); }
	public ISimple insCall(String id, Parametros p) {return new Call(id, p); }
	public ISimple insBloque(B bloque) {return new InsBloque(bloque); }
		
		/* Block constructor */
	public B bloque(Programa p) {return new B(p); }

		/* Arithmetical operations */
	public E suma(E opnd1, E opnd2) {return new Suma(opnd1, opnd2); }
	public E resta(E opnd1, E opnd2) {return new Resta(opnd1, opnd2); }

		/* Logical operations */
	public E and(E opnd1, E opnd2) {return new And(opnd1, opnd2); }
	public E or(E opnd1, E opnd2) {return new Or(opnd1, opnd2); }

		/* Relational operations */
	public E mayor(E opnd1, E opnd2) {return new Mayor(opnd1, opnd2); }
	public E mayorIgual(E opnd1, E opnd2) {return new MayorIgual(opnd1, opnd2); }
	public E menor(E opnd1, E opnd2) {return new Menor(opnd1, opnd2); }
	public E menorIgual(E opnd1, E opnd2) {return new MenorIgual(opnd1, opnd2); }
	public E equiv(E opnd1, E opnd2) {return new Equiv(opnd1, opnd2); }
	public E nonEquiv(E opnd1, E opnd2) {return new NonEquiv(opnd1, opnd2); }
	
		/* Arithmetical operations (v2) */
	public E mult(E opnd1, E opnd2) {return new Mult(opnd1, opnd2); }
	public E div(E opnd1, E opnd2) {return new Div(opnd1, opnd2); }
	public E resto(E opnd1, E opnd2) {return new Resto(opnd1, opnd2); }

		/* Logical operations (v2)*/
	public E not(E opnd) {return new Not(opnd); }
	public E neg(E opnd) {return new Neg(opnd); }

		/* Access operations */
	public E index(E opnd) {return new Index(opnd); }
	public E access(E opnd1) {return new Access(opnd1); }

	public E indirect(E opnd) {return new Indirect(opnd); }

		/* Terminal constructors */
	public E numInt(String val) {return new NumInt(val); }
	public E numReal(String val) {return new NumReal(val); }
	public E ttrue() {return new True(); }
	public E ffalse() {return new False(); }
	public E cadena(String val) {return new Cadena(val); }
	public E iden(String val) {return new Iden(val); }
	public E nulo() {return new Null(); }

}	
