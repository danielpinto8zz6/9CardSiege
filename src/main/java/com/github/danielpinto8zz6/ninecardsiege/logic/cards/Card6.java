package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.CoverOfDarkness;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.EnemyFatigue;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.Rally;
import com.github.danielpinto8zz6.ninecardsiege.logic.exceptions.EnemyNotFoundException;

/**
 * Card6 class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Card6 extends Card {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for Card6.
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public Card6(GameData gameData) {
		super(gameData);
	}

	/** {@inheritDoc} */
	@Override
	public void day1Event() {
		CoverOfDarkness.apply(getGameData());
		getPlayer().setActionPoints(3);
	}

	/** {@inheritDoc} */
	@Override
	public void day2Event() {
		EnemyFatigue.apply(getGameData());
		getPlayer().setActionPoints(3);
	}

	/** {@inheritDoc} */
	@Override
	public void day3Event() {
		Rally.apply(getGameData());
		getPlayer().setActionPoints(3);
	}

	/** {@inheritDoc} */
	@Override
	public void moveEnemyDay1() {
		int max = 0;

		for (final Enemy enemy : getGameData().getEnemies()) {
			if (enemy.getPosition() > max) {
				max = enemy.getPosition();
			}
		}

		for (final Enemy enemy : getGameData().getEnemies()) {
			if (enemy.getPosition() == max) {
				enemy.move(Constants.MOVE.UP);
			}
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
	}

	/** {@inheritDoc} */
	@Override
	public void moveEnemyDay3() {
		Enemy enemyR;
		try {
			enemyR = getGameData().getEnemy("BattleRam");

			enemyR.move(Constants.MOVE.UP);
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
	public String toString() {
		return "Card6";
	}
}
