package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Lorann;
/**
 * 
 * @author Adrien
 * @version 16.06.2016
 */
public class TestLorann {

	/**
	 * test method for {@link model.Lorann#Lorann(int, int, String)}
	 */
	@Test
	public void testLorann() {
		assertNotNull(new Lorann(0,0,"sprite/lorann_u.png"));
	}
	
	/**
	 * test method for {@link model.Lorann#getState()}
	 */
	@Test
	public void testGetState(){
		Lorann lorann = new Lorann(0,0,"sprite/lorann_u.png");
		lorann.state = contract.LorannState.UP;
		assertEquals(contract.LorannState.UP, lorann.getState());
	}
	/**
	 * test method for {@link model.Lorann#setState(contract.LorannState)}
	 */
	@Test
	public void testSetState(){
		Lorann lorann = new Lorann(0,0,"sprite/lorann_u.png");
		lorann.setState(contract.LorannState.UP);
		assertEquals(contract.LorannState.UP, lorann.getState());
	}
	
	/**
	 * test method for {@link model.Lorann#getPossessionSpell()}
	 */
	@Test
	public void testGetPossessionSpell(){
		Lorann lorann = new Lorann(0,0,"sprite/lorann_u.png");
		lorann.spellState = contract.SpellState.NotThrow;
		assertEquals(contract.SpellState.NotThrow, lorann.getPossessionSpell());
	}
	
	/**
	 * test method for {@link model.Lorann#setPossessionSpell(contract.SpellState)}
	 */
	@Test
	public void testSetPossessionSpell(){
		Lorann lorann = new Lorann(0,0,"sprite/lorann_u.png");
		lorann.spellState = contract.SpellState.NotThrow;
		lorann.setPossessionSpell(contract.SpellState.Throw);
		assertEquals(contract.SpellState.Throw, lorann.getPossessionSpell());
	}
}