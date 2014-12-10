/**
 * 
 */
package org.wahlzeit.rollingstock.location;

/**
 * @author oleksief
 *
 */
public interface Location {
	
	/**
	 * returns a simple human readable description
	 */
	String asString();
	
	/**
	 * returns latitude
	 */
	double getLatitude();
	
	/**
	 * returns longitude
	 */
	double getLongitude();
	
	/**
	 * returns X-coordinate
	 */
	double getX();
	
	/**
	 * returns Y-coordinate
	 */
	double getY();
	
	/**
	 * returns Z-coordinate
	 */
	double getZ();

}
