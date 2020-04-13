package ast;

public class ASTiny {

	public E plus(E opnd1, E opnd2) {return new Plus(opnd1, opnd2); }
	public E sub(E opnd1, E opnd2) {return new Subtraction(opnd1, opnd2); }
	public E mult(E opnd1, E opnd2) {return new Mult(opnd1,opnd2);}  
	public E div(E opnd1, E opnd2) {return new Div(opnd1,opnd2);}
	public E minor(E opnd1, E opnd2) {return new Minor(opnd1,opnd2);}
	public E minorEqual(E opnd1, E opnd2) {return new MinorEqual(opnd1,opnd2);}
	public E mayor(E opnd1, E opnd2) {return new Mayor(opnd1,opnd2);}
	public E mayorEqual(E opnd1, E opnd2) {return new MayorEqual(opnd1,opnd2);}
	public E equiv(E opnd1, E opnd2) {return new Equiv(opnd1,opnd2);}
	public E nonEquiv(E opnd1, E opnd2) {return new NonEquiv(opnd1,opnd2);}
	public E and(E opnd1, E opnd2) {return new And(opnd1,opnd2);}
	public E or(E opnd1, E opnd2) {return new Or(opnd1,opnd2);}
	public E not(E opnd1) {return new Not(opnd1);}
	public E neg(E opnd1) {return new Neg(opnd1);}	
	public E numReal(String st) {return new NumReal(st);} 
	public E eTrue() {return new True();} 
	public E eFalse() {return new False();} 
	public E id(String id) {return new Iden(id);}  
	public T tBool() {return new TBool();}
	public T tInt() {return new TInt(); }
	public T tReal() { return new TReal();}
	public Ds dSimple(String id, T tipo) {return new DSimple(tipo, id);}
	public Ds dCompuesta(Ds decs, String id, T tipo) {return new DCompuesta(decs, tipo, id);}	
	public Is iSimple(String id, E exp) {return new ISimple(id, exp);}
	public Is iCompuesta(Is ins, String id, E exp) {return new ICompuesta(ins, id, exp);}
	public S decIns(Ds decs, Is ins) {return new DecIns(decs, ins);}
}
