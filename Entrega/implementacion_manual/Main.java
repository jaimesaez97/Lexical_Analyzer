import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

    private final int NUM_FILES = 3;
    
	public static void main(String[] args){

		Reader input;
        int i = 1;
        String inputFile;
        
		try{
            while(i <= NUMFILES){
                inputFile = "input";
                inputFile.concat(i);
                inputFile.concat(".txt");
            
                input = new InputStreamReader(new FileInputStream(inputFile));
                
                LexicalAnalyzer la;
                la = new LexicalAnalyzer(input);
                LexicalUnit unit;
                do{
                    unit = la.nextToken();
                    System.out.println(unit);
                } while(unit.lexClass() != LexicalClass.EOF);
                
                i += 1;
            }
				
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}