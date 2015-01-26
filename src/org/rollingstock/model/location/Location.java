/**
 * 
 */
package org.rollingstock.model.location;

/**
 * An interface definition for location classes
 * 
 * @collaboration Location
 * @role Client
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
