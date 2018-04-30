package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;
import java.io.Serializable;

/**
 * Abstract Card class.
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
   * Constructor for Card.
   *
   * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public Card(GameData gameData) {
    this.gameData = gameData;
    this.cardNumber = counterPlusPlus();
  }

  /**
   * counterPlusPlus.
   *
   * @return a int.
   */
  public static int counterPlusPlus() {
    return Card.counter++;
  }

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
   * Setter for the field <code>gameData</code>.
   *
   * @param gameData the gameData to set
   */
  public void setGameData(GameData gameData) {
    this.gameData = gameData;
  }

  /**
   * getPlayer.
   *
   * @return the Player
   */
  public Player getPlayer() {
    return getGameData().getPlayer();
  }

  /** Day1Event. */
  public abstract void day1Event();

  /** Day2Event. */
  public abstract void day2Event();

  /** Day3Event. */
  public abstract void day3Event();

  /** moveEnemyDay1. */
  public abstract void moveEnemyDay1();

  /** moveEnemyDay2. */
  public abstract void moveEnemyDay2();

  /** moveEnemyDay3. */
  public abstract void moveEnemyDay3();
}
