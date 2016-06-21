package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSpell {

	@Test
	public void testSpell() {
		assertNotNull(new model.Spell(0, 0, "sprite/fireball_1.png"));
	}
	
	@Test
	public void testGetState(){
		model.Spell spell = new model.Spell(0, 0, "sprite/fireball_1.png");
		spell.state = contract.SpellState.DOWN;
		assertEquals(spell.getState(), contract.SpellState.DOWN);
	}
	
	@Test
	public void testSetState(){
		model.Spell spell = new model.Spell(0, 0, "sprite/fireball_1.png");
		spell.setState(contract.SpellState.RIGHT);
		spell.setState(contract.SpellState.DOWN);		
		assertEquals(spell.getState(), contract.SpellState.DOWN);
	}
}
