package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;

/**
 * <p>
 * BadWeather class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class BadWeather {

    /**
     * <p>
     * apply.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public static void apply(GameData gameData) {
        Player player = gameData.getPlayer();
        player.setCanArchersAtack(false);
        player.setCanBoilingWater(false);
        player.setCanCoupure(false);
        player.setCanCloseCombat(false);
        player.setCanExtraAP(false);
        player.setCanTunnelMovement(false);
        player.setCanRallyTroops(false);
    }
}
