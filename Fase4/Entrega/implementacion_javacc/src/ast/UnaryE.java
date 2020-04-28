package ast;

public abstract class UnaryE extends E {

	protected E opnd1;
	
	public UnaryE(E opnd1) {
		this.opnd1 = opnd1;
	}
	
	public E opnd1() {
		return this.opnd1;
	}
}
