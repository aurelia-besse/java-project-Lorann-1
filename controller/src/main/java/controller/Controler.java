package controller;

import java.awt.event.KeyEvent;

import contract.IControler;
import contract.IElement;
import contract.IFrame;
import contract.IGame;
import contract.ILorann;
import contract.Permeability;
import contract.LorannState;

public class Controler implements IControler {

	private IGame model;
	private IFrame frame;
	public Controler(IGame model, IFrame frame){
		this.model = model;
		this.frame = frame;
	}
	
	
	private boolean getBlocked(int x, int y){
		return model.getMap().getElement(x, y).getPermeability().equals(Permeability.BLOCKING);
		
				
				
	}
	public void keyEvents(KeyEvent lol){
		switch(lol.getKeyCode()){
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
		IElement Lorann = model.getMap().getHero();

		int x = Lorann.getX();
		int y = Lorann.getY();
		
		switch(state){
			case 1:
				((ILorann)Lorann).setState(LorannState.UP);
				if(!getBlocked(Lorann.getX(), Lorann.getY()-1)){
					Lorann.setPosition(x, y-1);
				}
				break;
			case 2:
				((ILorann)Lorann).setState(LorannState.DOWN);
				if(!getBlocked(x, y +1)){
					Lorann.setPosition(x, y+1);	
				}
				break;
			case 3:
				((ILorann)Lorann).setState(LorannState.RIGHT);
				if(!getBlocked(x + 1, y)){
					Lorann.setPosition(x +1, y);
				}
				break;
			case 4:
				((ILorann)Lorann).setState(LorannState.LEFT);
				if(!getBlocked(x - 1, y)){
					Lorann.setPosition(x - 1, y);
				}
				break;
				
		}model.change();
	}
	
	
}
