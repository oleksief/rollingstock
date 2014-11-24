/**
 * 
 */
package org.wahlzeit.rollingstock;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.wahlzeit.model.Photo;
import org.wahlzeit.model.PhotoId;

/**
 * @author oleksief
 *
 */
public class RollingStockPhoto extends Photo {
	
	public static final String ROLLING_STOCK_SOLUTION = "rl_solution";
	protected RollingStockSolution rlsolution = RollingStockSolution.NONE;
	
	/**
	 * 
	 * @methodtype constructor
	 */
	public RollingStockPhoto() {
		super();		
	}
	
	/**
	 * 
	 * @methodtype constructor
	 */
	public RollingStockPhoto(PhotoId myId) {
		super(myId);
	}
	
	/**
	 * 
	 * @methodtype constructor
	 */
	public RollingStockPhoto(ResultSet rset) throws SQLException {
		assert rset != null;	// pre
		readFrom(rset);
	}
	
	@Override
	public void readFrom(ResultSet rset) throws SQLException {
		super.readFrom(rset);
		//TODO for database extension
		//rlsolution = RollingStockSolution.getFromInt(rset.getInt("rl_solution"));		
	}
	
	@Override
	public void writeOn(ResultSet rset) throws SQLException {
		super.writeOn(rset);
		//TODO for database extension
		//rset.updateInt("rl_solution", rlsolution.asInt());
	}
	
	/**
	 * 
	 * @methodtype get
	 */
	public RollingStockSolution getRollingStockSolution() {
		assert rlsolution != null;	// pre
		return rlsolution;
	}
	
	/**
	 * 
	 * @methodtype set
	 */
	public void setRollingStockSolution(RollingStockSolution newSolution) {
		assert newSolution != null;	// pre
		rlsolution = newSolution;
		incWriteCount();
		assert isDirty();			// post
	}

}
