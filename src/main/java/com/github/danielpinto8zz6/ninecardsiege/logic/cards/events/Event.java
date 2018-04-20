package com.github.danielpinto8zz6.ninecardsiege.logic.cards.events;

import java.io.Serializable;
import java.util.List;

import com.github.danielpinto8zz6.ninecardsiege.logic.Enemy;
import com.github.danielpinto8zz6.ninecardsiege.logic.GameData;
import com.github.danielpinto8zz6.ninecardsiege.logic.Player;

public abstract class Event implements Serializable {
    private static final long serialVersionUID = 1L;

    private GameData gameData;

    private String eventName;

    public Event(GameData gameData, String name) {
        this.gameData = gameData;
    }

    /**
     * @return the gameData
     */
    public GameData getGameData() {
        return gameData;
    }

    /**
     * @param gameData the gameData to set
     */
    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }

    /**
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String toString() {
        return this.eventName;
    }

    public Player getPlayer() {
        return gameData.getPlayer();
    }

    public List<Enemy> getEnemies() {
        return gameData.getBattleCard().getEnemies();
    }

    public abstract void doEvent();

}
