package com.github.danielpinto8zz6.ninecardsiege.logic.cards.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class DeterminedEnemy extends Event {
    private static final long serialVersionUID = 1L;

    public DeterminedEnemy(GameData gameData) {
        super(gameData, "DeterminedEnemy");
    }

	@Override
	public void doEvent() {
		
	}
}