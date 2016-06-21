package main;

import java.io.IOException;

import contract.IController;
import contract.IFrame;
import contract.IGame;
import controller.Controller;
import model.Game;
import view.Frame;
/**
 * 
 * @author Aurelia, Arthur, Adrien
 * @version 15.06.2016
 */

public abstract class Main {

	/**
	* Method to start the game
	* @param args
	* @throws IOException
	*/
	public static void main(final String[] args) throws IOException {
		IGame game = new Game();
		IFrame frame = new Frame(game);
		IController control = new Controller(game,frame);
		frame.setController(control);
					
	}

}
