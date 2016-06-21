package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.AnimateSprite;
/**
 * 
 * @author Adrien
 * @version 16.06.2016
 *
 */
public class TestAnimateSprite {
	 
		/**
		 * test method for {@link model.AnimateSprite#AnimateSprite(String, String[])}
		 */
	  	@Test
	  	public void testAnimateSprite() {
	  		String[] urls = {"sprite/lorann_b.png", "sprite/lorann_bl.png", "sprite/lorann_br.png", "sprite/lorann_l.png", "sprite/lorann_r.png", "sprite/lorann_u.png", "sprite/lorann_ul.png", "sprite/lorann_ur.png"};
	 		assertNotNull(new AnimateSprite("sprite/lorann_b.png", urls));
	 			assertNotNull(new AnimateSprite("sprite/lorann_b.png", urls));
	  	}
	 	
		/**
		 * test method for {@link model.AnimateSprite#getImage()}	
		 */
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
	 
	 	/**
	 	 * test method for {@link model.AnimateSprite#nextImage()}	
	 	 */
	  	@Test
	  	public void testNextImage() {
	 		int rand;
	 		String[] urls = {"sprite/lorann_b.png", "sprite/lorann_bl.png", "sprite/lorann_br.png", "sprite/lorann_l.png", "sprite/lorann_r.png", "sprite/lorann_u.png", "sprite/lorann_ul.png", "sprite/lorann_ur.png"};
	 		do{
	 			rand = (int)(Math.random()*10);
	 		}while(rand > urls.length);
	 		AnimateSprite animateSprite = new AnimateSprite("sprite/lorann_b.png", urls);
	 		animateSprite.next = rand;
	 		animateSprite.nextImage();
	 		if(animateSprite.next != 0){
	 			assertEquals(animateSprite.next,rand+1);
	 		}
	 	}
	 } 