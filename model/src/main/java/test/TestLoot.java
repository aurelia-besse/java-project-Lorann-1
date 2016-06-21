package test;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.Permeability;
import model.Loot;

public class TestLoot {

	@Test
	public void testLoot() {
		assertNotNull(new Loot("sprite/purse.png", Permeability.BLOCKING));
	}

}
