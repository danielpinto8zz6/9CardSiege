package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.Dice;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * AwaitOptionSelectionForRallyTroops class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitOptionSelectionForRallyTroops extends StateAdapter {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor for AwaitOptionSelectionForRallyTroops.
   *
   * @param g a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public AwaitOptionSelectionForRallyTroops(GameData g) {
    super(g);
  }

  /** {@inheritDoc} */
  @Override
  public IStates applyRallyTroops(boolean plusOne) {
    int roll = Dice.roll();
    getGameData().addMsgLog("rolled" + roll + "on rally troops");

    if (plusOne) {
      roll++;
      getGameData().getPlayer().setSupplies(getGameData().getPlayer().getSupplies() - 1);
    }

    if (roll > 4) {
      getGameData().getPlayer().setMoral(getGameData().getPlayer().getMoral() + 1);
      if (getGameData().getPlayer().getMoral() > 4) getGameData().getPlayer().setMoral(4);
    }

    getGameData().getPlayer().setActionPoints(getGameData().getPlayer().getActionPoints() - 1);
    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGameData());
  }
}
