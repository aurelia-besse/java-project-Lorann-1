package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Floor;

public class TestFloor {

	@Test
	public void testFloor() {
		assertNotNull(new Floor(0,0,"C:/Users/adrie/Pictures/conneries/Auto congratulation/MOI/moi.jpg"));
	}
}
