package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWall {

	@Test
	public void testWall() {
		assertNotNull(new model.Wall(0, 0, "sprite/bone.png"));
	}

}
