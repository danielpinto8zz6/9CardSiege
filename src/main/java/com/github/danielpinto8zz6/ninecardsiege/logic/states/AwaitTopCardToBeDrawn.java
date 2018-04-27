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
        switch (getGame().getDay()) {
            case 1:
                card.moveEnemyDay1(getGame());
                break;
            case 2:
                card.moveEnemyDay2(getGame());
                break;
            case 3:
                card.moveEnemyDay3(getGame());
                break;
        }

        /**
         * Perform close combat action if 2 enemies in close combat area
         */
        //TODO
        return new AwaitActionSelection(getGame());
    }

    @Override
    public IStates quit() {
        return new GameOver(getGame());
    }
}
