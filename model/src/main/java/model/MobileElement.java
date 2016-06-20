package model;

import contract.IMobileElement;
import contract.Permeability;


public class MobileElement extends Element implements IMobileElement {
	
	
	public MobileElement ( String url, Permeability permeability){
		super(permeability,new Sprite(url));
	}

	
	
}

