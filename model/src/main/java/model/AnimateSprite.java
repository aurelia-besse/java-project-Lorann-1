package model;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.IAnimateSprite;

/**
*<b>The AnimateSprite class animates pictures</b>
* <p>
* The class AnimateSprite consists to make a movement for a picture
* <ul>
* </p>
* @author Aurelia
* @version 20.06.16
*/
public class AnimateSprite extends Sprite implements IAnimateSprite{

	private Image images[];
	private int next;
	public AnimateSprite(String url,String[] urls) {
		super(url);
		this.images = new Image[urls.length];
		for (int a=0; a<images.length; a++ ){
			try {
				this.images[a] = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(urls[a]));
			} catch (final IOException e) {
				e.printStackTrace();
			}
		}this.next = 0;
	}
	
	/* (non-Javadoc)
	 * @see model.IAnimateSprite#nextImage()
	 */
	public void nextImage(){
		this.next ++;
		if (this.next>= this.images.length){
			this.next = 0;
		}
	}
	/*
	 * (non-Javadoc)
	 * @see model.Sprite#getImage()
	 */
	public Image getImage() {
        return this.images[this.next];
    }

	
	
	

}
