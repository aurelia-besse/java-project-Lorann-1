package model;

import java.awt.Image;


import contract.IElement;
import contract.IPermeability;
import contract.ISprite;

/**
* <p>
* The Element class introduces elements based on 3 criteria :
* <ul>
* <li>An x and y coordinates to locate on a map at the start of the game.</li>
* <li>A url to connect the various images format . png.</li>
* <li>And a list to give him a permeability or not.</li>
* </ul>
* </p>
* 
* @author Arthur
 */
public class Element implements IElement {
	public int x, y;
	private IPermeability permeability;
	private ISprite sprite;

/**
 * @param permeability
 *				Update the permeability	 for the item
 * @param sprite
 * 				Update the sprite for the item
 */
	public Element(IPermeability permeability, ISprite sprite){
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	/* (non-Javadoc)
	 * @see model.IElement#getX()
	 */
	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	/* (non-Javadoc)
	 * @see model.IElement#getY()
	 */
	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setPosition(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	

	/* (non-Javadoc)
	 * @see model.IElement#getPermeability()
	 */
	public IPermeability getPermeability() {
		return permeability;
	}

	public void setPermeability(IPermeability permeability) {
		this.permeability = permeability;
	}

	/* (non-Javadoc)
	 * @see model.IElement#getSprite()
	 */
	public ISprite getSprite() {
		return sprite;
	}

	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}
	
	/* (non-Javadoc)
	 * @see model.IElement#getImage()
	 */
	public Image getImage() {
		return this.getSprite().getImage();
	}
	
	
	
}