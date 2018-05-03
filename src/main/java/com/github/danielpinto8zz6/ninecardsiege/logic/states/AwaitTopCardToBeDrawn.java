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
    if (cards.isEmpty()) {
      if (getGameData().getDay() == 3) {
        getGameData().addMsgLog("Your troops arrived! GAME WON!!!!!");
        return new GameOver(getGameData());
      }

      getGameData().addMsgLog("New day! Shuffeling cards");
      getGameData().addCards();
      getGameData().shuffleCards();
      getGameData().setDay(getGameData().getDay() + 1);
      getGameData().getPlayer().setSupplies(getGameData().getPlayer().getSupplies() - 1);

      if (getGameData().getStatusCard().getTroopPosition() == 4) {
        getGameData()
            .addMsgLog(
                "Your troops have been captured!\n"
                    + "They here in enemy lines at the end of the day");

        getGameData().getStatusCard().setTroopPosition(0);
        getGameData().getPlayer().setMoral(getGameData().getPlayer().getMoral() - 1);

      } else {
        getGameData().addMsgLog("Your troops arived at the castle");
        getGameData().getStatusCard().setTroopPosition(0);
        getGameData()
            .getPlayer()
            .setSupplies(
                getGameData().getPlayer().getSupplies()
                    + getGameData().getStatusCard().getSupplies());
        getGameData().getStatusCard().removeSupplies();
      }
    }
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

    /**
     * Perform enemy line check if our troops are on the enemy lines we have to roll a D6 if we roll
     * a 1 they are captured
     */
    if (getGameData().getStatusCard().getTroopPosition() == 3) {
      getGameData().addMsgLog("Performing enemy line check");

      if (Dice.roll() == 1) {
        getGameData().getStatusCard().setTroopPosition(0);
        getGameData().getStatusCard().removeSupplies();
        getGameData().getPlayer().setMoral(getGameData().getPlayer().getMoral() - 1);
      }
    }

    /** Perform close combat action if 2 enemies in close combat area */
    if (getGameData().getBattleCard().getEnemiesInCloseCombatArea().size() == 2) {
      getGameData().addMsgLog("Performing close combat action");
      int roll = Dice.roll();
      boolean keepRolling = true;

      while (keepRolling) {

        if (getGameData().getPlayer().getActionPoints() == 0) {
          getGameData()
              .addMsgLog("Game Over! No more actions points while performing close combat");
          return new GameOver(getGameData());
        }

        if (roll == 1) {
          getGameData().getPlayer().setMoral(getGameData().getPlayer().getMoral() - 1);
        } else if (roll > 4) {
          for (Enemy enemy : getGameData().getBattleCard().getEnemiesInCloseCombatArea()) {
            enemy.move(Constants.MOVE.DOWN);
            keepRolling = false;
          }
        }
        getGameData().getPlayer().setActionPoints(getGameData().getPlayer().getActionPoints() - 1);
        roll = Dice.roll();
      }

    } else if (getGameData().getBattleCard().getEnemiesInCloseCombatArea().size() == 3) {
      /** If there are 3 enemies on close combat area the game is over */
      getGameData().addMsgLog("Game Over! 3 enemies on close combat area");
      return new GameOver(getGameData());
    }

    getGameData().addMsgLog("Removing " + card.toString() + " from the deck");
    /** After card is drawn, remove it from the deck */
    cards.remove(card);

    return new AwaitActionSelection(getGameData());
  }

  /** {@inheritDoc} */
  @Override
  public IStates finish() {
    return new GameOver(getGameData());
  }
}
