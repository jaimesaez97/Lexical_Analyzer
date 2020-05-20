package ast;

public class DecVariable extends Declaracion {

	private String id;
	private T tipo;
	
	public DecVariable(T tipo, String id) {
		this.id = id;
		this.tipo = tipo;
	}
	
	@Override
	public T tipo() {
		return this.tipo;
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "var " + this.tipo + " " + this.id();
	}

	@Override
	public TipoDec tipoDec() {
		return TipoDec.DEC_VAR;
	}

}
