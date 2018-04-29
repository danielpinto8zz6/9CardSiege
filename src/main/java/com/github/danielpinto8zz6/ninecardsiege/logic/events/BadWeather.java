package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;

/**
 *
 * @author daniel
 */
public class BadWeather {

    /**
     *
     * @param gameData
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
