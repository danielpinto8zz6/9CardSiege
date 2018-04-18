package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.awt.Point;
import java.io.Serializable;
import java.util.List;

public class BattleCard implements Serializable {

    private static final long serialVersionUID = 1L;

    private GameData gameData;

    private List<Enemy> enemies;

    private int trebuchet;

    public BattleCard(GameData gameData) {

    }

    public void addEnemies(String name) {
        this.enemies.add(new Enemy("Ladders", 2, new Point(0, 4)));
        this.enemies.add(new Enemy("BattleRam", 3, new Point(1, 4)));
        this.enemies.add(new Enemy("BattleSiege", 4, new Point(2, 4)));

        this.trebuchet = 3;
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
     * @return the enemies
     */
    public List<Enemy> getEnemies() {
        return enemies;
    }

    /**
     * @return the trebuchet
     */
    public int getTrebuchet() {
        return trebuchet;
    }

    /**
     * @param trebuchet the trebuchet to set
     */
    public void setTrebuchet(int trebuchet) {
        this.trebuchet = trebuchet;
    }
}
