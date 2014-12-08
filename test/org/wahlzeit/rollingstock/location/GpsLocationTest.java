package org.wahlzeit.rollingstock.location;

import org.wahlzeit.rollingstock.location.GpsLocation;

import junit.framework.*;

/**
 * 
 * @author oleksief
 * 
 */
public class GpsLocationTest extends TestCase {
	
	/**
	 * 
	 * @param name
	 */
	public GpsLocationTest(String name) {
		super(name);
	}
	
	public void testAsString() {
		GpsLocation loc1 = new GpsLocation(49.5907, 11.0143);
		GpsLocation loc2 = new GpsLocation();
		assertEquals(loc1.asString(), "(49.5907, 11.0143)");
		assertEquals(loc2.asString(), "(0.0, 0.0)");
	}

}
