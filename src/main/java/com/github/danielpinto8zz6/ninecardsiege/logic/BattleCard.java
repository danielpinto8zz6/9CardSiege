package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * BattleCard class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class BattleCard implements Serializable {

  private static final long serialVersionUID = 1L;

  private GameData gameData;

  private final List<Enemy> enemies;

  private int trebuchet;

  /**
   * Constructor for BattleCard.
   *
   * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public BattleCard(GameData gameData) {
    this.gameData = gameData;

    enemies = new ArrayList<>();

    enemies.add(new Enemy("Ladders", 2));
    enemies.add(new Enemy("BattleRam", 3));
    enemies.add(new Enemy("SiegeTower", 4));

    this.trebuchet = 3;
  }

  /**
   * Getter for the field <code>gameData</code>.
   *
   * @return the gameData
   */
  public GameData getGameData() {
    return gameData;
  }

  /**
   * Setter for the field <code>gameData</code>.
   *
   * @param gameData the gameData to set
   */
  public void setGameData(GameData gameData) {
    this.gameData = gameData;
  }

  /**
   * Getter for the field <code>enemies</code>.
   *
   * @return the enemies
   */
  public List<Enemy> getEnemies() {
    return enemies;
  }

  /**
   * Getter for the field <code>trebuchet</code>.
   *
   * @return the trebuchet
   */
  public int getTrebuchet() {
    return trebuchet;
  }

  /**
   * Setter for the field <code>trebuchet</code>.
   *
   * @param trebuchet the trebuchet to set
   */
  public void setTrebuchet(int trebuchet) {
    this.trebuchet = trebuchet;
  }

  /**
   * getEnemy.
   *
   * @param name a {@link java.lang.String} object.
   * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.Enemy} object.
   */
  public Enemy getEnemy(String name) {
    for (Enemy enemy : enemies) {
      if (enemy.getName() == null ? name == null : enemy.getName().equals(name)) {
        return enemy;
      }
    }
    return null;
  }

  /**
   * getEnemiesInCloseCombatArea.
   *
   * @return a {@link java.util.List} object.
   */
  public List<Enemy> getEnemiesInCloseCombatArea() {
    List<Enemy> enemiesInCloseCombatArea = new ArrayList<>();

    for (Enemy e : enemies) {
      if (e.getPosition() == 0) {
        enemiesInCloseCombatArea.add(e);
      }
    }

    return enemiesInCloseCombatArea;
  }
}
