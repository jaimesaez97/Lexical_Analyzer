package synt;

import java.io.FileInputStream;

public class Main {

	private final static int NUM_FILES = 3;

	public static void main(String[] args){

		String inputFile;
		int i = 1;

		try{
			System.out.println("=================================================================");
            System.out.println("=================================================================");

            while(i <= NUM_FILES){
            	inputFile = "input";
            	inputFile = inputFile.concat(Integer.toString(i));
            	inputFile = inputFile.concat(".txt");

            	System.out.println(" 			FILE " + inputFile + "\n");
				
				TinySyntaxAnalyzer syna = new TinySyntaxAnalyzer(new FileInputStream(inputFile));
				syna.Sp();
				
				System.out.println("\n 			CORRECT SYNTAX!!\n");

                System.out.println("\n=================================================================");
                System.out.println("=================================================================");
                System.out.println("\n\n");

                i += 1;
         	}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}