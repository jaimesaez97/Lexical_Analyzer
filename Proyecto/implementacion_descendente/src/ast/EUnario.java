package ast;

public abstract class EUnario extends E {
	
	@Override
	public String id() {
		throw new UnsupportedOperationException("id");
	}
	
	@Override
	public E opnd1() {
		throw new UnsupportedOperationException("opnd1");
	}

}
