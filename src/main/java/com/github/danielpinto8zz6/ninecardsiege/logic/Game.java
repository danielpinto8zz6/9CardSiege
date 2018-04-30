package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.states.AwaitBeginning;
import com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates;

/**
 * <p>
 * Game class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public final class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    private IStates state;
    private GameData gameData;

    /**
     * <p>
     * Constructor for Game.</p>
     */
    public Game() {
        gameData = new GameData();
        setState(new AwaitBeginning(gameData));
    }

    /**
     * <p>
     * Getter for the field <code>state</code>.</p>
     *
     * @return the state
     */
    public IStates getState() {
        return state;
    }

    /**
     * <p>
     * Setter for the field <code>state</code>.</p>
     *
     * @param state the state to set
     */
    public void setState(IStates state) {
        this.state = state;
    }

    /**
     * <p>
     * Getter for the field <code>gameData</code>.</p>
     *
     * @return the gameData
     */
    public GameData getGameData() {
        return gameData;
    }

    /**
     * <p>
     * Setter for the field <code>gameData</code>.</p>
     *
     * @param gameData the gameData to set
     */
    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }

    /**
     * <p>
     * getMsgLog.</p>
     *
     * @return a {@link java.util.List} object.
     */
    public List<String> getMsgLog() {
        return gameData.getMsgLog();
    }

    /**
     * <p>
     * clearMsgLog.</p>
     */
    public void clearMsgLog() {
        gameData.clearMsgLog();
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return gameData.toString();
    }

    //--------------------- Methods that trigger events/actions in the finite state machine  -----------------------
    /**
     * <p>
     * start.</p>
     */
    public void start() {
        setState(getState().start());
    }

    /**
     * <p>
     * finish.</p>
     */
    public void finish() {
        setState(getState().finish());
    }

    /**
     * <p>
     * drawTopCard.</p>
     */
    public void drawTopCard() {
        setState(getState().drawTopCard());
    }
}
