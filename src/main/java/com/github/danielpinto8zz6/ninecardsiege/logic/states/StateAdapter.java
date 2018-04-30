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
     * {@inheritDoc}
     *
     * <p>
     * start.</p>
     */
    @Override
    public IStates start() {
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * finish.</p>
     */
    @Override
    public IStates finish() {
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * drawTopCard.</p>
     */
    @Override
    public IStates drawTopCard() {
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * archersAttack.</p>
     */
    @Override
    public IStates archersAttack() {
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * boilingWaterAttack.</p>
     */
    @Override
    public IStates boilingWaterAttack() {
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * attack.</p>
     */
    @Override
    public IStates attack() {
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * closeCombatAttack.</p>
     */
    @Override
    public IStates closeCombatAttack() {
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * capture.</p>
     */
    @Override
    public IStates capture() {
        return this;
    }
}
