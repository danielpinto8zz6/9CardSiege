package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import java.io.Serializable;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;

/**
 * Abstract Card class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public abstract class Card implements Serializable {

	private static final long serialVersionUID = 1L;

	private static int counter = 0;

	/**
	 * counterPlusPlus. Increate card counter by 1
	 *
	 * @return a int.
	 */
	private static int counterPlusPlus() {
		return Card.counter++;
	}

	/** CardNumber could be understood as a unique id for the card */
	private final int cardNumber;

	private GameData gameData;

	/**
	 * Constructor for Card.
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public Card(GameData gameData) {
		this.gameData = gameData;
		cardNumber = Card.counterPlusPlus();
	}

	/**
	 * Day1Event.
	 */
	public abstract void day1Event();

	/**
	 * Day2Event.
	 */
	public abstract void day2Event();

	/**
	 * Day3Event.
	 */
	public abstract void day3Event();

	/**
	 * Getter for the field <code>cardNumber</code>.
	 *
	 * @return the cardNumber
	 */
	public int getCardNumber() {
		return cardNumber;
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
	 * getPlayer.
	 *
	 * @return the Player
	 */
	public Player getPlayer() {
		return getGameData().getPlayer();
	}

	/**
	 * moveEnemyDay1.
	 */
	public abstract void moveEnemyDay1();

	/**
	 * moveEnemyDay2.
	 */
	public abstract void moveEnemyDay2();

	/**
	 * moveEnemyDay3.
	 */
	public abstract void moveEnemyDay3();

	/**
	 * Setter for the field <code>gameData</code>.
	 *
	 * @param gameData
	 *            the gameData to set
	 */
	public void setGameData(GameData gameData) {
		this.gameData = gameData;
	}
}
