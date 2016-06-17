package model;

import contract.IBubbleKey;
import contract.Permeability;

public class BubbleKey extends Loot implements IBubbleKey {
	
	public BubbleKey(int x, int y,String url) {
		super(url,Permeability.BLOCKING);
	}
}

