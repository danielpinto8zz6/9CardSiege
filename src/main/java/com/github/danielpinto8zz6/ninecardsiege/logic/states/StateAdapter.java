package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import java.io.Serializable;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * <p>
 * StateAdapter class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class StateAdapter implements IStates, Constants, Serializable {

    private static final long serialVersionUID = 1L;
    private GameData game;

    /**
     * <p>
     * Constructor for StateAdapter.</p>
     *
     * @param g a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public StateAdapter(GameData g) {
        this.game = g;
    }

    /**
     * <p>
     * Getter for the field <code>game</code>.</p>
     *
     * @return a {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData}
     * object.
     */
    public GameData getGame() {
        return game;
    }

    /**
     * <p>
     * Setter for the field <code>game</code>.</p>
     *
     * @param game a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public void setGame(GameData game) {
        this.game = game;
    }

    /**
     * <p>
     * Start.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    @Override
    public IStates Start() {
        return this;
    }

    /**
     * <p>
     * Finish.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    @Override
    public IStates Finish() {
        return this;
    }

    /**
     * <p>
     * DrawTopCard.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    @Override
    public IStates DrawTopCard() {
        return this;
    }

    /**
     * <p>
     * ArchersAttack.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    @Override
    public IStates ArchersAttack() {
        return this;
    }

    /**
     * <p>
     * BoilingWaterAttack.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    @Override
    public IStates BoilingWaterAttack() {
        return this;
    }

    /**
     * <p>
     * Attack.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    @Override
    public IStates Attack() {
        return this;
    }

    /**
     * <p>
     * CloseCombatAttack.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    @Override
    public IStates CloseCombatAttack() {
        return this;
    }

    /**
     * <p>
     * Capture.</p>
     *
     * @return a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.states.IStates}
     * object.
     */
    @Override
    public IStates Capture() {
        return this;
    }
}
