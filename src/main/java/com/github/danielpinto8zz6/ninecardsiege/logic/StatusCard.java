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
  private int direction;
  private int supplies;

  /**
   * Constructor for StatusCard.
   *
   * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public StatusCard(GameData gameData) {
    this.gameData = gameData;

    this.troopPosition = 0;
    this.supplies = 0;
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
   * Setter for the field <code>gameData</code>.
   *
   * @param gameData the gameData to set
   */
  public void setGameData(GameData gameData) {
    this.gameData = gameData;
  }

  /**
   * Getter for the field <code>troopPosition</code>.
   *
   * @return the troopPosition
   */
  public int getTroopPosition() {
    return troopPosition;
  }

  /**
   * Setter for the field <code>troopPosition</code>.
   *
   * @param troopPosition the troopPosition to set
   */
  public void setTroopPosition(int troopPosition) {
    this.troopPosition = troopPosition;
  }

  /**
   * Getter for the field <code>direction</code>.
   *
   * @return a int.
   */
  public int getDirection() {
    return direction;
  }

  /**
   * Setter for the field <code>direction</code>.
   *
   * @param direction a int.
   */
  public void setDirection(int direction) {
    this.direction = direction;
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
   * addSupplies.
   *
   * @param supplies a int.
   */
  public void addSupplies(int supplies) {
    this.supplies += supplies;

    if (this.supplies > 2) {
      this.supplies = 2;
    }
  }

  /** removeSupplies. */
  public void removeSupplies() {
    this.supplies = 0;
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
