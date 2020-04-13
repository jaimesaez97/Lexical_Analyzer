package ast;

public class Mult extends BinaryE {

	public Mult(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}
	
	@Override
	public TipoE type() {
		return TipoE.MULT;
	}
	
	@Override
	public String toString() {
		return "mult{" + this.opnd1.toString() + ", " + this.opnd2.toString() + "}";
	}

}
