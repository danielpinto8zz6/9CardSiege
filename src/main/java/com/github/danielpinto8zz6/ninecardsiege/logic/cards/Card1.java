package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.TrebuchetAttack;

/**
 * Card1 class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Card1 extends Card {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor for Card1.
   *
   * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public Card1(GameData gameData) {
    super(gameData);
  }

  /** {@inheritDoc} */
  @Override
  public void day1Event() {
    TrebuchetAttack.apply(getGameData());
    getPlayer().setActionPoints(3);
  }

  /** {@inheritDoc} */
  @Override
  public void day2Event() {
    TrebuchetAttack.apply(getGameData());
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
  public void moveEnemyDay1() {
    // no enemy movement
  }

  /** {@inheritDoc} */
  @Override
  public void moveEnemyDay2() {
    // no enemy movement
  }

  /** {@inheritDoc} */
  @Override
  public void moveEnemyDay3() {
    // no enemy movement
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return "Card1";
  }
}
