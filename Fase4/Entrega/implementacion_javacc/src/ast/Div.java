package ast;

public class Div extends BinaryE {

	public Div(E opnd1, E opnd2) {
		super(opnd1, opnd2);
	}
	
	@Override
	public TipoE type() {
		return TipoE.DIV;
	}
	
	@Override
	public String toString() {
		return "div{" + this.opnd1.toString() + ", " + this.opnd2.toString() + "}";
	}

}
