package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExp {

	public static void main(String[] args)throws FileNotFoundException {
		
		readFile("myFile.text");
		
	}
	     // compile time check method
	     private static void readFile(String fileName)throws FileNotFoundException{
	    		FileReader reader = new FileReader(fileName);// if I dont add throw decleartion it will complain
	    // it went thro Stack Trace When i run it 	
           System.out.println("Hey that file does not exist");
	}

}
