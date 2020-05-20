package ast;

public class Or extends EBinario {

	public Or(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.OR;
	}

	@Override
	public String toString() {
		return "or{" + this.opnd1.toString() + " or " + this.opnd2.toString() +"}";  
	}
}
