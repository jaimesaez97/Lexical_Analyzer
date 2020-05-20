package ast;

import ast.Sc;
import ast.Sp;
import ast.TArray;

public class ASProyect {

		/* Program constructors */
	public Programa prog(RPrograma rp, Instrucciones si) {return new Programa(rp, si); }
	
	public RPrograma progIns(Instrucciones si) {return new ProgIns(si); }
	public RPrograma decIns(Instrucciones si, Declaraciones sd) {return new DecIns(si, sd); }
	
		/* Declaration section constructors */
	public Declaraciones dSimple(Declaracion dec) {return new DeclaracionesUna(dec); }
	public Declaraciones dCompuesta(Declaraciones sd, Declaracion dec) {return new DeclaracionesMuchas(sd, dec); }

		/* Declaration constructors */
	public Declaracion decVar(T tipo, String id_lex) {return new DecVariable(tipo, id_lex); }
	public Declaracion decTipo(T tipo, String id_lex) {return new DecTipo(tipo, id_lex); }
	public Declaracion decProc(String id_lex, Parametros param, B bloque) {return new DecProceso(id_lex, param, bloque); }
	
		/* Parameter constructors */
	public Parametros secParam(Sp p) {return new Parametros(p); }
	public PSimple parSimple(T tipo, String id_lex) { return new PSimple(id_lex, tipo); }
	public PCompuesto parCompuesta(T tipo, String id_lex, Sp param) {return new PCompuesto(param, tipo, id_lex); }
	
		/* Type constructors */
	public T tInt() {return new TInt(); }
	public T tReal() { return new TReal(); }
	public T tBool() { return new TBool(); }
	public T tString() {return new TString(); }
	public T tIden(String name) {return new TIden(name); }
	public T tArray(String tam, T tipo) {return new TArray(tam, tipo); }
	public T tRecord(Sc campos) {return new TRecord(campos); }
	public T tPointer(T tipo) {return new TPointer(tipo); }
	
		/* Field constructors */
	public Sc campoSimple(T tipo, String id_lex) {return new CSimple(tipo, id_lex); }
	public Sc campoCompuesto(T tipo, String id_lex, Sc campos) {return new CCompuesto(tipo, id_lex, campos); }
		
		/* Instruction section constructors */
	public Instrucciones iSimple(Instruccion ins) {return new InstruccionesUna(ins); }
	public Instrucciones iCompuesta(Instrucciones instr, Instruccion ins) {return new InstruccionesMuchas(instr, ins); }
	
		/* Instruction constructors */
	public Instruccion insAsig(E opnd1, E opnd2) {return new Asig(opnd1, opnd2); }
	public Instruccion insIf(E opnd, Instrucciones ins) {return new If(opnd, ins); }
	public Instruccion insIfElse(E opnd, Instrucciones ins1, Instrucciones ins2) {return new IfElse(opnd, ins1, ins2); }
	public Instruccion insWhile(E opnd, Instrucciones ins) {return new While(opnd, ins); }
	public Instruccion insRead(E opnd) {return new Read(opnd); }
	public Instruccion insWrite(E opnd) {return new Write(opnd); }
	public Instruccion insNl() {return new Nl(); }
	public Instruccion insNew(E opnd) {return new New(opnd); }
	public Instruccion insDelete(E opnd) {return new Delete(opnd); }
	public Instruccion insCall(String id, Parametros p) {return new Call(id, p); }
	public Instruccion insBloque(B bloque) {return new InsBloque(bloque); }
		
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
	public E access(String id) {return new Access(id); }

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
