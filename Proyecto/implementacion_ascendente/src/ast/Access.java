package ast;

public class Access extends EUnario {

	public Access(E op1) {
		super(op1);
	}
	
	@Override
	public TipoE tipo() {
		return TipoE.ACCESS;
	}
	
	@Override
	public String toString() {
		return "->" + this.opnd1.toString();
	}
}
