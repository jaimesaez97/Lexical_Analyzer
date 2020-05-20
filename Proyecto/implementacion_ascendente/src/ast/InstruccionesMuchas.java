package ast;

public class InstruccionesMuchas extends Instrucciones {

	private Instruccion ins;
	private Instrucciones instr;
	
	public InstruccionesMuchas(Instrucciones isntr, Instruccion ins) {
		this.ins = ins;
		this.instr = instr;
	}
	
	@Override
	public Instruccion ins() {
		return this.ins;
	}
	
	@Override
	public Instrucciones instr() {
		return this.instr;
	}
	
	@Override
	public String toString() {
		return "";
	}

	@Override
	public TipoSi tipoIns() {
		return TipoSi.COMPUESTA;
	}

}
