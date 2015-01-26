package org.wahlzeit.rollingstock.model.location;

import org.rollingstock.model.location.CartesianLocation;

import junit.framework.*;

/**
 * 
 * @author oleksief
 * 
 */
public class CartesianLocationTest extends TestCase {
	
	/**
	 * 
	 * @param name
	 */
	public CartesianLocationTest(String name) {
		super(name);
	}
	
	public void testAsString() {
		CartesianLocation loc1 = new CartesianLocation(1.0, 2.0, 3.0);
		CartesianLocation loc2 = new CartesianLocation();
		assertEquals(loc1.asString(), "(1.0, 2.0, 3.0)");
		assertEquals(loc2.asString(), "(0.0, 0.0, 0.0)");
	}
	
}
