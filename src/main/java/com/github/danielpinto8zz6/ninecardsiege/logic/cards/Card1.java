package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class Card1 extends Card {

    private static final long serialVersionUID = 1L;

    public Card1(GameData gameData) {
        super(gameData);
    }

    @Override
    public void Day1Event() {
        // getGame().getPlayer().setWallStrength(getGame().getPlayer().getWallStrength() - 2);

        getPlayer().setActionPoints(3);
    }

    @Override
    public void Day2Event() {
        getGame().getPlayer().setWallStrength(getGame().getPlayer().getWallStrength() - 2);

        getPlayer().setActionPoints(2);
    }

    @Override
    public void Day3Event() {
        getGame().getPlayer().setWallStrength(getGame().getPlayer().getWallStrength() - 2);

        getPlayer().setActionPoints(1);
    }

    @Override
    public void moveEnemyDay1() {
        // no enemy movement
    }

    @Override
    public void moveEnemyDay2() {
        // no enemy movement
    }

    @Override
    public void moveEnemyDay3() {
        // no enemy movement
    }

    @Override
    public String toString() {
        return "Card1";
    }

}
