package test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Adrien
 * @version 16.06.2016
 *
 */
public class TestWall {

	/**
	 * test method for {@link model.Wall#Wall(int, int, String)}
	 */
	@Test
	public void testWall() {
		assertNotNull(new model.Wall(0, 0, "sprite/bone.png"));
	}

}
