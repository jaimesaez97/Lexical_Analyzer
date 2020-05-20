package ast;

public class DecIns extends Programa {
	
	private Instrucciones ins;
	private Declaraciones decs;
	
	public DecIns(Instrucciones ins, Declaraciones decs) {
		this.ins = ins;
		this.decs = decs;
	}

	@Override
	public TipoPrograma tipoProg() {
		return TipoPrograma.DECINS;
	}

	@Override
	public Instrucciones ins() {
		return this.ins;
	}
	
	@Override
	public Declaraciones decs() {
		return this.decs;
	}
	
	
	@Override
	public String toString() {
		return "ins = " + this.ins.toString() + "\ndecs = " + this.decs.toString();
	}

}
