package model;

import contract.ICoins;
import contract.Permeability;

public class Coins extends Loot implements ICoins {
	

	public Coins(int x, int y, String url) {
		super(url,Permeability.BLOCKING);
	}
}

