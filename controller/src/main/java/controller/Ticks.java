package controller;

import contract.IControler;


public class Ticks implements Runnable{

	private IControler controler;
	public Ticks( IControler controler){
		this.controler = controler;
		
	}
	/* (non-Javadoc)
	 * @see controller.ITicks#run()
	 */
	public void run() {
		try{
			while(true){
				controler.update();
				try{
				
			
				
				Thread.sleep(120);
				}catch(Exception e){e.printStackTrace();}
				
			}
		}catch(Exception ex){}
		
	}

}
