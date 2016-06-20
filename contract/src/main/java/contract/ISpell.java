package contract;

import contract.SpellState;

/**
 *<b>The Interface ISpell.</b> 
 * @author Arthur
 * @version 16.06.2016
 */
public interface ISpell {

	/**
	 * Recovers the spell state
	 * @return the spell state
	 */
	SpellState getState();

	/**
	 * Updates the spell state
	 * @param state
	 * 			It's a SpellState
	 */
	void setState(SpellState state);

}