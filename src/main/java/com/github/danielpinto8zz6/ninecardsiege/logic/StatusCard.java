package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

/**
 * StatusCard class. Manage info about status of player
 *
 * @author daniel
 * @version $Id: $Id
 */
public class StatusCard implements Serializable {

	private static final long serialVersionUID = 1L;

	private GameData gameData;

	// Could be 0, 1, 2, or 3
	private int troopPosition;
	private int freeMov;
	private int supplies;

	/**
	 * Constructor for StatusCard.
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public StatusCard(GameData gameData) {
		this.gameData = gameData;

		troopPosition = 0;
		supplies = 0;
		freeMov = 0;
	}

	/**
	 * addSupplies.
	 *
	 * @param supplies
	 *            a int.
	 */
	public void addSupplies(int supplies) {
		this.supplies += supplies;

		if (this.supplies > 2) {
			this.supplies = 2;
		}
	}

	public int getFreeMov() {
		return freeMov;
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
	 * Getter for the field <code>supplies</code>.
	 *
	 * @return the supplies
	 */
	public int getSupplies() {
		return supplies;
	}

	/**
	 * Getter for the field <code>troopPosition</code>.
	 *
	 * @return the troopPosition
	 */
	public int getTroopPosition() {
		return troopPosition;
	}

	/** removeSupplies. */
	public void removeSupplies() {
		supplies = 0;
	}

	/** reset. */
	public void reset() {
		troopPosition = 0;
		supplies = 0;
	}

	public void setFreeMov(int freeMov) {
		this.freeMov = freeMov;
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
	 * Setter for the field <code>troopPosition</code>.
	 *
	 * @param troopPosition
	 *            the troopPosition to set
	 */
	public void setTroopPosition(int troopPosition) {
		this.troopPosition = troopPosition;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		String s;

		s = "Status Card: ";
		s += "\n\t" + "Troop Position: " + getTroopPosition();
		s += "\n\t" + "Supplies: " + getSupplies();

		return s;
	}
}
