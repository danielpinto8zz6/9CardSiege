package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.GuardsDistracted;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.Illness;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.TrebuchetAttack;

/**
 * Card2 class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Card2 extends Card {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor for Card2.
   *
   * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public Card2(GameData gameData) {
    super(gameData);
  }

  /** {@inheritDoc} */
  @Override
  public void day1Event() {
    Illness.apply(getGameData());
    getPlayer().setActionPoints(2);
  }

  /** {@inheritDoc} */
  @Override
  public void day2Event() {
    GuardsDistracted.apply(getGameData());
    getPlayer().setActionPoints(2);
  }

  /** {@inheritDoc} */
  @Override
  public void day3Event() {
    TrebuchetAttack.apply(getGameData());
    getPlayer().setActionPoints(1);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return "Card2";
  }

  /** {@inheritDoc} */
  @Override
  public void moveEnemyDay1() {
    getGameData().getEnemy("SiegeTower").move(Constants.MOVE.UP);
  }

  /** {@inheritDoc} */
  @Override
  public void moveEnemyDay2() {
    int max = 0;

    for (Enemy enemy : getGameData().getEnemies()) {
      if (enemy.getPosition() > max) {
        max = enemy.getPosition();
      }
    }

    for (Enemy enemy : getGameData().getEnemies()) {
      if (enemy.getPosition() == max) {
        enemy.move(Constants.MOVE.UP);
      }
    }
  }

  /** {@inheritDoc} */
  @Override
  public void moveEnemyDay3() {
    // no enemy movement
  }
}
