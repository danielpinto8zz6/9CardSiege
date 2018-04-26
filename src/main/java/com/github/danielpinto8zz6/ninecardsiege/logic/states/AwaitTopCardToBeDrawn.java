package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card;

public class AwaitTopCardToBeDrawn extends StateAdapter {

    public AwaitTopCardToBeDrawn(GameData g) {
        super(g);
    }

    @Override
    public IStates pickAnEventCard() {
        List<Card> cards = getGame().getPlayer().getCards();
        Card card = cards.get(0);

        /**
        * Resolve event text
        */
        switch (getGame().getDay()) {
        case 1:
            card.Day1Event();
            break;
        case 2:
            card.Day2Event();
            break;
        case 3:
            card.Day3Event();
            break;
        }

        /**
         * Advance enemies
         */
        card.moveEnemies();


        /**
         * Perform close combat action if 2 enemies in close combat area
         */
        //TODO

        return null;
    }

    @Override
    public IStates quit() {
        return new GameOver(getGame());
    }
}
