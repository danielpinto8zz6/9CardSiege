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
        VolleyOfArrows.apply(getGame());
        getPlayer().setActionPoints(3);
    }

    @Override
    public void Day2Event() {
        Collapsed.apply(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day3Event() {
        RepairedTrebuchet.apply(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public String toString() {
        return "Card5";
    }

    @Override
    public void moveEnemyDay1(GameData gameData) {
        Enemy enemyR = gameData.getEnemy("BattleRam");
        enemyR.move(Constants.MOVE.UP);
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
        Enemy enemyL = gameData.getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);
    }
}
