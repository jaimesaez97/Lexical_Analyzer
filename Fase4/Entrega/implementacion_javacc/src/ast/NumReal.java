package ast;

public class NumReal extends E {
	
	private String value;
	
	public NumReal(String val) {
		this.value = val;
	}
	
	@Override
	public String val() {
		return this.value;
	}

	@Override
	public TipoE type() {
		return TipoE.NUMREAL;
	}

	@Override
	public String toString() {
		return "numReal{" + this.value + "}";
	}

}
