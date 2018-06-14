package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.util.Observable;

import com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates;

public class ObservableGame extends Observable {
	Game game;

	public ObservableGame() {
		game = new Game();
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

	public void callMenu() {
		game.dontAttack();

		setChanged();
		notifyObservers();
	}

	public void checkStatus() {
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	// Methods retrieve data from the game

	public void clearMsgLog() {
		game.clearMsgLog();
	}

	public void drawTopCard() {
		game.drawTopCard();
		game.StartOfTheTurn();

		setChanged();
		notifyObservers();
	}

	public void endOfTurn() {
		game.endOfTurn();

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

	public java.util.List<String> getMsgLog() {
		return game.getMsgLog();
	}

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

	public void closeCombatAttack() {
		game.closeCombatAttack();

		setChanged();
		notifyObservers();
	}

	public void coupure() {
		game.coupure();

		setChanged();
		notifyObservers();
	}

	public void rallyTroops() {
		game.rallyTroops();

		setChanged();
		notifyObservers();
	}

	public void supplyRaid() {
		game.supplyRaid();

		setChanged();
		notifyObservers();
	}

	public void sabotage() {
		game.sabotage();

		setChanged();
		notifyObservers();
	}
}
