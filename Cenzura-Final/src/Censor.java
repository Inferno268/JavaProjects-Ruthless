import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Censor{
	public static String censor(String... words) {        //Censor method 
	    String word = "";								  //creates empty String 
	    for (String x : words)							  //creates String then convert into char
	        for (int y = 0; y < x.length(); y++)		  	
	        	
	            word += String.format("|((?<=%s)%s(?=%s))",						
	            		x.substring(0, y), x.charAt(y), x.substring(y + 1));		//converts into format then check each index and compairs to Strings from Main
	    return word.substring(1);						
	}

}
