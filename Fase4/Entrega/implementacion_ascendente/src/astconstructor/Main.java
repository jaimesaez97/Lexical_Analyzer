package astconstructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;

import lex.TinyLexicalAnalyzer;

public class Main {

	public static void main(String[] args) {
		Reader input;
		try {
			input = new InputStreamReader(new FileInputStream("input1.txt"));
			TinyLexicalAnalyzer lex = new TinyLexicalAnalyzer(input);
			TinySyntaxAnalyzer asint = new TinySyntaxAnalyzer(lex);
			System.out.println(asint.parse().value);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}