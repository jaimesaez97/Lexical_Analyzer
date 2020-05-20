package ast;

public class PSimple extends Sp {

	private T tipo;
	private String id;
	
	public PSimple(String id, T t) {
		this.tipo = t;
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
	public String toString() {
		return this.tipo + " " + this.id;
	}
}
