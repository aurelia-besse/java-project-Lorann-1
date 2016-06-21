package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Coins;
/**
 * 
 * @author Adrien
 * @version 16.06.2016
 *
 */
public class TestCoins {

	/**
	 * test method for {@link model.Coins#Coins(int, int, String)}
	 */
	@Test
	public void testCoins() {
		assertNotNull(new Coins(0,0,"sprite/purse.png"));
	}

}
