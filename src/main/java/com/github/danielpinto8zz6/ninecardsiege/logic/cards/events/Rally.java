package com.github.danielpinto8zz6.ninecardsiege.logic.cards.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class Rally extends Event {
    private static final long serialVersionUID = 1L;

    public Rally(GameData gameData) {
        super(gameData, "Rally");
    }

	@Override
	public void doEvent() {
		
	}
}