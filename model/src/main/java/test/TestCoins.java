package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Coins;

public class TestCoins {

	@Test
	public void testCoins() {
		assertNotNull(new Coins(0,0,"sprite/purse.png"));
	}

}
