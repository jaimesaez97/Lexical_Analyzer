package ast;

public class DecIns extends S {
	
	private Ds decs;
	private Is ins;
	
	public DecIns(Ds decs, Is ins) {
		this.decs = decs;
		this.ins = ins;
	}

	public Ds decs() {
		return this.decs;
	}
	
	public Is ins() {
		return this.ins;
	}
	
	public TipoS type() {
		return TipoS.DECINS;
	}

	@Override
	public String toString() {
		return "decIns{" + this.decs.toString() + ", " + this.ins.toString() + "}";
	}

}
