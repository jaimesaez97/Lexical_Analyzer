package ast;

public class TArray extends T {
	
	public int tam;
	public T tipoAux;
	
	public TArray(String tam, T tipo) {
		this.tam = Integer.parseInt(tam);
		this.tipoAux = tipo;
	}
	
	@Override
	public int tam() {
		return this.tam;
	}
	
	@Override
	public T tipo() {
		return this.tipoAux;
	}
	
	@Override
	public TipoT tipoT() {
		return TipoT.ARRAY;
	}

	@Override
	public String toString() {
		return "array [" + this.tam + "] of " + this.tipoAux;
	}

}
