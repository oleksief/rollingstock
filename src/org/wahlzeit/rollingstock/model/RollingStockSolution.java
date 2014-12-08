/**
 * 
 */
package org.wahlzeit.rollingstock.model;

import org.wahlzeit.utils.EnumValue;

/**
 * The RollingStockSolution of a Rolling Stock Photo captures its solution (vehicle type) in the system.
 * The defined solutions are CRT (Commuter and Regional Trains), HST (High-Speed Trains),
 * LRT (Light Rail and Trams), Metros and Not-Defined (None). 
 * 
 * Value Object using Enum
 * 
 * @author oleksief
 *
 */
public enum RollingStockSolution implements EnumValue {
	
	NONE(0), CRT(1), HST(2), LRT(3), METRO(4);
	
	/**
	 * All possible states of RollingStockSolution
	 */
	private static RollingStockSolution[] allValues = {
		NONE, CRT, HST, LRT, METRO
	};
	
	private static String[] valueNames = {
		"None", "Commuter and Regional Train", "High-Speed Train", 
		"Light Rail and Tram", "Metro"	
	};
	
	/**
	 * Gets object of RollingStockSolution from int value
	 * @methodtype get
	 */
	public static RollingStockSolution getFromInt(int myValue) {
		assert ((myValue >= 0) && (myValue <= 4));		
		return allValues[myValue];		
	}
	
	/**
	 * Gets object of RollingStockSolution from String
	 * @methodtype get
	 */
	public static RollingStockSolution getFromString(String mySolution) throws IllegalArgumentException {
		for (RollingStockSolution sol: RollingStockSolution.values()) {
			if (valueNames[sol.asInt()].equals(mySolution)) {
				return sol;
			}
		}		
		throw new IllegalArgumentException("invalid RollingStockSolution string: " + mySolution);
	}
	
	private final int value;
	
	private RollingStockSolution(int myValue) {
		value = myValue;
	}

	@Override
	public int asInt() {
		assert ((value >= 0) && (value <= 4));
		return value;
	}
	
	@Override
	public String asString() {
		assert ((value >= 0) && (value <= 4));
		return valueNames[value];
	}

	@Override
	public EnumValue[] getAllValues() {
		assert allValues.length == valueNames.length;
		return allValues;
	}
	
	
	@Override
	public String getTypeName() {
		return "RollingStockSolution";
	}

}
