package ast;

public class Div extends EBinario {

	public Div(E op1, E op2) {
		super(op1, op2);
	}

	@Override
	public TipoE tipo() {
		return TipoE.DIV;
	}

	@Override
	public String toString() {
		return "div{" + this.opnd1.toString() + " / " + this.opnd2.toString() +"}";  
	}
}
