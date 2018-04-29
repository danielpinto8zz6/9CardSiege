package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import java.io.Serializable;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 *
 * @author daniel
 */
public class StateAdapter implements IStates, Constants, Serializable {

    private static final long serialVersionUID = 1L;
    private GameData game;

    /**
     *
     * @param g
     */
    public StateAdapter(GameData g) {
        this.game = g;
    }

    /**
     *
     * @return
     */
    public GameData getGame() {
        return game;
    }

    /**
     *
     * @param game
     */
    public void setGame(GameData game) {
        this.game = game;
    }

    public IStates Start() {
        return this;
    }

    public IStates Finish() {
        return this;
    }

    public IStates DrawTopCard() {
        return this;
    }

    public IStates ArchersAttack() {
        return this;
    }

    public IStates BoilingWaterAttack() {
        return this;
    }

    public IStates Attack() {
        return this;
    }

    public IStates CloseCombatAttack() {
        return this;
    }

    public IStates Capture() {
        return this;
    }
}
