package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * AwaitOptionSelectionForExtraActionPoint class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitOptionSelectionForExtraActionPoint extends StateAdapter {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor for AwaitOptionSelectionForExtraActionPoint.
   *
   * @param g a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public AwaitOptionSelectionForExtraActionPoint(GameData g) {
    super(g);
  }

  @Override
  public IStates endOfTurn() {
    return new AwaitTopCardToBeDrawn(getGameData());
  }

  @Override
  public IStates extraActionPoint(EXTRA extra) {
    getGameData().getPlayer().setActionPoints(getGameData().getPlayer().getActionPoints() + 1);
    switch (extra) {
      case MORAL:
        getGameData().getPlayer().setMoral(getGameData().getPlayer().getMoral() - 1);
        break;
      case SUPPLIES:
        getGameData().getPlayer().setSupplies(getGameData().getPlayer().getSupplies() - 1);
        break;
    }
    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGameData());
  }
}
