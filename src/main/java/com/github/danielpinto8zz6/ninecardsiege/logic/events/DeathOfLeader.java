package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 *
 * @author daniel
 */
public class DeathOfLeader {

    /**
     *
     * @param gameData
     */
    public static void apply(GameData gameData) {
        gameData.getPlayer().setMoral(gameData.getPlayer().getMoral() - 1);
    }
}
