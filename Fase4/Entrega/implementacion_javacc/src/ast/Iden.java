package ast;

public class Iden extends E {

	private String id;
	
	public Iden(String id) {
		this.id = id;
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public TipoE type() {
		return TipoE.IDEN;
	}

	@Override
	public String toString() {
		return "iden{" + this.id + "}";
	}

}
