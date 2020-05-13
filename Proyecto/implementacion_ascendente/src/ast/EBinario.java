package ast;

public abstract class EBinario extends E {

	protected E opnd1;
	protected E opnd2;
	
	public EBinario(E op1, E op2) {
		this.opnd1 = op1;
		this.opnd2 = op2;
	}
	
	@Override
	public E opnd1() {
		return this.opnd1;
	}
	
	@Override
	public E opnd2() {
		return this.opnd2;
	}
}
