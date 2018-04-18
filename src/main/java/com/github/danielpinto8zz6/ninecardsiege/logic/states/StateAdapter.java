package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class StateAdapter implements IStates, com.github.danielpinto8zz6.ninecardsiege.logic.Constants {
    private GameData game;

    public StateAdapter(GameData g) {
        this.game = g;
    }

    public GameData getGame() {
        return game;
    }

    public void setGame(GameData game) {
        this.game = game;
    }

    public IStates startGame() {
        return null;
    }

    public IStates quit() {
        return null;
    }
}
