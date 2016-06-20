package contract;

import contract.SpellState;

/**
 *<b>The Interface ISpell.</b> 
 * @author Arthur
 * @version 16.06.2016
 */
public interface ISpell {

	SpellState getState();

	/**
	 * 
	 * @param state
	 * 			Update the state of spell
	 */
	void setState(SpellState state);

}