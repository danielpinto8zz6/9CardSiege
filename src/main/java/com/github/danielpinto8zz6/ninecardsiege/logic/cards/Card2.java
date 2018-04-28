package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.GuardsDistracted;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.Illness;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.TrebuchetAttack;

public class Card2 extends Card {

    private static final long serialVersionUID = 1L;

    public Card2(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        Illness.apply(getGameData());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day2Event() {
        GuardsDistracted.apply(getGameData());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day3Event() {
        TrebuchetAttack.apply(getGameData());
        getPlayer().setActionPoints(1);
    }

    @Override
    public String toString() {
        return "Card2";
    }

    @Override
    public void moveEnemyDay1() {
        Enemy enemyS = getGameData().getEnemy("SiegeTower");
        enemyS.move(Constants.MOVE.UP);
    }

    @Override
    public void moveEnemyDay2() {
        int aux = 0;

        for (Enemy enemy : getGameData().getBattleCard().getEnemies()) {

            if (enemy.getPosition() > aux) {
                aux = enemy.getPosition();
            }
        }

        for (Enemy enemy : getGameData().getBattleCard().getEnemies()) {
            if (enemy.getPosition() == aux) {
                enemy.move(Constants.MOVE.UP);
            }
        }
    }

    @Override
    public void moveEnemyDay3() {
        // no enemy movement
    }
}
