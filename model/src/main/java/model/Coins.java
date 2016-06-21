package model;

import contract.ICoins;
import contract.Permeability;

/**
 * <b> The coins class represents a loot that can be retrieve to earn points </b>
 * The class coins consists to instantiate an object coins with:
 * <ul>
 * <li>An x and y coordinates to locate on a map.</li>
 * <li>A url to connect the coins to an image format . png.</li>
 * <li>And a list to give him a permeability.</li>
 * </ul> 
 * @author Arthur
 * @version 17.06.16
 */
public class Coins extends Loot implements ICoins {
	
	/**
	 * Initialized Coins 
	 * @param x
	 * 			The x position of the coins on a landmark o,x,y.
	 * @param y
	 * 			The y position of the coins on a landmark o,x,y.
	 * @param url
	 * 			The link to a specific image. 
	 */
	public Coins(int x, int y, String url) {
		super(url,Permeability.BLOCKING);
	}
}

