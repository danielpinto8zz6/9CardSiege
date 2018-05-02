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

    if (plusOne) roll++;

    if (roll > 4)
      getGameData().getPlayer().setWallStrength(getGameData().getPlayer().getWallStrength() + 1);

    getGameData().getPlayer().setActionPoints(getGameData().getPlayer().getActionPoints() - 1);
    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGameData());
  }
}
