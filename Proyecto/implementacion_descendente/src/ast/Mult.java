package ast;

public class Mult extends EBinario {

	public Mult(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.MULT;
	}

	@Override
	public String toString() {
		return "mult{" + this.opnd1.toString() + " * " + this.opnd2.toString() +"}";  
	}
}
