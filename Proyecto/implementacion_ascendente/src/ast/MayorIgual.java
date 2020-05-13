package ast;

public class MayorIgual extends EBinario {

	public MayorIgual(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.MAYORIGUAL;
	}

	@Override
	public String toString() {
		return "mayorigual{" + this.opnd1.toString() + " > " + this.opnd2.toString() +"}";  
	}
}
