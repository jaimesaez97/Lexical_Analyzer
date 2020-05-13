package ast;

public class TInt extends T {
	
	public TInt() {
		
	}
	
	@Override
	public TipoT tipoT() {
		return TipoT.INT;
	}

	@Override
	public String toString() {
		return "int";
	}

}
