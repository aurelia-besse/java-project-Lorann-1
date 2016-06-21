package test;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.Permeability;

public class TestMobileElement {

	@Test
	public void testMobileElement() {
		assertNotNull(new model.MobileElement("sprite/bone.png", Permeability.BLOCKING));
	}

}
