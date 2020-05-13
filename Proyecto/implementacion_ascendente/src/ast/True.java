package ast;

public class True extends E {

	private String id;
	
	public True() {
		this.id = "True";
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public TipoE tipo() {
		return TipoE.TRUE;
	}

	@Override
	public String toString() {
		return this.id;
	}

}
