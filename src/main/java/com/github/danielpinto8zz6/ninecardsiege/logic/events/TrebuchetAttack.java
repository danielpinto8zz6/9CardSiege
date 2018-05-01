package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * TrebuchetAttack class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class TrebuchetAttack {

    /**
     * apply.
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public static void apply(GameData gameData) {
        gameData.getPlayer().setWallStrength(gameData.getPlayer().getWallStrength() - 2);
    }
}
