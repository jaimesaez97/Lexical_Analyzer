package ast;

public class CCompuesta extends Sc {

	private T tipo;
	private String id;
	private Sc campos;
	
	public CCompuesta(T tipo, String id, Sc campos) {
		this.tipo = tipo;
		this.id = id;
		this.campos = campos;
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
	public Sc campos() {
		return this.campos;
	}

	@Override
	public TipoSc tipoSc() {
		return TipoSc.SIMPLE;
	}
	
	@Override
	public String toString() {
		return "  " + this.tipo + " " + this.id + ";\n" + this.campos.toString();
	}
}
