package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class AwaitActionSelection extends StateAdapter {
    public AwaitActionSelection(GameData g) {
        super(g);
    }

    @Override
    public IStates quit() {
        return new GameOver(getGame());
    }
}
