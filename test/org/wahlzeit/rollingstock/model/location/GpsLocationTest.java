package org.wahlzeit.rollingstock.model.location;

import org.rollingstock.model.location.GpsLocation;
import org.rollingstock.model.location.LocationException;

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
		GpsLocation loc1, loc2;
		try {
			loc1 = new GpsLocation(49.5907, 11.0143);
			loc2 = new GpsLocation();
			assertEquals(loc1.asString(), "(49.5907, 11.0143)");
			assertEquals(loc2.asString(), "(0.0, 0.0)");
		} catch (LocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
