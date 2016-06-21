package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.BubbleKey;

/**
 * 
 * @author Adrien
 * @version 16.06.2016
 *
 */
public class TestBubbleKey {

	/**
	 * test method for {@link model.BubbleKey#BubbleKey(int, int, String)}
	 */
	@Test
	public void testBubbleKey() {
		assertNotNull(new BubbleKey(0,0, "sprite/crystal_ball.png"));
	}
}
