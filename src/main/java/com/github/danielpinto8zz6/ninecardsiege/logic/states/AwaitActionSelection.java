package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * AwaitActionSelection class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitActionSelection extends StateAdapter {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor for AwaitActionSelection.
   *
   * @param g a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public AwaitActionSelection(GameData g) {
    super(g);
  }

  /** {@inheritDoc} */
  @Override
  public IStates archersAttack() {
    // TODO
    return new AwaitEnemyTrackSelectionForBoilingWaterAttack(getGame());
  }

  /** {@inheritDoc} */
  @Override
  public IStates boilingWaterAttack() {
    // TODO
    return new AwaitEnemyTrackSelectionForBoilingWaterAttack(getGame());
  }

  /** {@inheritDoc} */
  @Override
  public IStates closeCombatAttack() {
    // TODO
    return new AwaitActionSelection(getGame());
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGame());
  }
}
