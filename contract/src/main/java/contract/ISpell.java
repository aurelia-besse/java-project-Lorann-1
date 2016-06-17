package contract;

import contract.SpellState;

public interface ISpell {

	SpellState getState();

	void setState(SpellState state);

}