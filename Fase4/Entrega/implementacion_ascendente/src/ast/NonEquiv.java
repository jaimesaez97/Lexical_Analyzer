package ast;

public class NonEquiv extends BinaryE {

	public NonEquiv(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}
	
	public TipoE type() {
		return TipoE.NONEQUIV;
	}

	@Override
	public String toString() {
		return "nonEquiv{" + this.opnd1.toString() + ", " + this.opnd2.toString() + "}";
	}

}
