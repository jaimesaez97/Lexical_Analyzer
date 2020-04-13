package ast;

public abstract class S {

	public Ds decs() {
		throw new UnsupportedOperationException("decs");
	}
	
	public Is ins() {
		throw new UnsupportedOperationException("ins");
	}
	
	public abstract TipoS type();
	
	public abstract String toString();
}
