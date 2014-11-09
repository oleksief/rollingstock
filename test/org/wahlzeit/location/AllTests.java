package org.wahlzeit.location;

import junit.framework.*;

/**
 * 
 * @author oleksief
 * 
 */
public class AllTests extends TestSuite {
	
	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(GpsLocationTest.class);
		suite.addTestSuite(CartesianLocationTest.class);
		return suite;
	}

}
