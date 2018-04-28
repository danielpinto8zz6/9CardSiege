package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.Collapsed;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.RepairedTrebuchet;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.VolleyOfArrows;

public class Card5 extends Card {

    private static final long serialVersionUID = 1L;

    public Card5(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        VolleyOfArrows.apply(getGameData());
        getPlayer().setActionPoints(3);
    }

    @Override
    public void Day2Event() {
        Collapsed.apply(getGameData());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day3Event() {
        RepairedTrebuchet.apply(getGameData());
        getPlayer().setActionPoints(2);
    }

    @Override
    public String toString() {
        return "Card5";
    }

    @Override
    public void moveEnemyDay1() {
        Enemy enemyR = getGameData().getEnemy("BattleRam");
        enemyR.move(Constants.MOVE.UP);
    }

    @Override
    public void moveEnemyDay2() {
        Enemy enemyL = getGameData().getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);

        Enemy enemyR = getGameData().getEnemy("BattleRam");
        enemyR.move(Constants.MOVE.UP);
    }

    @Override
    public void moveEnemyDay3() {
        Enemy enemyL = getGameData().getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);
    }
}
