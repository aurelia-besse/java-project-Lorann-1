package contract;

import java.awt.Image;

/**
 *<b>The Interface IElement.</b> 
 * @author Arthur
 * @version 16.06.2016
 */
public interface IElement {

	int getX();

	int getY();
	
	public void setPosition(int x, int y);

	public Permeability getPermeability();

	public ISprite getSprite();

	Image getImage();

}