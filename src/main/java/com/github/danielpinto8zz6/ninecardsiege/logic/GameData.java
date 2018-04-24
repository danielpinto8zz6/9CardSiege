package com.github.danielpinto8zz6.ninecardsiege.logic;

import java.io.Serializable;
import java.util.List;

public class GameData implements Constants, Serializable {

    private static final long serialVersionUID = 1L;

    private Player player;

    private int day;

    private BattleCard battleCard;
    private StatusCard statusCard;

    public GameData() {
        this.player = new Player(this, "Player");
        this.day = 1;

        battleCard = new BattleCard(this);
        statusCard = new StatusCard(this);
    }

    public void initialize() {
        this.player = new Player(this, "Player");
        this.day = 1;

        battleCard = new BattleCard(this);
        statusCard = new StatusCard(this);

    }

    /**
     * @return the players
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the battleCard
     */
    public BattleCard getBattleCard() {
        return battleCard;
    }

    /**
     * @return the statusCard
     */
    public StatusCard getStatusCard() {
        return statusCard;
    }

    public Enemy getEnemy(String name) {
        return getBattleCard().getEnemy(name);
    }

    public List<Enemy> getEnemies() {
        return getBattleCard().getEnemies();
    }
}
