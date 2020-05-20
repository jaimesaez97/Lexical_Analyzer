package ast;

public abstract class E {

	public E opnd1() {
		throw new UnsupportedOperationException("opnd1");
	}
	
	public E opnd2() {
		throw new UnsupportedOperationException("opnd2");
	}
	
	public E exp() {
		throw new UnsupportedOperationException("exp");
	}
	
	public String id() {
		throw new UnsupportedOperationException("id");
	}
	
	public String val() {
		throw new UnsupportedOperationException("val");
	}
	
	public abstract TipoE tipo();
	
	public abstract String toString();
}
