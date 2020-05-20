package ast;

public class ProgIns extends RPrograma {

	private Instrucciones ins;
	
	public ProgIns(Instrucciones ins) {
		this.ins = ins;
	}
	
	@Override
	public Instrucciones ins() {
		return this.ins;
	}

	@Override
	public TipoPrograma tipoProg() {
		return TipoPrograma.PROGINS;
	}
	
	@Override
	public String toString() {
		return "ins = " + this.ins.toString();
	}
}
