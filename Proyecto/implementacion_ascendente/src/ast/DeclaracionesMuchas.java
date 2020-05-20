package ast;

public class DeclaracionesMuchas extends Declaraciones {
	
	private Declaracion dec;
	private Declaraciones decs;
	
	public DeclaracionesMuchas(Declaraciones decs, Declaracion dec) {
		this.dec = dec;
		this.decs = decs;
	}
	
	@Override
	public Declaracion dec() {
		return this.dec;
	}
	
	@Override
	public Declaraciones decs() {
		return this.decs;
	}
	
	@Override
	public String toString() {
		return "";
	}
	@Override
	public TipoSd tipoDec() {
		return TipoSd.COMPUESTA;
	}

}
