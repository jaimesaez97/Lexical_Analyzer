package ast;

public class DecProceso extends Declaracion {

	private String id;
	private Sp p;
	private B bloque;
	
	public DecProceso(String id, Parametros param, B bloque) {
		this.p = param.param();
		this.bloque = bloque;
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public Sp param() {
		return this.p;
	}
	
	@Override
	public B bloque() {
		return this.bloque;
	}
	
	@Override
	public String toString() {
		return "proc " + this.id() + this.param().toString() + this.bloque().toString();
	}

	@Override
	public TipoDec tipoDec() {
		return TipoDec.DEC_PROC;
	}

}
