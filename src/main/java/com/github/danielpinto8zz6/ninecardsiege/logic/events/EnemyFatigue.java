package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;

/**
 * EnemyFatigue class.
 *
 * @author daniel
 * @version $Id: $Id
 */
public class EnemyFatigue {

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
		player.setmCoupure(player.getmCoupure() + 1);
	}
}
