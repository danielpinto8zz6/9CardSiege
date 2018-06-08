package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.DeathOfLeader;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.FlamingArrows;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.GateFortified;
import com.github.danielpinto8zz6.ninecardsiege.logic.exceptions.EnemyNotFoundException;

/**
 * Card4 class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Card4 extends Card {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for Card4.
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
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
	public void moveEnemyDay1() {
		Enemy enemyL;
		try {
			enemyL = getGameData().getEnemy("Ladders");

			enemyL.move(Constants.MOVE.UP);
		} catch (final EnemyNotFoundException e) {
			getGameData().addMsgLog(e.getMessage());
		}

		Enemy enemyS;
		try {
			enemyS = getGameData().getEnemy("SiegeTower");

			enemyS.move(Constants.MOVE.UP);
		} catch (final EnemyNotFoundException e) {
			getGameData().addMsgLog(e.getMessage());
		}
	}

	/** {@inheritDoc} */
	@Override
	public void moveEnemyDay2() {
		Enemy enemyL;
		try {
			enemyL = getGameData().getEnemy("Ladders");

			enemyL.move(Constants.MOVE.UP);
		} catch (final EnemyNotFoundException e) {
			getGameData().addMsgLog(e.getMessage());
		}

		Enemy enemyR;
		try {
			enemyR = getGameData().getEnemy("BattleRam");

			enemyR.move(Constants.MOVE.UP);
		} catch (final EnemyNotFoundException e) {
			getGameData().addMsgLog(e.getMessage());
		}
	}

	/** {@inheritDoc} */
	@Override
	public void moveEnemyDay3() {
		Enemy enemyS;
		try {
			enemyS = getGameData().getEnemy("SiegeTower");

			enemyS.move(Constants.MOVE.UP);
		} catch (final EnemyNotFoundException e) {
			getGameData().addMsgLog(e.getMessage());
		}
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "Card4";
	}
}
