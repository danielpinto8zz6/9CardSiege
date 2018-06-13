package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.awt.Component;
import java.awt.List;
import java.util.Observable;

import com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates;

public class ObservableGame extends Observable {
	Game game;

	public ObservableGame() {
		game = new Game();
	}

	public void drawTopCard() {
		game.drawTopCard();
		game.StartOfTheTurn();

		setChanged();
		notifyObservers();
	}

	public void finish() {
		game.finish();
		notifyObservers();
	}

	public Game getGame() {
		return game;
	}

	public GameData getGameData() {
		return game.getGameData();
	}

	// Methods retrieve data from the game

	public Player getPlayer() {
		return game.getGameData().getPlayer();
	}

	public IStates getState() {
		return game.getState();
	}

	public boolean isOver() {
		return game.isOver();
	}

	public void setGame(Game game) {
		this.game = game;

		setChanged();
		notifyObservers();
	}

	public void callMenu() {
		game.dontAttack();

		setChanged();
		notifyObservers();
	}

	public void setPlayerName(String text) {
		game.getGameData().getPlayer().setName(text);
		setChanged();
		notifyObservers();
	}

	public void start() {
		game.start();

		setChanged();
		notifyObservers();
	}

	public void archersAttack() {
		game.archersAttack();

		setChanged();
		notifyObservers();
	}

	public void attack(String name) {
		game.attack(name);

		setChanged();
		notifyObservers();
	}
        
        	public void checkStatus(){
                        game.checkStatus();
                        
                setChanged();
		notifyObservers();
                }
                
public void endOfTurn() {
    game.endOfTurn();
    
                    setChanged();
		notifyObservers();
}


	public java.util.List<String> getMsgLog() {
		return game.getMsgLog();
	}

	public void clearMsgLog() {
		game.clearMsgLog();
	}

}
