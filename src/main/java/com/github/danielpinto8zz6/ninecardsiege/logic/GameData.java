package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

public class GameData implements Constants, Serializable {

    private static final long serialVersionUID = 1L;

    private Player player;

    public GameData() {
        player = new Player("Player");
    }

    /**
     * @return the players
     */
    public Player getPlayer() {
        return player;
    }
}
