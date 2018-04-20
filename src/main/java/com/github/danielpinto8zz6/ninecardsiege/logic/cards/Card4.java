package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Card;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.events.DeathOfLeader;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.events.FlamingArrows;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.events.GateFortified;

public class Card4 extends Card {
    private static final long serialVersionUID = 1L;

    public Card4(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        new DeathOfLeader(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day2Event() {
        new GateFortified(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day3Event() {
        new FlamingArrows(getGame());
        getPlayer().setActionPoints(3);
    }
}
