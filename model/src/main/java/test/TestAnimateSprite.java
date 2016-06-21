package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.AnimateSprite;

public class TestAnimateSprite {

	@Test
	public void testAnimateSprite() {
		String[] urls = {"sprite/lorann_b.png", "sprite/lorann_bl.png", "sprite/lorann_br.png", "sprite/lorann_l.png", "sprite/lorann_r.png", "sprite/lorann_u.png", "sprite/lorann_ul.png", "sprite/lorann_ur.png"};
		assertNotNull(new AnimateSprite("sprite/lorann_b.png", urls));
	}
	
	@Test
	public void testGetImage() {
		int rand;
		String[] urls = {"sprite/lorann_b.png", "sprite/lorann_bl.png", "sprite/lorann_br.png", "sprite/lorann_l.png", "sprite/lorann_r.png", "sprite/lorann_u.png", "sprite/lorann_ul.png", "sprite/lorann_ur.png"};
		do{
			rand = (int)(Math.random()*10);
		}while(rand > urls.length);
		AnimateSprite animateSprite = new AnimateSprite("sprite/lorann_b.png", urls);
		animateSprite.next = rand;
		animateSprite.nextImage();
		assertEquals(animateSprite.next,rand+1);
		
	}

	@Test
	public void testNextImage() {
		fail("No test for this function yet");
	}
}
