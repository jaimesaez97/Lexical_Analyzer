package ast;

public class If extends ISimple {
	
	private E exp;
	private Si ins;
	
	public If(E exp, Si ins) {
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
		return TipoIns.INS_IF;
	}
	
	@Override
	public String toString() {
		return "if(" + this.exp + ") then {" + this.ins + "} endif";
	}
}
