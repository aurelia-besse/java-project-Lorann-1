package model;

import contract.IFloor;
import contract.Permeability;
/**
*<b>The Floor class represents the wallpaper of the game</b>
* <p>
* The class Floor consists to create an object Floor with:
* <ul>
* <li>An x and y coordinates to locate on a map.</li>
* <li>A url to connect the floor to an image format . png.</li>
* <li>And a list to give him a permeability or not.</li>
* </ul>
* </p>
* 
* @author Arthur
* @version 17.06.16
*/

public class Floor extends StaticElement implements IFloor{
	/**
	 * @param x
	 * 			The x position of the floor on a landmark o,x,y.
	 * @param y
	 * 			The y position of the floor on a landmark o,x,y.
	 * @param url
	 * 			The link to a specific image. 
	 */
	public Floor(int x, int y, String url) {
		super(url, Permeability.PENETRABLE);
	
	}

}
