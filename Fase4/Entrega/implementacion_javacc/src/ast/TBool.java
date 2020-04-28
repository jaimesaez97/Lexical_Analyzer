package ast;

public class TBool extends T {
	
	public TBool() {
		
	}

	@Override
	public TipoT type() {
		return TipoT.BOOL;
	}
	
	@Override
	public String toString() {
		return "bool";
	}

}
