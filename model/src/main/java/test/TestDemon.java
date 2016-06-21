package test;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestDemon {

	@Test
	public void testDemon() {
		double x = Math.random();
		String url = "";
		if (x<0.25){
			url = "sprite/monster_1.png";
		}
		
		else if (x<0.5){
			url = "sprite/monster_2.png";
		}
		
		else if (x<0.75){
			url = "sprite/monster_3.png";
		}
		
		else if (x<1){
			url = "sprite/monster_4.png";
		}
			
		assertNotNull(new model.Demon(0,0,url));
	}
}