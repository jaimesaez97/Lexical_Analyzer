package ast;

public class False extends E {

	public String id;
	
	public False() {
			this.id = "false";
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public TipoE type() {
		return TipoE.FALSE;
	}

	@Override
	public String toString() {
		return this.id;
	}

}
