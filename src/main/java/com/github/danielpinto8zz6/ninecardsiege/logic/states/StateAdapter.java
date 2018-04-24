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

    @Override
    public IStates startGame() {
        return this;
    }

    public IStates quit() {
        return this;
    }

    public IStates pickAnEventCard() {
        return this;
    }

    public IStates doEvent() {
        return this;
    }

    public IStates moveEnemies() {
        return this;
    }

    public IStates checkPlayerAtion() {
        return this;
    }

    public IStates playerAtion() {
        return this;
    }

    public IStates endOfTheDay() {
        return this;
    }

    public IStates endChek() {
        return this;
    }
}
