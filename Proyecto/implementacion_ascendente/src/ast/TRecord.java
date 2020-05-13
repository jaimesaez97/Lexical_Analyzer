package ast;

public class TRecord extends T {
	
	public Sc campos;
	
	public TRecord(Sc campos) {
		this.campos = campos;
	}
	
	@Override
	public Sc campos() {
		return this.campos;
	}
	
	@Override
	public TipoT tipoT() {
		return TipoT.ARRAY;
	}

	@Override
	public String toString() {
		return "record{\n" + this.campos.toString();
	}

}
