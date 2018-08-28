package my.test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DSGCEvents {

	public static void main(String[] args) {
		
    	if(args.length == 0) {
    		System.out.println("Proper Usage is: java -jar DSGCEvents.jar /your/absolute/location/to/system.log");
    		System.exit(0);
    	}
     
	
		
		DSReadFile readFile = new DSReadFile();
		ArrayList<Double> list;
		
		String file = args[0];
		
		try {
			list = readFile.CreateArrayList(file);
			
			System.out.println("The Number of GC events are : "+new DSGetGCCount().getGarbageCollectionCount(list));
			System.out.println("The median value of the gc latency from all GC events is : "+new DSMedianFinder().getLatencyMedian(list)+"ms");
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}		
		

	}

}
