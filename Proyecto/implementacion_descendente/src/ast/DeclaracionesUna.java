package ast;

public class DeclaracionesUna extends Declaraciones {

	private Declaracion dec;
	
	public DeclaracionesUna(Declaracion dec) {
		this.dec = dec;
	}
	
	@Override
	public Declaracion dec() {
		return this.dec;
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public TipoSd tipoDec() {
		return TipoSd.SIMPLE;
	}
	
	
	
}
