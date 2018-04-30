package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * DeathOfLeader class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class DeathOfLeader {

  /**
   * apply.
   *
   * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public static void apply(GameData gameData) {
    gameData.getPlayer().setMoral(gameData.getPlayer().getMoral() - 1);
  }
}
