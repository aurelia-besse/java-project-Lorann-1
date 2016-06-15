package model;

public class StaticElement extends Element {

	public StaticElement ( String url, Permeability permeability){
		super(new Sprite(url),permeability)
	}
}
