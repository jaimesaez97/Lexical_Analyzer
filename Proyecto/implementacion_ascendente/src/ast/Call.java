package ast;

public class Call extends ISimple {
	
	private String id;
	private Parametros param;
	
	public Call(String id, Parametros p) {
		this.id = id;
		this.param = p;
	}
	
	@Override
	public TipoIns tipoIns() {
		return TipoIns.INS_CALL;
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public Parametros param() {
		return this.param;
	}
	
	@Override
	public String toString() {
		return "call" + this.param;
	}

}
