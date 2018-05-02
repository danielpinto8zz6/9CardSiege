package com.github.danielpinto8zz6.ninecardsiege.logic;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants.EXTRA;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates;
import java.io.Serializable;
import java.util.List;

/**
 * Game class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public final class Game implements Serializable {

  private static final long serialVersionUID = 1L;

  private IStates state;
  private GameData gameData;

  /** Constructor for Game. */
  public Game() {
    gameData = new GameData();
    setState(new AwaitBeginning(gameData));
  }

  /**
   * Getter for the field <code>state</code>.
   *
   * @return the state
   */
  public IStates getState() {
    return state;
  }

  /**
   * Setter for the field <code>state</code>.
   *
   * @param state the state to set
   */
  public void setState(IStates state) {
    this.state = state;
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
   * getMsgLog.
   *
   * @return a {@link java.util.List} object.
   */
  public List<String> getMsgLog() {
    return gameData.getMsgLog();
  }

  /** clearMsgLog. */
  public void clearMsgLog() {
    gameData.clearMsgLog();
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return gameData.toString();
  }

  // --------------------- Methods that trigger events/actions in the finite state
  // machine
  // -----------------------
  /** start. */
  public void start() {
    setState(getState().start());
  }

  /** finish. */
  public void finish() {
    setState(getState().finish());
  }

  /** drawTopCard. */
  public void drawTopCard() {
    setState(getState().drawTopCard());
  }

  /**
   * attack enemy
   *
   * @param name a {@link java.lang.String} object.
   */
  public void attack(String name) {
    setState(getState().attack(name));
  }

  /** archersAttack. */
  public void archersAttack() {
    setState(getState().archersAttack());
  }

  /** boilingWaterAttack. */
  public void boilingWaterAttack() {
    setState(getState().boilingWaterAttack());
  }

  /** closeCombatAttack. */
  public void closeCombatAttack() {
    setState(getState().closeCombatAttack());
  }

  /** extraActionPoint */
  public void extraActionPoint() {
    setState(getState().extraActionPoint());
  }

  /**
   * extraActionPoint
   *
   * @param extra a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Constants.EXTRA} object.
   */
  public void applyExtraActionPoint(EXTRA extra) {
    setState(getState().applyExtraActionPoint(extra));
  }

  /** endOfTurn */
  public void endOfTurn() {
    setState(getState().endOfTurn());
  }

  /** coupure. */
  public void coupure() {
    setState(getState().coupure());
  }

  /** rallyTroops. */
  public void rallyTroops() {
    setState(getState().rallyTroops());
  }

  /**
   * applyRallyTroops.
   *
   * @param plusOne a boolean.
   */
  public void applyRallyTroops(boolean plusOne) {
    setState(getState().applyRallyTroops(plusOne));
  }
}
