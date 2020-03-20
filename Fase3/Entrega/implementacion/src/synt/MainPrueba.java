package synt;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import lex.TinyLexicalAnalyzer;

public class MainPrueba {

	private final static int NUM_FILES = 3;

	public static void main(String[] args){

		Reader input;
		String inputFile;

		try{
			System.out.println("=================================================================");
            System.out.println("=================================================================");

            	inputFile = "input2.txt";

            	input = new InputStreamReader(new FileInputStream(inputFile));

            	System.out.println(" 			FILE " + inputFile + "\n");
            	TinyLexicalAnalyzer lexa = new TinyLexicalAnalyzer(input);
				TinySyntaxAnalyzer syna = new TinySyntaxAnalyzer(lexa);
				
				syna.setScanner(lexa);
				syna.parse();
				
				
				System.out.println("\n 			CORRECT SYNTAX!!\n");

                System.out.println("\n=================================================================");
                System.out.println("=================================================================");
                System.out.println("\n\n");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}