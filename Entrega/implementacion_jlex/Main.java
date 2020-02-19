package jaime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

	public static void main(String[] args){

		Reader input;

		try{
			input = new InputStreamReader(new FileInputStream("input.txt"));
			TinyLexicalAnalyzer la;
			la = new TinyLexicalAnalyzer(input);
			LexicalUnit unit;
			do{
				unit = la.yylex();
				System.out.println(unit);
			} while(unit.lexClass() != LexicalClass.EOF);
				
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}