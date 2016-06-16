package contract;

import java.util.Observable;
import java.util.Observer;

import contract.IMap;

public interface IGame {

	IMap getMap();

	Observable getObservable();
	
	void addObserver(Observer observer);
	
	public void change();
}