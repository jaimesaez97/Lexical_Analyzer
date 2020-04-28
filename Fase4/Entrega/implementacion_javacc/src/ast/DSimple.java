package ast;

public class DSimple extends Ds {

	private T type;
	private String id;
	
	public DSimple(T type, String id) {
		this.type = type;
		this.id = id;
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public T tipoT() {
		return this.type;
	}
	
	@Override
	public TipoDs type() {
		return TipoDs.SIMPLE;
	}

	@Override
	public String toString() {
		return "DSimple{" + this.type.toString() + " " + this.id + "}";
	}

}
