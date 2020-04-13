package ast;

public class TReal extends T {
	
	public TReal() {
		
	}
	
	@Override
	public TipoT type() {
		return TipoT.REAL;	
	}
	
	@Override
	public String toString() {
		return "real";
	}

}
