package ast;

public class While extends ISimple {

	private E exp;
	private Si ins;
	
	public While(E exp, Si ins) {
		this.exp = exp;
		this.ins = ins;
	}
	
	@Override
	public E exp1() {
		return this.exp;
	}
	
	@Override
	public Si ins1() {
		return this.ins;
	}

	@Override
	public TipoIns tipoIns() {
		return TipoIns.INS_WHILE;
	}
	
	@Override
	public String toString() {
		return "while(" + this.exp + ") do {" + this.ins + "} endif";
	}
}
