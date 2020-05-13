package ast;

public class Not extends EUnario {

	public Not(E op1) {
		super(op1);
	}
	
	@Override
	public TipoE tipo() {
		return TipoE.NOT;
	}
	
	@Override
	public String toString() {
		return "not " + this.opnd1.toString();
	}

}
