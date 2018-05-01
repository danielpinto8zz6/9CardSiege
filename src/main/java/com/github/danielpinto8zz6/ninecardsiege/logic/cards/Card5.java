package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.Collapsed;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.RepairedTrebuchet;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.VolleyOfArrows;

/**
 * Card5 class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Card5 extends Card {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Card5.
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public Card5(GameData gameData) {
        super(gameData);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void day1Event() {
        VolleyOfArrows.apply(getGameData());
        getPlayer().setActionPoints(3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void day2Event() {
        Collapsed.apply(getGameData());
        getPlayer().setActionPoints(2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void day3Event() {
        RepairedTrebuchet.apply(getGameData());
        getPlayer().setActionPoints(2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Card5";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveEnemyDay1() {
        Enemy enemyR = getGameData().getEnemy("BattleRam");
        enemyR.move(Constants.MOVE.UP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveEnemyDay2() {
        Enemy enemyL = getGameData().getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);

        Enemy enemyR = getGameData().getEnemy("BattleRam");
        enemyR.move(Constants.MOVE.UP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveEnemyDay3() {
        Enemy enemyL = getGameData().getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);
    }
}
