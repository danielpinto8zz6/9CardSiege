package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class Rally {

    public static void apply(GameData gameData) {
        for (Enemy enemy : gameData.getEnemies()) {
            if (enemy != null && (enemy.getPosition() == 0 || enemy.getPosition() == 1)) {
                enemy.setStrength(enemy.getStrength() + 1);
            }
        }
    }
}
