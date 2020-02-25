
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class SyntaxMain {

	private final static int NUM_FILES = 3;

	public static void main(String[] args){

		Reader input;
		String inputFile;
		int i = 1;

		try{
			System.out.println("=================================================================");
            System.out.println("=================================================================");

            while(i <= NUM_FILES){
            	inputFile = "input";
            	inputFile = inputFile.concat(Integer.toString(i));
            	inputFile = inputFile.concat(".txt");

            	input = new InputStreamReader(new InputFileStream("inp"));

            	System.out.println(" 			FILE " + inputFile + "\n");
				
				TinySyntaxAnalyzer syna = new TinySyntaxAnalyzer(input);
				syna.Sp();

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