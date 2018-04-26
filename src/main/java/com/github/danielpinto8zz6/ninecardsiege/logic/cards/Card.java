package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import java.io.Serializable;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;

public abstract class Card implements Serializable {

    private static final long serialVersionUID = 1L;

    private static int counter = 0;
    private int cardNumber;

    private GameData gameData;

    public Card(GameData gameData) {
        this.gameData = gameData;
        cardNumber = ++counter;
    }

    /**
     * @return the cardNumber
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * @return the gameData
     */
    public GameData getGameData() {
        return gameData;
    }

    /**
     * @param gameData the gameData to set
     */
    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }

    public Player getPlayer() {
        return gameData.getPlayer();
    }

    public GameData getGame() {
        return gameData;
    }

    public abstract void Day1Event();

    public abstract void Day2Event();

    public abstract void Day3Event();

    public abstract void moveEnemies();
}
