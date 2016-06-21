package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Floor;
/**
 * 
 * @author Adrien
 * @version 16.06.2016
 *
 */
public class TestFloor {

	/**
	 * test method for {@link model.Floor#Floor(int, int, String)}
	 */
	@Test
	public void testFloor() {
		assertNotNull(new Floor(0,0,"sprite/bone.png"));
	}
}
