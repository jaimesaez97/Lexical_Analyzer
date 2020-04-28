package ast;

public class DCompuesta extends Ds {
	
	private T type;
	private String id;
	private Ds decs;
	
	public DCompuesta(Ds decs, T type, String id) {
		this.decs = decs;
		this.type = type;
		this.id = id;
	}
	
	@Override
	public Ds decs() {
		return this.decs;
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
		return TipoDs.COMPUESTA;
	}

	@Override
	public String toString() {
		return "DCompuesta{ DSimple{" + this.type.toString() + " " + this.id + "}, " + decs.toString() + "}";
	}
}
