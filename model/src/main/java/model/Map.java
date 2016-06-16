package model;

import java.util.ArrayList;

public class Map {

	private int width;
	private int height;
	private Element		elements[][];
	private ArrayList<MobileElement> mobiles = new ArrayList<MobileElement>();
	
	public Map(int width, int height){
		this.width = width;
		this.height = height;
		this.elements = new Element[this.getWidth()][this.getHeight()];
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Element[][] getElements() {
		return elements;
	}
	public void setElements(Element[][] elements) {
		this.elements = elements;
	}
	public ArrayList<MobileElement> getMobiles() {
		return mobiles;
	}
	public void addMobiles(MobileElement mobile) {
		mobiles.add(mobile);
	}

	public Element getElement( int x,  int y) {
		if ((x < 0) || (y < 0) || (x >= this.getWidth()) || (y >= this.getHeight())) {
			return null;
		}
		return this.elements[x][y];
	}
	
	public void addElement(Element element, final int x, final int y) {
		this.elements[x][y] = element;
		
	}
	
	
}
