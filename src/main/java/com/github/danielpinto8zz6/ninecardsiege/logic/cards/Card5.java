package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Card;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.events.Collapsed;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.events.RepairedTrebuchet;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.events.VolleyOfArrows;

public class Card5 extends Card {
    private static final long serialVersionUID = 1L;

    public Card5(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        new VolleyOfArrows(getGame());
        getPlayer().setActionPoints(3);
    }

    @Override
    public void Day2Event() {
        new Collapsed(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day3Event() {
        new RepairedTrebuchet(getGame());
        getPlayer().setActionPoints(2);
    }
}
