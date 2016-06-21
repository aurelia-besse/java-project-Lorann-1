package model.Mock;

import java.awt.Image;

import contract.ISprite;
import contract.Permeability;
import model.Sprite;

public class ElementMock implements contract.IElement{
		public int X, Y = 0;
		private String url = "sprite/bone.png";
		protected Sprite sprite = new Sprite(url);
		private Permeability permeability = Permeability.BLOCKING;		
		private Image image;

	
	public int getX() {
		return this.X;
	}

	public int getY() {
		return this.Y;
	}

	public void setPosition(int x, int y) {
		X = x;
		Y = y;
		
	}

	public Permeability getPermeability() {
		return permeability;
	}

	public ISprite getSprite() {
		return sprite;
	}

	public Image getImage() {
		return image;
	}

}
