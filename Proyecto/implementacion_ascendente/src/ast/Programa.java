package ast;

public abstract class Programa {

	public Sd decs() {
		throw new UnsupportedOperationException("decs");
	}
	
	public Si ins() {
		throw new UnsupportedOperationException("ins");
	}
	
	public abstract TipoPrograma tipoProg();
	
	public abstract String toString();
}
