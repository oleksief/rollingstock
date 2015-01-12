/**
 * 
 */
package org.wahlzeit.rollingstock.model;

/**
 * @collaboration RollingStock / RollingStockType (Type Object)
 * @role Type Object
 * @author oleksief
 *
 */
public class RollingStockType {
	
	private String name;
	private RollingStockSolution rsSolution;
	
	public RollingStockType(String name, RollingStockSolution rsSolution) {
		this.name = name;
		this.rsSolution = rsSolution;
	}

	/**
	 * @methodtype get
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @methodtype set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @methodtype get
	 * @return the rolling stock solution
	 */
	public RollingStockSolution getRollingStockSolution() {
		assert rsSolution != null;	// pre
		return rsSolution;
	}
	
	/**
	 * 
	 * @methodtype set
	 */
	public void setRollingStockSolution(RollingStockSolution newSolution) {
		assert newSolution != null;	// pre
		rsSolution = newSolution;
	}
	
	

}
