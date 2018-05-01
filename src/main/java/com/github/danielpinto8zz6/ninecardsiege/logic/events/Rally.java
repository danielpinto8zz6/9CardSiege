package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * Rally class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Rally {

  /**
   * apply.
   *
   * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public static void apply(GameData gameData) {
    gameData
        .getEnemies()
        .stream()
        .filter(
            (enemy) -> (enemy != null && (enemy.getPosition() == 0 || enemy.getPosition() == 1)))
        .forEachOrdered((enemy) -> enemy.setStrength(enemy.getStrength() + 1));
  }
}
