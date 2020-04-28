package ast;

public class Mayor extends BinaryE {

	public Mayor(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}
	
	@Override
	public TipoE type() {
		return TipoE.MAYOR;
	}
	
	@Override
	public String toString() {
		return "mayor{" + this.opnd1.toString() + ", " + this.opnd2.toString() + "}";
	}

}
