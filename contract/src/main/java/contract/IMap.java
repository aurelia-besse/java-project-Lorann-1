package contract;

import java.util.ArrayList;
/**
 * <b>The Interface IMap.</b>
 * @author Aurelia
 * @version 16.06.16
 */
public interface IMap {

	/**
	 * Recovers the width of the map
	 * @return the width of the map		
	 */
	int getWidth();

	/**
	 * Recovers the height of the map
	 * @return the height of the map
	 */
	int getHeight();

	/**
	 * Recovers a table of elements
	 *@return  the table of the elements
	 */
	public IElement[][] getElements();

	/**
	 * Recovers a mobile element in the list
	 * @return a mobile element
	 */
	public ArrayList<IMobileElement> getMobiles();

	/**
	 * Add a mobile element in the list
	 * @param mobile
	 * 			It's a mobile element	
	 */
	public void addMobiles(IMobileElement mobile);

	/**
	 * Recovers an element in a position 
	 * @param x
	 * 			The x position of the element on a landmark o,x,y.
	 * @param y
	 * 			The y position of the element on a landmark o,x,y.
	 * @return the element in the position
	 */
	public IElement getElement(int x, int y);
	
	/**
	 * Adds an element in a position 
	 *@param x 
	 *		The x position of the element on a landmark o,x,y.
	 *@param y 
	 *		The y position of the element on a landmark o,x,y.
	 *@param element 
	 *			It's the element to add on the coordinates x, y
	 */
	void addElement(IElement element, int x, int y);
	
	/**
	 * Recovers Lorann in the map
	 * @return Lorann
	 */
	public IElement getLorann();
	
	/**
	 * Method to set Lorann in the map
	 * @param lorann
	 * 			It's an element			
	 */
	public void setLorann(IElement lorann);
	
	/**
	 * Recovers the spell
	 * @return the spell
	 */
	public IElement getSpell();
	
	/**
	 * Update the spell
	 * @param spell
	 * 			It's an element
	 */
	public void setSpell(IElement spell);

}