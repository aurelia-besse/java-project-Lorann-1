package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Lorann;

public class TestLorann {

	@Test
	public void testLorann() {
		assertNotNull(new Lorann(0,0,""));
	}
}