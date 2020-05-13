package ast;

public class Asig extends ISimple {
	
	private E exp1;
	private E exp2;

	public Asig(E ex1, E ex2) {
		this.exp1 = ex1;
		this.exp2 = ex2;
	}
	
	@Override
	public TipoIns tipoIns() {
		return TipoIns.INS_ASIG;
	}
	
	@Override
	public E exp1() {
		return this.exp1;
	}
	
	@Override
	public E exp2() {
		return this.exp2;
	}
	
	public String toString() {
		return "asig{" + this.exp1() + " = " + this.exp2() + "}";
	}

}
