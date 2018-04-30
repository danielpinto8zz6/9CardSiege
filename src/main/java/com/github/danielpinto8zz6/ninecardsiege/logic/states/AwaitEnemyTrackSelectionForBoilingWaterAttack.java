package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 * <p>
 * AwaitEnemyTrackSelectionForBoilingWaterAttack class.</p>
 *
 * @author daniel
 * @version $Id: $Id
 */
public class AwaitEnemyTrackSelectionForBoilingWaterAttack extends StateAdapter {

    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Constructor for AwaitEnemyTrackSelectionForBoilingWaterAttack.</p>
     *
     * @param g a
     * {@link com.github.danielpinto8zz6.ninecardsiege.logic.GameData} object.
     */
    public AwaitEnemyTrackSelectionForBoilingWaterAttack(GameData g) {
        super(g);
    }

    /** {@inheritDoc} */
    @Override
    public IStates attack() {
        // TODO
        return new AwaitActionSelection(getGame());
    }

    /** {@inheritDoc} */
    @Override
    public IStates finish() {
        return new GameOver(getGame());
    }
}
