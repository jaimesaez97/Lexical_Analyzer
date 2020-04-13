package ast;

public class Plus extends BinaryE {

	public Plus(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}
	
	@Override 
	public TipoE type() {
		return TipoE.SUBTRACTION; 
	}
	
	@Override
	public String toString() {
		return "suma{ " + this.opnd1.toString() + ", " + this.opnd2.toString() + "}";
	}

}
