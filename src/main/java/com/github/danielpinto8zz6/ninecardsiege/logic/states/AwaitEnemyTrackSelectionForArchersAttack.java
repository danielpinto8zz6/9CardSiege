package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 *
 * @author daniel
 */
public class AwaitEnemyTrackSelectionForArchersAttack extends StateAdapter {

    private static final long serialVersionUID = 1L;

    /**
     *
     * @param g
     */
    public AwaitEnemyTrackSelectionForArchersAttack(GameData g) {
        super(g);
    }

    @Override
    public IStates Attack() {
        // TODO
        return new AwaitActionSelection(getGame());
    }

    @Override
    public IStates Finish() {
        return new GameOver(getGame());
    }
}
