package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.BubbleKey;

public class TestBubbleKey {

	@Test
	public void testBubbleKey() {
		assertNotNull(new BubbleKey(0,0,"C:/Users/adrie/Pictures/conneries/Auto congratulation/MOI/moi.jpg"));
	}
}
