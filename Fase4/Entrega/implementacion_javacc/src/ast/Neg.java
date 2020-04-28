package ast;

public class Neg extends UnaryE {

	public Neg(E opnd1) {
		super(opnd1);
	}
	
	@Override
	public TipoE type() {
		return TipoE.NEG;
	}
	
	@Override
	public String toString() {
		return "neg{" + this.opnd1.toString() + "}";
	}
}
