package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import java.util.ArrayList;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * BoilingOil class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class BoilingOil {

	/**
	 * apply.
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public static void apply(GameData gameData) {
		BoilingOil.getEnemiesOnCircleSpaces(gameData).forEach((enemy) -> enemy.setStrength(enemy.getStrength() + 2));
	}

	/**
	 * getEnemiesOnCircleSpaces. returns a list of all the enemies on circle spaces
	 * (position 1)
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 * @return a {@link java.util.List} object.
	 */
	public static List<Enemy> getEnemiesOnCircleSpaces(GameData gameData) {
		final List<Enemy> enemiesOnCircleSpaces = new ArrayList<>();
		gameData.getBattleCard().getEnemies().stream().filter((enemy) -> (enemy.getPosition() == 1))
				.forEachOrdered(enemiesOnCircleSpaces::add); // Circle Spaces = position 1
		return enemiesOnCircleSpaces;
	}
}
