package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
private Image image;
public Sprite( final String url) {
		
		try {
			this.image = ImageIO.read(new File(url));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}


public Image getImage() {
	return this.image;
}
}