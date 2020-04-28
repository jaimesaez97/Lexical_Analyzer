package ast;

public abstract class Is {

	public String id() {
		throw new UnsupportedOperationException("id");
	}
	
	public E exp() {
		throw new UnsupportedOperationException("exp");
	}
	
	public Is ins() {
		throw new UnsupportedOperationException("ins");
	}
	
	public abstract TipoIs type();
	
	public abstract String toString();
}
