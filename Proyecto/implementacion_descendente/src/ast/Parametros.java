package ast;

public class Parametros {
	
	private Sp parametros;
	
	public Parametros(Sp param) {
		this.parametros = param;
	}
	
	public Sp param() {
		return this.parametros;
	}
	
	public String toString() {
		return "(" + this.parametros.toString() + ")";
	}

}
