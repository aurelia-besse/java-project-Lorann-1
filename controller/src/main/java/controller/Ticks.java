package controller;

import contract.IController;

/**
 * 
 * @author Aurelia
 * @version 17.06.2016
 */
public class Ticks implements Runnable{

	private IController controller;
	
	/**
	 * Initialize
	 * @param controller
	 */
	public Ticks( IController controller){
		this.controller = controller;
		
	}
	/* (non-Javadoc)
	 * @see controller.ITicks#run()
	 */
	public void run() {
		try{
			while(true){
				controller.update();
				try{
				
			
				
				Thread.sleep(150);
				}catch(Exception e){e.printStackTrace();}
				
			}
		}catch(Exception ex){}
		
	}

}
