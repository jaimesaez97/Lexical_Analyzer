package ast;

public class Not extends EUnario {

	private E opnd1;
	
	public Not(E op1) {
		this.opnd1 = op1;
	}
	
	@Override
	public E opnd1() {
		return this.opnd1;
	}
	
	@Override
	public String toString() {
		return "not " + this.opnd1.toString();
	}

	@Override
	public TipoE tipo() {
		return TipoE.NOT;
	}

}
