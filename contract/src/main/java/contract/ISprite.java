package contract;

import java.awt.Image;

public interface ISprite {

	/**
	 * @return The picture .png
	 */
	Image getImage();
	public void setImage(String url);

}