package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

/**
 * <p>
 * StatusCard class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class StatusCard implements Serializable {

    private static final long serialVersionUID = 1L;

    private GameData gameData;

    // Could be 0, 1, 2, or 3
    private int troopPosition;

    private int supplies;

    /**
     * <p>
     * Constructor for StatusCard.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public StatusCard(GameData gameData) {
        this.gameData = gameData;

        this.troopPosition = 0;
        this.supplies = 0;
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
     * Getter for the field <code>troopPosition</code>.</p>
     *
     * @return the troopPosition
     */
    public int getTroopPosition() {
        return troopPosition;
    }

    /**
     * <p>
     * Setter for the field <code>troopPosition</code>.</p>
     *
     * @param troopPosition the troopPosition to set
     */
    public void setTroopPosition(int troopPosition) {
        this.troopPosition = troopPosition;
    }

    /**
     * <p>
     * Getter for the field <code>supplies</code>.</p>
     *
     * @return the supplies
     */
    public int getSupplies() {
        return supplies;
    }

    /**
     * <p>
     * addSupplies.</p>
     *
     * @param supplies a int.
     */
    public void addSupplies(int supplies) {
        this.supplies += supplies;

        if (this.supplies > 2) {
            this.supplies = 2;
        }
    }

    /**
     * <p>
     * checkCapture.</p>
     */
    public void checkCapture() {

        if (Dice.roll() == 1) {
            this.troopPosition = 0;
            gameData.getPlayer().setMoral(gameData.getPlayer().getMoral() - 1);
        }
    }

    /**
     * <p>
     * removeSupplies.</p>
     */
    public void removeSupplies() {
        this.supplies = 0;
    }
}
