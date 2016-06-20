package model;

import contract.DoorState;
import contract.IDoor;
import contract.Permeability;

/**
 * <b> The Door class represents the access to the end of the level </b>
 * <p>
 * The class Door consists to create an object Door with:
 * <ul>
 * <li>An x and y coordinates to locate on a map.</li>
 * <li>A url to connect the door to an image format . png.</li>
 * <li>And a list to give him a permeability or not.</li>
 * </ul>
 * </p>
 * 
 * @author Arthur
 * @version 17.06.16
 */
public class Door extends StaticElement implements IDoor {
	/**
	 * @param x
	 * 			The x position of the door on a landmark o,x,y.
	 * @param y
	 * 			The y position of the door on a landmark o,x,y.
	 * @param url
	 * 			The link to a specific image. 
	 */
	private DoorState doorstate;
	
	public Door(int x, int y, String url) {
		super(url,Permeability.BLOCKING);
	}

	public DoorState getDoorstate() {
		return doorstate;
	}

	public void setDoorstate(DoorState doorstate) {
		this.doorstate = doorstate;
	}
	
	
}


