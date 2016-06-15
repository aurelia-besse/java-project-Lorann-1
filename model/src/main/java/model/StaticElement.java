package model;

public class StaticElement extends Element {

	public StaticElement ( String url, Permeability permeability){
		super(permeability, new Sprite(url));
	}
}
