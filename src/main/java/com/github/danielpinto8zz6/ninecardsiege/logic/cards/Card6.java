package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.CoverOfDarkness;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.EnemyFatigue;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.Rally;

public class Card6 extends Card {
    private static final long serialVersionUID = 1L;

    public Card6(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        new CoverOfDarkness(getGame());
        getPlayer().setActionPoints(3);
    }

    @Override
    public void Day2Event() {
        new EnemyFatigue(getGame());
        getPlayer().setActionPoints(3);
    }

    @Override
    public void Day3Event() {
        new Rally(getGame());
        getPlayer().setActionPoints(3);
    }

    @Override
    public String toString() {
        return "Card6";
    }
}
