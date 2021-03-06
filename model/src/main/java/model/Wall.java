package model;

import contract.IWall;
import contract.Permeability;
/**
*<b>The Wall class represents the structure of the map</b>
*The Wall class represents the structure of the map
* The class Wall consists to instantiate an object Wall with:
* <ul>
* <li>An x and y coordinates to locate on a map.</li>
* <li>A url to connect the wall to an image format . png.</li>
* <li>And a list to give him a permeability.</li>
* </ul>
* @author Arthur
* @version 17.06.16
*/
public class Wall extends StaticElement implements IWall {
	
	/**
	 * Initialize the wall
	 * @param x
	 * 			The x position of the wall on a landmark o,x,y.
	 * @param y
	 * 			The y position of the wall on a landmark o,x,y.
	 * @param url
	 * 			The link to a specific image. 
	 */
	public Wall ( int x, int y, String url){
		super(url,Permeability.BLOCKING);
	}
}

