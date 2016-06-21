package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import contract.IController;
import contract.IFrame;
import contract.IGame;

/** 
 * <b>This class Frame is used to create the game window</b>
 * 
 * @author Aurelia
 * @version 16.06.16
 */
public class Frame extends JFrame implements IFrame, KeyListener{


	private static final long serialVersionUID = 2773168040909497332L;
	private Panel panel;
	int HEIGHT = 412;
	int WIDTH = 646;
	IGame game;
	IController controller;
	
	/**
	 * Initialize the frame
	 * @param game
	 * 		It's the game 	
	 */
	public Frame(IGame game){
		this.game = game;
		this.addKeyListener(this);
		this.setTitle("Lorann");
		
		this.setSize(IFrame.WIDTH, IFrame.HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		panel = new Panel(this);
		this.getContentPane().add(panel);
		
		this.setVisible(true);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	public void keyPressed(KeyEvent keyevent ) {
		controller.keyEvents(keyevent);	
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyReleased(KeyEvent e) {	
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public void keyTyped(KeyEvent e) {
	}
	
	/**
 	* Method to get the controller
 	* @return the controller 
 	*/
	public IController getController() {
		return controller;
	}

	/*
	 * (non-Javadoc)
	 * @see contract.IFrame#setControler(contract.IControler)
	 */
	public void setController(IController controller) {
		this.controller = controller;
	}
	
	
}
