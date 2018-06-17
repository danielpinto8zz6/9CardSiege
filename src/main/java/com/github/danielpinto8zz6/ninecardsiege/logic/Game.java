package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants.EXTRA;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates;

/**
 * Game class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public final class Game implements Serializable {

	private static final long serialVersionUID = 1L;

	private IStates state;
	private GameData gameData;

	/** Constructor for Game. */
	public Game() {
		gameData = new GameData();
		setState(new AwaitBeginning(gameData));
	}

	/**
	 * extraActionPoint
	 *
	 * @param extra
	 *            a
	 *            {@link com.github.danielpinto8zz6.ninecardsiege.logic.Constants.EXTRA}
	 *            object.
	 */
	public void applyExtraActionPoint(EXTRA extra) {
		setState(getState().applyExtraActionPoint(extra));
	}

	/**
	 * applyRallyTroops.
	 *
	 * @param plusOne
	 *            a boolean.
	 */
	public void applyRallyTroops(boolean plusOne) {
		setState(getState().applyRallyTroops(plusOne));
	}

	/** archersAttack. */
	public void archersAttack() {
		setState(getState().archersAttack());
	}

	/**
	 * attack enemy
	 *
	 * @param name
	 *            a {@link java.lang.String} object.
	 */
	public void attack(String name) {
		setState(getState().attack(name));
	}

	/** boilingWaterAttack. */
	public void boilingWaterAttack() {
		setState(getState().boilingWaterAttack());
	}

	/** checkStatus. */
	public void checkStatus() {
		setState(getState().checkStatus());
	}

	/** clearMsgLog. */
	public void clearMsgLog() {
		gameData.clearMsgLog();
	}

	/** closeCombatAttack. */
	public void closeCombatAttack() {
		setState(getState().closeCombatAttack());
	}

	/** coupure. */
	public void coupure() {
		setState(getState().coupure());
	}

	public void dont() {
		setState(getState().dont());
	}

	/** drawTopCard. */
	public void drawTopCard() {
		setState(getState().drawTopCard());
	}

	/** endOfTurn */
	public void endOfTurn() {
		setState(getState().endOfTurn());
	}

	/** extraActionPoint */
	public void extraActionPoint() {
		setState(getState().extraActionPoint());
	}

	public void fastMovement(boolean up) {
		setState(getState().fastMovement(up));
	}

	/** finish. */
	public void finish() {
		setState(getState().finish());
	}

	public void freeMovement(boolean up) {
		setState(getState().freeMovement(up));
	}

	public List<Enemy> getEnemies() {
		return getGameData().getEnemies();
	}

	/**
	 * Getter for the field <code>gameData</code>.
	 *
	 * @return the gameData
	 */
	public GameData getGameData() {
		return gameData;
	}

	/**
	 * getMsgLog.
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<String> getMsgLog() {
		return gameData.getMsgLog();
	}

	/**
	 * Getter for the field <code>state</code>.
	 *
	 * @return the state
	 */
	public IStates getState() {
		return state;
	}

	public boolean isOver() {
		return getGameData().isEndGame();
	}

	public void leaveLocation() {
		setState(getState().leaveLocation());
	}

	/** playAgain. */
	public void playAgain() {
		setState(getState().playAgain());
	}

	/** rallyTroops. */
	public void rallyTroops() {
		setState(getState().rallyTroops());
	}

	/** sabotage. */
	public void sabotage() {
		setState(getState().sabotage());
	}

	/**
	 * Setter for the field <code>gameData</code>.
	 *
	 * @param gameData
	 *            the gameData to set
	 */
	public void setGameData(GameData gameData) {
		this.gameData = gameData;
	}

	/**
	 * Setter for the field <code>state</code>.
	 *
	 * @param state
	 *            the state to set
	 */
	public void setState(IStates state) {
		this.state = state;
	}

	/**
	 * Methods that trigger events/actions in the finite state machine /
	 *
	 * <p>
	 * start.
	 */
	public void start() {
		setState(getState().start());
	}

	public void StartOfTheTurn() {
		setState(getState().StartOfTheTurn());
	}

	/** supplyRaid. */
	public void supplyRaid() {
		setState(getState().supplyRaid());
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return gameData.toString();
	}

	/** tunelMovement. */
	public void tunnelMovement() {
		setState(getState().tunnelMovement());
	}
}
