package ast;

public class Write extends Instruccion {
	
	private E exp;
	
	public Write(E exp) {
		this.exp = exp;
	}
	
	@Override
	public E exp1() {
		return this.exp;
	}

	@Override
	public TipoIns tipoIns() {
		return TipoIns.INS_WRITE;
	}
	
	@Override
	public String toString() {
		return "write " + this.exp.toString();
	}

}
