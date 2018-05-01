package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * VolleyOfArrows class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class VolleyOfArrows {

  /**
   * apply.
   *
   * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public static void apply(GameData gameData) {
    gameData
        .getEnemies()
        .stream()
        .filter((enemy) -> (enemy != null))
        .forEachOrdered((enemy) -> enemy.setStrength(enemy.getStrength() - 1));
  }
}
