package contract;

/**
 *<b>The Interface IFrame.</b> 
 * @author Arthur
 * @version 16.06.2016
 */
public interface IFrame {

	int HEIGHT = 412;
	int WIDTH = 646;
	
	/**
	 * @param controler
	 * 				Use the controler
	 */
	public void setControler(IControler controler);

}