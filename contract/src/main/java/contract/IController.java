package contract;

import java.awt.event.KeyEvent;

/**
 * <b>The Interface IController.</b>
 * @author Aurelia
 * @version 16.06.2016
 * */
public interface IController {

	/**
	 * Method for KeyEvent
	 * @param e 
	 * 		it's a key Event
	 */
	public void keyEvents(KeyEvent e);
	public void update();

}