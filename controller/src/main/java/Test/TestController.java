package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controller.Controller;

public class TestController {

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
	public void testController() {
		assertNotNull(new Controller(null, null));
	}

	@Test
	public void testKeyEvents() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveLorann() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveMobileElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveDemon() {
		fail("Not yet implemented");
	}

	@Test
	public void testDemonContact() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveSpell() {
		fail("Not yet implemented");
	}

	@Test
	public void testSpellContact() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
