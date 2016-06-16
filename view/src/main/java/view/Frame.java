package view;

import javax.swing.JFrame;

import contract.IFrame;
import contract.IGame;

public class Frame extends JFrame implements IFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2773168040909497332L;
	private Panel panel;
	int HEIGHT = 412;
	int WIDTH = 646;
	IGame game;
	
	public Frame(IGame game){
		this.game = game;
		this.setTitle("Lorann");
		this.setSize(IFrame.WIDTH, IFrame.HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		panel = new Panel(this);
		this.getContentPane().add(panel);
		this.setVisible(true);
	}
	
}
