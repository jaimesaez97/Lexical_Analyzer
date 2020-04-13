package err;
import lex.LexicalUnit;
import astconstructor.LexicalClass;

public class TinyErrorMgmt {

	public void lexicalError(int row, String lexeme) {
		System.out.println("ERROR in row " + row + ". Unexpected character " + lexeme);
		System.exit(1);
	}
	
	public void syntaxError(int row, LexicalClass found, LexicalClass... expected) {
		System.out.println("ERROR in row "+ row + ". Found class " + found + " expected class: ");
		for(LexicalClass exp : expected) {
			System.out.println(exp + " ");
		}
		System.exit(1);
	}
	
	public void fatalError(Exception e) {
		System.out.println(e);
		e.printStackTrace();
		System.exit(1);
	}

	public void syntaxError(LexicalUnit lexicalUnit) {
		System.out.println("ERROR");
	}
	
}
