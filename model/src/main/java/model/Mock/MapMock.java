package model.Mock;

import java.util.ArrayList;

import contract.IElement;
import contract.IMobileElement;

public class MapMock {
	private int width;
	private int height;
	public IElement elements[][];
	public ArrayList<IMobileElement> mobiles = new ArrayList<IMobileElement>();
	public IElement hero;
	private IElement spell;
	
}
