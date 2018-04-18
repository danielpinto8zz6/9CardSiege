package com.github.danielpinto8zz6.ninecardsiege.logic.cards.events;

import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;

public class DeathOfLeader extends Event {
    private static final long serialVersionUID = 1L;

    public DeathOfLeader(GameData gameData) {
        super(gameData, "DeathOfLeader");
    }
}