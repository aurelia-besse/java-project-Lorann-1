package contract;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import contract.IMap;

/**
 * <b>The Interface IGame.</b>
 * @author Aurelia
 * @version 16.06.2016
 */
public interface IGame {

	/**
	 * Method return a map
	 * @return the map 
	 */
	IMap getMap();
	 
	/**
	 * Method to get an observable
	 * @return
	 */
	Observable getObservable();
	
	/**
	 Method to add an observer
	 @param observer 
	 */
	void addObserver(Observer observer);
	
	/**
	 Method for notify all Observer
	 */
	public void change();
	
	/**
	 * Create the spell depending on the position of the character
	 * @param hero 
	 * 			It's an element
	 */
	public void addSpells(IElement hero);
	
	/**
	 * Adds floor 
	 * @param hero 
	 * 			It's an element
	 * @param x
	 * 			The x position of the floor on a landmark o,x,y.
	 * @param y
	 * 			The y position of the floor on a landmark o,x,y.
	 */
	public void addFloor(IElement hero, int x ,int y);
	
	/**
	 * Recovers the game state
	 * @return the game state 
	 */
	public GameState getGamestate();
	
	/**
	 * Updates the game state
	 * @param gamestate
	 * 				It's a GameState
	 */
	public void setGamestate(GameState gamestate);
	
	/**
	 * Displays the defeat ... 
	 * @param graphics 
	 * 			Give the picture for the loose
	 */
	public void GameOver(Graphics graphics);
	
	/**
	 * Displays the win!
	 * @param grapihcs
	 * 				Give the picture for the win
	 */
	public void Congratulations(Graphics graphics);
}