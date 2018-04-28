package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.BattleCard;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.StatusCard;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card;

public class AwaitTopCardToBeDrawn extends StateAdapter {

    public AwaitTopCardToBeDrawn(GameData g) {
        super(g);
    }

    @Override
    public IStates DrawTopCard() {
        List<Card> cards = getGame().getCards();
        Card card = cards.get(0);
        BattleCard battleCard = getGame().getBattleCard();
        StatusCard statusCard = getGame().getStatusCard();
        /**
         * Resolve event text Advance enemies
         */

        switch (getGame().getDay()) {
        case 1:
            card.Day1Event();
            card.moveEnemyDay1();
            break;
        case 2:
            card.Day2Event();
            card.moveEnemyDay2();
            break;
        case 3:
            card.Day3Event();
            card.moveEnemyDay3();
            break;
        }

        /**
         * Perform enemy line check if our troops are on the enemy lines we have
         * to roll a D6 if we roll a 1 they are captured
         */
        if (statusCard.getTroopPosition() == 4)
            statusCard.checkCapture();
        /**
         * Perform close combat action if 2 enemies in close combat area
         */
        battleCard.checkCloseCombat();

        if (getGame().getPlayer().getActionPoints() == 0) {
            return new GameOver(getGame());
        } else {
            return new AwaitActionSelection(getGame());
        }
    }

    @Override
    public IStates Finish() {
        return new GameOver(getGame());
    }
}
