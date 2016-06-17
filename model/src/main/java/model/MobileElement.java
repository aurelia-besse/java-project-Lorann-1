package model;

import contract.IMobileElement;
import contract.IPermeability;

public class MobileElement extends Element implements IMobileElement {
	
	public MobileElement ( String url, IPermeability permeability){
		super(permeability,new Sprite(url));
	}
}

