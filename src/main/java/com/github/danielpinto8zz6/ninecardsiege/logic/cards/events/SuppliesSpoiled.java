package com.github.danielpinto8zz6.ninecardsiege.logic.cards.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class SuppliesSpoiled extends Event {
    private static final long serialVersionUID = 1L;

    public SuppliesSpoiled(GameData gameData) {
        super(gameData, "SuppliesSpoiled");
    }

    public void doEvent() {
        getPlayer().setSupplies(getPlayer().getSupplies() - 1);
    }
}