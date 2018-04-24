package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class TrebuchetAttack {

    public static void apply(GameData gameData) {
        gameData.getPlayer().setWallStrength(gameData.getPlayer().getWallStrength() - 2);
    }
}
