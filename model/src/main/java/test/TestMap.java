package test;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.IElement;
import contract.Permeability;
import model.Element;
import model.Sprite;

public class TestMap {
	
	@Test
	public void testMap(){
		assertNotNull(new model.Map(42,88));
	}
	
	@Test
	public void testGetWidth() {
		int w = 23;
		model.Map map = new model.Map(w,15);
		assertEquals(w, map.getWidth());
	}

	@Test
	public void testSetWidth() {
		int w = 23;
		model.Map map = new model.Map(w,15);
		int width1 = map.getWidth();
		int width2;
		do{
			width2 = (int)(Math.random()*100);
		}while(width2 ==width1);
		map.setWidth(width2);
		
		assertEquals(width2, map.getWidth());
	}

	@Test
	public void testGetHeight() {
		int h = 23;
		model.Map map = new model.Map(23,h);
		assertEquals(h, map.getHeight());
	}

	@Test
	public void testSetHeight() {
		int h = 23;
		model.Map map = new model.Map(34,h);
		int height1 = map.getHeight();
		int height2;
		do{
			height2 = (int)(Math.random()*100);
		}while(height2 == height1);
		map.setHeight(height2);
		
		assertEquals(height2, map.getHeight());
	}

	@Test
	public void testGetElements() {
		model.Map map = new model.Map((int)(Math.random()*100),(int)(Math.random()*100));
		map.elements = new IElement[map.getWidth()][map.getHeight()];
		assertArrayEquals(map.getElements(),map.elements);
	}

	@Test
	public void testSetElements() {
		int w;
		int h;
		model.Map map = new model.Map((int)(Math.random()*100),(int)(Math.random()*100));
		map.elements = new IElement[map.getWidth()][map.getHeight()];
		do{
			w = (int)(Math.random()*100);
			h = (int)(Math.random()*100);
			
		}while(w>map.getWidth() || h>map.getHeight());
		
		IElement[][] elements2 = new IElement[w][h];
		map.setElements(elements2);
		assertArrayEquals(map.getElements(), elements2);
	}

	@Test
	public void testGetMobiles() {
		/* To complete*/
	}

	@Test
	public void testAddMobiles() {
		/* To complete*/
	}
	
	@Test
	public void testGetHero(){
		Sprite sprite = new Sprite("C:/Users/adrie/Pictures/conneries/Auto congratulation/MOI/moi.jpg");
		model.Map map = new model.Map((int)(Math.random()*100),(int)(Math.random()*100));
		map.hero = new Element(Permeability.PENETRABLE,sprite);
		assertEquals(map.hero, map.getHero());
	}
	
	@Test
	public void testSetHero(){
		Sprite sprite = new Sprite("C:/Users/adrie/Pictures/conneries/Auto congratulation/MOI/moi.jpg");
		model.Map map = new model.Map((int)(Math.random()*100),(int)(Math.random()*100));
		map.hero = new Element(Permeability.PENETRABLE,sprite);
		Sprite newSprite = new Sprite("C:/Users/adrie/Pictures/TV/film/LOTR/lotr-wallpaper-sauron.png");
		IElement newHero =new Element(Permeability.PENETRABLE,newSprite);
		map.setHero(newHero);
		assertEquals(newHero, map.getHero());
	}
}
