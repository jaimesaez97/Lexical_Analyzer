package ast;

public abstract class T {
	
	public abstract String toString();
	
	public int tam() {
		throw new UnsupportedOperationException("tam");
	}
	
	public T tipo() {
		throw new UnsupportedOperationException("tipo");
	}
	
	public String nombre() {
		throw new UnsupportedOperationException("nombre");
	}

	public TipoT tipoT() {
		throw new UnsupportedOperationException("tipoT");
	}
	
	public String typeName() {
		throw new UnsupportedOperationException("typeName");
	}
	
	public Sc campos() {
		throw new UnsupportedOperationException("campos");
	}

	
	
	
}
