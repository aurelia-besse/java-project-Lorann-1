package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Observable;

import contract.IGame;
import contract.IMap;
import contract.IModel;

public class Game extends Observable implements IGame {

	public IMap map;
	private DBGame dbgame;

	public Game(){
		dbgame = new DBGame();
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
					map.addElement(new Door(x, y, url), x, y);
					break;
				case 7:
					map.setHero(new Lorann(x, y, url));
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

	/* (non-Javadoc)
	 * @see model.IGame#getObservable()
	 */
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}
}
