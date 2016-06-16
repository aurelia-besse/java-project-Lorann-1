package model;

import contract.IDemon;
import contract.Permeability;

public class Demon extends MobileElement implements IDemon {
	
	public Demon(int x, int y, String url) {
		super(url,Permeability.PENETRABLE);
	}
}


