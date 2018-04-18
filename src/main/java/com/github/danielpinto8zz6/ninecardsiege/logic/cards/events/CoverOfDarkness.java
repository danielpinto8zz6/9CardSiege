package com.github.danielpinto8zz6.ninecardsiege.logic.cards.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class CoverOfDarkness extends Event {
    private static final long serialVersionUID = 1L;

    public CoverOfDarkness(GameData gameData) {
        super(gameData, "CoverOfDarkness");
    }
}