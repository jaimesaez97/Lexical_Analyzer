package ast;

public class Suma extends EBinario {

	public Suma(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.SUMA;
	}

	@Override
	public String toString() {
		return "suma{" + this.opnd1.toString() + " + " + this.opnd2.toString() +"}";  
	}

}
