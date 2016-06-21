package test;

import static org.junit.Assert.*;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

public class TestSprite {

	@Test
	public void testSprite() {
		assertNotNull(new model.Sprite("sprite/bone.png"));
	}

	@Test
	public void testGetImage() {
		Image temp;
		model.Sprite sprite = new model.Sprite("sprite/bone.png");
		try {
			temp = ImageIO.read(sprite.getClass().getClassLoader().getResourceAsStream("sprite/bone.png"));
			sprite.image = temp;
			assertEquals(sprite.getImage(), temp);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetImage(){
		Image image = null;
		String url = "sprite/bone.png";
		model.Sprite sprite = new model.Sprite(url);
		
		sprite.setImage(url);
		assertNotEquals(sprite.getImage(), image);
	}
}
