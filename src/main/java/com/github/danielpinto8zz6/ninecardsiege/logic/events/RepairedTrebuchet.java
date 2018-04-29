package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 *
 * @author daniel
 */
public class RepairedTrebuchet {

    /**
     *
     * @param gameData
     */
    public static void apply(GameData gameData) {
        if (gameData.getBattleCard().getTrebuchet() < 3) {
            gameData.getBattleCard().setTrebuchet(gameData.getBattleCard().getTrebuchet() + 1);
        }
    }
}
