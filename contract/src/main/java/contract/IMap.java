package contract;

import java.util.ArrayList;

public interface IMap {

	int getWidth();

	int getHeight();

	public IElement[][] getElements();

	ArrayList<IMobileElement> getMobiles();

	void addMobiles(IMobileElement mobile);

	public IElement getElement(int x, int y);

	void addElement(IElement element, int x, int y);
	
	public IElement getHero();
	
	public void setHero(IElement hero);

}