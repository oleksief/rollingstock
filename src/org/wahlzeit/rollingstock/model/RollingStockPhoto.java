/**
 * 
 */
package org.wahlzeit.rollingstock.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.wahlzeit.model.Photo;
import org.wahlzeit.model.PhotoId;

/**
 * A photo represents a user-provided (uploaded) photo of Rolling stock.
 * 
 * @collaboration RollingstockPhoto / RollingStock
 * @role Client
 * @author oleksief
 *
 */
public class RollingStockPhoto extends Photo {
	
	private RollingStock rollingStock;
	
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
	
	/**
	 * 
	 * @methodtype constructor
	 */
	public RollingStockPhoto(Photo photo) {
		super(photo.getId());		
	}
	
	@Override
	public void readFrom(ResultSet rset) throws SQLException {
		super.readFrom(rset);
		RollingStockType rsType = new RollingStockType(rset.getString("rs_type_name"), 
				RollingStockSolution.getFromInt(rset.getInt("rs_solution")));
		rollingStock = new RollingStock(rset.getString("rs_name"), rsType);		
	}
	
	@Override
	public void writeOn(ResultSet rset) throws SQLException {
		super.writeOn(rset);
		assert(rollingStock != null);
		rset.updateString("rs_name", rollingStock.getName());
		rset.updateString("rs_type_name", rollingStock.getRsType().getName());
		rset.updateInt("rs_solution", rollingStock.getRsType().getRollingStockSolution().asInt());
	}
	
	/**
	 * 
	 * @methodtype get
	 */
	public RollingStock getRollingStock() {
		assert rollingStock != null;
		return rollingStock; 
	}
	
	/**
	 * 
	 * @methodtype set
	 */
	public void setRollingStock(RollingStock rollingStock) {
		assert rollingStock != null;
		this.rollingStock = rollingStock;
		incWriteCount();
	}

}
