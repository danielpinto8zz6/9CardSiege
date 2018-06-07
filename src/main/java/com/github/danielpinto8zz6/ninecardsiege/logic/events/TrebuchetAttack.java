package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.Dice;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * TrebuchetAttack class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class TrebuchetAttack {

  /**
   * apply.
   *
   * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public static void apply(GameData gameData) {
    switch (gameData.getBattleCard().getTrebuchet()) {
      case 3:
        gameData.getPlayer().setWallStrength(gameData.getPlayer().getWallStrength() - 2);
        break;
      case 2:
        gameData.getPlayer().setWallStrength(gameData.getPlayer().getWallStrength() - 1);
        break;
      case 1:
        int roll = Dice.roll();
        if (roll > 3)
          gameData.getPlayer().setWallStrength(gameData.getPlayer().getWallStrength() - 1);
        break;
      default:
        break;
    }
    if (gameData.getPlayer().getWallStrength() < 0) {
      gameData.getPlayer().setWallStrength(0);
    }
  }
}
