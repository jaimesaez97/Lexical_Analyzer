package ast;

public class MayorEqual extends BinaryE {

	public MayorEqual(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}
	
	@Override
	public TipoE type() {
		return TipoE.MAYOREQUAL;
	}
	
	@Override
	public String toString() {
		return "mayorEqual{" + this.opnd1.toString() + ", " + this.opnd2.toString() + "}";
	}

}
