package contract;

/**
 *<b>The Interface IFrame.</b> 
 * @author Aurelia
 * @version 16.06.2016
 */
public interface IFrame {

	int HEIGHT = 412;
	int WIDTH = 646;
	
	/**
	 * Method to set the controller
	 * @param controler
	 * 				
	 */
	public void setController(IController controler);

}