package contract;

import java.awt.Image;

/**
 *<b>The Interface IElement.</b> 
 * @author Aurelia
 * @version 16.06.2016
 */
public interface IElement {

	/**
	 * Method to get the x coordinate of an element
	 * @return the x coordinate of an element
	 */
	int getX();

	/**
	 * Method to get the y coordinate of an element
	 * @return the y coordinate of an element
	 */
	int getY();
	
	/**
	 * Method to set the position of an element
	 * @param x
	 * 		the x coordinate of an element
	 * @param y
	 * 		the y coordinate of an element
	 */
	public void setPosition(int x, int y);

	/**
	 * Method to get the permeability of an element
	 * @return the permeability of an element
	 */
	public Permeability getPermeability();

	/**
	 * Method to get the sprite of an element
	 * @return the sprite of an element
	 */
	public ISprite getSprite();

	Image getImage();

}