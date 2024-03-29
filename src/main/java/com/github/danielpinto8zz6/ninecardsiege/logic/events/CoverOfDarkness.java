package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;

/**
 * CoverOfDarkness class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class CoverOfDarkness {

	/**
	 * apply.
	 *
	 * @param gameData
	 *            a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
	 *            object.
	 */
	public static void apply(GameData gameData) {
		final Player player = gameData.getPlayer();
		player.setmRaidSupplies(player.getmRaidSupplies() + 1);
		player.setmSabotage(player.getmSabotage() + 1);
	}
}
