package ast;

public abstract class EUnario extends E {
	
	protected E opnd1;
	
	public EUnario(E op1) {
		this.opnd1 = op1;
	}
	
	@Override
	public E opnd1() {
		return this.opnd1;
	}

}
