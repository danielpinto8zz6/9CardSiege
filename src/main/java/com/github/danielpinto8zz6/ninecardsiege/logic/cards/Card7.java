package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.DeterminedEnemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.Faith;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.IronShields;

/**
 * Card7 class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Card7 extends Card {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Card7.
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public Card7(GameData gameData) {
        super(gameData);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void day1Event() {
        DeterminedEnemy.apply(getGameData());
        getPlayer().setActionPoints(2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void day2Event() {
        IronShields.apply(getGameData());
        getPlayer().setActionPoints(2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void day3Event() {
        Faith.apply(getGameData());
        getPlayer().setActionPoints(3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Card7";
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
        Enemy enemyS = getGameData().getEnemy("SiegeTower");
        enemyS.move(Constants.MOVE.UP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moveEnemyDay3() {
        Enemy enemyL = getGameData().getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);

        Enemy enemyR = getGameData().getEnemy("BattleRam");
        enemyR.move(Constants.MOVE.UP);

        Enemy enemyS = getGameData().getEnemy("SiegeTower");
        enemyS.move(Constants.MOVE.UP);
    }
}
