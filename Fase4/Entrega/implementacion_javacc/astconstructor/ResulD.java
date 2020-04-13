package astconstructor;

import ast.T;

public class ResulD {

	private String id;
	private T type;
	
	public ResulD(String id, T type) {
		this.id = id;
		this.type = type;
	}
	
	public String id() {
		return this.id;
	}
	
	public T type() {
		return this.type;
	}
}
