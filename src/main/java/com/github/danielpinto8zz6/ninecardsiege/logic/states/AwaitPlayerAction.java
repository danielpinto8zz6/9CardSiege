package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class AwaitPlayerAction extends StateAdapter {
    public AwaitPlayerAction(GameData g) {
        super(g);
    }

    @Override
    public IStates quit() {
        return new GameOver(getGame());
    }
}
