package ast;

public class IfElse extends ISimple {
	
	private E exp;
	private Si ins1;
	private Si ins2;
	
	public IfElse(E exp, Si ins1, Si ins2) {
		this.exp = exp;
		this.ins1 = ins1;
		this.ins2 = ins2;
	}
	
	@Override
	public E exp1() {
		return this.exp;
	}
	
	@Override
	public Si ins1() {
		return this.ins1;
	}
	
	@Override
	public Si ins2() {
		return this.ins2;
	}

	@Override
	public TipoIns tipoIns() {
		return TipoIns.INS_IFELSE;
	}
	
	@Override
	public String toString() {
		return "if(" + this.exp + ") then {" + this.ins1 + "} else {" + this.ins2 + "} endif";
	}
	
}
