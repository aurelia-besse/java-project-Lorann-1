package model;

import contract.ILorann;

public class Lorann extends MobileElement implements ILorann {
	public Lorann ( int x, int y, String url){
		super(url,Permeability.PENETRABLE);
	}
}

