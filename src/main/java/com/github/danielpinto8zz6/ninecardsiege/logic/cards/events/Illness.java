package com.github.danielpinto8zz6.ninecardsiege.logic.cards.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class Illness extends Event {
    private static final long serialVersionUID = 1L;

    public Illness(GameData gameData) {
        super(gameData, "Illness");
    }
}