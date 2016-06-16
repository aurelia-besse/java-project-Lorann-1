package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class Panel extends JPanel implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 508369234136358064L;
	private Game game;
	private Controler control;
	
	public Panel(){
		this.setBackground(new Color(255,0,255));
		
		
		
		
		game = new Game();
		game.addObserver(this);
		control = new Controler(game);
	
		
	}
	
	public void paintComponent(Graphics g){
		clearAll(g);
		int x = 0;
		for(Element[] e : game.getMap().getElements()){
			int y = 0;
			for(Element element : e){
					
					if(element instanceof Wall){
					
						design(g, element.getSprite().getImage(), x, y);
						
					}else if(element instanceof BubbleKey){
						
						design(g, element.getSprite().getImage(), x, y);
						
					}else if(element instanceof Coins){
						
						design(g, element.getSprite().getImage(), x, y);
						
					}else if(element instanceof Door){
						
						design(g, element.getSprite().getImage(), x, y);
						
					}else if(element instanceof Demon){
						
						design(g, element.getSprite().getImage(), x, y);
						
					}else if(element instanceof Lorann){
						
						design(g, element.getSprite().getImage(), x, y);
						
					}else if(element instanceof Floor){
						
						design(g, element.getSprite().getImage(), x, y);
						
					}
					
				y++;
			}
			x++;
			
		} 
	
	}

	private void design(Graphics g, Image image, int x, int y) {
		g.drawImage(image, x*32, y*32, 32, 32, null);
	}
	
	private void clearAll(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, Frame.WIDTH, Frame.HEIGHT);
	}
	
	public void update(Observable o, Object arg) {
		
		
		repaint();
	}
}
