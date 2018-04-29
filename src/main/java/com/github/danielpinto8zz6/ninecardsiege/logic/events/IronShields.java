package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 *
 * @author daniel
 */
public class IronShields {

    /**
     *
     * @param gameData
     */
    public static void apply(GameData gameData) {
        Enemy enemy = gameData.getEnemy("SiegeTower");
        if (enemy != null) {
            enemy.setStrength(enemy.getStrength() + 1);
        }
    }
}
