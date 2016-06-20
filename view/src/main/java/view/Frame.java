package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import contract.IControler;
import contract.IFrame;
import contract.IGame;

/** This class Frame is used to run what is present in the game window
 * 
 * @author Aurelia
 * @version 20.06.16
 */
public class Frame extends JFrame implements IFrame, KeyListener{


	private static final long serialVersionUID = 2773168040909497332L;
	private Panel panel;
	int HEIGHT = 412;
	int WIDTH = 646;
	IGame game;
	IControler controler;
	
	/**
	 * 
	 * @param game
	 * 		This is the game 	
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
/**
 * @param keyevent 
 * 			Use the keyevent
 */
	public void keyPressed(KeyEvent keyevent ) {
		controler.keyEvents(keyevent);
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
/**
 * 
 * @return the controler 
 */
	public IControler getControler() {
		return controler;
	}

	/*
	 * (non-Javadoc)
	 * @see contract.IFrame#setControler(contract.IControler)
	 */
	public void setControler(IControler controler) {
		this.controler = controler;
	}
	
	
}
