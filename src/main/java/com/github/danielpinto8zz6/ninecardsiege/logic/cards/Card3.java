package com.github.danielpinto8zz6.ninecardsiege.logic.cards;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.BadWeather;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.BoilingOil;
import com.github.danielpinto8zz6.ninecardsiege.logic.events.SuppliesSpoiled;
import com.github.danielpinto8zz6.ninecardsiege.logic.exceptions.EnemyNotFoundException;

/**
 * Card3 class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Card3 extends Card {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for Card3.
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public Card3(GameData gameData) {
		super(gameData);
	}

	/** {@inheritDoc} */
	@Override
	public void day1Event() {
		SuppliesSpoiled.apply(getGameData());
		getPlayer().setActionPoints(2);
	}

	/** {@inheritDoc} */
	@Override
	public void day2Event() {
		BadWeather.apply(getGameData());
		getPlayer().setActionPoints(2);
	}

	/** {@inheritDoc} */
	@Override
	public void day3Event() {
		BoilingOil.apply(getGameData());
		getPlayer().setActionPoints(2);
	}

	/** {@inheritDoc} */
	@Override
	public void moveEnemyDay1() {
		Enemy enemy;
		try {
			enemy = getGameData().getEnemy("Ladders");

			enemy.move(Constants.MOVE.UP);
		} catch (final EnemyNotFoundException e) {
			getGameData().addMsgLog(e.getMessage());
		}
	}

	/** {@inheritDoc} */
	@Override
	public void moveEnemyDay2() {
		/** no enemy movement */
	}

	/** {@inheritDoc} */
	@Override
	public void moveEnemyDay3() {
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
	public String toString() {
		return "Card3";
	}
}
