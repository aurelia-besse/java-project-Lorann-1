package model;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Observable;

import javax.imageio.ImageIO;

import contract.*;


public class Game extends Observable implements IGame {

	private IMap map;
	private DBGame dbgame;
	private GameState gamestate;

	public Game(){
		dbgame = new DBGame();
		gamestate = GameState.OK;
		initMap();
	}
	/* (non-Javadoc)
	 * @see model.IGame#getMap()
	 */
	public IMap getMap() {
		return map;
	}
	
	public void initMap(){
		map = new Map(20,12);
		try {
			ResultSet result = dbgame.procedure("{call elementMap(?)}", 1);
			while(result.next()){
				int x = result.getInt("x");
				int y = result.getInt("y");
				int id = result.getInt("IDelement");
				String url = result.getString("url");
				System.out.println(url);
				switch(id){
				case 1: case 2: case 3:
					map.addElement(new Wall(x, y,url),x,y);
					break;
				case 4:
					map.addElement(new BubbleKey(x, y, url), x, y);
					break;
				case 6:
					IElement door = new Door(x, y, url);
					map.addElement(door, x, y);
					((IDoor)door).setDoorState(DoorState.CLOSE);
					break;
				case 7:
					map.setHero(new Lorann(x, y,url));
					break;
				case 8: case 9 : case 10: case 11:
					map.addMobiles(new Demon(x, y, url));
					break;
				case 12:
					map.addElement(new Coins(x, y, url), x, y);
					break;
				case 13:
					map.addElement(new Floor(x, y, url), x, y);
					break;
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void change(){
	setChanged();
	notifyObservers();
	}
	
	public void addSpells(IElement hero){
		int x =hero.getX();
		int y =hero.getY();
		if(((ILorann)hero).getState().equals(LorannState.UP)&& getMap().getElement(x, y-1).getPermeability().equals(Permeability.PENETRABLE)){
			y --;
		}else if (((ILorann)hero).getState().equals(LorannState.DOWN)&& getMap().getElement(x, y+1).getPermeability().equals(Permeability.PENETRABLE)){
			y ++;
		}else if (((ILorann)hero).getState().equals(LorannState.RIGHT) && getMap().getElement(x+1, y).getPermeability().equals(Permeability.PENETRABLE)){
			x ++;
		}else if (((ILorann)hero).getState().equals(LorannState.LEFT) && getMap().getElement(x-1, y).getPermeability().equals(Permeability.PENETRABLE)){
			x --;
		}
		getMap().setSpell(new Spell(x,y,"sprite/fireball_1.png"));
	}
	
	public void addFloor(IElement hero, int x ,int y){
		getMap().addElement(new Floor(hero.getX(),hero.getY(),"sprite/floor.png"),x,y);
	}
	
	

	public GameState getGamestate() {
		return gamestate;
	}
	public void setGamestate(GameState gamestate) {
		this.gamestate = gamestate;
	}
	
	public void GameOver(Graphics graphics){
		Image image;
		try {
			image = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("sprite/maxresdefault.jpg"));
			graphics.drawImage(image, 0, 0, null);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void Congratulations(Graphics graphics){
		Image image;
		try {
			image = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("sprite/maxresdefault.jpg"));
			graphics.drawImage(image, 0, 0, null);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/* (non-Javadoc)
	 * @see model.IGame#getObservable()
	 */
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}
}
