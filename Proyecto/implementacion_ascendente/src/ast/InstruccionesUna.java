package ast;

public class InstruccionesUna extends Instrucciones {

	private Instruccion ins;
	
	public InstruccionesUna(Instruccion ins) {
		this.ins = ins;
	}
	
	@Override
	public Instruccion ins() {
		return this.ins;
	}
	
	@Override
	public String toString() {
		return "";
	}

	@Override
	public TipoSi tipoIns() {
		return TipoSi.SIMPLE;
	}
}
