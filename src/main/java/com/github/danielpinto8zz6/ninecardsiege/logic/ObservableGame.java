package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.util.Observable;

import com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates;

public class ObservableGame extends Observable {

	Game game;

	public ObservableGame() {
		game = new Game();
	}

	public void applyExtraActionPoint(Constants.EXTRA extra) {
		game.applyExtraActionPoint(extra);
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	public void applyRallyTroops(boolean plusOne) {
		game.applyRallyTroops(plusOne);
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	public void archersAttack() {
		game.archersAttack();
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	public void attack(String name) {
		game.attack(name);
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	public void boilingWaterAttack() {
		game.boilingWaterAttack();
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	public void callMenu() {
		game.dont();

		setChanged();
		notifyObservers();
	}

	// Methods retrieve data from the game
	public void clearMsgLog() {
		game.clearMsgLog();
	}

	public void closeCombatAttack() {
		game.closeCombatAttack();
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	public void coupure() {
		game.coupure();
		game.checkStatus();

		setChanged();
		notifyObservers();
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

	public void extraActionPoint() {
		game.extraActionPoint();

		setChanged();
		notifyObservers();
	}

	public void fastMovement(boolean up) {
		game.fastMovement(up);
		setChanged();
		notifyObservers();
	}

	public void finish() {
		game.finish();
		notifyObservers();
	}

	public void freeMovement(boolean up) {
		game.freeMovement(up);
		setChanged();
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

	public void leaveLocation() {
		game.leaveLocation();

		setChanged();
		notifyObservers();
	}

	public void rallyTroops() {
		game.rallyTroops();

		setChanged();
		notifyObservers();
	}

	public void sabotage() {
		game.sabotage();
		game.checkStatus();

		setChanged();
		notifyObservers();
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

	public void supplyRaid() {
		game.supplyRaid();
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	public void tunnelMovement() {
		game.tunnelMovement();
		setChanged();
		notifyObservers();
	}

	public void over() {
		game.finish();

		setChanged();
		notifyObservers();
	}

	public void playAgain() {
		game.playAgain();

		setChanged();
		notifyObservers();
	}

}
