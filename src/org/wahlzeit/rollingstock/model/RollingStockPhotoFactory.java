/**
 * 
 */
package org.wahlzeit.rollingstock.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.wahlzeit.model.Photo;
import org.wahlzeit.model.PhotoFactory;
import org.wahlzeit.model.PhotoId;
import org.wahlzeit.services.SysLog;

/**
 * @author oleksief
 *
 */
public class RollingStockPhotoFactory extends PhotoFactory {
	
	/**
	 * Hidden singleton instance; needs to be initialized from the outside.
	 */
	private static RollingStockPhotoFactory instance = null;
	
	/**
	 * Public singleton access method.
	 * @methodtype get 
	 * @return RollingStockPhotoFactory instance
	 */
	public static synchronized RollingStockPhotoFactory getInstance() {
		if (instance == null) {
			SysLog.logSysInfo("setting generic RollingStockPhotoFactory");
			setInstance(new RollingStockPhotoFactory());
		}
		assert (instance != null);
		return instance;
	}
	
	/**
	 * Method to set the singleton instance of RollingStockPhotoFactory.
	 * @methodtype set
	 * @param RollingStockPhotoFactory instance
	 */
	protected static synchronized void setInstance(RollingStockPhotoFactory rsPhotoFactory) {
		assert (instance == null) : "attempt to initalize RollingStockPhotoFactory twice";
		instance = rsPhotoFactory;
	}
	
	/**
	 * Hidden singleton instance; needs to be initialized from the outside.
	 * @methodtype initialization
	 */
	public static void initialize() {
		getInstance(); // drops result due to getInstance() side-effects
	}
	
	/**
	 * 
	 */
	protected RollingStockPhotoFactory() {
		// do nothing
	}

	/**
	 * @methodtype factory
	 */
	public Photo createPhoto() {
		return new RollingStockPhoto();
	}
	
	/**
	 * 
	 */
	public Photo createPhoto(PhotoId id) {
		return new RollingStockPhoto(id);
	}
	
	/**
	 * 
	 */
	public Photo createPhoto(ResultSet rs) throws SQLException {
		return new RollingStockPhoto(rs);
	}
	

}
