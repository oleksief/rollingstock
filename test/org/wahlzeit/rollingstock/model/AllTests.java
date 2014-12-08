/**
 * 
 */
package org.wahlzeit.rollingstock.model;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author oleksief
 *
 */
public class AllTests extends TestSuite {
	
	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(RollingStockSolutionTest.class);
		suite.addTestSuite(RollingStockPhotoFactoryTest.class);
		return suite;
	}

}
