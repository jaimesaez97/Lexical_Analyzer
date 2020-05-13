package ast;

public class Equiv extends EBinario {

	public Equiv(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.EQUIV;
	}

	@Override
	public String toString() {
		return "equiv{" + this.opnd1.toString() + " == " + this.opnd2.toString() +"}";  
	}
}
