package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * SuppliesSpoiled class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class SuppliesSpoiled {

    /**
     * apply.
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public static void apply(GameData gameData) {
        gameData.getPlayer().setSupplies(gameData.getPlayer().getSupplies() - 1);
    }
}
