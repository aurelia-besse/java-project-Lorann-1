package model;

import contract.IMobileElement;
import contract.IPermeability;
import contract.ISprite;

public class MobileElement extends Element implements IMobileElement {
	
	private int x, y ;
	private ISprite sprite;
	
	public MobileElement ( String url, IPermeability permeability){
		super(permeability,new Sprite(url));
	}

	
	
}

