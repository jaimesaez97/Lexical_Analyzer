package astconstructor;

import ast.E;

public class ResulI {

	private String id;
	private E exp;
	
	public ResulI(String id, E exp) {
		this.id = id;
		this.exp = exp;
	}
	
	public E exp() {
		return this.exp;
	}
	
	public String id() {
		return this.id;
	}
}
