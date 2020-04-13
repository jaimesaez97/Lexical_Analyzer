package ast;

public class Equiv extends BinaryE {

	public Equiv(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}
	
	@Override
	public TipoE type() {
		return TipoE.EQUIV;
	}
	
	@Override
	public String toString() {
		return "equiv{" + this.opnd1.toString() + ", " + this.opnd2.toString() + "}";
	}

}
