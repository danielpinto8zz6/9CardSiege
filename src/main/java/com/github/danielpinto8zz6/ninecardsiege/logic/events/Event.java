package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import java.io.Serializable;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;

/**
 * <p>
 * Event class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;

    private GameData gameData;

    private String eventName;

    /**
     * <p>
     * Constructor for Event.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     * @param name a {@link java.lang.String} object.
     */
    public Event(GameData gameData, String name) {
        this.gameData = gameData;
    }

    /**
     * <p>
     * Getter for the field <code>gameData</code>.</p>
     *
     * @return the gameData
     */
    public GameData getGameData() {
        return gameData;
    }

    /**
     * <p>
     * Setter for the field <code>gameData</code>.</p>
     *
     * @param gameData the gameData to set
     */
    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }

    /**
     * <p>
     * Getter for the field <code>eventName</code>.</p>
     *
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * <p>
     * Setter for the field <code>eventName</code>.</p>
     *
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * <p>
     * toString.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String toString() {
        return this.eventName;
    }

    /**
     * <p>
     * getPlayer.</p>
     *
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Player}
     * object.
     */
    public Player getPlayer() {
        return gameData.getPlayer();
    }

    /**
     * <p>
     * getEnemies.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<Enemy> getEnemies() {
        return gameData.getBattleCard().getEnemies();
    }

}
