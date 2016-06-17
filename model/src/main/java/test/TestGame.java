package test;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.IMap;

public class TestGame {

	@Test
	public void testGetMap() {
		
		model.Game game = new model.Game();
		assertEquals(game.getMap(),game.map);
		
	}

	@Test
	public void testInitMap() {
		model.Game game = new model.Game();
		game.initMap(1);
		IMap map1 = game.getMap();
		game.initMap(3);
		IMap map2 = game.getMap();
		assertNotSame(map1, map2);
	}
}