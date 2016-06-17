package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import contract.IControler;
import contract.IFrame;
import contract.IGame;

public class Frame extends JFrame implements IFrame, KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2773168040909497332L;
	private Panel panel;
	int HEIGHT = 412;
	int WIDTH = 646;
	IGame game;
	IControler controler;
	
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

	public void keyPressed(KeyEvent connard ) {
		controler.keyEvents(connard);
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public IControler getControler() {
		return controler;
	}

	public void setControler(IControler controler) {
		this.controler = controler;
	}
	
	
}
