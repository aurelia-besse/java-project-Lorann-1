package controller;

import contract.IController;


public class Ticks implements Runnable{

	private IController controller;
	/**
	 * 
	 * @param controler
	 * 				Uses the controler
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
