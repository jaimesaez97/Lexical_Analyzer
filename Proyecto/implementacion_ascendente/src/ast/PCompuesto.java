package ast;

public class PCompuesto extends Sp {
	
	private T tipo;
	private String id;
	private boolean ref;	/* & */
	private Sp params;
	
	public PCompuesto(Sp params, T type, String id, boolean ref) {
		this.params = params;
		this.tipo = type;
		this.id = id;
		this.ref = ref;
	}
	
	@Override
	public Sp params() {
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
	public boolean ref() {
		return this.ref;
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
