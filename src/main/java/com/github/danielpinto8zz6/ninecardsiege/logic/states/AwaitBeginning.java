package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class AwaitBeginning extends StateAdapter {

    public AwaitBeginning(GameData g) {
        super(g);
    }

    @Override
    public IStates start() {
        return new AwaitTopCardToBeDrawn(getGame());
    }

    @Override
    public IStates quit() {
        return new GameOver(getGame());
    }
}
