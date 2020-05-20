package ast;

public class If extends Instruccion {
	
	private E exp;
	private Instrucciones ins;
	
	public If(E exp, Instrucciones ins) {
		this.exp = exp;
		this.ins = ins;
	}
	
	@Override
	public E exp1() {
		return this.exp;
	}
	
	@Override
	public Instrucciones instr1() {
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
