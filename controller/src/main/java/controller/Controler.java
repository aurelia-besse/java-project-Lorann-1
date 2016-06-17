package controller;

import java.awt.event.KeyEvent;

import contract.IControler;
import contract.IElement;
import contract.IFrame;
import contract.IGame;
import contract.ILorann;
import contract.IMobileElement;
import contract.Permeability;
import contract.LorannState;

public class Controler implements IControler {

	private IGame model;
	private IFrame frame;
	public Controler(IGame model, IFrame frame){
		this.model = model;
		this.frame = frame;
		Thread t = new Thread(new Ticks(this));
		t.start();
	}
	
	
	private boolean getBlocked(int x, int y){
		return model.getMap().getElement(x, y).getPermeability().equals(Permeability.BLOCKING);
		
				
				
	}
	public void keyEvents(KeyEvent e){
		switch(e.getKeyCode()){
			case KeyEvent.VK_UP : case KeyEvent.VK_A :
				moveLorann(1);
				break;
			case KeyEvent.VK_DOWN : case KeyEvent.VK_S :
				moveLorann(2);
				break;
			case KeyEvent.VK_LEFT : case KeyEvent.VK_Q :
				moveLorann(4);
				break;
			case KeyEvent.VK_RIGHT : case KeyEvent.VK_D :
				moveLorann(3);
				break;
			case KeyEvent.VK_SPACE :
			
				break;
		}
		}
	
	
	public void moveLorann(int state){
		IElement lorann = model.getMap().getHero();

		int x = lorann.getX();
		int y = lorann.getY();
		
		switch(state){
			case 1:
				((ILorann)lorann).setState(LorannState.UP);
				if(!getBlocked(lorann.getX(),lorann.getY()-1)){
					lorann.setPosition(x, y-1);
				}
				break;
			case 2:
				((ILorann)lorann).setState(LorannState.DOWN);
				if(!getBlocked(x, y +1)){
					lorann.setPosition(x, y+1);	
				}
				break;
			case 3:
				((ILorann)lorann).setState(LorannState.RIGHT);
				lorann.getSprite().setImage("D:/java project Lorann 1/sprite/lorann_r.png");
				if(!getBlocked(x + 1, y)){
					lorann.setPosition(x +1, y);
				}
				break;
			case 4:
				((ILorann)lorann).setState(LorannState.LEFT);
				if(!getBlocked(x - 1, y)){
					lorann.setPosition(x - 1, y);
				}
				break;
				
		}model.change();
	}
	
	public void moveDemon(){
		for(IMobileElement demon : model.getMap().getMobiles()){
			double random = Math.random();
			int x = ((IElement)demon).getX();
			int y = ((IElement)demon).getY();
			if(random <= .25d && !getBlocked(x,y -1)){
				((IElement)demon).setPosition(x, y -1);
			}else if (random <= .50d && !getBlocked(x,y +1)){
				((IElement)demon).setPosition(x, y +1);
			}else if (random <= .75d && !getBlocked(x -1,y )){
				((IElement)demon).setPosition(x -1,y);
			}else if (random <= .75d && !getBlocked(x +1,y )){
				((IElement)demon).setPosition(x +1,y);
		}
	}model.change();
	}
	
	
}
