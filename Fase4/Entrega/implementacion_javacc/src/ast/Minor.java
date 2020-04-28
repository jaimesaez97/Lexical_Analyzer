package ast;

public class Minor extends BinaryE {

	public Minor(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}
	
	@Override
	public TipoE type() {
		return TipoE.MINOR;
	}
	
	@Override
	public String toString() {
		return "minor{" + this.opnd1.toString() + ", " + this.opnd2.toString() + "}";
	}

}
