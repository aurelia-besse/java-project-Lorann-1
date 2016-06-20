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
				BubbleKeyCheck(x,y-1,lorann);
				CoinsCheck(x,y-1,lorann);
				DoorCheck(x,y-1,lorann);
				if(!getBlocked(lorann.getX(),lorann.getY()-1)){
					lorann.setPosition(x, y-1);
				}
				break;
			case 2:
				((ILorann)lorann).setState(LorannState.DOWN);
				BubbleKeyCheck(x,y+1,lorann);
				CoinsCheck(x,y+1,lorann);
				DoorCheck(x,y+1,lorann);
				if(!getBlocked(x, y +1)){
					lorann.setPosition(x, y+1);	
				}
				break;
			case 3:
				((ILorann)lorann).setState(LorannState.RIGHT);

				BubbleKeyCheck(x+1,y,lorann);
				CoinsCheck(x+1,y,lorann);
				DoorCheck(x+1,y,lorann);
				if(!getBlocked(x + 1, y)){
					lorann.setPosition(x +1, y);
				}
				break;
			case 4:
				((ILorann)lorann).setState(LorannState.LEFT);
				BubbleKeyCheck(x-1,y,lorann);
				CoinsCheck(x-1,y,lorann);
				DoorCheck(x-1,y,lorann);
				if(!getBlocked(x - 1, y)){
					lorann.setPosition(x - 1, y);
				}
				break;
				
		}model.change();
	}
	
	private void BubbleKeyCheck(int x, int y, IElement lorann){
		IElement bubblekey = model.getMap().getElement(x, y);
		if(bubblekey instanceof IBubbleKey){
			lorann.setPosition(x, y);
			model.addFloor(lorann, x, y);
			for(IElement[] e : model.getMap().getElements()){
				for(IElement element : e){
					if(element instanceof IDoor){
						((IDoor)element).setDoorState(DoorState.OPEN);
						element.getSprite().setImage("sprite/gate_open.png");
					}
				}
			}
		}
	}
	
	private void CoinsCheck(int x, int y, IElement lorann){
		IElement coins = model.getMap().getElement(x, y);
		if (coins instanceof ICoins){
			lorann.setPosition(x, y);
			model.addFloor(lorann, x, y);
		}
	}
	
	private void DoorCheck(int x, int y, IElement lorann){
		IElement door = model.getMap().getElement(x, y);
		if (door instanceof IDoor){
			if(((IDoor)door).getDoorState().equals(DoorState.OPEN)){
				model.setGamestate(GameState.Congratulation);
				lorann.setPosition(x, y);
			}else if (((IDoor)door).getDoorState().equals(DoorState.CLOSE)){
				model.setGamestate(GameState.GAMEOVER);
			}

		}
	}
	
	public void moveMobileElement(){
		try{
			moveDemon();
			moveSpell();
		}catch(Exception ex){};
	
		
	}
			
	public void moveDemon(){		
			for(IMobileElement demon : model.getMap().getMobiles()){
				double random = Math.random();
				int x = ((IElement)demon).getX();
				int y = ((IElement)demon).getY();
				if(((IElement)demon).getX()== model.getMap().getHero().getX() && ((IElement)demon).getY()== model.getMap().getHero().getY()){
					System.out.println(model.getMap().getHero() + "mort");
					model.setGamestate(GameState.GAMEOVER);

				}
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
	}
	
	public void moveSpell(){
			IElement spell = model.getMap().getSpell();
			int x = spell.getX();
			int y = spell.getY();
			contact();
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
	}
	
		
	
	public void update(){
		moveMobileElement();
		updateSprites();
	}
	
	
	private void updateSprites(){
		((IAnimateSprite)model.getMap().getHero().getSprite()).nextImage();
		if(model.getMap().getSpell()!=null){
			((IAnimateSprite)model.getMap().getSpell().getSprite()).nextImage();
		}
		
	}
	
	public void contact(){
		IElement lorann = model.getMap().getHero();
		IElement spell = model.getMap().getSpell();
		if(lorann.getX()== spell.getX() && lorann.getY()==spell.getY()){
			((ILorann)lorann).setPossessionSpell(SpellState.NotThrow);
			model.getMap().setSpell(null);
		}
		for(IMobileElement demon : model.getMap().getMobiles()){
			if(((IElement)demon).getX()== spell.getX() && ((IElement)demon).getY()== spell.getY()){
				System.out.println(demon + "mort");
				model.getMap().getMobiles().remove(demon);
				model.getMap().setSpell(null);
				((ILorann)model.getMap().getHero()).setPossessionSpell(SpellState.NotThrow);
			}
		}
	}
	


}
