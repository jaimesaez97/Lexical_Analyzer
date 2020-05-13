package ast;

public class Index extends EUnario {
	
	public Index(E op1) {
		super(op1);
	}
	
	@Override
	public TipoE tipo() {
		return TipoE.INDEX;
	}
	
	@Override
	public String toString() {
		return "[" + this.opnd1.toString() + "]";
	}
}
