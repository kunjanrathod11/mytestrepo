package my.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
	
	
	public ArrayList<Double> CreateArrayList(String file) throws FileNotFoundException{
		
		this.list = new ArrayList<>();
		
		Scanner scanner = new Scanner(new File(file));
		
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
