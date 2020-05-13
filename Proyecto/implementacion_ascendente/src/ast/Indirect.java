package ast;

public class Indirect extends EUnario {

	public Indirect(E op1) {
		super(op1);
	}
	
	@Override
	public TipoE tipo() {
		return TipoE.INDIRECT;
	}
	
	@Override
	public String toString() {
		return "* " + this.opnd1.toString();
	}
}
