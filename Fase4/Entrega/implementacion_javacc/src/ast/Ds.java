package ast;

public abstract class Ds {

	public T tipoT() {
		throw new UnsupportedOperationException("type");
	}
	
	public String id() {
		throw new UnsupportedOperationException("id");
	}
	
	public Ds decs() {
		throw new UnsupportedOperationException("decs");
	}
	
	public abstract TipoDs type();
	
	public abstract String toString();
}
