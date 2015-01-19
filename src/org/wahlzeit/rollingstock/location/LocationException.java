/**
 * 
 */
package org.wahlzeit.rollingstock.location;

/**
 * Own exception class for Location
 * @author oleksief
 *
 */
public class LocationException extends Exception {
	
	/**
	 * Constructs a new exception with null as its detail message
	 * @methodtype constructor
	 */
	public LocationException() {
		super();
	}
	
	/**
	 * Constructs a new exception with the specified detail message
	 * @methodtype constructor
	 */
	public LocationException(String message) {
		super(message);
	}
	
	/**
	 * Constructs a new exception with the specified detail message and cause
	 * @methodtype constructor
	 */
	public LocationException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Constructs a new exception with the specified cause and a detail message of 
	 * (cause==null ? null : cause.toString()) 
	 * (which typically contains the class and detail message of cause)
	 * @methodtype constructor
	 */
	public LocationException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * @methodtype get
	 */
	public String getMessage()
    {
        return super.getMessage();
    }

}
