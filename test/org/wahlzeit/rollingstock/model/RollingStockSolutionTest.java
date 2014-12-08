/**
 * 
 */
package org.wahlzeit.rollingstock.model;

import junit.framework.TestCase;

/**
 * @author oleksief
 *
 */
public class RollingStockSolutionTest extends TestCase {
	
	/**
	 * 
	 * @param name
	 */
	public RollingStockSolutionTest(String name) {
		super(name);
	}
	
	/**
	 * 
	 */
	public void testGetFromInt() {
		assertTrue(RollingStockSolution.getFromInt(RollingStockSolution.NONE.asInt()) 
				== RollingStockSolution.NONE);
		assertTrue(RollingStockSolution.getFromInt(RollingStockSolution.CRT.asInt()) 
				== RollingStockSolution.CRT);
		assertTrue(RollingStockSolution.getFromInt(RollingStockSolution.METRO.asInt()) 
				== RollingStockSolution.METRO);
	}
	
	/**
	 * 
	 */
	public void testGetFromString() {
		assertTrue(RollingStockSolution.getFromString(RollingStockSolution.NONE.asString())
				.equals(RollingStockSolution.NONE));
		assertTrue(RollingStockSolution.getFromString(RollingStockSolution.CRT.asString())
				.equals(RollingStockSolution.CRT));
		assertTrue(RollingStockSolution.getFromString(RollingStockSolution.METRO.asString())
				.equals(RollingStockSolution.METRO));
	}
	

}
