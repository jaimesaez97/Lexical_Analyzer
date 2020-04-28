package ast;

public class True extends E {
	public String id;
	
	public True() {
			this.id = "true";
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public TipoE type() {
		return TipoE.TRUE;
	}

	@Override
	public String toString() {
		return this.id;
	}
}
