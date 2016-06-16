package model;

import contract.IPermeability;

public class StaticElement extends Element {

	public StaticElement ( String url, IPermeability permeability){
		super(permeability, new Sprite(url));
	}
}
