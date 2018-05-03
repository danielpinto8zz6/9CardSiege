package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Dice;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.exceptions.EnemyNotFoundException;

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
  public IStates attack(String name) {
    int roll = Dice.roll();

    Enemy enemy;
    try {
      enemy = getGameData().getEnemy(name);

      getGameData().addMsgLog("Perfotming ArchersAttack");
      getGameData().addMsgLog("Roll : " + roll);

      if (enemy.getStrength() < roll) {
        enemy.move(Constants.MOVE.DOWN);
      }

      getGameData().getPlayer().setActionPoints(getGameData().getPlayer().getActionPoints() - 1);
    } catch (EnemyNotFoundException e) {
      getGameData().addMsgLog(e.getMessage());
    }

    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGameData());
  }
}
