package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class GuardsDistracted {

    public static void apply(GameData gameData) {
        gameData.getPlayer().setmRallyTroops(gameData.getPlayer().getmRallyTroops() + 1);
        gameData.getPlayer().setmSabotage(gameData.getPlayer().getmSabotage() + 1);
    }
}
