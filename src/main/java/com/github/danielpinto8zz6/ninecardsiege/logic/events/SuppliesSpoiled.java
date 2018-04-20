package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class SuppliesSpoiled extends Event {
    private static final long serialVersionUID = 1L;

    public SuppliesSpoiled(GameData gameData) {
        super(gameData, "SuppliesSpoiled");
    }

    @Override
    public void doEvent() {
        getPlayer().setSupplies(getPlayer().getSupplies() - 1);
    }
}