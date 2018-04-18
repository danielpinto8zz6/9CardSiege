package com.github.danielpinto8zz6.ninecardsiege.logic.cards.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class GuardsDistracted extends Event {
    private static final long serialVersionUID = 1L;

    public GuardsDistracted(GameData gameData) {
        super(gameData, "GuardsDistracted");
    }
}