package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Card;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.events.GuardsDistracted;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.events.Illness;
import com.github.danielpinto8zz6.ninecardsiege.logic.cards.events.TrebuchetAttack;

public class Card2 extends Card {
    private static final long serialVersionUID = 1L;

    public Card2(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        new Illness(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day2Event() {
        new GuardsDistracted(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day3Event() {
        new TrebuchetAttack(getGame());
        getPlayer().setActionPoints(1);
    }

    @Override
    public String toString() {
        return "Card2";
    }
}
