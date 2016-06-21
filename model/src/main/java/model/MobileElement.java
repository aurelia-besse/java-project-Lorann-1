package model;

import contract.IMobileElement;
import contract.Permeability;

/**
 * @author Arthur
 * @version 16.06.2016
 */
public class MobileElement extends Element implements IMobileElement {
	
	/**
	 * @param url
	 * 			To assign an image
	 * @param permeability
	 * 			To assign a permeability
	 */
	public MobileElement ( String url, Permeability permeability){
		super(permeability,new Sprite(url));
	}

	
	
}

