package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * AwaitEnemyTrackSelectionForArchersAttack class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitEnemyTrackSelectionForArchersAttack extends StateAdapter {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor for AwaitEnemyTrackSelectionForArchersAttack.
   *
   * @param g a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public AwaitEnemyTrackSelectionForArchersAttack(GameData g) {
    super(g);
  }

  /** {@inheritDoc} */
  @Override
  public IStates attack() {
    // TODO
    return new AwaitActionSelection(getGame());
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGame());
  }
}
