package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;
import com.github.danielpinto8zz6.ninecardsiege.logic.exceptions.EnemyNotFoundException;

/**
 * Faith class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Faith {

  /**
   * apply.
   *
   * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public static void apply(GameData gameData) {
    Player player = gameData.getPlayer();
    player.setmRaidSupplies(player.getmRaidSupplies() + 1);

    Enemy enemyR;
    try {
      enemyR = gameData.getEnemy("BattleRam");

      enemyR.setStrength(enemyR.getStrength() - 1);
    } catch (EnemyNotFoundException e) {
      gameData.addMsgLog(e.getMessage());
    }

    Enemy enemyL;
    try {
      enemyL = gameData.getEnemy("Ladders");

      enemyL.setStrength(enemyL.getStrength() - 1);
    } catch (EnemyNotFoundException e) {
      gameData.addMsgLog(e.getMessage());
    }
  }
}
