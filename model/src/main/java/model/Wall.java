package model;

public class Wall extends StaticElement {
	public Wall ( int x, int y, String url){
		super(url,Permeability.BLOCKING);
	}
}

