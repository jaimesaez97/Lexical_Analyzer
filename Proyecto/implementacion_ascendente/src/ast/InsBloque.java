package ast;

public class InsBloque extends ISimple {

	public B b;
	
	public InsBloque(B b) {
		this.b = b;
	}
	
	@Override
	public TipoIns tipoIns() {
		return TipoIns.INS_BLOQUE;
	}
	
	@Override
	public B bloque() {
		return this.b;
	}
	
	@Override
	public String toString() {
		return "insBloque" + this.b;
	}
}
