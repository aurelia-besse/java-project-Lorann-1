package model;

import contract.ILorann;
import contract.Permeability;
import contract.LorannState;

public class Lorann extends MobileElement implements ILorann {
	private LorannState state = LorannState.DOWN;
	
	public Lorann ( int x, int y, String url){
		super(url,Permeability.PENETRABLE);
		setX(x);
		setY(y);
	}


public LorannState getState() {
	return state;
}
public void setState(LorannState state) {
	this.state = state;
	//getSprite().setAnimated(state.ordinal());
	
}
}