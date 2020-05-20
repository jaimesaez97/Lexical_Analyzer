package ast;

public class Indirect extends EUnario {

	private E opnd1;
	
	public Indirect(E op1) {
		this.opnd1 = op1;
	}
	
	@Override
	public E opnd1() {
		return this.opnd1;
	}
	
	@Override
	public TipoE tipo() {
		return TipoE.INDIRECT;
	}
	
	@Override
	public String toString() {
		return "* " + this.opnd1.toString();
	}
}
