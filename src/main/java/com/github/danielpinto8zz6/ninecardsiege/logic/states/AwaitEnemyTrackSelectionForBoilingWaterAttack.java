package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Dice;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * AwaitEnemyTrackSelectionForBoilingWaterAttack class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitEnemyTrackSelectionForBoilingWaterAttack extends StateAdapter {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor for AwaitEnemyTrackSelectionForBoilingWaterAttack.
   *
   * @param g a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public AwaitEnemyTrackSelectionForBoilingWaterAttack(GameData g) {
    super(g);
  }

  /** {@inheritDoc} */
  @Override
  public IStates attack(String name) {
    if ("stop".equals(name)) {
      getGameData().addMsgLog("Already Performed Boilin Water Attack this turn");
      return new AwaitActionSelection(getGameData());
    }
    int roll = Dice.roll();
    Enemy enemy = getGameData().getEnemy(name);

    if (enemy == null) {
      getGameData().addMsgLog("Enemy not found");
      return new AwaitActionSelection(getGameData());
    }

    getGameData().addMsgLog("Performing Boilin Water Attack");
    getGameData().addMsgLog("Roll : " + roll);

    if (enemy.getStrength() < (roll + 2)) {
      enemy.move(Constants.MOVE.DOWN);
    }
    getGameData().getPlayer().setCanBoilingWater(false);
    getGameData().getPlayer().setActionPoints(getGameData().getPlayer().getActionPoints() - 1);

    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGameData());
  }
}
