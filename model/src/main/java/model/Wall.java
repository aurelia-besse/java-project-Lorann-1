package model;

import contract.IWall;

public class Wall extends StaticElement implements IWall {
	public Wall ( int x, int y, String url){
		super(url,Permeability.BLOCKING);
	}
}

