package com.github.danielpinto8zz6.ninecardsiege.logic.cards.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class TrebuchetAttack extends Event {
    private static final long serialVersionUID = 1L;

    public TrebuchetAttack(GameData gameData) {
        super(gameData, "TrebuchetAttack");
    }

    @Override
    public void doEvent() {
        getPlayer().setWallStrength(getPlayer().getWallStrength() - 2);
    }
}
