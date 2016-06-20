package model;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import contract.ISprite;

/**
 * <b>This class Sprite is used to assign a picture to an item</b>
 * <p>
 * The Sprite consists to:
 * <ul>
 * <li>Assigned an image with an url</li>
 * </ul>
 * </p>
 * @author Arthur
 * @version 17.06.2016
 */

public class Sprite implements ISprite {
	
private Image image;
/**
 * 
 * @param url
 * 				An url for one image
 */
public Sprite( String url) {
		
		try {
			this.image = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(url));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

/**
 * @return The picture .png
 */
public Image getImage() {
	return this.image;
}


public void setImage(String url)
{

	try {
		this.image = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(url));
	} catch (final IOException e) {
		e.printStackTrace();
	}
}


}