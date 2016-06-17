package main;

import java.io.IOException;

import contract.IControler;
import contract.IFrame;
import contract.IGame;
import controller.Controler;
import model.Game;
import view.Frame;


public abstract class essaiMain {


		public static void main(final String[] args) throws IOException {
			IGame game = new Game();
			IFrame frame = new Frame(game);
			IControler control = new Controler(game,frame);
			frame.setControler(control);	
		}
}
