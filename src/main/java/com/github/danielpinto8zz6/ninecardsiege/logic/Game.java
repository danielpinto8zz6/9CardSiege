package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;

import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates;

public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    private IStates state;
    private GameData gameData;

    public Game() {
        gameData = new GameData();
        setState(new AwaitBeginning(gameData));
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

	/**
	 * @return the gameData
	 */
	public GameData getGameData() {
		return gameData;
	}

	/**
	 * @param gameData the gameData to set
	 */
	public void setGameData(GameData gameData) {
		this.gameData = gameData;
	}
}
