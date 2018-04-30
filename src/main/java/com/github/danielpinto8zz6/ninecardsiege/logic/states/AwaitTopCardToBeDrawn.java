package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card;

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
    getGame().addMsgLog("Picking Card...");

    List<Card> cards = getGame().getCards();
    Card card = cards.get(0);

    getGame().addMsgLog("Picked " + card.toString());

    getGame().addMsgLog("Resolving event text Advance enemies");

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

    getGame().addMsgLog("Performing enemy line check");
    /**
     * Perform enemy line check if our troops are on the enemy lines we have to roll a D6 if we roll
     * a 1 they are captured
     */
    if (getGame().getStatusCard().getTroopPosition() == 4) {
      getGame().getStatusCard().checkCapture();
    }

    getGame().addMsgLog("Performing close combat action");
    /** Perform close combat action if 2 enemies in close combat area */
    getGame().getBattleCard().checkCloseCombat();

    getGame().addMsgLog("Removing " + card.toString() + " from the deck");
    /** After card is drawn, remove it from the deck */
    cards.remove(card);

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
