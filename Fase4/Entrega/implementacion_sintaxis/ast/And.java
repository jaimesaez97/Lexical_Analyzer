package ast;

public class And extends BinaryE {

	public And(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}

	@Override
	public TipoE type() {
		return TipoE.AND;
	}

	@Override
	public String toString() {
		return "and{" + this.opnd1.toString() + ", " + this.opnd2.toString() + "}";
 	}

}
