package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 *
 * @author daniel
 */
public class TrebuchetAttack {

    /**
     *
     * @param gameData
     */
    public static void apply(GameData gameData) {
        gameData.getPlayer().setWallStrength(gameData.getPlayer().getWallStrength() - 2);
    }
}
