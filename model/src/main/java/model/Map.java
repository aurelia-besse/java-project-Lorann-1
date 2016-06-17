package model;

import java.util.ArrayList;

import contract.IElement;
import contract.IMap;
import contract.IMobileElement;

public class Map implements IMap {

	private int width;
	private int height;
	private IElement		elements[][];
	private ArrayList<IMobileElement> mobiles = new ArrayList<IMobileElement>();
	private IElement hero;
	
	public Map(int width, int height){
		this.width = width;
		this.height = height;
		this.elements = new IElement[this.getWidth()][this.getHeight()];
	}
	/* (non-Javadoc)
	 * @see model.IMap#getWidth()
	 */
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	/* (non-Javadoc)
	 * @see model.IMap#getHeight()
	 */
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	/* (non-Javadoc)
	 * @see model.IMap#getElements()
	 */
	public IElement[][] getElements() {
		return elements;
	}
	public void setElements(IElement[][] elements) {
		this.elements = elements;
	}
	/* (non-Javadoc)
	 * @see model.IMap#getMobiles()
	 */
	public ArrayList<IMobileElement> getMobiles() {
		return mobiles;
	}
	/* (non-Javadoc)
	 * @see model.IMap#addMobiles(model.MobileElement)
	 */
	public void addMobiles(IMobileElement mobile) {
		mobiles.add(mobile);
	}

	/* (non-Javadoc)
	 * @see model.IMap#getElement(int, int)
	 */
	public IElement getElement( int x,  int y) {
		if ((x < 0) || (y < 0) || (x >= this.getWidth()) || (y >= this.getHeight())) {
			return null;
		}
		return this.elements[x][y];
	}
	
	/* (non-Javadoc)
	 * @see model.IMap#addElement(model.Element, int, int)
	 */
	public void addElement(IElement element, final int x, final int y) {
		this.elements[x][y] = element;
		
	}
	public IElement getHero() {
		return hero;
	}
	public void setHero(IElement hero) {
		this.hero = hero;
	}
	
	
	
	
}
