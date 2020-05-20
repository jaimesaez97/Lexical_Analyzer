package ast;

public class TPointer extends T {

	private T tipo;
	
	public TPointer(T tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public T tipo() {
		return this.tipo;
	}
	
	@Override
	public TipoT tipoT() {
		return TipoT.POINTER;
	}
	
	@Override
	public String toString() {
		return "pointer " + this.tipo.toString();
	}

}
