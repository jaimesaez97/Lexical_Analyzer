package ast;

public class IfElse extends Instruccion {
	
	private E exp;
	private Instrucciones ins1;
	private Instrucciones ins2;
	
	public IfElse(E exp, Instrucciones ins1, Instrucciones ins2) {
		this.exp = exp;
		this.ins1 = ins1;
		this.ins2 = ins2;
	}
	
	@Override
	public E exp1() {
		return this.exp;
	}
	
	@Override
	public Instrucciones instr1() {
		return this.ins1;
	}
	
	@Override
	public Instrucciones instr2() {
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
