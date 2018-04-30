package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.BattleCard;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.StatusCard;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card;
import java.util.List;

/**
 * AwaitTopCardToBeDrawn class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitTopCardToBeDrawn extends StateAdapter {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor for AwaitTopCardToBeDrawn.
   *
   * @param g a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
   */
  public AwaitTopCardToBeDrawn(GameData g) {
    super(g);
  }

  /** {@inheritDoc} */
  @Override
  public IStates drawTopCard() {
    List<Card> cards = getGame().getCards();
    Card card = cards.get(0);
    BattleCard battleCard = getGame().getBattleCard();
    StatusCard statusCard = getGame().getStatusCard();
    /** Resolve event text Advance enemies */
    switch (getGame().getDay()) {
      case 1:
        card.day1Event();
        card.moveEnemyDay1();
        break;
      case 2:
        card.day2Event();
        card.moveEnemyDay2();
        break;
      case 3:
        card.day3Event();
        card.moveEnemyDay3();
        break;
      default:
        break;
    }

    /**
     * Perform enemy line check if our troops are on the enemy lines we have to roll a D6 if we roll
     * a 1 they are captured
     */
    if (statusCard.getTroopPosition() == 4) {
      statusCard.checkCapture();
    }
    /** Perform close combat action if 2 enemies in close combat area */
    battleCard.checkCloseCombat();

    if (getGame().getPlayer().getActionPoints() == 0) {
      return new GameOver(getGame());
    } else {
      return new AwaitActionSelection(getGame());
    }
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGame());
  }
}
