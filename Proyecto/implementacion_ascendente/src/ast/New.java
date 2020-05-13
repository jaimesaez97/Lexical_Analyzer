package ast;

public class New extends ISimple {

	private E exp;
	
	public New(E exp) {
		this.exp = exp;
	}
	
	@Override
	public E exp1() {
		return this.exp;
	}

	@Override
	public TipoIns tipoIns() {
		return TipoIns.INS_NEW;
	}
	
	@Override
	public String toString() {
		return "new " + this.exp.toString();
	}

}
