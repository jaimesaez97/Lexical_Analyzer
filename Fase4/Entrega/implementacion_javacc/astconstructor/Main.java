package astconstructor;

import java.io.Reader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
	
	public static final int NUM_FILES = 3;
	
	public static void main(String[] argc) {
		String inputFile;
		Reader input;
		ASTTinyConstructor asint;
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
				asint = new ASTTinyConstructor(input);
				System.out.println(asint.S());
				
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
