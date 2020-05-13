package lex;

import java_cup.runtime.Symbol;

public class ALexOperations {

	private ProyectLexicalAnalyzer _alex;
	
	public ALexOperations(ProyectLexicalAnalyzer alex) {
		this._alex = alex;
	}

	public Symbol unitEOF() {
		return new UnivaluatedLexicalUnit(_alex.row(), LexicalClass.EOF, _alex.lexeme());
	}
	
	
}
