package model;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import contract.ISprite;

/**
  * <b>This class Sprite is used to assign a picture to an item</b>
 * This class Sprite is used to assign a picture to an item
 * The Sprite consists to:
 * <ul>
 * <li>Assigned an image with an url</li>
 * </ul>
 * @author Arthur
 * @version 17.06.2016
 */

public class Sprite implements ISprite {
	
public Image image;

/**
 * Initialize a sprite
 * @param url
 */
public Sprite(String url) {
		
		try {
			this.image = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(url));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

/*
 * (non-Javadoc)
 * @see contract.ISprite#getImage()
 */
public Image getImage() {
	return this.image;
}

/*
 * (non-Javadoc)
 * @see contract.ISprite#setImage(java.lang.String)
 */
public void setImage(String url)
{

	try {
		this.image = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(url));
	} catch (final IOException e) {
		e.printStackTrace();
	}
}


}