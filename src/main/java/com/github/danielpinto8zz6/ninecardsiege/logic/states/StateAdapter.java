package com.github.danielpinto8zz6.ninecardsiege.logic.states;

import com.github.danielpinto8zz6.ninecardsiege.logic.Constants;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class StateAdapter implements IStates, Constants {

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

    public IStates start() {
        return this;
    }

    public IStates quit() {
        return this;
    }

    public IStates DrawTopCard() {
        return this;
    }
}
