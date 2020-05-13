package ast;

public class And extends EBinario {

	public And(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.AND;
	}

	@Override
	public String toString() {
		return "and{" + this.opnd1.toString() + " and " + this.opnd2.toString() +"}";  
	}
}
