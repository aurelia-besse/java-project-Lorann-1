package model;

import java.util.ArrayList;

public class Map {

	private int width;
	private int height;
	private Element		elements[][];
	private ArrayList<MobileElement> mobiles = new ArrayList<MobileElement>();
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

	
	
}
