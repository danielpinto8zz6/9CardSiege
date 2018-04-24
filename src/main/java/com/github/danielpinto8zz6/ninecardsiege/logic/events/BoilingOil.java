package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import java.util.ArrayList;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class BoilingOil {

    public static void apply(GameData gameData) {
        for (Enemy enemy : getEnemiesOnCircleSpaces(gameData)) {
            enemy.setStrength(enemy.getStrength() + 2);
        }
    }

    public static List<Enemy> getEnemiesOnCircleSpaces(GameData gameData) {
        List<Enemy> enemiesOnCircleSpaces = new ArrayList<Enemy>();
        for (Enemy enemy : gameData.getBattleCard().getEnemies()) {
            // Circle Spaces = position 1
            if (enemy.getPosition() == 1) {
                enemiesOnCircleSpaces.add(enemy);
            }
        }
        return enemiesOnCircleSpaces;
    }
}
