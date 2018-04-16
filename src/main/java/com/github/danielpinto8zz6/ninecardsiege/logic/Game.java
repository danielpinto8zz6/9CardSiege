package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

import com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates;

public class Game implements Serializable {

	private static final long serialVersionUID = 1L;

	Player player;

	private IStates state;

	public Game() {

	}

	public void setupGame() {
	}

	public boolean addPlayer(String name) {
		// It's 1 player game
		if (player != null) {
			new Player(name);
			return true;
		}
		return false;
	}

	/**
	 * @return the players
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the state
	 */
	public IStates getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(IStates state) {
		this.state = state;
	}
}