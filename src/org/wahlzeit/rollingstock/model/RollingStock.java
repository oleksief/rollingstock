/**
 * 
 */
package org.wahlzeit.rollingstock.model;


/**
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
