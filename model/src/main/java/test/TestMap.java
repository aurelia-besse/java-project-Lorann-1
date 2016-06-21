package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IElement;
import contract.Permeability;
import model.Element;
import model.Sprite;

public class TestMap {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testMap(){
		assertNotNull(new model.Map(42,88));
	}
	
	@Test
	public void testGetWidth() {
		int w = (int)(Math.random()*100);
		model.Map map = new model.Map(w,15);
		assertEquals(w, map.getWidth());
	}

	@Test
	public void testSetWidth() {
		int w = (int)(Math.random()*100);
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
		int h = (int)(Math.random()*100);
		model.Map map = new model.Map(23,h);
		assertEquals(h, map.getHeight());
	}

	@Test
	public void testSetHeight() {
		int h = (int)(Math.random()*100);
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
	/** THIS METHOD HAS AN ERROR SOMEWHERE, SO SHE ISN'T USED YET
	@Test
	public void testSetElements() {
		int w;
		int h;
		newElements = null;
		
		model.Map map = new model.Map(w = (int)(Math.random()*100), h = (int)(Math.random()*100));
		model.Sprite sprite1 = new model.Sprite("sprite/bone.png");
		model.Sprite sprite2 = new model.Sprite("sprite/horizontal_bone.png");
		model.Sprite sprite3 = new model.Sprite("sprite/vertical_bone.png");
		model.Sprite sprite4 = new model.Sprite("sprite/closed_door.png");
		
		model.Element element1 = new model.Element(Permeability.BLOCKING, sprite1);
		model.Element element2 = new model.Element(Permeability.PENETRABLE, sprite2);
		model.Element element3 = new model.Element(Permeability.BLOCKING, sprite3);
		model.Element element4 = new model.Element(Permeability.PENETRABLE, sprite4);
		
		for (int k = 0; k<2;k++)
			for(int i=0; i<w; i++){
				for(int j=0; j<h; j++){
					int a = (int)(Math.random()*1000000)%4;
					switch(a){
					case 1:
						if (k == 0){
						map.elements[i][j] = element1;
						break;
						}
						else if (k==1){
							newElements[i][j] = element1;
							break;
						}
						else{
							fail("Variable k get out of range");
						}
					
					case 2:
						if (k == 0){
						map.elements[i][j] = element2;
						break;
						}
						else if (k==1){
							newElements[i][j] = element2;
							break;
						}
						else{
							fail("Variable k get out of range");
						}
					
					case 3:
						if (k == 0){
							map.elements[i][j] = element3;
							break;
						}
						else if (k==1){
							newElements[i][j] = element3;
							break;
						}
						else{
							fail("Variable k get out of range");
						}
						
					case 4:
						if (k == 0){
							map.elements[i][j] = element4;
							break;
							}
						else if (k==1){
							newElements[i][j] = element4;
							break;
							}
						else{
							fail("Variable k get out of range");
							}			
					}
				}
			}
		map.setElements(newElements);
		assertArrayEquals(newElements, map.elements);
		}
	**/
	@Test
	public void testGetMobiles() {
		fail("Test method not Implemented yet");
		/* To complete*/
	}
	
	@Test
	public void testGetElement(){
		Sprite sprite = new Sprite("sprite/lorann_ul.png");
		model.Map map = new model.Map((int)(Math.random()*100),(int)(Math.random()*100));
		model.Element element = new model.Element(Permeability.PENETRABLE, sprite);
		map.elements[2][2] = element;
		assertEquals(map.getElement(2, 2), element);
	}

	@Test
	public void testAddMobiles() {
		/* To complete*/
	}
	
	@Test
	public void testGetHero(){
		Sprite sprite = new Sprite("sprite/lorann_ul.png");
		model.Map map = new model.Map((int)(Math.random()*100),(int)(Math.random()*100));
		map.lorann = new Element(Permeability.PENETRABLE,sprite);
		assertEquals(map.lorann, map.getLorann());
	}
	
	@Test
	public void testSetHero(){
		Sprite sprite = new Sprite("sprite/lorann_ul.png");
		model.Map map = new model.Map((int)(Math.random()*100),(int)(Math.random()*100));
		map.lorann = new Element(Permeability.PENETRABLE,sprite);
		Sprite newSprite = new Sprite("sprite/lorann_ur.png");
		IElement newHero =new Element(Permeability.PENETRABLE,newSprite);
		map.setLorann(newHero);
		assertEquals(newHero, map.getLorann());
	}
	
	@Test
	public void testGetSpell(){
		Sprite sprite = new Sprite("sprite/bone.png");
		model.Map map = new model.Map((int)(Math.random()*100),(int)(Math.random()*100));
		map.spell = new Element(Permeability.BLOCKING, sprite);
		assertEquals(map.spell,map.getSpell());
	}
}
