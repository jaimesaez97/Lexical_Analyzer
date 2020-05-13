package ast;

public class DecProc extends DSimple {
	
	private Sp p;
	private B bloque;

	public DecProc(String id, Sp p, B bloque) {
		super(id);
		this.p = p;
		this.bloque = bloque;
	}
	
	public DecProc(DSimple d) {
		super(d.id());
		this.p = d.param();
		this.bloque = d.bloque();
	}

	@Override
	public TipoDec tipoDec() {
		return TipoDec.DEC_PROC;
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

}
