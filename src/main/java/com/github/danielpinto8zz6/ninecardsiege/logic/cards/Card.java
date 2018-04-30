package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import java.io.Serializable;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;

/**
 * <p>
 * Abstract Card class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public abstract class Card implements Serializable {

    private static final long serialVersionUID = 1L;

    private static int counter = 0;
    private final int cardNumber;

    private GameData gameData;

    /**
     * <p>
     * Constructor for Card.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public Card(GameData gameData) {
        this.gameData = gameData;
        this.cardNumber = counterPlusPlus();
    }

    /**
     * <p>counterPlusPlus.</p>
     *
     * @return a int.
     */
    public static int counterPlusPlus() {
        return Card.counter++;
    }

    /**
     * <p>
     * Getter for the field <code>cardNumber</code>.</p>
     *
     * @return the cardNumber
     */
    public int getCardNumber() {
        return cardNumber;
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
     * getPlayer.</p>
     *
     * @return the Player
     */
    public Player getPlayer() {
        return getGameData().getPlayer();
    }

    /**
     * <p>
     * Day1Event.</p>
     */
    public abstract void day1Event();

    /**
     * <p>
     * Day2Event.</p>
     */
    public abstract void day2Event();

    /**
     * <p>
     * Day3Event.</p>
     */
    public abstract void day3Event();

    /**
     * <p>
     * moveEnemyDay1.</p>
     */
    public abstract void moveEnemyDay1();

    /**
     * <p>
     * moveEnemyDay2.</p>
     */
    public abstract void moveEnemyDay2();

    /**
     * <p>
     * moveEnemyDay3.</p>
     */
    public abstract void moveEnemyDay3();
}
