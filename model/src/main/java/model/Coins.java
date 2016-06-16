package model;

public class Coins extends Loot {
	

	public Coins(int x, int y, String url) {
		super(url,Permeability.BLOCKING);
		setX(x);
		setY(y);
	}
}

