package ast;

public class Resta extends EBinario {

	public Resta(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.RESTA;
	}

	@Override
	public String toString() {
		return "resta{" + this.opnd1.toString() + " - " + this.opnd2.toString() +"}";  
	}
}
