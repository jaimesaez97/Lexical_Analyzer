package ast;

public class NumInt extends E {

	private String value;
	
	public NumInt(String val) {
		this.value = val;
	}
	
	@Override
	public String val() {
		return this.value;
	}
	
	@Override
	public TipoE type() {
		return TipoE.NUMINT;
	}

	@Override
	public String toString() {
		return "int{" + this.value + "}";
	}

}
