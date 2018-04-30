package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * <p>
 * Collapsed class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Collapsed {

    /**
     * <p>
     * apply.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public static void apply(GameData gameData) {
        Enemy enemy = gameData.getEnemy("SiegeTower");
        if (enemy != null) {
            if (enemy.getPosition() == 4) {
                gameData.getEnemies().remove(enemy);
            }
        }
    }

}
