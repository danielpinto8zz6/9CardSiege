package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import java.util.ArrayList;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * <p>
 * BoilingOil class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class BoilingOil {

    /**
     * <p>
     * apply.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public static void apply(GameData gameData) {
        getEnemiesOnCircleSpaces(gameData).forEach((enemy) -> {
            enemy.setStrength(enemy.getStrength() + 2);
        });
    }

    /**
     * <p>
     * getEnemiesOnCircleSpaces.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     * @return a {@link java.util.List} object.
     */
    public static List<Enemy> getEnemiesOnCircleSpaces(GameData gameData) {
        List<Enemy> enemiesOnCircleSpaces = new ArrayList<>();
        gameData.getBattleCard().getEnemies().stream().filter((enemy) -> (enemy.getPosition() == 1)).forEachOrdered((enemy) -> {
            enemiesOnCircleSpaces.add(enemy);
        }); // Circle Spaces = position 1
        return enemiesOnCircleSpaces;
    }
}
