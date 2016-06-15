package model;

public class MobileElement extends Element {
	
	public MobileElement ( String url, Permeability permeability){
		super(permeability,new Sprite(url));
	}
}

