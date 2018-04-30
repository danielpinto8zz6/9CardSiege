package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import java.io.Serializable;

/**
 * StateAdapter class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class StateAdapter implements IStates, Constants, Serializable {

  private static final long serialVersionUID = 1L;
  private GameData game;

  /**
   * Constructor for StateAdapter.
   *
   * @param g a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public StateAdapter(GameData g) {
    this.game = g;
  }

  /**
   * Getter for the field <code>game</code>.
   *
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public GameData getGame() {
    return game;
  }

  /**
   * Setter for the field <code>game</code>.
   *
   * @param game a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public void setGame(GameData game) {
    this.game = game;
  }

  /**
   * {@inheritDoc}
   *
   * <p>start.
   */
  @Override
  public IStates start() {
    return this;
  }

  /**
   * {@inheritDoc}
   *
   * <p>finish.
   */
  @Override
  public IStates finish() {
    return this;
  }

  /**
   * {@inheritDoc}
   *
   * <p>drawTopCard.
   */
  @Override
  public IStates drawTopCard() {
    return this;
  }

  /**
   * {@inheritDoc}
   *
   * <p>archersAttack.
   */
  @Override
  public IStates archersAttack() {
    return this;
  }

  /**
   * {@inheritDoc}
   *
   * <p>boilingWaterAttack.
   */
  @Override
  public IStates boilingWaterAttack() {
    return this;
  }

  /**
   * {@inheritDoc}
   *
   * <p>attack.
   */
  @Override
  public IStates attack() {
    return this;
  }

  /**
   * {@inheritDoc}
   *
   * <p>closeCombatAttack.
   */
  @Override
  public IStates closeCombatAttack() {
    return this;
  }

  /**
   * {@inheritDoc}
   *
   * <p>capture.
   */
  @Override
  public IStates capture() {
    return this;
  }
}
