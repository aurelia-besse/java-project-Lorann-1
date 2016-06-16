package contract;

import java.awt.Image;

public interface IElement {

	int getX();

	int getY();

	public IPermeability getPermeability();

	public ISprite getSprite();

	Image getImage();

}