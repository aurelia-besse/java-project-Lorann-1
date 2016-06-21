package contract;

/**
 * <b>The Interface ILorann.</b>
 * @author Arthur
 * @version 16.06.2016
 */
public interface ILorann {
	
	/**
	 * Recovers the state of Lorann
	 * @return The state in which lorann is
	 */
	public LorannState getState() ;
	
	/**
	 * Updates the state of Lorann
	 * @param state 
	 *			It's a LorannState
	 */
	public void setState(LorannState state);
	
	/**
	 * Method to recovers if Lorann possesses the spell or not
	 * @return the possession spell
	 */
	public SpellState getPossessionSpell();
	/**
	 * Method to update the possession of spell
	 * @param spellState
	 * 				It's a SpellState
	 */
	public void setPossessionSpell(SpellState spellState);
	
	
}