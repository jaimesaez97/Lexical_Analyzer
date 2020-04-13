package ast;

public class ISimple extends Is {
	
	public String id;
	public E exp;

	public ISimple(String id, E exp) {
		this.id = id;
		this.exp = exp;
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public E exp() {
		return this.exp;
	}
	
	@Override
	public TipoIs type() {
		return TipoIs.SIMPLE;
	}

	@Override
	public String toString() {
		return "ISimple{" + this.id + ", " + this.exp.toString() + "}";
	}

}
