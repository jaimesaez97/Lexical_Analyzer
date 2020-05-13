package ast;

public class TString extends T {
	
	public TString() {
		
	}
	
	@Override
	public TipoT tipoT() {
		return TipoT.STRING;
	}

	@Override
	public String toString() {
		return "string";
	}

}
