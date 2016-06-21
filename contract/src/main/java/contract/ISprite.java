package contract;

import java.awt.Image;
/**
 *<b>The Interface ISprite.</b>
 * @author Aurelia
 * @version 16.06.2016
 */
public interface ISprite {

	/**
	 * Recovers an image
	 * @return The picture .png
	 */
	Image getImage();
	public void setImage(String url);

}