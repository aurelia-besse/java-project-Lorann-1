package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import contract.*;



public class Panel extends JPanel implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 508369234136358064L;
	
	Frame frame;
	
	public Panel(Frame frame){
		this.frame = frame;
		this.setBackground(new Color(255,0,255));
		frame.game.addObserver(this);
		
	}
	
	public void paintComponent(Graphics g){
		clearAll(g);
		int x = 0;
		for(IElement[] e : frame.game.getMap().getElements()){
			int y = 0;
			for(IElement element : e){
					
					if(element instanceof IWall){
					
						design(g, element.getSprite().getImage(), x, y);
						
					}else if(element instanceof IBubbleKey){
						
						design(g, element.getSprite().getImage(), x, y);
						
					}else if(element instanceof ICoins){
						
						design(g, element.getSprite().getImage(), x, y);
						
					}else if(element instanceof IDoor){
						
						design(g, element.getSprite().getImage(), x, y);
						
					}else if(element instanceof IDemon){
						
						design(g, element.getSprite().getImage(), x, y);
						
					}else if(element instanceof ILorann){
						
						design(g, element.getSprite().getImage(), x, y);
						
					}else if(element instanceof IFloor){
						
						design(g, element.getSprite().getImage(), x, y);
						
					}
					
				y++;
			}
			x++;
			
		} 
		design(g, frame.game.getMap().getHero().getSprite().getImage(),frame.game.getMap().getHero().getX(), frame.game.getMap().getHero().getY());
		for(IMobileElement demon : frame.game.getMap().getMobiles()){
			design(g, demon.getSprite.getImage, demon.getX(),demon.getY());
		}
	}

	private void design(Graphics g, Image image, int x, int y) {
		g.drawImage(image, x*32, y*32, 32, 32, null);
	}
	
	private void clearAll(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, IFrame.WIDTH, IFrame.HEIGHT);
	}
	
	public void update(Observable o, Object arg) {
		
		
		repaint();
	}
}
