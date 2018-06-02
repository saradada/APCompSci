import java.io.*;
import java.util.Random;
public class LabArray {
    public static void main(String [] args) {
    	generateNumbersFile();
        // The name of the file to open.
        String fileName = "numbers.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);
           

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
    public static void generateNumbersFile(){
    	try{ 
	    	PrintWriter writer = new PrintWriter("numbers.txt", "UTF-8");
	    	Random rand = new Random();
	    	for (int i=0;i<20;i++){
	    		writer.println(rand.nextInt(1000)+1);
	    	}
	    	writer.close();
    	}
    	catch(Exception ex){
    		System.out.println(ex.getMessage());
    	}
    }
}