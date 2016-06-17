package model;

import contract.IMobileElement;
import contract.IPermeability;

public class MobileElement extends Element implements IMobileElement {
	
	private int x, y ;
	
	public MobileElement ( String url, IPermeability permeability){
		super(permeability,new Sprite(url));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}

