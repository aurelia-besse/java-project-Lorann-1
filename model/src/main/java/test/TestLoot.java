package test;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.Permeability;
import model.Loot;

public class TestLoot {

	@Test
	public void testLoot() {
		assertNotNull(new Loot("C:/Users/adrie/Pictures/conneries/Auto congratulation/MOI/moi.jpg", Permeability.BLOCKING));
	}

}
