package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Game implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Player> players = new ArrayList<Player>();

	public Game() {
	}

	public void setupGame() {
	}

	public void addPlayer(String name) {
		players.add(new Player(name));
	}

}
