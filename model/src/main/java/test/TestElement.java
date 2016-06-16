package test;

import static org.junit.Assert.*;

import javax.swing.text.html.parser.Element;

import org.junit.Test;

import model.Permeability;

public class TestElement {

	@Test
	public void testElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetX() {
		model.Sprite image = new model.Sprite("https://fr.wikipedia.org/wiki/Flanby#/media/File:Flanby_n01.jpg");
		model.Element element = new model.Element(Permeability.BLOCKING , image);
		int x = (int)(Math.random()*10);
		element.x = x;
		assertEquals(x,element.getX());
	}

	@Test
	public void testSetX() {
		model.Sprite image = new model.Sprite("https://fr.wikipedia.org/wiki/Flanby#/media/File:Flanby_n01.jpg");
		model.Element element = new model.Element(Permeability.BLOCKING , image);
		int x = (int)(Math.random()*10);
		element.setX(x);
		assertEquals(x,element.getX());
	}

	@Test
	public void testGetY() {
		model.Sprite image = new model.Sprite("https://fr.wikipedia.org/wiki/Flanby#/media/File:Flanby_n01.jpg");
		model.Element element = new model.Element(Permeability.BLOCKING , image);
		int y = (int)(Math.random()*10);
		element.y = y;
		assertEquals(y, element.getY());
	}

	@Test
	public void testSetY() {
		model.Sprite image = new model.Sprite("https://fr.wikipedia.org/wiki/Flanby#/media/File:Flanby_n01.jpg");
		model.Element element = new model.Element(Permeability.BLOCKING , image);
		int y = (int)(Math.random()*10);
		element.setY(y);
		assertEquals(y,element.getY());
	}

	@Test
	public void testGetPermeability() {
		model.Sprite image = new model.Sprite("https://fr.wikipedia.org/wiki/Flanby#/media/File:Flanby_n01.jpg");
		double rand = Math.random();
		if (rand < 0.5){
			model.Element element = new model.Element(Permeability.BLOCKING , image);
			assertEquals(Permeability.BLOCKING, element.getPermeability());
		}
		
		else{
			model.Element element = new model.Element(Permeability.PENETRABLE , image);
			assertEquals(Permeability.PENETRABLE, element.getPermeability());
		}
		
	}

	@Test
	public void testSetPermeability() {
		model.Sprite image = new model.Sprite("https://fr.wikipedia.org/wiki/Flanby#/media/File:Flanby_n01.jpg");
		double rand = Math.random();
		
	}

	@Test
	public void testGetSprite() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSprite() {
		fail("Not yet implemented");
	}

}
