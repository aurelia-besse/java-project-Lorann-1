package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDoor {

	@Test
	public void test() {
		assertNotNull(new model.Coins(0,0,"sprite/gate_closed.png"));
	}

}