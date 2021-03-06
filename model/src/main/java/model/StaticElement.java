package model;

import contract.Permeability;
/**
 *<b>This class StaticElement is used to define the mobility of the object</b>
 * This class StaticElement is used to define the mobility of the object
 * The StaticElement consists take into account:
 * <ul>
 * <li>A url to connect the object to an image format . png.</li>
 * <li>And a list to give him a permeability or not.</li>
 * </ul>
 * @author Arthur
 * @version 17.06.2016
 */
public class StaticElement extends Element {
/***
 * 
 * @param url
 * 			Take the picture.
 * @param permeability
 * 			Take the permeability of the element.
 */
	public StaticElement ( String url, Permeability permeability){
		super(permeability, new Sprite(url));
	}
}
