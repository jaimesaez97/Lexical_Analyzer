package ast;

public class Neg extends EUnario {

	public Neg(E op1) {
		super(op1);
	}
	
	@Override
	public TipoE tipo() {
		return TipoE.NEG;
	}
	
	@Override
	public String toString() {
		return "- " + this.opnd1.toString();
	}
}
