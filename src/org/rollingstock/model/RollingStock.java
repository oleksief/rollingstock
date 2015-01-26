/**
 * 
 */
package org.rollingstock.model;


/**
 * Provides main domain functionality
 * Provides descriptive information common to all instances of a type
 * 
 * @collaboration RollingstockPhoto / RollingStock
 * @role Domain Object
 * 
 * @collaboration RollingStock / RollingStockType (Type Object)
 * @role Base Object
 * 
 * @author oleksief
 *
 */
public class RollingStock {
	
	private String name;
	private RollingStockType rsType;
	
	public RollingStock(String name, RollingStockType rsType) throws IllegalArgumentException, NullPointerException{
		if (name == null || name.isEmpty())
			throw new IllegalArgumentException("RollingStock constructor has failed. Name is null or empty.");
		if (rsType == null)
			throw new NullPointerException("RollingStock constructor has failed. Type is null.");
		this.name = name;
		this.rsType = rsType;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (name == null || name.isEmpty())
			throw new IllegalArgumentException("Name is null or empty.");
		this.name = name;
	}

	/**
	 * @return the rsType
	 */
	public RollingStockType getRsType() {
		return rsType;
	}

	/**
	 * @param rsType the rsType to set
	 */
	public void setRsType(RollingStockType rsType) throws NullPointerException {
		if (rsType == null)
			throw new NullPointerException("RollingStockType is null.");
		this.rsType = rsType;
	}


}
