package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * RepairedTrebuchet class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class RepairedTrebuchet {

	/**
	 * apply.
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public static void apply(GameData gameData) {
		if (gameData.getBattleCard().getTrebuchet() < 3) {
			gameData.getBattleCard().setTrebuchet(gameData.getBattleCard().getTrebuchet() + 1);
		}
	}
}
