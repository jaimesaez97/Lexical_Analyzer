package ast;

public class ISimple extends Si {

	public ISimple() {
		super();
	}
	
	@Override
	public TipoSi tipo() {
		return TipoSi.SIMPLE;
	}
	
	@Override
	public String id() {
		throw new UnsupportedOperationException("id");
	}
	
	@Override
	public E exp1() {
		throw new UnsupportedOperationException("exp1");
	}
	
	@Override
	public E exp2() {
		throw new UnsupportedOperationException("exp2");
	}
	
	@Override
	public Si ins1() {
		throw new UnsupportedOperationException("ins1");
	}
	
	@Override
	public Si ins2() {
		throw new UnsupportedOperationException("ins2");
	}
	
	@Override
	public Parametros param() {
		throw new UnsupportedOperationException("param");
	}
	@Override
	public B bloque() {
		throw new UnsupportedOperationException("bloque");
	}

	public TipoIns tipoIns() {
		throw new UnsupportedOperationException("tipoIns");
	}
}
