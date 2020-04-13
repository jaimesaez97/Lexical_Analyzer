package ast;

public class ICompuesta extends Is {

	public String id;
	public E exp;
	public Is ins;
	
	public ICompuesta(Is ins, String id, E e) {
		this.id = id;
		this.exp = e;
		this.ins = ins;
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
	public Is ins() {
		return this.ins;
	}
	
	@Override
	public TipoIs type() {
		return TipoIs.COMPUESTA;
	}

	@Override
	public String toString() {
		return "ICompuesta { ISimple {" + this.id + ", " + this.exp.toString() + "}, ins: " + this.ins.toString() + "}";
	}

}
