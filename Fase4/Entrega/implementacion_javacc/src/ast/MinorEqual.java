package ast;

public class MinorEqual extends BinaryE {

	public MinorEqual(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}
	
	@Override
	public TipoE type() {
		return TipoE.MINOREQUAL;
	}
	
	@Override
	public String toString() {
		return "minorEqual{" + this.opnd1.toString() + ", " + this.opnd2.toString() + "}";
	}

}
