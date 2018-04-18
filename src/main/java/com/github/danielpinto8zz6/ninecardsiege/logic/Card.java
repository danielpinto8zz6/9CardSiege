package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

public class Card implements Serializable {

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
    
    public Player getPlayer(){
        return gameData.getPlayer();
    }

    public GameData getGame(){
        return gameData;
    }

}
