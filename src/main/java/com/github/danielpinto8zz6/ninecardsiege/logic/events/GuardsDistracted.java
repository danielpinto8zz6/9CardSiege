package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 *
 * @author daniel
 */
public class GuardsDistracted {

    /**
     *
     * @param gameData
     */
    public static void apply(GameData gameData) {
        gameData.getPlayer().setmRallyTroops(gameData.getPlayer().getmRallyTroops() + 1);
        gameData.getPlayer().setmSabotage(gameData.getPlayer().getmSabotage() + 1);
    }
}
