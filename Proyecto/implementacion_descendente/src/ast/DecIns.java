package ast;

public class DecIns extends RPrograma {
	
	private Declaraciones decs;
	private Instrucciones ins;
	
	public DecIns(Instrucciones ins, Declaraciones decs) {
		this.decs = decs;
		this.ins = ins;
	}

	@Override
	public TipoPrograma tipoProg() {
		return TipoPrograma.DECINS;
	}

	
	@Override
	public Declaraciones decs() {
		return this.decs;
	}
	
	@Override
	public Instrucciones ins() {
		return this.ins;
	}
	
	@Override
	public String toString() {
		return "decs = " + this.decs.toString();
	}

}
