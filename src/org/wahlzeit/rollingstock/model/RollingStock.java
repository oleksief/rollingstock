/**
 * 
 */
package org.wahlzeit.rollingstock.model;


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
	
	public RollingStock(String name, RollingStockType rsType) {
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
	public void setName(String name) {
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
	public void setRsType(RollingStockType rsType) {
		this.rsType = rsType;
	}


}
