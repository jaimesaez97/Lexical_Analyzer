package ast;

public class CSimple extends Sc {

	private T tipo;
	private String id;
	
	public CSimple(T tipo, String id) {
		this.tipo = tipo;
		this.id = id;
	}
	
	@Override
	public T tipo() {
		return this.tipo;
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public TipoDeclaraciones tipoSc() {
		return TipoDeclaraciones.SIMPLE;
	}
	
	@Override
	public String toString() {
		return "  " + this.tipo + " " + this.id;
	}
}
