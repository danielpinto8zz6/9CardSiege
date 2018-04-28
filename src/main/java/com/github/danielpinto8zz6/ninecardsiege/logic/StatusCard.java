package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

public class StatusCard implements Serializable {

    private static final long serialVersionUID = 1L;

    private GameData gameData;

    // Could be 0, 1, 2, or 3
    private int troopPosition;

    private int supplies;

    public StatusCard(GameData gameData) {
        this.troopPosition = 0;
        this.supplies = 0;
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

    /**
     * @return the troopPosition
     */
    public int getTroopPosition() {
        return troopPosition;
    }

    /**
     * @param troopPosition the troopPosition to set
     */
    public void setTroopPosition(int troopPosition) {
        this.troopPosition = troopPosition;
    }

    /**
     * @return the supplies
     */
    public int getSupplies() {
        return supplies;
    }

    public void addSupplies(int supplies) {
        this.supplies += supplies;

        if (this.supplies > 2) {
            this.supplies = 2;
        }
    }

    public void checkCapture() {

        if (Dice.roll() == 1) {
            this.troopPosition = 0;
            gameData.getPlayer().setMoral(gameData.getPlayer().getMoral() - 1);
        }
    }

    public void removeSupplies() {
        this.supplies = 0;
    }
}
