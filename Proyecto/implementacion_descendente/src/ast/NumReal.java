package ast;

public class NumReal extends E {
	
	public String value;
	
	public NumReal(String val) {
		this.value = val;
	}
	
	@Override
	public String val() {
		return this.value;
	}

	@Override
	public TipoE tipo() {
		return TipoE.NUMREAL;
	}

	@Override
	public String toString() {
		return "real{" + this.value + "}";
	}

}
