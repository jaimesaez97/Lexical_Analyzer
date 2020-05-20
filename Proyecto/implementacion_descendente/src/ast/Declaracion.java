package ast;

public abstract class Declaracion {
	
	public B bloque() {
		throw new UnsupportedOperationException("bloque");
	}
	
	public Sp param() {
		throw new UnsupportedOperationException("param");
	}
	
	public T tipo() {
		throw new UnsupportedOperationException("tipo");
	}
	
	public String id() {
		throw new UnsupportedOperationException("id");
	}
	
	public abstract String toString();
	
	public abstract TipoDec tipoDec();
}
