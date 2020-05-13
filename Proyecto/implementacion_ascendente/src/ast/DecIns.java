package ast;

public class DecIns extends Programa {
	
	private Si ins;
	private Sd decs;
	
	public DecIns(Si ins, Sd decs) {
		this.ins = ins;
		this.decs = decs;
	}

	@Override
	public TipoPrograma tipoProg() {
		return TipoPrograma.DECINS;
	}

	@Override
	public Si ins() {
		return this.ins;
	}
	
	@Override
	public Sd decs() {
		return this.decs;
	}
	
	
	@Override
	public String toString() {
		return "ins = " + this.ins.toString() + "\ndecs = " + this.decs.toString();
	}

}
