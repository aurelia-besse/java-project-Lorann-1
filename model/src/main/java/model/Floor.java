package model;

import contract.IFloor;

public class Floor extends StaticElement implements IFloor{

	public Floor(int x, int y, String url) {
		super(url, Permeability.PENETRABLE);
	
	}

}
