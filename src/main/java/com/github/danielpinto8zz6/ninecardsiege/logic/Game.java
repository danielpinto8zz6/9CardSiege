package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates;

public class Game implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Player> players = new ArrayList<Player>();

	private IStates state;

	public Game() {

	}

	public void setupGame() {
	}

	public void addPlayer(String name) {
		players.add(new Player(name));
	}

	/**
	 * @return the players
	 */
	public List<Player> getPlayers() {
		return players;
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