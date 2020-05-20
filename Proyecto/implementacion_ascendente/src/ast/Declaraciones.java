package ast;

public abstract class Declaraciones {
	
	public Declaraciones decs() {
		throw new UnsupportedOperationException("decs");
	}
	
	public Declaracion dec() {
		throw new UnsupportedOperationException("dec");
	}
	
	public abstract String toString();
	
	public abstract TipoSd tipoDec();

}
