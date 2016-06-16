package model;

import contract.Permeability;

public class Spell extends MobileElement {
	public Spell ( int x, int y, String url){
		super(url,Permeability.PENETRABLE);
	}
}


