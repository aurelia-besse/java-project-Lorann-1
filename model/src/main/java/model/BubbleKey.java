package model;

import contract.IBubbleKey;
import contract.Permeability;
/**
 * <b> BubbleKey is the class representative the necessary key to open the door </b>
 * <p>
 * The BubbleKey consists to instantiate an object BubbleKey with :
 * <ul>
 * <li>An x and y coordinates to locate on a map.</li>
 * <li>A url to connect the key to an image format . png.</li>
 * <li>And a list to give him a permeability.</li>
 * </ul>
 * </p>
 * 
 * @author Arthur
 * @version 17.06.16
 */
public class BubbleKey extends Loot implements IBubbleKey {
	
	/**
	 * Initialize BubbleKey
	 * @param x
	 * 			The x position of the key on a landmark o,x,y.
	 * @param y
	 * 			The y position of the key on a landmark o,x,y.
	 * @param url
	 *			The link to a specific image. 
	 */
	public BubbleKey(int x, int y,String url) {
		super(url,Permeability.BLOCKING);
	}
}

