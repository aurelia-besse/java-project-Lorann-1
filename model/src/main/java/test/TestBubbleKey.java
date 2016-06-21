package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.BubbleKey;

public class TestBubbleKey {

	@Test
	public void testBubbleKey() {
		assertNotNull(new BubbleKey(0,0, "sprite/crystal_ball.png"));
	}
}
