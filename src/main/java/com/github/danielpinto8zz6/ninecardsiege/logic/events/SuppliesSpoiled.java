package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 *
 * @author daniel
 */
public class SuppliesSpoiled {

    /**
     *
     * @param gameData
     */
    public static void apply(GameData gameData) {
        gameData.getPlayer().setSupplies(gameData.getPlayer().getSupplies() - 1);
    }
}
