package ast;

public class Resto extends EBinario {

	public Resto(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.RESTO;
	}

	@Override
	public String toString() {
		return "resto{" + this.opnd1.toString() + ", " + this.opnd2.toString() +"}";  
	}
}
