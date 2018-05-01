package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import java.util.ArrayList;
import java.util.List;

/**
 * BoilingOil class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class BoilingOil {

  /**
   * apply.
   *
   * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public static void apply(GameData gameData) {
    getEnemiesOnCircleSpaces(gameData)
        .forEach((enemy) -> enemy.setStrength(enemy.getStrength() + 2));
  }

  /**
   * getEnemiesOnCircleSpaces.
   *
   * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   * @return a {@link java.util.List} object.
   */
  public static List<Enemy> getEnemiesOnCircleSpaces(GameData gameData) {
    List<Enemy> enemiesOnCircleSpaces = new ArrayList<>();
    gameData
        .getBattleCard()
        .getEnemies()
        .stream()
        .filter((enemy) -> (enemy.getPosition() == 1))
        .forEachOrdered(enemiesOnCircleSpaces::add); // Circle Spaces = position 1
    return enemiesOnCircleSpaces;
  }
}
