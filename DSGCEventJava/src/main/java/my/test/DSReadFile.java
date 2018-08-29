/**
 * 
 */
package my.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kunjan Rathod
 *
 */
public class DSReadFile {
	
	public ArrayList<Double> list;
	
    static String between(String value, String a, String b) {
        // Return a substring between the two strings.
        int posA = value.indexOf(a);
        if (posA == -1) {
            return "";
        }
        int posB = value.lastIndexOf(b);
        if (posB == -1) {
            return "";
        }
        int adjustedPosA = posA + a.length();
        if (adjustedPosA >= posB) {
            return "";
        }
        return value.substring(adjustedPosA, posB);
    }
	
	
	public ArrayList<Double> CreateArrayList(String file) throws FileNotFoundException, URISyntaxException{
		
		this.list = new ArrayList<Double>();
		
		URL fileURL = getClass().getResource( "/" + file );
		
		if(fileURL == null) {
			
		     System.out.println("Unable to locate log file, please check the name.");
             System.exit(-3);
			
		}
		
		Scanner scanner = new Scanner(new File(fileURL.toURI()));
		
		while(scanner.hasNext()) {
			
			String line = scanner.nextLine();
			
			if(line.contains("GCInspector.java")) {
				
				//String s = line.substring(97, 100);
				
				String s = between(line, "in ", "ms");
				
				//System.out.println("Debug: "+s);
				
				this.list.add(Double.parseDouble(s));
				
				
			}
			
		}
		
		scanner.close();
		return this.list;
		
	}	 

}
