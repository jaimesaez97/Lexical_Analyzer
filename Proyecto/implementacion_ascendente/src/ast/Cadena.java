package ast;

public class Cadena extends E {

	public String value;
	
	public Cadena(String val) {
		this.value = val;
	}
	
	@Override
	public String val() {
		return this.value;
	}
	
	@Override
	public TipoE tipo() {
		return TipoE.CADENA;
	}

	@Override
	public String toString() {
		return "cadena{" + this.value + "}";
	}

}
