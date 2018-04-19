package com.github.danielpinto8zz6.ninecardsiege.logic.cards.events;

import java.util.ArrayList;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class BoilingOil extends Event {
    private static final long serialVersionUID = 1L;

    public BoilingOil(GameData gameData) {
        super(gameData, "BoilingOil");
    }

    public void doEvent() {
        for (Enemy enemy : getEnemiesOnCircleSpaces()) {
            enemy.setStrength(enemy.getStrength() + 2);
        }
    }

    public List<Enemy> getEnemiesOnCircleSpaces() {
        List<Enemy> enemiesOnCircleSpaces = new ArrayList<Enemy>();
        for (Enemy enemy : getEnemies()) {
            // Circle Spaces = position 1
            if (enemy.getPosition() == 1) {
                enemiesOnCircleSpaces.add(enemy);
            }
        }
        return enemiesOnCircleSpaces;
    }
}