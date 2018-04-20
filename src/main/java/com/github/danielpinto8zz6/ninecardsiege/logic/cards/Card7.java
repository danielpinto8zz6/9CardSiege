package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Card;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.events.DeterminedEnemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.events.Faith;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.events.IronShields;

public class Card7 extends Card {
    private static final long serialVersionUID = 1L;

    public Card7(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        new DeterminedEnemy(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day2Event() {
        new IronShields(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day3Event() {
        new Faith(getGame());
        getPlayer().setActionPoints(3);
    }

    @Override
    public String toString() {
        return "Card7";
    }
}
