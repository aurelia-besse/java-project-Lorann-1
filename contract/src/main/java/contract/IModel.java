package contract;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import contract.IMap;

/**
 * <b>The Interface IModel.</b>
 * @author Aurelia
 * @version 16.06.2016
 */
public interface IModel {

	/**
	 * Method to get the score
	 * @return
	 */
	public int getScore();
	
	/**
	 * Method to set the score
	 * @param score
	 */
	public void setScore(int score); 
	
	/**
	 * Method to get the id of the map
	 * @return the id
	 */
	public int getId();
	
	/**
	 * Method to set the id of the map
	 * @param id
	 */
	public void setId(int id);
	
	/**
	 * Method to get a map on the list
	 * @return a list of all maps
	 */
	public ArrayList<IMap> getMaps();
	
	/**
	 * Method to get a map
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
	 * @param lorann 
	 * 			It's an element
	 */
	public void addSpells(IElement lorann);
	
	/**
	 * Adds floor 
	 * @param lorann
	 * 			It's an element
	 * @param x
	 * 			The x position of the floor on a landmark o,x,y.
	 * @param y
	 * 			The y position of the floor on a landmark o,x,y.
	 */
	public void addFloor(IElement lorann, int x ,int y);
	
	/**
	 * Recovers the game state
	 * @return the game state 
	 */
	public GameState getGameState();
	
	/**
	 * Updates the game state
	 * @param gameState
	 * 				It's a GameState
	 */
	public void setGameState(GameState gameState);
	
	/**
	 * Displays the defeat ... 
	 * @param graphics 
	 * 			Give the picture for the loose
	 */
	public void GameOver(Graphics graphics);
	
	/**
	 * Displays the win!
	 * @param graphics
	 * 				Give the picture for the win
	 */
	public void Congratulations(Graphics graphics);
}