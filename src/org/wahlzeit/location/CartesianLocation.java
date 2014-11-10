/**
 * 
 */
package org.wahlzeit.location;

/**
 * @author oleksief
 *
 */
public class CartesianLocation extends AbstractLocation {

	private double x, y, z;
	
	public CartesianLocation() {
		this(0., 0., 0.);
	}
	
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
	 * returns a simple human readable description
	 * @methodtype conversion
	 */
	@Override
	public String asString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}

}
