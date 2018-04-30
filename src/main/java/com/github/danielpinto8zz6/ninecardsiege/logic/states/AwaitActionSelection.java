package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * <p>
 * AwaitActionSelection class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitActionSelection extends StateAdapter {

    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Constructor for AwaitActionSelection.</p>
     *
     * @param g a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public AwaitActionSelection(GameData g) {
        super(g);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IStates ArchersAttack() {
        //TODO
        return new AwaitEnemyTrackSelectionForBoilingWaterAttack(getGame());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IStates BoilingWaterAttack() {
        //TODO
        return new AwaitEnemyTrackSelectionForBoilingWaterAttack(getGame());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IStates CloseCombatAttack() {
        //TODO
        return new AwaitActionSelection(getGame());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IStates Finish() {
        return new GameOver(getGame());
    }
}
