package ast;

public class Programa {

	private RPrograma rp;
	private Instrucciones ins;
	
	public Programa(RPrograma rp, Instrucciones ins) {
		this.rp = rp;
		this.ins = ins;
	}
	
	public RPrograma rp() {
		return this.rp;
	}
	
	public Instrucciones ins() {
		return this.ins;
	}
	
	public TipoPrograma tipoProg() {
		return rp.tipoProg();
	}
	
	public String toString() {
		return this.rp.toString() + "\nins:" + this.ins.toString();
	}
}
