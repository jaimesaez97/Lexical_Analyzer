package ast;

public class Menor extends EBinario {

	public Menor(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.MENOR;
	}

	@Override
	public String toString() {
		return "menor{" + this.opnd1.toString() + " < " + this.opnd2.toString() +"}";  
	}
}
