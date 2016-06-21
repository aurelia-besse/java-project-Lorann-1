package test;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Adrien
 * @version 16.06.2016
 *
 */
public class TestSpell {

	/**
	 * test method for {@link model.Spell#Spell(int, int, String)}
	 */
	@Test
	public void testSpell() {
		assertNotNull(new model.Spell(0, 0, "sprite/fireball_1.png"));
	}
	
	/**
	 * test method for {@link model.Spell#getState()}
	 */
	@Test
	public void testGetState(){
		model.Spell spell = new model.Spell(0, 0, "sprite/fireball_1.png");
		spell.state = contract.SpellState.DOWN;
		assertEquals(spell.getState(), contract.SpellState.DOWN);
	}
	
	/**
	 * test method for {@link model.Spell#setState(contract.SpellState)}
	 */
	@Test
	public void testSetState(){
		model.Spell spell = new model.Spell(0, 0, "sprite/fireball_1.png");
		spell.setState(contract.SpellState.RIGHT);
		spell.setState(contract.SpellState.DOWN);		
		assertEquals(spell.getState(), contract.SpellState.DOWN);
	}
}
