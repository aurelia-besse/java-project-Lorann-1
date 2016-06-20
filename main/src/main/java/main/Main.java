package main;

import java.io.IOException;

import contract.IController;
import contract.IFrame;
import contract.IGame;
import controller.Controller;
import model.Game;
import view.Frame;


public abstract class Main {


		public static void main(final String[] args) throws IOException {
			IGame game = new Game();
			IFrame frame = new Frame(game);
			IController control = new Controller(game,frame);
			frame.setController(control);
			
			
			
		}
	

}
