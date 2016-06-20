package contract;

public interface ILorann {
	/**
	 * Recovers the state of Lorann
	 * 
	 * @return The state in which lorann is
	 */
	public LorannState getState() ;
	
	/**
	 * Updates the state of Lorann
	 * 
	 * @param state 
	 *			It is the new image of lorann
	 */
	public void setState(LorannState state);
	
	public SpellState getPossessionSpell();
	/**
	 * 
	 * @param spellstate
	 * 					Updates where is the spell
	 */
	public void setPossessionSpell(SpellState spellstate);
}