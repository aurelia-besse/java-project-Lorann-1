package model;

import contract.ILorann;
import contract.Permeability;
import contract.State;

public class Lorann extends MobileElement implements ILorann {
	private State state = State.DOWN;
	
	public Lorann ( int x, int y, String url){
		super(url,Permeability.PENETRABLE);
		setX(x);
		setY(y);
	}


public State getState() {
	return state;
}
public void setState(State state) {
	this.state = state;
	//getSprite().setAnimated(state.ordinal());
	
}
}