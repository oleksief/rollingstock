/**
 * 
 */
package org.rollingstock.model.location;

/**
 * A Cartesian location provides a Cartesian implementation
 * 
 * @collaboration Location
 * @role Value Class
 * @author oleksief
 *
 */
public class CartesianLocation extends AbstractLocation {

	private double x, y, z;
	
	/**
	 * 
	 * @methodtype constructor
	 */
	public CartesianLocation() {
		this(0., 0., 0.);
	}
	
	/**
	 * 
	 * @methodtype constructor
	 */
	public CartesianLocation(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Gets coordinate x
	 * @methodtype get
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * Gets coordinate y
	 * @methodtype get
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * Gets coordinate z
	 * @methodtype get
	 */
	public double getZ() {
		return z;
	}
	
	/**
	 * Sets coordinate x
	 * @methodtype set
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * Sets coordinate y
	 * @methodtype set
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Sets coordinate z
	 * @methodtype set
	 */
	public void setZ(double z) {
		this.z = z;
	}
	
	/**
	 * Returns a simple human readable description
	 * @methodtype conversion
	 */
	@Override
	public String asString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}

	/**
	 * Converts Cartesian coordinates to latitude
	 * @methodtype get
	 */
	@Override
	public double getLatitude() {
		// TODO conversion
		return 0.;
	}
	
	/**
	 * Converts Cartesian coordinates to longitude
	 * @methodtype get
	 */
	@Override
	public double getLongitude() {
		// TODO conversion
		return 0.;
	}

}
