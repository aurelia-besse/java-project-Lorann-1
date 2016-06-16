package model;

import java.awt.Image;

public class Element {
	public int x, y;
	private Permeability permeability;
	private Sprite sprite;
	

	public Element(Permeability permeability, Sprite sprite){
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Permeability getPermeability() {
		return permeability;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

	public Sprite getSprite() {
		return sprite;
	}

	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public Image getImage() {
		return this.getSprite().getImage();
	}
	
	
}
