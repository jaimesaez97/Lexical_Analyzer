package ast;

public class Or extends BinaryE {

	public Or(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}
	
	@Override
	public TipoE type() {
		return TipoE.OR;
	}

	@Override
	public String toString() {
		return "or{" + this.opnd1.toString() + ", " + this.opnd2.toString() + "}";
	}

}
