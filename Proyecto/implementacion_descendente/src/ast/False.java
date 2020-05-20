package ast;

public class False extends E {
	
	private String id;
	
	public False() {
		this.id = "False";
	}
	
	@Override
	public String id() {
		return this.id;
	}

	@Override
	public TipoE tipo() {
		return TipoE.FALSE;
	}

	@Override
	public String toString() {
		return this.id;
	}

}
