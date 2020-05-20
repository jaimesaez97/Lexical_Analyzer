package ast;

public abstract class RPrograma {

	public Declaraciones decs() {
		throw new UnsupportedOperationException("decs");
	}

	public Instrucciones ins() {
		throw new UnsupportedOperationException("ins");
	}

	public abstract TipoPrograma tipoProg();
	
	public abstract String toString();

}
