package ast;

public class PCompuesto extends Sp {
	
	private T tipo;
	private String id;
	private Sp params;
	
	public PCompuesto(Sp params, T type, String id) {
		this.params = params;
		this.tipo = type;
		this.id = id;
	}
	
	@Override
	public Sp param() {
		return this.params;
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public T tipo() {
		return this.tipo;
	}
	
	@Override
	public TipoSp tipoSp() {
		return TipoSp.COMPUESTO;
	}
	
	@Override
	public String toString() {
		return this.tipo.toString() + " " + this.id + " " + this.params.toString();
	}

}
