/**
 * 
 */
package org.wahlzeit.rollingstock.model;

import org.rollingstock.model.RollingStockPhoto;
import org.rollingstock.model.RollingStockPhotoFactory;

import junit.framework.TestCase;

/**
 * @author oleksief
 *
 */
public class RollingStockPhotoFactoryTest extends TestCase {
	
	/**
	 * 
	 * @param name
	 */
	public RollingStockPhotoFactoryTest(String name) {
		super(name);
	}
	
	public void testGetInstance() {
		assertTrue(RollingStockPhotoFactory.getInstance() != null);
		assertTrue(RollingStockPhotoFactory.getInstance()
				.equals(RollingStockPhotoFactory.getInstance()));
		
	}
	
	public void testCreatePhoto() {
		assertTrue(RollingStockPhotoFactory.getInstance().createPhoto() instanceof RollingStockPhoto);
	}
	

}
