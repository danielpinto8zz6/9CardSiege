package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * IronShields class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class IronShields {

    /**
     * apply.
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public static void apply(GameData gameData) {
        Enemy enemy = gameData.getEnemy("SiegeTower");
        if (enemy != null) {
            enemy.setStrength(enemy.getStrength() + 1);
        }
    }
}
