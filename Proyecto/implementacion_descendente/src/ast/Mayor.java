package ast;

public class Mayor extends EBinario {

	public Mayor(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.MAYOR;
	}

	@Override
	public String toString() {
		return "mayor{" + this.opnd1.toString() + " > " + this.opnd2.toString() +"}";  
	}
}
