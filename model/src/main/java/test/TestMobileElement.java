package test;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.Permeability;

/**
 * 
 * @author Adrien
 * @version 16.06.2016
 *
 */
public class TestMobileElement {

	/**
	 * test method for {@link model.MobileElement#MobileElement(String, Permeability)}
	 */
	@Test
	public void testMobileElement() {
		assertNotNull(new model.MobileElement("sprite/bone.png", Permeability.BLOCKING));
	}

}
