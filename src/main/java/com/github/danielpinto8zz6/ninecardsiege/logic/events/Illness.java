package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * Illness class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class Illness {

	/**
	 * apply.
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public static void apply(GameData gameData) {

		if (gameData.getPlayer().getMoral() >= 1) {
			gameData.getPlayer().setMoral(gameData.getPlayer().getMoral() - 1);
		}
		if (gameData.getPlayer().getSupplies() >= 1) {
			gameData.getPlayer().setMoral(gameData.getPlayer().getSupplies() - 1);
		}
	}
}
