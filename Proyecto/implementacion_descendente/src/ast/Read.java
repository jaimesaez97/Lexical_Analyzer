package ast;

public class Read extends Instruccion {
	
	private E exp;
	
	public Read(E exp) {
		this.exp = exp;
	}
	
	@Override
	public E exp1() {
		return this.exp;
	}

	@Override
	public TipoIns tipoIns() {
		return TipoIns.INS_READ;
	}
	
	@Override
	public String toString() {
		return "read " + this.exp.toString();
	}
}
