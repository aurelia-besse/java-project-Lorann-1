package model;

import javax.swing.JFrame;

public class Frame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2773168040909497332L;
	public static final int WIDTH = 646, HEIGHT = 412;
	private Panel panel;
	public Frame(){
		this.setTitle("Lorann");
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		panel = new Panel();
		this.getContentPane().add(panel);
		this.setVisible(true);
	}
}
