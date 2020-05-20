package ast;

public class Null extends E {
	
	private String id;
	
	public Null() {
		this.id = "Null";
	}
	
	@Override
	public String id() {
		return this.id;
	}

	@Override
	public TipoE tipo() {
		return TipoE.NULL;
	}

	@Override
	public String toString() {
		return this.id;
	}

}
