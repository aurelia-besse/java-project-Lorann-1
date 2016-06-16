package controller;

import contract.IControler;
import contract.IGame;

public class Controler implements IControler {

	private IGame model;
	public Controler(IGame model){
		this.model = model;
	}
}
