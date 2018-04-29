package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * <p>Rally class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Rally {

    /**
     * <p>apply.</p>
     *
     * @param gameData a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public static void apply(GameData gameData) {
        for (Enemy enemy : gameData.getEnemies()) {
            if (enemy != null && (enemy.getPosition() == 0 || enemy.getPosition() == 1)) {
                enemy.setStrength(enemy.getStrength() + 1);
            }
        }
    }
}
