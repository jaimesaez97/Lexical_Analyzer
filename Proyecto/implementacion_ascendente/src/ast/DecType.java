package ast;

public class DecType extends DSimple {

	private T tipo;
	
	public DecType(String id, T t) {
		super(id);
		this.tipo = t;
	}
	
	@Override
	public T tipoT() {
		return this.tipo;
	}
	
	@Override
	public TipoDec tipoDec() {
		return TipoDec.DEC_TYPE;
	}

	@Override
	public String toString() {
		return "type " + this.tipo + " " + this.id();
	}

}
