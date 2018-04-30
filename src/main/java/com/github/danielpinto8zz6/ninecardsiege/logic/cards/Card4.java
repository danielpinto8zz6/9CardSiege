package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.DeathOfLeader;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.FlamingArrows;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.GateFortified;

/**
 * <p>
 * Card4 class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Card4 extends Card {

    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Constructor for Card4.</p>
     *
     * @param gameData a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public Card4(GameData gameData) {
        super(gameData);
    }

    /** {@inheritDoc} */
    @Override
    public void day1Event() {
        DeathOfLeader.apply(getGameData());
        getPlayer().setActionPoints(2);
    }

    /** {@inheritDoc} */
    @Override
    public void day2Event() {
        GateFortified.apply(getGameData());
        getPlayer().setActionPoints(2);
    }

    /** {@inheritDoc} */
    @Override
    public void day3Event() {
        FlamingArrows.apply(getGameData());
        getPlayer().setActionPoints(3);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Card4";
    }

    /** {@inheritDoc} */
    @Override
    public void moveEnemyDay1() {
        Enemy enemyL = getGameData().getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);

        Enemy enemyS = getGameData().getEnemy("SiegeTower");
        enemyS.move(Constants.MOVE.UP);
    }

    /** {@inheritDoc} */
    @Override
    public void moveEnemyDay2() {
        Enemy enemyL = getGameData().getEnemy("Ladders");
        enemyL.move(Constants.MOVE.UP);

        Enemy enemyR = getGameData().getEnemy("BattleRam");
        enemyR.move(Constants.MOVE.UP);
    }

    /** {@inheritDoc} */
    @Override
    public void moveEnemyDay3() {
        Enemy enemyS = getGameData().getEnemy("SiegeTower");
        enemyS.move(Constants.MOVE.UP);
    }
}
