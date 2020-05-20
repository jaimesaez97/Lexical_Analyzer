package ast;

public class NonEquiv extends EBinario {

	public NonEquiv(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.NONEQUIV;
	}

	@Override
	public String toString() {
		return "nonequiv{" + this.opnd1.toString() + " != " + this.opnd2.toString() +"}";  
	}
}
