package ast;

public abstract class BinaryE extends E {

	protected E opnd1;
	protected E opnd2;
	
	public BinaryE(E opnd1, E opnd2) {
		this.opnd1 = opnd1;
		this.opnd2 = opnd2;
	}
	
	public E opnd1() {
		return this.opnd1;
	}
	
	public E opnd2() {
		return this.opnd2;
	}

}
