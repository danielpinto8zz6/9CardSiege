package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;

/**
 *
 * @author daniel
 */
public class Faith {

    /**
     *
     * @param gameData
     */
    public static void apply(GameData gameData) {
        Player player = gameData.getPlayer();
        player.setmRaidSupplies(player.getmRaidSupplies() + 1);

        Enemy enemyR = gameData.getEnemy("BattleRam");
        Enemy enemyL = gameData.getEnemy("Ladders");
        if (enemyR != null) {
            enemyR.setStrength(enemyR.getStrength() - 1);
        }
        if (enemyL != null) {
            enemyL.setStrength(enemyL.getStrength() - 1);
        }
    }
}
