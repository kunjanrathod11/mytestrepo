package my.test;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;

public class DSGetGCCountTest extends TestCase {

	public final void testGetGarbageCollectionCount() {

		System.out.println("Test Count");
		int expResult = 6;
		ArrayList<Double> doubleList = new ArrayList<Double>(Arrays.asList(3.0,2.0,1.0,9.0,4.0,13.0));
		int result = new DSGetGCCount().getGarbageCollectionCount(doubleList);
		assertEquals(expResult, result);
	
	}

}
