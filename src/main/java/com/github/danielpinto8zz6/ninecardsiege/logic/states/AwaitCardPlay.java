
package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.Card;

public class AwaitCardPlay extends StateAdapter {
    public AwaitCardPlay(GameData g) {
        super(g);
    }

    @Override
    public IStates pickAnEventCard() {
        List<Card> cards = getGame().getPlayer().getCards();
        Card card = cards.get(0);

        getGame().applyCardEvent(card);

        // We don't need the card anymore
        cards.remove(0);
        card = null;

        return new AwaitActionSelection(getGame());
    }

    @Override
    public IStates quit() {
        return new GameOver(getGame());
    }
}
