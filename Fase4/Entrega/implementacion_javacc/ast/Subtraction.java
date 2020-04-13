package ast;

public class Subtraction extends BinaryE {

	public Subtraction(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}

	@Override
	public TipoE type() {
		return TipoE.SUBTRACTION;
	}

	@Override
	public String toString() {
		return "subtraction{" + this.opnd1.toString() + ", " + this.opnd2.toString() + "}";
	}

}
