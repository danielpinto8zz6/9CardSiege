package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.CoverOfDarkness;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.EnemyFatigue;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.Rally;

public class Card6 extends Card {

    private static final long serialVersionUID = 1L;

    public Card6(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        CoverOfDarkness.apply(getGame());
        getPlayer().setActionPoints(3);
    }

    @Override
    public void Day2Event() {
        EnemyFatigue.apply(getGame());
        getPlayer().setActionPoints(3);
    }

    @Override
    public void Day3Event() {
        Rally.apply(getGame());
        getPlayer().setActionPoints(3);
    }

    @Override
    public String toString() {
        return "Card6";
    }

    @Override
    public void moveEnemyDay1() {
        int aux = 0;

        for (Enemy enemy : getGame().getBattleCard().getEnemies()) {

            if (enemy.getPosition() > aux) {
                aux = enemy.getPosition();
            }
        }

        for (Enemy enemy : getGame().getBattleCard().getEnemies()) {
            if (enemy.getPosition() == aux) {
                enemy.move(Constants.MOVE.UP);
            }
        }
    }

    @Override
    public void moveEnemyDay2() {
        Enemy enemyL = getGame().getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);
    }

    @Override
    public void moveEnemyDay3() {
        Enemy enemyR = getGame().getEnemy("BattleRam");
        enemyR.move(Constants.MOVE.UP);

        Enemy enemyS = getGame().getEnemy("SiegeTower");
        enemyS.move(Constants.MOVE.UP);
    }
}
