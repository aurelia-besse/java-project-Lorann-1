package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IController;
/**
 * 
 * @author Adrien
 * @version 16.06.2016
 *
 */
public class TestTicks {

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

	/**
	 * test method for {@link controller.Ticks#Ticks(IController)}
	 */
	@Test
	public void testTicks() {
		IController controller = null;
		assertNotNull(new controller.Ticks(controller));
	}

	/**
	 * test method for {@link controller.Ticks#run()}
	 */
	@Test
	public void testRun() {
		IController controller = null;
		controller.Ticks ticks = new controller.Ticks(controller);
		ticks.run();
	}

}
