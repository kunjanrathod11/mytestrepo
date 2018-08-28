package my.test;

import java.util.ArrayList;
import java.util.Collections;

public class DSMedianFinder {
	
	public double middle;
	
	public double getLatencyMedian(ArrayList<Double> list) {
		
		Collections.sort(list);
		
		 //this.middle = list.size()/2;
		 
		 if(list.size()%2 == 0) {
			 
			 this.middle = (list.get(list.size()/2) + list.get(list.size()/2 - 1))/2;
			 
		 }else {
			 
			 this.middle = list.get(list.size()/2);
			 
		 }
		
		return this.middle;
		
	}

}
