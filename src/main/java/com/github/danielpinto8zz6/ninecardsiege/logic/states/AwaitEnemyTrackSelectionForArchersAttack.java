package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * <p>
 * AwaitEnemyTrackSelectionForArchersAttack class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitEnemyTrackSelectionForArchersAttack extends StateAdapter {

    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Constructor for AwaitEnemyTrackSelectionForArchersAttack.</p>
     *
     * @param g a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public AwaitEnemyTrackSelectionForArchersAttack(GameData g) {
        super(g);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IStates Attack() {
        // TODO
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
