package ast;

public class Nl extends Instruccion {

	@Override
	public String toString() {
		return "nl\n";
	}

	@Override
	public TipoIns tipoIns() {
		return TipoIns.INS_NL;
	}
}
