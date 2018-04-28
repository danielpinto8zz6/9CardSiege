package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class AwaitEnemyTrackSelectionForBoilingWaterAttack extends StateAdapter {

    public AwaitEnemyTrackSelectionForBoilingWaterAttack(GameData g) {
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
