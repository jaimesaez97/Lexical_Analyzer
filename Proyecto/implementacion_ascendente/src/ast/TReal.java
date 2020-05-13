package ast;

public class TReal extends T {

	public TReal() {		

	}
	
	@Override
	public TipoT tipoT() {
		return TipoT.REAL;
	}
	
	@Override
	public String toString() {
		return "real";
	}
	
	

}
