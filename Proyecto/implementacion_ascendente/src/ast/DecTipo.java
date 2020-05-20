package ast;

public class DecTipo extends Declaracion {
	
	private T tipo;
	private String id;
	
	public DecTipo(T tipo, String id) {
		this.tipo = tipo;
		this.id = id;
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public T tipo() {
		return this.tipo;
	}

	@Override
	public String toString() {
		return "type " + this.tipo + " " + this.id();
	}

	@Override
	public TipoDec tipoDec() {
		return TipoDec.DEC_TYPE;
	}

}
