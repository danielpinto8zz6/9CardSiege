package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class AwaitBeginning extends StateAdapter {

    public AwaitBeginning(GameData g) {
        super(g);
    }

    @Override
    public IStates Start() {
        return new AwaitTopCardToBeDrawn(getGame());
    }

    @Override
    public IStates Finish() {
        return new GameOver(getGame());
    }
}
