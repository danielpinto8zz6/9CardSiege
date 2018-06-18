package com.github.danielpinto8zz6.ninecardsiege.gui;

import java.util.Observable;

import com.github.danielpinto8zz6.ninecardsiege.logic.Game;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates;

/**
 * <p>
 * ObservableGame class.
 * </p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class ObservableGame extends Observable {

	Game game;

	/**
	 * <p>
	 * Constructor for ObservableGame.
	 * </p>
	 */
	public ObservableGame() {
		game = new Game();
	}

	/**
	 * <p>
	 * applyExtraActionPoint.
	 * </p>
	 *
	 * @param extra
	 *            a
	 *            {@link com.github.danielpinto8zz6.ninecardsiege.logic.Constants.EXTRA}
	 *            object.
	 */
	public void applyExtraActionPoint(com.github.danielpinto8zz6.ninecardsiege.logic.Constants.EXTRA extra) {
		game.applyExtraActionPoint(extra);
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * applyRallyTroops.
	 * </p>
	 *
	 * @param plusOne
	 *            a boolean.
	 */
	public void applyRallyTroops(boolean plusOne) {
		game.applyRallyTroops(plusOne);
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * archersAttack.
	 * </p>
	 */
	public void archersAttack() {
		game.archersAttack();
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * attack.
	 * </p>
	 *
	 * @param name
	 *            a {@link java.lang.String} object.
	 */
	public void attack(String name) {
		game.attack(name);
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * boilingWaterAttack.
	 * </p>
	 */
	public void boilingWaterAttack() {
		game.boilingWaterAttack();
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * callMenu.
	 * </p>
	 */
	public void callMenu() {
		game.dont();

		setChanged();
		notifyObservers();
	}

	// Methods retrieve data from the game
	/**
	 * <p>
	 * clearMsgLog.
	 * </p>
	 */
	public void clearMsgLog() {
		game.clearMsgLog();
	}

	/**
	 * <p>
	 * closeCombatAttack.
	 * </p>
	 */
	public void closeCombatAttack() {
		game.closeCombatAttack();
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * coupure.
	 * </p>
	 */
	public void coupure() {
		game.coupure();
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * drawTopCard.
	 * </p>
	 */
	public void drawTopCard() {
		game.drawTopCard();
		game.StartOfTheTurn();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * endOfTurn.
	 * </p>
	 */
	public void endOfTurn() {
		game.endOfTurn();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * extraActionPoint.
	 * </p>
	 */
	public void extraActionPoint() {
		game.extraActionPoint();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * fastMovement.
	 * </p>
	 *
	 * @param up
	 *            a boolean.
	 */
	public void fastMovement(boolean up) {
		game.fastMovement(up);
		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * finish.
	 * </p>
	 */
	public void finish() {
		game.finish();
		notifyObservers();
	}

	/**
	 * <p>
	 * freeMovement.
	 * </p>
	 *
	 * @param up
	 *            a boolean.
	 */
	public void freeMovement(boolean up) {
		game.freeMovement(up);
		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * Getter for the field <code>game</code>.
	 * </p>
	 *
	 * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Game} object.
	 */
	public Game getGame() {
		return game;
	}

	/**
	 * <p>
	 * getGameData.
	 * </p>
	 *
	 * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *         object.
	 */
	public GameData getGameData() {
		return game.getGameData();
	}

	/**
	 * <p>
	 * getMsgLog.
	 * </p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public java.util.List<String> getMsgLog() {
		return game.getMsgLog();
	}

	/**
	 * <p>
	 * getPlayer.
	 * </p>
	 *
	 * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Player}
	 *         object.
	 */
	public Player getPlayer() {
		return game.getGameData().getPlayer();
	}

	/**
	 * <p>
	 * getState.
	 * </p>
	 *
	 * @return a
	 *         {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
	 *         object.
	 */
	public IStates getState() {
		return game.getState();
	}

	/**
	 * <p>
	 * isOver.
	 * </p>
	 *
	 * @return a boolean.
	 */
	public boolean isOver() {
		return game.isOver();
	}

	/**
	 * <p>
	 * leaveLocation.
	 * </p>
	 */
	public void leaveLocation() {
		game.leaveLocation();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * over.
	 * </p>
	 */
	public void over() {
		game.finish();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * playAgain.
	 * </p>
	 */
	public void playAgain() {
		game.playAgain();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * rallyTroops.
	 * </p>
	 */
	public void rallyTroops() {
		game.rallyTroops();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * sabotage.
	 * </p>
	 */
	public void sabotage() {
		game.sabotage();
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * Setter for the field <code>game</code>.
	 * </p>
	 *
	 * @param game
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Game}
	 *            object.
	 */
	public void setGame(Game game) {
		this.game = game;

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * setPlayerName.
	 * </p>
	 *
	 * @param text
	 *            a {@link java.lang.String} object.
	 */
	public void setPlayerName(String text) {
		game.getGameData().getPlayer().setName(text);
		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * start.
	 * </p>
	 */
	public void start() {
		game.start();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * supplyRaid.
	 * </p>
	 */
	public void supplyRaid() {
		game.supplyRaid();
		game.checkStatus();

		setChanged();
		notifyObservers();
	}

	/**
	 * <p>
	 * tunnelMovement.
	 * </p>
	 */
	public void tunnelMovement() {
		game.tunnelMovement();
		setChanged();
		notifyObservers();
	}

}
