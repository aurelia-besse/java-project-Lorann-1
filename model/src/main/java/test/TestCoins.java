package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCoins {

	@Test
	public void testCoins() {
		assertNotNull(new model.Coins(0,0,"http://monde-medieval.com/2900-thickbox/Bourse-En-Cuir-Garnie.jpg"));
	}

}
