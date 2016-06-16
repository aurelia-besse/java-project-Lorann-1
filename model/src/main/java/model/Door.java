package model;

import contract.IDoor;

public class Door extends StaticElement implements IDoor {
	
	public Door(int x, int y, String url) {
		super(url,Permeability.BLOCKING);
	}
}


