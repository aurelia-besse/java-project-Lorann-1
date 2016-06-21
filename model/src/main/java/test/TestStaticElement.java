package test;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.Permeability;

public class TestStaticElement {

	@Test
	public void testStaticElement() {
		assertNotNull(new model.StaticElement("sprite/bone.png", Permeability.PENETRABLE));
	}

}
