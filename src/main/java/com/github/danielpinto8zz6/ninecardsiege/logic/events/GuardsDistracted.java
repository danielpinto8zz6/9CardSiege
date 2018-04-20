package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class GuardsDistracted {
    public static void apply(GameData gameData) {
        gameData.getPlayer().setMoral(gameData.getPlayer().getMoral() + 1);
        gameData.getPlayer().setSabotage(gameData.getPlayer().getSabotage() + 1);
    }
}