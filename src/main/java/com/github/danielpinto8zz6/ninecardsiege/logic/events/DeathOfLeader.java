package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class DeathOfLeader {

    public static void apply(GameData gameData) {
        gameData.getPlayer().setMoral(gameData.getPlayer().getMoral() - 1);
    }
}
