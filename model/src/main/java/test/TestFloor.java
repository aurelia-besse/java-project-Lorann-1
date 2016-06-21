package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Floor;

public class TestFloor {

	@Test
	public void testFloor() {
		assertNotNull(new Floor(0,0,"sprite/bone.png"));
	}
}
