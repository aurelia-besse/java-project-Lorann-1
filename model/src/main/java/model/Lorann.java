package model;

import contract.ILorann;
import contract.Permeability;
import contract.LorannState;
/**
*<b>The Lorann class represents the main character that the user plays</b>
* <p>
* The class Lorann consists to create an object Lorann with:
* <ul>
* <li>An x and y coordinates to locate on a map at the start of the game.</li>
* <li>A url to connect the character to an image format . png.</li>
* <li>And a list to give him a permeability or not.</li>
* </ul>
* </p>
* 
* @author Arthur
* @version 17.06.16
*/
public class Lorann extends MobileElement implements ILorann {
	private LorannState state = LorannState.DOWN;
	/**
	 * @param x
	 * 			The x position of the character on a landmark o,x,y.
	 * 			It can be changed by the user during the game.
	 * @param y
	 * 			The y position of the character on a landmark o,x,y.
	 * 			It can be changed by the user during the game.
	 * @param url
	 * 			The link to a specific image. 
	 */
	public Lorann (int x, int y, String url){
		super(url,Permeability.PENETRABLE);
		setX(x);
		setY(y);
	}

/**
 * Recovers the image correspondent lorann following its movement
 * 
 * @return The state in which lorann is
 */
	
public LorannState getState() {
	return state;
}

/**
 * Updates the image correspondent lorann following its movement
 * 
 * @param state 
 *			It is the new image of lorann
 */

public void setState(LorannState state) {
	this.state = state;
	//getSprite().setAnimated(state.ordinal());
	
}
}