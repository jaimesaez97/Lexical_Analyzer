package ast;

public class B {
	
	public Programa p;
	
	public B(Programa p) {
		this.p = p;
	}
	
	public Programa prog() {
		return this.p;
	}
	
	@Override
	public String toString() {
		return "bloque { " + this.p.toString() + " }";
	}

}
