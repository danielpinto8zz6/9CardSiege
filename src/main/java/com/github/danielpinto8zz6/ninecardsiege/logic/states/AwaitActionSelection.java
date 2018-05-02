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
    if (getGameData().getBattleCard().getEnemiesInCloseCombatArea().size() == 2) {
      getGameData().addMsgLog("GAME OVER! 2 Enemies in close combat area");
      return new GameOver(getGameData());
    }
    if (getGameData().getPlayer().getMoral() == 0
        || getGameData().getPlayer().getSupplies() == 0
        || getGameData().getPlayer().getWallStrength() == 0) {
      getGameData().addMsgLog("GAME OVER! 1 status at 0");
      return new GameOver(getGameData());
    }
    /** Reset player modifiers */
    getGameData().getPlayer().resetModifiers();

    /** Reset enemies strength */
    for (Enemy enemy : getGameData().getEnemies()) {
      enemy.resetStrenght();
    }

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
        || !getGameData().getPlayer().isCanCoupure()) {
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
        || !getGameData().getPlayer().isCanRallyTroops()) {
      getGameData().addMsgLog("Can't perform this action");
      return new AwaitActionSelection(getGameData());
    }

    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates tunnelMovement() {
    if (getGameData().getPlayer().getActionPoints() == 0
        || !getGameData().getPlayer().isCanTunnelMovement()) {
      getGameData().addMsgLog("Can't perform this action");
      return new AwaitActionSelection(getGameData());
    }

    // TODO
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public IStates supplyRaid() {
    if (getGameData().getPlayer().getActionPoints() == 0) {
      getGameData().addMsgLog("Can't perform this action");
      return new AwaitActionSelection(getGameData());
    }

    if (getGameData().getStatusCard().getTroopPosition() == 4) {
      int roll = Dice.roll();
      switch (roll) {
        case 1:
          getGameData().getPlayer().setMoral(getGameData().getPlayer().getMoral() - 1);
          getGameData().getStatusCard().setTroopPosition(0);
          getGameData().getStatusCard().removeSupplies();
          getGameData().addMsgLog("Reduce moral by 1\nTroops captured\nRemoved supplies");
          break;
        case 3:
        case 4:
        case 5:
          getGameData().getStatusCard().addSupplies(1);
          getGameData().addMsgLog("Added 1 supply (max 2)");
          break;
        case 6:
          getGameData().getStatusCard().addSupplies(2);
          getGameData().addMsgLog("Added 2 supplies (max 2)");
          break;
      }
    }

    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates sabotage() {
    if (getGameData().getPlayer().getActionPoints() == 0) {
      getGameData().addMsgLog("Can't perform this action");
      return new AwaitActionSelection(getGameData());
    }

    if (getGameData().getStatusCard().getTroopPosition() == 4) {
      int roll = Dice.roll();
      if (roll > 4) {
        int trebuchet = (getGameData().getBattleCard().getTrebuchet() - 1);
        getGameData().getBattleCard().setTrebuchet(trebuchet > 0 ? trebuchet : 0);
        getGameData().addMsgLog("Reduce trebuchet by 1 (min 0)");
      } else if (roll == 1) {
        getGameData().getPlayer().setMoral(getGameData().getPlayer().getMoral() - 1);
        getGameData().getStatusCard().setTroopPosition(0);
        getGameData().getStatusCard().removeSupplies();
        getGameData().addMsgLog("Reduce moral by 1\nTroops captured\nRemoved supplies");
      }
    }

    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGameData());
  }
}
