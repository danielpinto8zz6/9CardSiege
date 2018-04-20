package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.BadWeather;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.BoilingOil;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.SuppliesSpoiled;

public class Card3 extends Card {
    private static final long serialVersionUID = 1L;

    public Card3(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        new SuppliesSpoiled(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day2Event() {
        new BadWeather(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day3Event() {
        new BoilingOil(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public String toString() {
        return "Card3";
    }
}
