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

    public IStates Start() {
        return this;
    }

    public IStates Finish() {
        return this;
    }

    public IStates DrawTopCard() {
        return this;
    }

	public IStates ArchersAttack() {
		return this;
	}

	public IStates BoilingWaterAttack() {
		return this;
	}

	public IStates Attack() {
		return this;
	}

	public IStates CloseCombatAttack() {
		return this;
	}

	public IStates Capture() {
		return this;
	}
}
