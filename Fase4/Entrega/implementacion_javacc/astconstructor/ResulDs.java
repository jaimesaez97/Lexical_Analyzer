package astconstructor;

import ast.Ds;

public class ResulDs {
	
	private Ds a;
	private boolean thersDec;
	
	public ResulDs() {
		this.thersDec = false;
		this.a = null;
	}
	
	public ResulDs(Ds def) {
		this.a = def;
		this.thersDec = true;
	}
	
	public Ds a() {
		return this.a;
	}
	
	public boolean thersDec() {
		return this.thersDec;
	}
	

}
