package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.DeterminedEnemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.Faith;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.IronShields;

public class Card7 extends Card {

    private static final long serialVersionUID = 1L;

    public Card7(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        DeterminedEnemy.apply(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day2Event() {
        IronShields.apply(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day3Event() {
        Faith.apply(getGame());
        getPlayer().setActionPoints(3);
    }

    @Override
    public String toString() {
        return "Card7";
    }

    @Override
    public void moveEnemyDay1() {
        Enemy enemyR = getGame().getEnemy("BattleRam");
        enemyR.move(Constants.MOVE.UP);
    }

    @Override
    public void moveEnemyDay2() {
        Enemy enemyS = getGame().getEnemy("SiegeTower");
        enemyS.move(Constants.MOVE.UP);
    }

    @Override
    public void moveEnemyDay3() {
        Enemy enemyL = getGame().getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);

        Enemy enemyR = getGame().getEnemy("BattleRam");
        enemyR.move(Constants.MOVE.UP);

        Enemy enemyS = getGame().getEnemy("SiegeTower");
        enemyS.move(Constants.MOVE.UP);
    }
}
