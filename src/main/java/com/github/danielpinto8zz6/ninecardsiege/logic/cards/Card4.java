package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.DeathOfLeader;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.FlamingArrows;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.GateFortified;

public class Card4 extends Card {

    private static final long serialVersionUID = 1L;

    public Card4(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        DeathOfLeader.apply(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day2Event() {
        GateFortified.apply(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day3Event() {
        FlamingArrows.apply(getGame());
        getPlayer().setActionPoints(3);
    }

    @Override
    public String toString() {
        return "Card4";
    }

    @Override
    public void moveEnemyDay1(GameData gameData) {
        Enemy enemyL = gameData.getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);

        Enemy enemyS = gameData.getEnemy("SiegeTower");
        enemyS.move(Constants.MOVE.UP);
    }

    @Override
    public void moveEnemyDay2(GameData gameData) {
        Enemy enemyL = gameData.getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);

        Enemy enemyR = gameData.getEnemy("BattleRam");
        enemyR.move(Constants.MOVE.UP);
    }

    @Override
    public void moveEnemyDay3(GameData gameData) {
        Enemy enemyS = gameData.getEnemy("SiegeTower");
        enemyS.move(Constants.MOVE.UP);
    }
}
