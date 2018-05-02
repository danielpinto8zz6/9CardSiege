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
    if (getGameData().getPlayer().getActionPoints() == 0) {
      getGameData().addMsgLog("************** End Of Turn *****************");
      return new AwaitTopCardToBeDrawn(getGameData());
    }
    if (!getGameData().getPlayer().isCanArchersAtack()) {
      getGameData().addMsgLog("Can't Archers Attack this turn");
      return new AwaitActionSelection(getGameData());
    }
    return new AwaitEnemyTrackSelectionForArchersAttack(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates boilingWaterAttack() {
    if (getGameData().getPlayer().getActionPoints() == 0) {
      getGameData().addMsgLog("************** End Of Turn *****************");
      return new AwaitTopCardToBeDrawn(getGameData());
    }
    if (!getGameData().getPlayer().isCanBoilingWater()) {
      getGameData().addMsgLog("Can't Boilin Water Attack this turn");
      return new AwaitActionSelection(getGameData());
    }
    return new AwaitEnemyTrackSelectionForBoilingWaterAttack(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates closeCombatAttack() {
    if (getGameData().getPlayer().getActionPoints() == 0) {
      getGameData().addMsgLog("************** End Of Turn *****************");
      return new AwaitTopCardToBeDrawn(getGameData());
    }
    if (!getGameData().getPlayer().isCanCloseCombat()) {
      getGameData().addMsgLog("Can't Close Combat Attack this turn");
      return new AwaitActionSelection(getGameData());
    }
    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGameData());
  }
}
