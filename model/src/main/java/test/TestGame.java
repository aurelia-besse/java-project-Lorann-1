package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.DBGame;
import model.Map;

public class TestGame {

	@Test
	public void testGetMap() {
		
		model.Game game = new model.Game();
		assertEquals(game.getMap(),game.map);
		
	}

	@Test
	public void testInitMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetObservable() {
		fail("Not yet implemented");
	}
}
