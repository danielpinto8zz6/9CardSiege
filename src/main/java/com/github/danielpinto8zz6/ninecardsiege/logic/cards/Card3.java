package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.BadWeather;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.BoilingOil;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.SuppliesSpoiled;

public class Card3 extends Card {

    private static final long serialVersionUID = 1L;

    public Card3(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        SuppliesSpoiled.apply(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day2Event() {
        BadWeather.apply(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day3Event() {
        BoilingOil.apply(getGame());
        getPlayer().setActionPoints(2);
    }

    @Override
    public String toString() {
        return "Card3";
    }

    @Override
    public void moveEnemyDay1(GameData gameData) {
        Enemy enemy = gameData.getEnemy("Ladders");
        enemy.move(Constants.MOVE.UP);
    }

    @Override
    public void moveEnemyDay2(GameData gameData) {
        // no enemy movement
    }

    @Override
    public void moveEnemyDay3(GameData gameData) {
        Enemy enemyL = gameData.getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);

        Enemy enemyR = gameData.getEnemy("BattleRam");
        enemyR.move(Constants.MOVE.UP);
    }
}
