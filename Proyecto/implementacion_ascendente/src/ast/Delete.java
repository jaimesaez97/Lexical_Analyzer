package ast;

public class Delete extends ISimple {

	private E exp;
	
	public Delete(E exp) {
		this.exp = exp;
	}
	
	@Override
	public E exp1() {
		return this.exp;
	}

	@Override
	public TipoIns tipoIns() {
		return TipoIns.INS_DELETE;
	}
	
	@Override
	public String toString() {
		return "delete " + this.exp.toString();
	}
}
