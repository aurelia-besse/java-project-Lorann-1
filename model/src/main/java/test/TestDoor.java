package test;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Adrien
 * @version 16.06.2016
 */
public class TestDoor {

	/**
	 * test method for {@link model.Door#Door(int, int, String)}
	 */
	@Test
	public void test() {
		assertNotNull(new model.Coins(0,0,"sprite/gate_closed.png"));
	}

}