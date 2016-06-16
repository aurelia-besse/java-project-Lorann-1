package model;

import contract.IBubbleKey;

public class BubbleKey extends Loot implements IBubbleKey {
	
	public BubbleKey(int x, int y,String url) {
		super(url,Permeability.BLOCKING);
	}
}

