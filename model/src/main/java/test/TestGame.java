package test;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.IMap;
import model.Game;

public class TestGame {

	@Test
	public void testGame(){
		assertNotNull(new Game());
	}
	
	
	
	@Test
	public void testGetMap() {
		
		model.Game game = new model.Game();
		assertEquals(game.getMap(),game.map);
		
	}

	@Test
	public void testLoadsMap() {
		model.Game game = new model.Game();
		game.loadsMap(1);
		IMap map1 = game.getMap();
		game.loadsMap(3);
		IMap map2 = game.getMap();
		assertNotSame(map1, map2);
	}
}