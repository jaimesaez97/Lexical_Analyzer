package ast;

public class TIden extends T {
	
	public String name;
	
	public TIden(String name) {
		this.name = name;
	}
	
	@Override
	public String typeName() {
		return this.name;
	}
	

	@Override
	public String toString() {
		return typeName();
	}

}
