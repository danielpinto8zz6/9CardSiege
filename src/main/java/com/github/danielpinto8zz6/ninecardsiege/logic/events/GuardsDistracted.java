package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * <p>
 * GuardsDistracted class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class GuardsDistracted {

    /**
     * <p>
     * apply.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public static void apply(GameData gameData) {
        gameData.getPlayer().setmRallyTroops(gameData.getPlayer().getmRallyTroops() + 1);
        gameData.getPlayer().setmSabotage(gameData.getPlayer().getmSabotage() + 1);
    }
}
