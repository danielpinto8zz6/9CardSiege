package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card;

public class AwaitTopCardToBeDrawn extends StateAdapter {

    public AwaitTopCardToBeDrawn(GameData g) {
        super(g);
    }

    @Override
    public IStates DrawTopCard() {
        List<Card> cards = getGame().getPlayer().getCards();
        Card card = cards.get(0);

        /**
         * Resolve event text Advance enemies
         */
        switch (getGame().getDay()) {
            case 1:
                card.Day1Event();
                card.moveEnemyDay1(getGame());
                break;
            case 2:
                card.Day2Event();
                card.moveEnemyDay2(getGame());
                break;
            case 3:
                card.Day3Event();
                card.moveEnemyDay3(getGame());
                break;
        }

        /**
         * Perform enemy line check if our troops are on the enemy lines we have
         * to roll a D6 if we roll a 1 they are captured
         */
        //TODO
        /**
         * Perform close combat action if 2 enemies in close combat area
         */
        //TODO
        return new AwaitActionSelection(getGame());
    }

    @Override
    public IStates Finish() {
        return new GameOver(getGame());
    }
}
