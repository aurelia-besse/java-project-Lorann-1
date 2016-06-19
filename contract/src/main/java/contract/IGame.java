package contract;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import contract.IMap;

public interface IGame {

	IMap getMap();

	Observable getObservable();
	
	void addObserver(Observer observer);
	
	public void change();
	
	public void addSpells(IElement hero);
	
	public void addFloor(IElement hero, int x ,int y);
	
	public GameState getGamestate();
	
	public void setGamestate(GameState gamestate);
	
	public void GameOver(Graphics graphics);
	
	public void Congratulations(Graphics graphics);
}