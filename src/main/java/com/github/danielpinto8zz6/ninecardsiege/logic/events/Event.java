package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import java.io.Serializable;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;

/**
 * Event class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Event implements Serializable {

	private static final long serialVersionUID = 1L;

	private GameData gameData;

	private String eventName;

	/**
	 * Constructor for Event.
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 * @param name
	 *            a {@link java.lang.String} object.
	 */
	public Event(GameData gameData, String name) {
		this.gameData = gameData;
	}

	/**
	 * getEnemies.
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<Enemy> getEnemies() {
		return gameData.getBattleCard().getEnemies();
	}

	/**
	 * Getter for the field <code>eventName</code>.
	 *
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
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
	 * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Player}
	 *         object.
	 */
	public Player getPlayer() {
		return gameData.getPlayer();
	}

	/**
	 * Setter for the field <code>eventName</code>.
	 *
	 * @param eventName
	 *            the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
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
	 * {@inheritDoc}
	 *
	 * <p>
	 * toString.
	 */
	@Override
	public String toString() {
		return eventName;
	}
}
