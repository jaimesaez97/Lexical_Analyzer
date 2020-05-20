package ast;

public class Access extends EUnario {

	private String id;
	
	public Access(String id) {
		this.id = id;
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public TipoE tipo() {
		return TipoE.ACCESS;
	}
	
	@Override
	public String toString() {
		return "->" + this.id;
	}
}
