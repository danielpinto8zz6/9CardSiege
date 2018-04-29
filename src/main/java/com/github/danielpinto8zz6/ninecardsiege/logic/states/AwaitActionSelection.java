package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

/**
 *
 * @author daniel
 */
public class AwaitActionSelection extends StateAdapter {

    private static final long serialVersionUID = 1L;

    /**
     *
     * @param g
     */
    public AwaitActionSelection(GameData g) {
        super(g);
    }

    @Override
    public IStates ArchersAttack() {
        //TODO
        return new AwaitEnemyTrackSelectionForBoilingWaterAttack(getGame());
    }

    @Override
    public IStates BoilingWaterAttack() {
        //TODO
        return new AwaitEnemyTrackSelectionForBoilingWaterAttack(getGame());
    }

    @Override
    public IStates CloseCombatAttack() {
        //TODO
        return new AwaitActionSelection(getGame());
    }

    @Override
    public IStates Finish() {
        return new GameOver(getGame());
    }
}
