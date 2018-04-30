package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.Dice;
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
    getGameData().addMsgLog("Picking Card...");

    List<Card> cards = getGameData().getCards();
    Card card = cards.get(0);

    getGameData().addMsgLog("Picked " + card.toString());

    getGameData().addMsgLog("Resolving event text Advance enemies");

    /** Resolve event text Advance enemies */
    switch (getGameData().getDay()) {
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
    if (getGameData().getStatusCard().getTroopPosition() == 4) {
      getGameData().addMsgLog("Performing enemy line check");

      if (Dice.roll() == 1) {
        getGameData().getStatusCard().setTroopPosition(0);
        getGameData().getPlayer().setMoral(getGameData().getPlayer().getMoral() - 1);
      }
    }

    getGameData().addMsgLog("Performing close combat action");
    /** Perform close combat action if 2 enemies in close combat area */
    getGameData().getBattleCard().checkCloseCombat();

    getGameData().addMsgLog("Removing " + card.toString() + " from the deck");
    /** After card is drawn, remove it from the deck */
    cards.remove(card);

    if (getGameData().getPlayer().getActionPoints() == 0) {
      return new GameOver(getGameData());
    } else {
      return new AwaitActionSelection(getGameData());
    }
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGameData());
  }
}
