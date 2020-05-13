package ast;

public class DSimple extends Sd {
	

	private String id;
	
	public DSimple(String id) {
		this.id = id;
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public TipoSd tipo() {
		return TipoSd.SIMPLE;
	}

	public TipoDec tipoDec() {
		throw new UnsupportedOperationException("tipoDec");
	}

}
