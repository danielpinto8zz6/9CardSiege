package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Dice;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
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

        List<Card> cards = getGameData().getCards();
    getGameData().addMsgLog("Picking Card...");
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

    getGameData().addMsgLog("Removing " + card.toString() + " from the deck");
    /** After card is drawn, remove it from the deck */
    cards.remove(card);

    return new AwaitBegginingOfTheTurn(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGameData());
  }
}
