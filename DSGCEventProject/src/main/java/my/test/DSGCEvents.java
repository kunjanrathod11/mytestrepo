/**
 * 
 */
package my.test;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * @author Kunjan Rathod
 *
 */
public class DSGCEvents {

	
	private static String file = "system.log";
	
	
	public static void main(String[] args) {

    	if(args.length > 0) {
    		
            /* Proper Usage is: 
             * java -jar DSGCEvents.jar /your/absolute/location/to/system.log
             */
    		
    		DSGCEvents.file = args[0];
    	}
     
	
		
		DSReadFile readFile = new DSReadFile();
		ArrayList<Double> list;
		
		
		try {
			list = readFile.CreateArrayList(DSGCEvents.file);
			
			System.out.println("The Number of GC events are : "+new DSGetGCCount().getGarbageCollectionCount(list));
			System.out.println("The median value of the gc latency from all GC events is : "+new DSMedianFinder().getLatencyMedian(list)+"ms");
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		

	}

}
