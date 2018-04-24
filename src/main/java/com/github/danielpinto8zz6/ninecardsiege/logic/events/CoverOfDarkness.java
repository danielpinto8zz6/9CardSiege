package com.github.danielpinto8zz6.ninecardsiege.logic.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;

public class CoverOfDarkness {
    public static void apply(GameData gameData) {
        Player player = gameData.getPlayer();
        player.setmRaidSupplies(player.getmRaidSupplies() + 1);
        player.setmSabotage(player.getmSabotage() + 1);
    }
}