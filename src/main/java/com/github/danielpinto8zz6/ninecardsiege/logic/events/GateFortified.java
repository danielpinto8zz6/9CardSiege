package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * <p>GateFortified class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class GateFortified {

    /**
     * <p>apply.</p>
     *
     * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public static void apply(GameData gameData) {
        Enemy enemy = gameData.getEnemy("BattleRam");
        if (enemy != null) {
            enemy.setStrength(enemy.getStrength() - 1);
        }
    }
}
