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
public class TestStaticElement {

	/**
	 * test method for {@link model.StaticElement#StaticElement(String, Permeability)}
	 */
	@Test
	public void testStaticElement() {
		assertNotNull(new model.StaticElement("sprite/bone.png", Permeability.PENETRABLE));
	}

}
