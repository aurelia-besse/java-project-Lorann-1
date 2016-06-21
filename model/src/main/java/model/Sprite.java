package model;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ISprite;

public class Sprite implements ISprite {
private Image image;
public Sprite(String url) {
		
		try {
			this.image = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(url));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}


/* (non-Javadoc)
 * @see model.ISprite#getImage()
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