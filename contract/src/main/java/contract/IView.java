package contract;

/**
 *<b>The Interface IView.</b>
 * @author Aurelia
 * @version 16.06.2016
 */
public interface IView {

	int HEIGHT = 460;
	int WIDTH = 646;
	
	/**
	 * Method to set the controller
	 * @param controler
	 * 				
	 */
	public void setController(IController controler);

}