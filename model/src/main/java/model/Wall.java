package model;

import contract.IWall;
import contract.Permeability;

public class Wall extends StaticElement implements IWall {
	public Wall ( int x, int y, String url){
		super(url,Permeability.BLOCKING);
	}
}

