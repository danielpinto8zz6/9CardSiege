package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class Illness extends Event {
    private static final long serialVersionUID = 1L;

    public Illness(GameData gameData) {
        super(gameData, "Illness");
    }

    @Override
    public void doEvent() {
        getPlayer().setMoral(getPlayer().getMoral() - 1);
        getPlayer().setSupplies(getPlayer().getSupplies() - 1);
    }
}