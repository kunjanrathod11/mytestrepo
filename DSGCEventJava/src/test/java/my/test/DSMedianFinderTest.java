package my.test;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;

public class DSMedianFinderTest extends TestCase {

	public final void testGetLatencyMedian() {
		
		System.out.println("Test Median");
		Double expResult = 3.0;
		ArrayList<Double> doubleList = new ArrayList<Double>(Arrays.asList(3.0,2.0,1.0,9.0,13.0));
		Double result = new DSMedianFinder().getLatencyMedian(doubleList);
		assertEquals(expResult, result);

		expResult = 3.5;
		doubleList = new ArrayList<Double>(Arrays.asList(3.0,2.0,1.0,9.0,4.0,13.0));
		result = new DSMedianFinder().getLatencyMedian(doubleList);
		assertEquals(expResult, result);
	}

}
