package ast;

public class DecVar extends DSimple {

	private T tipo;
	
	public DecVar(String id, T t) {
		super(id);
		this.tipo = t;
	}
	
	@Override
	public T tipoT() {
		return this.tipo;
	}
	
	@Override
	public TipoDec tipoDec() {
		return TipoDec.DEC_VAR;
	}

	@Override
	public String toString() {
		return "var " + this.tipo + " " + this.id();
	}
		
}
