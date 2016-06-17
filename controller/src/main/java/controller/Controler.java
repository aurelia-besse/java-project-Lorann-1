package controller;

import java.awt.event.KeyEvent;

import contract.*;

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
				IElement lorann = model.getMap().getHero();
				if(((ILorann)lorann).getPossessionSpell().equals(SpellState.NotThrow)){
					((ILorann)lorann).setPossessionSpell(SpellState.Throw);
					model.addSpells(lorann);
					setSpellState(((ILorann)lorann).getState());
				}
				break;
				
		}
		}
	
	private void setSpellState(LorannState state){
		IElement spell = model.getMap().getSpell();
		if(state == LorannState.UP){
			((ISpell)spell).setState(SpellState.UP);
		}else if (state == LorannState.DOWN){
			((ISpell)spell).setState(SpellState.DOWN);
		}else if (state == LorannState.LEFT){
			((ISpell)spell).setState(SpellState.LEFT);
		}else if (state == LorannState.RIGHT){
			((ISpell)spell).setState(SpellState.RIGHT);
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
				}else if (model.getMap().getElement(x, y-1) instanceof IBubbleKey || model.getMap().getElement(x, y-1) instanceof ICoins){
					lorann.setPosition(x, y-1);
					model.addFloor(lorann, x, y-1);
				}
				break;
			case 2:
				((ILorann)lorann).setState(LorannState.DOWN);
				if(!getBlocked(x, y +1)){
					lorann.setPosition(x, y+1);	
				}else if (model.getMap().getElement(x, y+1) instanceof IBubbleKey || model.getMap().getElement(x, y+1) instanceof ICoins){
					lorann.setPosition(x, y+1);
					model.addFloor(lorann, x, y+1);
				}
				break;
			case 3:
				((ILorann)lorann).setState(LorannState.RIGHT);
				lorann.getSprite().setImage("D:/java project Lorann 1/sprite/lorann_r.png");
				if(!getBlocked(x + 1, y)){
					lorann.setPosition(x +1, y);
				}else if (model.getMap().getElement(x+1, y) instanceof IBubbleKey || model.getMap().getElement(x+1, y) instanceof ICoins){
					lorann.setPosition(x+1, y);
					model.addFloor(lorann, x+1, y);
				}
				break;
			case 4:
				((ILorann)lorann).setState(LorannState.LEFT);
				if(!getBlocked(x - 1, y)){
					lorann.setPosition(x - 1, y);
				}else if (model.getMap().getElement(x-1, y) instanceof IBubbleKey || model.getMap().getElement(x-1, y) instanceof ICoins){
					lorann.setPosition(x-1, y);
					model.addFloor(lorann, x-1, y);
				}
				break;
				
		}model.change();
	}
	
	public void moveDemon(){
		try{
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
				}model.change();	
			}
		
			IElement spell = model.getMap().getSpell();
			int x = spell.getX();
			int y = spell.getY();
			
			if (((ISpell)spell).getState().equals(SpellState.UP)){
				if(getBlocked(x,y-1)){
					((ISpell)spell).setState(SpellState.DOWN);
				}else{
					spell.setPosition(x, y-1);
				}
			}else if (((ISpell)spell).getState().equals(SpellState.DOWN)){
				if(getBlocked(x,y+1)){
					((ISpell)spell).setState(SpellState.UP);
				}else{
					spell.setPosition(x, y+1);
				}
			}else if (((ISpell)spell).getState().equals(SpellState.RIGHT)){
				if(getBlocked(x+1,y)){
					((ISpell)spell).setState(SpellState.LEFT);
				}else{
					spell.setPosition(x+1, y);
				}
			}else if (((ISpell)spell).getState().equals(SpellState.LEFT)){
				if(getBlocked(x-1,y)){
					((ISpell)spell).setState(SpellState.RIGHT);
				}else{
					spell.setPosition(x-1, y);
				}
			}model.change();
	
		}catch(Exception ex){};
	
		
	}
	


}
