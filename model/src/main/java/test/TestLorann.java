package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Lorann;

public class TestLorann {

	@Test
	public void testLorann() {
		assertNotNull(new Lorann(0,0,"sprite/lorann_u.png"));
	}
	
	@Test
	public void testGetState(){
		Lorann lorann = new Lorann(0,0,"sprite/lorann_u.png");
		lorann.state = contract.LorannState.UP;
		assertEquals(contract.LorannState.UP, lorann.getState());
	}
	
	@Test
	public void testSetState(){
		Lorann lorann = new Lorann(0,0,"sprite/lorann_u.png");
		lorann.setState(contract.LorannState.UP);
		assertEquals(contract.LorannState.UP, lorann.getState());
	}
	
	@Test
	public void testGetPossessionSpell(){
		Lorann lorann = new Lorann(0,0,"sprite/lorann_u.png");
		lorann.spellState = contract.SpellState.NotThrow;
		assertEquals(contract.SpellState.NotThrow, lorann.getPossessionSpell());
	}
	
	@Test
	public void testSetPossessionSpell(){
		Lorann lorann = new Lorann(0,0,"sprite/lorann_u.png");
		lorann.spellState = contract.SpellState.NotThrow;
		lorann.setPossessionSpell(contract.SpellState.Throw);
		assertEquals(contract.SpellState.Throw, lorann.getPossessionSpell());
	}
}