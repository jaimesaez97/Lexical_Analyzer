package ast;

public abstract class Instruccion {

	public abstract String toString();
	
	public abstract TipoIns tipoIns();
	
	public B bloque() {
		throw new UnsupportedOperationException("bloque");
	}
	
	public E exp1() {
		throw new UnsupportedOperationException("exp1");
	}
	
	public E exp2() {
		throw new UnsupportedOperationException("exp2");	
	}
	
	public Instrucciones instr1() {
		throw new UnsupportedOperationException("inst1");
	}
	
	public Instrucciones instr2() {
		throw new UnsupportedOperationException("inst2");
	}
	
	public String id() {
		throw new UnsupportedOperationException("id");
	}
	
	public Parametros param() {
		throw new UnsupportedOperationException("param");
	}
}
