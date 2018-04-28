package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.List;

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

    public List<String> getMsgLog() {
        return gameData.getMsgLog();
    }

    public void clearMsgLog() {
        gameData.clearMsgLog();
    }

    @Override
    public String toString() {
        return gameData.toString();
    }

    //--------------------- Methods that trigger events/actions in the finite state machine  -----------------------
    public void Start() {
        setState(getState().Start());
    }

    public void Finish() {
        setState(getState().Finish());
    }
}
