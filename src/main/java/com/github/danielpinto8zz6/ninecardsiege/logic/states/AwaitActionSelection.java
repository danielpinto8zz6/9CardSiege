package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Dice;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
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
    if (getGameData().getPlayer().getActionPoints() == 0
        || !getGameData().getPlayer().isCanArchersAtack()) {
      getGameData().addMsgLog("Can't perform this action");
      return new AwaitActionSelection(getGameData());
    }
    return new AwaitEnemyTrackSelectionForArchersAttack(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates boilingWaterAttack() {
    if (getGameData().getPlayer().getActionPoints() == 0
        || !getGameData().getPlayer().isCanBoilingWater()) {
      getGameData().addMsgLog("Can't perform this action");
      return new AwaitActionSelection(getGameData());
    }
    return new AwaitEnemyTrackSelectionForBoilingWaterAttack(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates closeCombatAttack() {
    if (getGameData().getPlayer().getActionPoints() == 0
        || !getGameData().getPlayer().isCanCloseCombat()) {
      getGameData().addMsgLog("Can't perform this action");
      return new AwaitActionSelection(getGameData());
    }

    int roll = Dice.roll();

    if (roll == 1) {
      getGameData().getPlayer().setMoral(getGameData().getPlayer().getMoral() - 1);
    } else if (roll > 4) {
      for (Enemy enemy : getGameData().getBattleCard().getEnemiesInCloseCombatArea()) {
        enemy.move(Constants.MOVE.DOWN);
      }
    }
    getGameData().getPlayer().setActionPoints(getGameData().getPlayer().getActionPoints() - 1);

    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates endOfTurn() {
    return new AwaitTopCardToBeDrawn(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates extraActionPoint() {
    if (getGameData().getPlayer().getSupplies() > 0
        && getGameData().getPlayer().getMoral() > 0
        && getGameData().getPlayer().isCanExtraAP()) {
      return new AwaitOptionSelectionForExtraActionPoint(getGameData());
    }

    getGameData().addMsgLog("Can't add extra action points");

    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates coupure() {
    if (getGameData().getPlayer().getActionPoints() == 0
        || !getGameData().getPlayer().isCanArchersAtack()) {
      getGameData().addMsgLog("Can't perform this action");
      return new AwaitActionSelection(getGameData());
    }

    int roll = Dice.roll();

    if (roll > 4)
      getGameData().getPlayer().setWallStrength(getGameData().getPlayer().getWallStrength() + 1);

    getGameData().getPlayer().setActionPoints(getGameData().getPlayer().getActionPoints() - 1);

    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates rallyTroops() {
    if (getGameData().getPlayer().getActionPoints() == 0
        || !getGameData().getPlayer().isCanArchersAtack()) {
      getGameData().addMsgLog("Can't perform this action");
      return new AwaitActionSelection(getGameData());
    }

    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates tunnelMovement() {
    if (getGameData().getPlayer().getActionPoints() == 0
        || !getGameData().getPlayer().isCanArchersAtack()) {
      getGameData().addMsgLog("Can't perform this action");
      return new AwaitActionSelection(getGameData());
    }

    // TODO
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public IStates supplyRaid() {
    if (getGameData().getPlayer().getActionPoints() == 0
        || !getGameData().getPlayer().isCanArchersAtack()) {
      getGameData().addMsgLog("Can't perform this action");
      return new AwaitActionSelection(getGameData());
    }

    // TODO
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public IStates sabotage() {
    if (getGameData().getPlayer().getActionPoints() == 0
        || !getGameData().getPlayer().isCanArchersAtack()) {
      getGameData().addMsgLog("Can't perform this action");
      return new AwaitActionSelection(getGameData());
    }

    // TODO
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGameData());
  }
}
