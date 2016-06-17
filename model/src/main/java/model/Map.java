package model;

import java.util.ArrayList;

import contract.IElement;
import contract.IMap;
import contract.IMobileElement;

/**
*<b>The Map class represents the whole map</b>
* <p>
* The class Map consists to create an object with :
* <ul>
* <li>A dimension of game window.</li>
* <li>A variety of different object.</li>
* <li>The image displacement.</li>
* </ul>
* </p>
* 
* @author Arthur
* @version 17.06.16
*/
public class Map implements IMap {

	private int width;
	private int height;
	private IElement		elements[][];
	private ArrayList<IMobileElement> mobiles = new ArrayList<IMobileElement>();
	private IElement hero;
	
	/**
	 * 
	 * @param width
	 * 				The width of the map.
	 * @param height
	 * 				The height of the map.
	 */
	
	public Map(int width, int height){
		this.width = width;
		this.height = height;
		this.elements = new IElement[this.getWidth()][this.getHeight()];
	}
	
	/**
	 * @param width 
	 * 			Recovers the width of the map
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * 
	 * @param width
	 * 				Updates the width of the map
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @param height
	 * 			Recovers the height of the map
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * 
	 * @param height
	 * 			Updates the height of the map
	 */
	
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return The elements 
	 */
	public IElement[][] getElements() {
		return elements;
	}
	/**
	 * 
	 * @param elements 
	 * 				the elements is updated 		
	 */
	public void setElements(IElement[][] elements) {
		this.elements = elements;
	}
	/**
	 * @return The different mobiles object
	 */
	public ArrayList<IMobileElement> getMobiles() {
		return mobiles;
	}
	public void addMobiles(IMobileElement mobile) {
		mobiles.add(mobile);
	}

	public IElement getElement( int x,  int y) {
		if ((x < 0) || (y < 0) || (x >= this.getWidth()) || (y >= this.getHeight())) {
			return null;
		}
		return this.elements[x][y];
	}
	
	/**
	 * @param element 
	 *			It assigns the coordinates to the element
	 */
	public void addElement(IElement element, final int x, final int y) {
		this.elements[x][y] = element;
		
	}
	/**
	 * @return Retrieve the hero
	 */
	public IElement getHero() {
		return hero;
	}
	/**
	 * @param hero 
	 * 			The hero is updated
	 */
	public void setHero(IElement hero) {
		this.hero = hero;
	}
	
	
	
	
}
