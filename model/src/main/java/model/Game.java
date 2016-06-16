package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;

public class Game extends Observable {

	private Map map;
	private DBGame dbgame;

	public Game(){
		dbgame = new DBGame();
		initMap();
	}
	public Map getMap() {
		return map;
	}
	
	public void initMap(){
		map = new Map(20,12);
		try {
			ResultSet result = dbgame.procedure("{call elementMap(?)}", 2);
			while(result.next()){
				int x = result.getInt("x");
				int y = result.getInt("y");
				int id = result.getInt("IDelement");
				String url = result.getString("url");
				System.out.println(url);
				switch(id){
				case 1: case 2: case 3:
					map.addElement(new Wall(x, y,url), x, y);
					break;
				case 4:
					map.addElement(new BubbleKey(x, y, url), x, y);
					break;
				case 6:
					map.addElement(new Door(x, y, url), x, y);
					break;
				case 7:
					map.addElement(new Lorann(x, y, url), x, y);
					break;
				case 8: case 9 : case 10: case 11:
					map.addElement(new Demon(x, y, url), x, y);
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

	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}
}
