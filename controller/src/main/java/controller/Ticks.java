package controller;

import contract.IControler;
import contract.ITicks;

public class Ticks implements Runnable, ITicks{

	private IControler controler;
	private long ticks;
	public Ticks( IControler controler){
		this.controler = controler;
		
	}
	/* (non-Javadoc)
	 * @see controller.ITicks#run()
	 */
	public void run() {
		try{
			while(true){
				
				try{
				
			
				controler.moveDemon();
				Thread.sleep(170);
				}catch(Exception e){e.printStackTrace();}
				
			}
		}catch(Exception ex){}
		
	}

}
