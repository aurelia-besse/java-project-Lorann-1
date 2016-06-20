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
		String images[] = {
				"sprite/fireball_1.png",
                "sprite/fireball_2.png",
                "sprite/fireball_3.png",
                "sprite/fireball_4.png"};
        this.sprite = new AnimateSprite(url,images);
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


