package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

public class GameData implements Constants, Serializable {

    private static final long serialVersionUID = 1L;

    private Player player;

    public int day;

    public GameData() {
        this.player = new Player(this, "Player");
        this.day = 1;
    }

    /**
     * @return the players
     */
    public Player getPlayer() {
        return player;
    }

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
}
