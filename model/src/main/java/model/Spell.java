package model;



import contract.ISpell;
import contract.Permeability;
import contract.SpellState;


public class Spell extends MobileElement implements ISpell {
	private SpellState state;
	
	
	public Spell ( int x, int y, String url){
		super(url,Permeability.PENETRABLE);
		setX(x);
		setY(y);
	}
	/* (non-Javadoc)
	 * @see model.ISpell#getState()
	 */
	public SpellState getState() {
		return state;
	}
	/* (non-Javadoc)
	 * @see model.ISpell#setState(contract.SpellState)
	 */
	public void setState(SpellState state) {
		this.state = state;
	}
	
	
}


