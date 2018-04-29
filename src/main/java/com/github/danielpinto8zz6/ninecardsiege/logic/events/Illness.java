package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * <p>Illness class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Illness {

    /**
     * <p>apply.</p>
     *
     * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public static void apply(GameData gameData) {
        gameData.getPlayer().setMoral(gameData.getPlayer().getMoral() - 1);
        gameData.getPlayer().setSupplies(gameData.getPlayer().getSupplies() - 1);
    }
}
