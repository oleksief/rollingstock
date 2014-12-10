/**
 * 
 */
package org.wahlzeit.rollingstock.location;

/**
 * A GPS location provides a GPS implementation
 * 
 * @author oleksief
 *
 */
public class GpsLocation extends AbstractLocation {
	
	private double latitude;
	private double longitude;
	
	/**
	 * Default constructor
	 * @methodtype constructor
	 */
	public GpsLocation() throws IllegalArgumentException {
		this(0., 0.);
	}
	
	/**
	 * 
	 * @methodtype constructor
	 */
	public GpsLocation(double latitude, double longitude) throws IllegalArgumentException { 
		assertIsValidLatitude(latitude);
		assertIsValidLongitude(longitude);
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	/**
	 * Gets latitude of GPS
	 * @methodtype get
	 */
	public double getLatitude() {
		return latitude;	
	}
	
	/**
	 * Gets longitude of GPS
	 * @methodtype get
	 */
	public double getLongitude() {
		return longitude;
	}
	
	/**
	 * Sets latitude of GPS
	 * @methodtype set
	 */
	public void setLatitude(double latitude) throws IllegalArgumentException {
		assertIsValidLatitude(latitude);
		this.latitude = latitude;
	}
	
	/**
	 * Sets longitude of GPS
	 * @methodtype set
	 */
	public void setLongitude(double longitude) throws IllegalArgumentException {
		assertIsValidLongitude(longitude);
		this.longitude = longitude;
	}
	
	/**
	 * Returns a simple human readable description
	 * @methodtype conversion
	 */
	public String asString() {
		return "(" + latitude + ", " + longitude + ")";
	}
	
	/**
	 * Checks whether a latitude has a correct value
	 * @methodtype assertion
	 */
	protected void assertIsValidLatitude(double latitude) throws IllegalArgumentException {
		if (latitude < -90.0 && latitude > 90.0)
			throw new IllegalArgumentException("Latitude has invalid value!");
	}
	
	/**
	 * Checks whether a longitude has a correct value
	 * @methodtype assertion
	 */
	protected void assertIsValidLongitude(double longitude)  throws IllegalArgumentException{
		if (longitude < -180.0 && longitude > 180.0)
			throw new IllegalArgumentException("Longitude has invalid value!");
	}

	/**
	 * Converts GPS-coordinates to X-coordinate
	 * @methodtype get
	 */
	@Override
	public double getX() {
		// TODO conversion
		return 0.;
	}

	/**
	 * Converts GPS-coordinates to Y-coordinate
	 * @methodtype get
	 */
	@Override
	public double getY() {
		// TODO conversion
		return 0.;
	}

	/**
	 * Converts GPS-coordinates to Z-coordinate
	 * @methodtype get
	 */
	@Override
	public double getZ() {
		// TODO conversion
		return 0.;
	}

	

}
