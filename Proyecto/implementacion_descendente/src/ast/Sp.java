package ast;

public abstract class Sp {

	public TipoSp tipoSp() {
		throw new UnsupportedOperationException("tipoSp");
	}
	
	public abstract String toString();
	
	public T tipo() {
		throw new UnsupportedOperationException("tipo");
	}
	
	public String id() {
		throw new UnsupportedOperationException("id");
	}
	
	public Sp param() {
		throw new UnsupportedOperationException("param");
	}
	
}
