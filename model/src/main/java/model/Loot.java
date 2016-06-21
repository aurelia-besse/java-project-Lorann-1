package model;

import contract.Permeability;

/**
*<b>The Loot class represents all objects that the user can take</b>
*The Loot class represents all objects that the user can take
* The class Loot consists to create many object with:
* <ul>
* <li>A url to connect the loot to an image format . png.</li>
* <li>And a list to give him a permeability.</li>
* </ul>
* @author Arthur
* @version 17.06.16
*/
public class Loot extends StaticElement {
	/**
	 * 
	 * @param url
	 *			To assign an image 			
	 * @param permeability
	 * 			To assign a permeability
	 */
	public Loot ( String url, Permeability permeability){
		super(url, permeability);
	}
}

