package ast;

public abstract class Instrucciones {
	
	public Instruccion ins() {
		throw new UnsupportedOperationException("ins");
	}
	
	public Instrucciones instr() {
		throw new UnsupportedOperationException("instr");
	}

	public abstract String toString();
	
	public abstract TipoSi tipoIns();
}
