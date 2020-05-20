package ast;

public class While extends Instruccion {

	private E exp;
	private Instrucciones ins;
	
	public While(E exp, Instrucciones ins) {
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
		return TipoIns.INS_WHILE;
	}
	
	@Override
	public String toString() {
		return "while(" + this.exp + ") do {" + this.ins + "} endif";
	}
}
