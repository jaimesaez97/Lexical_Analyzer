package ast;

public class ProgIns extends Programa {

	private Si ins;
	
	public ProgIns(Si ins) {
		this.ins = ins;
	}
	
	@Override
	public Si ins() {
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
