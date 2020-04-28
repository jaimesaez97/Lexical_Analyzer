package ast;

public class Not extends UnaryE {

	public Not(E opnd1) {
		super(opnd1);
	}

	@Override
	public TipoE type() {
		return TipoE.NOT;
	}

	@Override
	public String toString() {
		return "not{" + this.opnd1.toString() + "}";
	}

}
