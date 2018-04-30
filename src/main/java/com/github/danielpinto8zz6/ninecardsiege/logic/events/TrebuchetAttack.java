package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * <p>
 * TrebuchetAttack class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class TrebuchetAttack {

    /**
     * <p>
     * apply.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public static void apply(GameData gameData) {
        gameData.getPlayer().setWallStrength(gameData.getPlayer().getWallStrength() - 2);
    }
}
