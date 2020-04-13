package astconstructor;

import ast.Is;

public class ResulIs {

	private Is a;
	private boolean thersIns;
	
	public ResulIs() {
		this.a = null;
		this.thersIns = false;
	}
	
	public ResulIs(Is a) {
		this.a = a;
		this.thersIns = true;
	}
	
	public Is a() {
		return this.a;
	}
	
	public boolean thersIns() {
		return this.thersIns;
	}
	
}
