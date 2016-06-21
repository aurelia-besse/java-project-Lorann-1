package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import model.Game;

public class TestGame {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGame(){
		assertNotNull(new Game());
	}
	
	@Test
	public void testGetId(){
		model.Game game = new model.Game();
		assertEquals(game.getId(), game.id);
	}
	
	@Test
	public void testSetId(){
		int rand;
		model.Game game = new model.Game();
		do{
		rand = (int)(Math.random()*10);
		}while (rand == game.getId());
		game.setId(rand);
	}
	
	@Test
	public void testGetScore(){
		model.Game game = new model.Game();
		int scoreSetted = 28021933;
		game.score = scoreSetted;
		assertEquals(scoreSetted, game.getScore());
	}
	
	@Test
	public void testSetScore(){
		model.Game game = new model.Game();
		int scoreSetted = 28021933;
		game.setScore(scoreSetted);
		assertEquals(scoreSetted, game.getScore());
	}
}