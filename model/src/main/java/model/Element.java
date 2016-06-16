package model;

import java.awt.Image;


import contract.IElement;
import contract.IPermeability;
import contract.ISprite;

public class Element implements IElement {
	public int x, y;
	private IPermeability permeability;
	private ISprite sprite;


	public Element(IPermeability permeability, ISprite sprite){
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	/* (non-Javadoc) coucou
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