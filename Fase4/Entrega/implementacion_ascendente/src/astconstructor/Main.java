package astconstructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;

import lex.TinyLexicalAnalyzer;

public class Main {
	
	public static final int NUM_FILES = 3;

	public static void main(String[] args) {
		String inputFile;
		Reader input;
		int i = 1;
		
		try {
			
			while(i <= NUM_FILES) {
				System.out.println("=================================================================");
				System.out.println("=================================================================");
				inputFile = "input";
				inputFile = inputFile.concat(Integer.toString(i));
				inputFile = inputFile.concat(".txt");
				
				System.out.println(" 			FILE " + inputFile + "\n");
							
				input = new InputStreamReader(new FileInputStream(inputFile));
				
				TinyLexicalAnalyzer lex = new TinyLexicalAnalyzer(input);
				TinySyntaxAnalyzer asint = new TinySyntaxAnalyzer(lex);
				System.out.println(asint.parse().value);
				
				System.out.println("\n=================================================================");
	            System.out.println("=================================================================");
	            System.out.println("\n\n");
	
	            i += 1;
            }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}