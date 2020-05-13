package ast;

public class MenorIgual extends EBinario {

	public MenorIgual(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.MENORIGUAL;
	}

	@Override
	public String toString() {
		return "menorigual{" + this.opnd1.toString() + " <= " + this.opnd2.toString() +"}";  
	}
}
