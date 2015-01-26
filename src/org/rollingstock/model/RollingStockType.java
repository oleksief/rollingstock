/**
 * 
 */
package org.rollingstock.model;

/**
 * @collaboration RollingStock / RollingStockType (Type Object)
 * @role Type Object
 * @author oleksief
 *
 */
public class RollingStockType {
	
	private String name;
	private RollingStockSolution rsSolution;
	
	public RollingStockType(String name, RollingStockSolution rsSolution) throws IllegalArgumentException, NullPointerException {
		if (name == null || name.isEmpty())
			throw new IllegalArgumentException("RollingStockType constructor has failed. Name is null or empty.");
		if (rsSolution == null)
			throw new NullPointerException("RollingStockType constructor has failed. Solution is null.");
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
	public void setName(String name) throws IllegalArgumentException {
		if (name == null || name.isEmpty())
			throw new IllegalArgumentException("Name is null or empty.");
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
	public void setRollingStockSolution(RollingStockSolution newSolution) throws NullPointerException {
		if (newSolution == null)
			throw new NullPointerException("Solution is null.");		
		rsSolution = newSolution;
	}
	
	

}
