package ast;

public abstract class Sp {

	public TipoSp tipoSp() {
		throw new UnsupportedOperationException("tipoSp");
	}
	
	public T tipo() {
		throw new UnsupportedOperationException("tipo");
	}
	
	public String id() {
		throw new UnsupportedOperationException("id");
	}
	
	public boolean ref() {
		throw new UnsupportedOperationException("ref");
	}

	public Sp params() {
		throw new UnsupportedOperationException("params");
	}
	
}
