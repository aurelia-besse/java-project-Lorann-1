package model;

import java.util.Observable;

import contract.IModel;

public class Game extends Observable implements IModel{

	private Map map;

	public Map getMap() {
		return map;
	}
	
	public void initMap(){
		
	}

	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}
}
