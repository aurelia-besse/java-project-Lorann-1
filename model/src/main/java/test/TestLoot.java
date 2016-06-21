package test;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.Permeability;
import model.Loot;
/**
 * 
 * @author Adrien
 * @version 16.06.2016
 *
 */
public class TestLoot {

	/**
	 * test method for {@link model.Loot#Loot(String, Permeability)}
	 */
	@Test
	public void testLoot() {
		assertNotNull(new Loot("sprite/purse.png", Permeability.BLOCKING));
	}

}
